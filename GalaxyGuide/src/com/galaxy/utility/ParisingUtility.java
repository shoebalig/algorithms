package com.galaxy.utility;

import com.galaxy.constants.Constants;
import com.galaxy.engine.QueryEngineFactory;
import com.galaxy.enums.RomanEnums;
import com.galaxy.handlers.MetalQueryEngine;
import com.galaxy.handlers.QueryEngine;
import com.galaxy.handlers.RomanQueryEngine;
import com.galaxy.handlers.utility.MetalEngineUtility;
import com.galaxy.handlers.utility.RomanEngineUtility;

public class ParisingUtility {
	private RomanQueryEngine romanMapInstance = RomanQueryEngine.getInstance();
	private MetalQueryEngine metalMapInstance = MetalQueryEngine.getInstance();
	public double calculateFinalValue(String inputQuery)
	{
		int splitIndex = inputQuery.lastIndexOf(Constants.IS_LINESEPRATOR_WITHSPACE);
		String[] query = inputQuery.substring((splitIndex+3)).substring(0,inputQuery.substring((splitIndex+3)).lastIndexOf(Constants.QUESTIONMARK)).trim().split(Constants.BLANK_SPACE);
		if(splitIndex<0||!isValidQuery(query))
		{
			return  Double.NaN;
		}
		double finalResult= getAllMetalorMappedRomanValues(query);
		return  finalResult;
	}
	
	public double fetchValueFromQuery(String queryType) {

		double result=-1;
		if (queryType != null) {
			QueryEngine engineInstance = QueryEngineFactory.getEngineIntance(queryType);
			result = engineInstance.getParamsFromQuery(queryType);
		}
		return result;
	}

	private boolean isValidQuery(String[] query) 
	{
		boolean flag=false;
		for (String string : query) 
		{
			if(romanMapInstance.isValueExist(string)||metalMapInstance.isValueExist(string))
			{
				flag=true;
			}
		}
		return flag;
	}
	
	public String  printOutput(String line, double result) 
	{
		String[] variables= line.split(Constants.BLANK_SPACE);
		String finalResult="";
		for (String value : variables) 
		{
			if(romanMapInstance.isValueExist(value)||metalMapInstance.isValueExist(value))
			{
				finalResult=finalResult+" "+value;
			}
		}
		return finalResult.trim()+Constants.IS_LINESEPRATOR_WITHSPACE2+result;
	}
	private double getAllMetalorMappedRomanValues(String[] query) {
	
		double sum=0;
		for (int j = 0; j < query.length;) 
		{
			
			if((j+1)<query.length && RomanEngineUtility.getRomanMap().containsKey(query[j]) && RomanEngineUtility.getRomanMap().containsKey(query[j+1]))
			{
				if(romanMapInstance.getCodeValue(query[j])<romanMapInstance.getCodeValue(query[j+1]))
				{
					sum = sum+romanMapInstance.getCodeValue(query[j+1])-romanMapInstance.getCodeValue(query[j]);
					j=j+2;
				}
				else
				{
					sum=sum+romanMapInstance.getCodeValue(query[j]);
					j++;
				}
				
			}
			else if((j+1)<query.length && RomanEngineUtility.getRomanMap().containsKey(query[j]) && !RomanEngineUtility.getRomanMap().containsKey(query[j+1]))
			{
				sum = sum+romanMapInstance.getCodeValue(query[j]);
				j++;
			}
			else if((j+1)>=query.length)
			{
				if(RomanEngineUtility.getRomanMap().containsKey(query[j]))
				{
					sum = sum+romanMapInstance.getCodeValue(query[j]);
				}
				else if(MetalEngineUtility.getMetalMap().containsKey(query[j]))
				{
					sum = sum*MetalEngineUtility.getMetalMap().get(query[j]);
				}
				j++;
			}
			else
			{
				sum=0;
			}
		}
		return sum;
	}

	public void getItem(String line) 
	{
		String [] tokens=line.split(Constants.BLANK_SPACE);
		RomanEngineUtility.addValue(romanMapInstance, tokens[0].trim(), tokens[2].trim());
	}
	public static double fetchAndGetSumOfCodes(String value) {
		double[] values=getAllCodesforValues(value);
		char[] codes= value.toCharArray();
		double sum=0;
		for (int i = 0; i < values.length;) 
		{
			if((i+1)<values.length && values[i]<values[i+1])
			{
				if(isSubstractionValid(codes[i+1],codes[i]))
				{
					sum=sum+(values[i+1]-values[i]);
					i=i+2;
				}
				else
				{
					sum=sum+values[i];
					i++;
				}
			}
			else
			{
				sum=sum+values[i];
				i++;
			}
		}
		return sum;
	}
	private static boolean isSubstractionValid(char next, char current) 
	{
			boolean finalValue= false;
			switch(current)
			{
			case 'I':
				if(next=='X'||next=='V')
				{
					finalValue= true;
				}
				else
				{
					System.out.println("I can only be subtracted from V and X only.");
				}
				break;

			case 'X':
				if(next=='L'||next=='C')
					finalValue= true;
				else
					System.out.println("X can only be subtracted from L and C only.");
				break;
				
			case 'C':
				if(next=='D'||next=='M')
					finalValue= true;
				else
						System.out.println("C can only be subtracted from D and M only.");
				break; 
			case 'D':
				finalValue= false;
				break; 
			case 'V':
					finalValue= false;
				break;
			case 'L':
				finalValue= false;
				break; 
			default :
				finalValue= false;
				break;
				// I have no idea what you are talking about.
			}
			return finalValue;
		}

	public static double[] getAllCodesforValues(String value)
	{
		double[] values=new double[value.length()];
		for (int i = 0; i < value.length(); i++) 
		{
			values[i] = RomanEnums.getCodeValue(""+value.charAt(i));
		}
		return values;
	}
	
	public static double fetchAndGetSumOfCodes(double[] values) {
		double sum=0;
		for (int i = 0; i < values.length;) 
		{
			if((i+1)<values.length && values[i]<values[i+1])
			{
				sum=sum+(values[i+1]-values[i]);
				i=i+2;
			}
			else
			{
				sum=sum+values[i];
				i++;
			}
		}
		return sum;
	}
}

package com.galaxy.handlers.utility;

import java.util.HashMap;
import java.util.Map;

import com.galaxy.constants.Constants;
import com.galaxy.handlers.MetalQueryEngine;
import com.galaxy.handlers.RomanQueryEngine;
import com.galaxy.utility.ParisingUtility;

public class MetalEngineUtility {
	private static Map<String, Double> metalMap;

	public static double addMetalValue(MetalQueryEngine metalQueryEngine, String token1, String token2) 
	{
		String[] variables= token1.split(Constants.BLANK_SPACE);
		String[] creditValues= token2.split(Constants.BLANK_SPACE);
		double[] eachCodedValues=new double[variables.length-1];
		double creditValue = Double.parseDouble(creditValues[0]);
		String metalName= variables[(variables.length-1)];
		double metalvalue;
		for (int i=0;i<variables.length-1;i++) 
		{
			eachCodedValues[i] = RomanQueryEngine.getInstance().getCodeValue(variables[i]);
		}
		metalvalue=creditValue/ParisingUtility.fetchAndGetSumOfCodes(eachCodedValues);
		addMetalToMap(metalName,metalvalue);
		return metalvalue;
	}
	public static Map<String, Double> getMetalMap()
	{
		return metalMap;
	}
	static void addMetalToMap(String metalname, double value) 
	{
		if(metalMap==null)
		{
			metalMap=new HashMap<>();
		}
		metalMap.put(metalname, value);
	}
}
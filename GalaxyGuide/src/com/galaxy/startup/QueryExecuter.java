package com.galaxy.startup;

import com.galaxy.engine.QueryEngineFactory;
import com.galaxy.enums.QueryTypeEnum;
import com.galaxy.handlers.QueryEngine;
import com.galaxy.utility.ParisingUtility;
import com.galaxy.utility.RegexUtil;

public class QueryExecuter {
	ParisingUtility utility = new ParisingUtility();
	final double ERROR=-1;
	double result;
	public void processQuery(String line) {
			try
			{
			if (RegexUtil.ifInvalidQuery(line))
			{
				System.out.println("Input query "+line+" violates Roman Number repitition constraints.");
				return;
			}
			QueryTypeEnum lineType = RegexUtil.getQueryType(line);
			switch(lineType)
			{
				case QUERY_ASSIGNMENT:
					utility.fetchValueFromQuery(line);
					break;
				case QUERY_FETCH_CREDITS_INFO:
					utility.fetchValueFromQuery(line);
					break;
				case QUERY_HOW_MANY:
					result = utility.calculateFinalValue(line);
					if(!Double.isNaN(result))
						System.out.println(utility.printOutput(line,result));
					else
						System.out.println("Few query values are not provided.");
					break;
				case QUERY_HOW_MUCH:
					result = utility.calculateFinalValue(line);
					if(!Double.isNaN(result))
						System.out.println(utility.printOutput(line,result));
					else
						System.out.println("Few query values are not provided.");
					break;
				case QUERY_INVALID:
					System.out.println("I have no idea what you are talking about");
					break;
			}	
			}
			catch(Exception e)
			{
				System.out.println("Input "+ line +" is not valid please renter input properly !!!");
			}
			//return result;
		
	}

}

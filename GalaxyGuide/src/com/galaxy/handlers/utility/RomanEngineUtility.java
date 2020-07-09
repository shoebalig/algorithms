package com.galaxy.handlers.utility;

import java.util.HashMap;
import java.util.Map;

import com.galaxy.enums.RomanEnums;
import com.galaxy.handlers.RomanQueryEngine;
import com.galaxy.utility.ParisingUtility;

public class RomanEngineUtility {
	private static Map<String, Double> romanValuesMap;
	
	public static double addValue(RomanQueryEngine romanQueryEngine, String name, String value)
	{	
		if(romanValuesMap==null)
		{
			romanValuesMap=new HashMap<>();
		}
		if(name!=null && value!=null && value.length()==1)
		{
			romanValuesMap.put(name, RomanEnums.getCodeValue(value));
		}
		else if(name!=null && value!=null && value.length()>1)
		{
			romanValuesMap.put(name, ParisingUtility.fetchAndGetSumOfCodes(value));
		}
		return romanValuesMap.get(name);
	}
	public static Map<String, Double> getRomanMap()
	{
		return romanValuesMap;
	}
}
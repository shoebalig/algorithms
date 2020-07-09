package com.galaxy.handlers;

import com.galaxy.constants.Constants;
import com.galaxy.handlers.utility.RomanEngineUtility;

public class RomanQueryEngine implements QueryEngine{
	private static RomanQueryEngine romanQueryEngine;
	private RomanQueryEngine(){

	}
	public static RomanQueryEngine getInstance(){
		if(romanQueryEngine == null){
			romanQueryEngine = new RomanQueryEngine();
		}
		return romanQueryEngine;
	}
	@Override
	public double getCodeValue(String item)
	{
		if(RomanEngineUtility.getRomanMap()!=null)
			return RomanEngineUtility.getRomanMap().get(item);
		return Double.NaN;
	}
	@Override
	public double getParamsFromQuery(String line) {
		String [] tokens=line.split(Constants.BLANK_SPACE);
		double value=RomanEngineUtility.addValue(romanQueryEngine, tokens[0].trim(), tokens[2].trim());
		return value;
	}
	@Override
	public boolean isValueExist(String key)
	{
		if(RomanEngineUtility.getRomanMap()!=null)
			return RomanEngineUtility.getRomanMap().containsKey(key);
		return false;
	}
}

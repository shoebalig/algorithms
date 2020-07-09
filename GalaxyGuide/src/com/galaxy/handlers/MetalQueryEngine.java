package com.galaxy.handlers;

import java.util.HashMap;

import com.galaxy.constants.Constants;
import com.galaxy.handlers.utility.MetalEngineUtility;

public class MetalQueryEngine implements QueryEngine {
	private static MetalQueryEngine metalValuesMapping;

	private MetalQueryEngine()
	{}
    public static MetalQueryEngine getInstance(){
        if(metalValuesMapping == null){
        	metalValuesMapping = new MetalQueryEngine();
        }
        return metalValuesMapping;
    }
    
	@Override
	public	double getCodeValue(String metalname) 
	{
		if(MetalEngineUtility.getMetalMap()!=null)
			return MetalEngineUtility.getMetalMap().get(metalname);
		return Double.NaN;
	}
	@Override
	public boolean isValueExist(String key)
	{
		if(MetalEngineUtility.getMetalMap()!=null)
			return MetalEngineUtility.getMetalMap().containsKey(key);
		return false;
	}
	@Override
	public double getParamsFromQuery(String line) 
	{
		int splitIndex=line.lastIndexOf(Constants.IS_LINESEPRATOR);
		String firstToken=line.substring(0,splitIndex);
		String secondToken=line.split(Constants.BLANK_SPACE)[line.split(Constants.BLANK_SPACE).length-2];
		double value=MetalEngineUtility.addMetalValue(metalValuesMapping, firstToken.trim(), secondToken.trim());
		return value;
	}
}

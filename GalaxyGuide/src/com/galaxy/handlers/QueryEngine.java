package com.galaxy.handlers;

public interface QueryEngine {
	double getParamsFromQuery(String query);
	boolean isValueExist(String key);
	double getCodeValue(String metalname); 
}

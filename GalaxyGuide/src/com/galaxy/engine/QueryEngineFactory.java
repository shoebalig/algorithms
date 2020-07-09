package com.galaxy.engine;

import com.galaxy.handlers.MetalQueryEngine;
import com.galaxy.handlers.QueryEngine;
import com.galaxy.handlers.RomanQueryEngine;

public class QueryEngineFactory 
{
	public static QueryEngine getEngineIntance(String queryType){
	      if(queryType == null){
	         return null;
	      }		
	      if(queryType.contains("Credits")&& !queryType.contains("?")){
	         return MetalQueryEngine.getInstance();
	         
	      } 
	      else if(!queryType.contains("Credits")&& !queryType.contains("?")){
	         return RomanQueryEngine.getInstance();
	      }
	      return null;
	   }
}

package com.galaxy.startup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestCode {
		final static String DEFAULT_PATH= "..//GalaxyGuide//resource//InputData"; 
		public static void main(String[] args) throws IOException 
		{
			QueryExecuter handler= new QueryExecuter();
			try
			{
				Stream<String> stream;
				if(args[0]!=null)
					stream =Files.lines(Paths.get(args[0]));
				else
					stream =Files.lines(Paths.get(DEFAULT_PATH));
				stream.forEach(handler::processQuery);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
}

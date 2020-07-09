package com.galaxy.enums;

public enum QueryRegEnum {
	ASSIGNMENT ("^([a-z]+) is ([I|V|X|L|C|D|M])$", QueryTypeEnum.QUERY_ASSIGNMENT),
	FETCH_CREDITS_INFO ("((?:[a-z]+ )+)([A-Z]\\w+) is (\\d+) ([A-Z]\\w+)$", QueryTypeEnum.QUERY_FETCH_CREDITS_INFO),
	HOW_MANY("^how many ([a-zA-Z]\\w+) is ((?:\\w+ )+)([A-Z]\\w+) \\?$", QueryTypeEnum.QUERY_HOW_MANY),
	HOW_MUCH("^how much is ((?:\\w+[^0-9] )+)\\?$", QueryTypeEnum.QUERY_HOW_MUCH);
	private String regex;
	private QueryTypeEnum queryType;
	
	QueryRegEnum(String regex, QueryTypeEnum queryType)
	{
		this.regex = regex;
		this.queryType = queryType;
	}
	
	public QueryTypeEnum getType()
	{
		return this.queryType;
	}
	
	public String getRegex()
	{
		return this.regex;
	}
}

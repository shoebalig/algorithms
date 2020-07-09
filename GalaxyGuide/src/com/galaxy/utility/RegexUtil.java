package com.galaxy.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.galaxy.constants.Constants;
import com.galaxy.enums.QueryRegEnum;
import com.galaxy.enums.QueryTypeEnum;

public class RegexUtil {
	static String[] invalidInputs = { "(IIII+)", "(XXXX+)", "(CCCC+)", "(MMMM+)", "(DD+)", "(LL+)", "(VV+)" };
	static String regex = "";

	static public boolean ifInvalidQuery(String line) {
		String token[] = line.split(Constants.BLANK_SPACE);
		boolean flag = false;
		for (int i = 0; i < invalidInputs.length; i++) {
			regex = invalidInputs[i];
			for (int j = 0; j < token.length; j++) {
				Matcher matchFound = getMatcher(getPattern(regex), token[j]);
				if (matchFound.find()) {
					return true;
				}
			}
		}
		return flag;
	}

	static public Matcher getMatcher(Pattern pattern, String line) {
		return pattern.matcher(line);
	}

	static public Pattern getPattern(String line) {
		return Pattern.compile(line);
	}

	static public QueryTypeEnum getQueryType(String line) {
		QueryTypeEnum value = QueryTypeEnum.QUERY_INVALID;
		for (QueryRegEnum l : QueryRegEnum.values()) {
			Matcher matcher = getMatcher(getPattern(l.getRegex()), line);

			if (matcher.matches()) {
				value = l.getType();
			}
		}
		return value;

	}
}

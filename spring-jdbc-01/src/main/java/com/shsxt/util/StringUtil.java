package com.shsxt.util;

public final class StringUtil {
	
	public static boolean isBlankOrNull (final String str) {
		if  (null == str || "".equals(str)) {
			return true;
		}
		return false;
		
	}
}

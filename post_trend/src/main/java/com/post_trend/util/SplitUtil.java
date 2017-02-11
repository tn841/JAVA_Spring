package com.post_trend.util;

public class SplitUtil {

	/*
	 * 특수문자 제거
	 */
	public static String stringReplace(String str){       
	      String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
	      str =str.replaceAll(match, " ");
	      return str;
	}
	/*
	 * 스페이스바 두번 제거
	 */
	 public static String continueSpaceRemove(String str){
		   String match2 = "\\s{2,}";
		   str = str.replaceAll(match2, " ");
		   return str;
	}
}

package org.login;


public class Asia  {

	public static void main(String[] args) {
		
		String s ="India is my country";
		String[] split = s.split(" ");
		String output ="";
		for (int i = split.length-1; i >=0; i--) {
			String word="";
			for (int j = split[i].length()-1; j >=0; j--) {
				char charAt = split[i].charAt(j);
				word= word+charAt;
			}
			output=output+ word+" ";
		}
		System.out.println(output);
	}
}

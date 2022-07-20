package Pooja;

import java.util.StringTokenizer;

public class StringTokenizerEg {

	public static void main(String[] args) {
	//	StringTokenizer St = new StringTokenizer("Welcome to Anudip Foundation Mumbai,Maharashtra");
	StringTokenizer St = new StringTokenizer("Welcome to Anudip Foundation Mumbai,Maharashtra");
	
		
		while(St.hasMoreTokens()) {
	//		System.out.println(St.nextToken());
		
		System.out.println(St.nextToken(","));
		}
	}

}

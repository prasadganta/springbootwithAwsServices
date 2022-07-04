package com.techwithtony.sample.firstapp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordFinder {

	public static void main(String args[]) {

		String s1 = "prasadGantajavadevelopergilisium";
		String s2 = "Gantaprasadgilisiumjavadevelopernaveenkumar";

		List<Character> list1 = new ArrayList<Character>();
		
		List<Character> list2 = new ArrayList<Character>();

		Arrays.asList(s1);

		//List<String> list2 = Arrays.asList(s2);

		System.out.println(list1);

		// s1.length()

		String sample = null;

		List<Character> charlist = new ArrayList<Character>();

		for (int i = 0; i <= s1.length()-1; i++) {

			list1.add((char) s1.indexOf(i));

		}

		for (int i = 0; i <= s2.length()-1; i++) {

			list2.add((char) s2.indexOf(i));

		}
		
		
		
		
		//list1.
		

	}

}

package com.metalt;

import java.util.Arrays;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ahmet", "Beko", 21),
				new Person("Cengiz", "Seko", 22),
				new Person("Fatih", "Meko", 23)
				);
		
        Condition condition = new Condition () {
				public boolean test(Person p) {
					return p.getLastName().startsWith("S");
				}
		};
		
		printConditinally(people,condition);
	}

	private static void printConditinally(List<Person> people , Condition condition) {
	  for (Person p : people) {
		if (condition.test(p)) {
          System.out.println(p);
		}
	  }
	}

}

interface Condition {
  boolean test(Person p);
}
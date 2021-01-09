package com.metalt.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.metalt.model.Person;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Zeki", "Gur", 31),
				new Person("Ahmet", "Beko", 21),
				new Person("Cengiz", "Seko", 22),
				new Person("Fatih", "Meko", 23)
				);

		Collections.sort(people,(p1,p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
		
		printConditinally(people, p-> true);
		
		printConditinally(people,p -> p.getLastName().startsWith("S"));
	}

	private static void printConditinally(List<Person> people , Predicate<Person> predicate) {
	  for (Person p : people) {
		if (predicate.test(p)) {
          System.out.println(p);
		}
	  }
	}
}

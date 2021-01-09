package com.metalt.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.metalt.model.Person;

public class StandartFunctionalInterfacesExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Zeki", "Gur", 31),
				new Person("Ahmet", "Beko", 21),
				new Person("Cengiz", "Seko", 22),
				new Person("Fatih", "Meko", 23)
				);

		Collections.sort(people,(p1,p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
		
		printConditinally(people, p-> true, p -> System.out.println(p));
		
		printConditinally(people,p -> p.getLastName().startsWith("S"), p -> System.out.println(p.getLastName()));
	}

	private static void printConditinally(List<Person> people , Predicate<Person> predicate,Consumer<Person> consumer) {
	  for (Person p : people) {
		if (predicate.test(p)) {
          consumer.accept(p);
		}
	  }
	}
}

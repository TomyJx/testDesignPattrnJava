package com.test.testDesignPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-24-12:44
 */
public class ObjectStructrue {
	private List<Person> people = new ArrayList<>();

	public void add(Person p) {
		people.add(p);
	}

	public void remove(Person p) {
		people.remove(p);
	}

	public void execute(Visitor visitor) {
		for (int i = 0; i < people.size(); i++) {
			people.get(i).say(visitor);
		}
	}
}

package com.samplecode.snippet;

import java.util.HashMap;

public class CustomObjectAsKeyInHashMap {
	
	class Student{
		int roll;
		String name;	
		public Student(int roll, String name) {
			super();
			this.roll = roll;
			this.name = name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + roll;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (roll != other.roll)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + "]";
		}

	}

	public static void main(String[] args) {
		CustomObjectAsKeyInHashMap c = new CustomObjectAsKeyInHashMap();
		HashMap<Student, String> map = new HashMap<>();
		map.put(c.new Student(1,"Chetan"), "Chetan1");
		map.put(c.new Student(1,"Chetan"), "Chetan2");
		map.put(c.new Student(1,"Supriya"), "Supriya1");
		
		map.entrySet().stream().forEach(e -> System.out.println(e));
		
		System.out.println(map.get(c.new Student(1,"Rahul")));
	}

}

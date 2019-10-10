package com.yedam.generic;

import java.util.Arrays;

public class CourseExample {
	public static void main(String[] args) {
		
		Course<Person> personCo = new Course<>("일반인과정", 5);
		personCo.add(new Person("일반인1"));
		personCo.add(new Worker("직장인1"));
		personCo.add(new Student("학생1"));
		personCo.add(new HighStudent("고딩1"));
		
		Course<Worker> workerCo = new Course<>("직장인과정",5);
		workerCo.add(new Worker("직장인2"));
		
		Course<Student> stuCo = new Course<>("학생과정",5);
		stuCo.add(new Student("학생3"));
		stuCo.add(new HighStudent("고딩2"));
		
		Course<HighStudent> higCo = new Course<>("고딩과정",5);
		higCo.add(new HighStudent("고딩3"));
		
		
		registerCourse(personCo);
		registerCourse(workerCo);
		registerCourse(stuCo);
		registerCourse(higCo);
		System.out.println();
		
		registerCourseStudent(stuCo);
		registerCourseStudent(higCo);
		System.out.println();
		
		registerCourseWorker(personCo);
		registerCourseWorker(workerCo);
		System.out.println();
		
		
		
		
	}
	
	
	
	public static void registerCourse(Course<?> course) {
		System.out.println("과정명 : " +	course.getName() + ", 수강생 : " + 
					Arrays.deepToString(course.getStudents()));
	}
	
	public static void registerCourseStudent (Course<? extends Student> course) {
		System.out.println("과정명 : " + course.getName() +", 수강생 "+ Arrays.deepToString(course.getStudents()));
	}
	
	public static void registerCourseWorker (Course<? super Worker> course) {
		System.out.println("과정명 : " + course.getName() +", 수강생 "+ Arrays.deepToString(course.getStudents()));
	}
		
		
}

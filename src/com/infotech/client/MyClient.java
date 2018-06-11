package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

import com.infotech.myinterface.MyInterface;
import com.infotech.myinterfaceimpl.MyClass;
import com.infotech.model.Student;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface myInterface= new MyClass();
		List<Student> stuList= new ArrayList<>();
		stuList.add(new Student ("Abhi",20));
		stuList.add(new Student ("Ab",25));
		stuList.add(new Student ("Abhishek",30));
		stuList.add(new Student ("Abu",40));
		stuList.add(new Student ("Abdya",50));
		
		List<Student> sortStudents=myInterface.sortStudents(stuList);
		
		for(Student student: sortStudents)
		{
			System.out.println(student.getName() + "\t" + student.getAge());
		}
		
		
		
		System.out.println("---------------------------------------");
		
		MyInterface.greet("Abhi");
		
		System.out.println("---------------------------------------");
		
		List<Integer> inList=new ArrayList<>();
		
		inList.add(10);
		inList.add(20);
		inList.add(30);
		inList.add(40);
		inList.add(50);
		inList.add(60);
		
		Integer maxNum=myInterface.getMaxNum(inList);
		
		System.out.println("Max Number"+maxNum);
		
		
		
	}

}

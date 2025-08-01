package com.swabhav.reflection.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.swabhav.reflection.model.Student;

public class StudentTest {
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
	Student student=new Student();
	
	Class c=Student.class;
	System.out.println(c.getName());
	
	Field fields=c.getDeclaredField("cgpa");
	fields.setAccessible(true);
	System.out.println("Cgpa is "+fields.get(student));
	
	Method meth=c.getDeclaredMethod("result",double.class);
	meth.setAccessible(true);
	Object res=meth.invoke(student, 9.8);
	System.out.println("result : "+ res);
	
	
	
//	System.out.println("Fields are :");
//	for(Field res : fields) {
//		System.out.println(res.getName());
//	}
//	
//	System.out.println("-----------");
//	System.out.println("Methods are");
//	
//	Method[] methods= c.getDeclaredMethods();
//	for(Method meth : methods) {
//		System.out.println("Method name "+meth.getName());
//		System.out.println("Return type  "+meth.getReturnType());
//		System.out.println("Modifier is  "+Modifier.toString(meth.getModifiers()));
//		
//	}
}
}

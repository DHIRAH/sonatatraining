package com.sonata.day;

import java.util.ArrayList;
import java.util.Collections;

public class studentTest {
public static void main (String args[]) {
ArrayList<student> a1 = new ArrayList<student>();
a1.add(new student(123,"ram", 23));
a1.add(new student(124,"raj", 29));
a1.add(new student(125,"rajuu", 25));

Collections.sort(a1);
for(student st:a1) {
	System.out.println(st.rollno+"  "+st.name+ "  "+st.age);
	
}





}
}

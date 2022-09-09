package com.sonata.javastream;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {
public static List<Employee>getEmployee(){
	List<Employee>list =new ArrayList();
	list.add(new Employee(172,"Roshan","IT",5000));
	list.add(new Employee(388,"Santhosh","social",9000));
	list.add(new Employee(245,"Bimal","civil",4000));
	list.add(new Employee(786,"Prakash","defence",6000));
	list.add(new Employee(876,"dhiraj","training",7000));
	return list;
}
}

package com.sonata.App;

import com.sonata.DAOImpl.Employeelmpl;
import com.sonata.Emodel.Employee;

public class App {



   public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.setEmpId(13);;
    e1.setEmpName("Anjali");
    e1.setEmpSal(2000);
    Employeelmpl p1 = new Employeelmpl();
    int a1 =p1.save(e1);
    System.out.println(a1);
    }
}
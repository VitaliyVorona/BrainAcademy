package com.brainacad.LABS_2_2.labs_2_2_3;

/**
 * Created by User on 12.08.2015.
 */
public class Employee {
    public void calSalary(String name, double... varargs) {

        double salary = 0;

        for (int i = 0; i < varargs.length; i++){
            salary+=varargs[i];
        }
        System.out.println(name + " salary is " + salary);
    }
}

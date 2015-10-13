package com.brainacad.LABS_2_10.labs_2_10_2;

/**
 * Created by User on 11.09.2015.
 */
public class MyTest {
    public void test() throws MyException {

    }

    public static void main(String[] args) {
        testExcp();
    }

    public static int testExcp(){
        int x = 120;
        assert x == 10 : "wtf";
        System.out.println("OK");
        return x;
    }
}

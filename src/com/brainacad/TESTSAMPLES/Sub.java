package com.brainacad.TESTSAMPLES;

/**
 * Created by Groovy on 14-Sep-15.
 */
public class Sub extends Base {
    public String name = "Sub";
    public int testInt = 2;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTestInt() {
        return testInt;
    }
}

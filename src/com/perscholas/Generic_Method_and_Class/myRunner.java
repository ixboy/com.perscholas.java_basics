package com.perscholas.Generic_Method_and_Class;

public class myRunner {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.genericsMethod(25);
        obj.genericsMethod("I am studying here");
        obj.genericsMethod(2346.5);
        obj.genericsMethod(true);
        obj.genericsMethod(false);

        GMultipleDatatype<String, Boolean> gMult = new GMultipleDatatype("isma", false);
        System.out.println(gMult.getValueOne());
        System.out.println(gMult.getValueTwo());
        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GMultipleDatatype<String[], Integer> mobj2 = new GMultipleDatatype("ismael", 123);
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
        GMultipleDatatype mobj3 = new GMultipleDatatype("Ismael",12345);
        System.out.println(mobj3.getValueOne());
        System.out.println(mobj3.getValueTwo());
    }

}

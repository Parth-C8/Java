package com.company;

class SingExmpl {
    private static SingExmpl singExmpl_obj = null;
    String str;

    private SingExmpl() {
    }

    public static SingExmpl getInstance() {
        if (singExmpl_obj == null) {
            singExmpl_obj = new SingExmpl();
        }
        return singExmpl_obj;
    }
}

public class Ques4 {
    public static void main(String[] args) {
        SingExmpl obj1 = SingExmpl.getInstance();
        obj1.str = "This is a Singleton Class Example String 1";
        SingExmpl obj2 = SingExmpl.getInstance();
        obj1.str = "This is a Singleton Class Example String 2";
        SingExmpl obj3 = SingExmpl.getInstance();
        obj1.str = "This is a Singleton Class Example String 3";
        System.out.println("\nFirst object value: " + obj1.str);
        System.out.println("Second Object value: " + obj2.str);
        System.out.println("Third Object value: " + obj3.str);

    }
}

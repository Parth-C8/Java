package com.company;

class MyException extends Exception
{
    private int num;
    public MyException(String message, int num) {
        super(message, null, false, true);
        this.num = num;
    }
}

public class Ques13 {

    static void compute(int n) throws MyException
    {
        System.out.println("\nCalled Compute("+ n+" )");
        if(n>10)
            throw new MyException("Number is greater than 10", n);
        System.out.println("Normal Exit");
    }
    public static void main(String[] args) {

        try{
            compute(1);
            compute(20);
        }catch (MyException e)
        {
            e.printStackTrace();
        }
    }
}

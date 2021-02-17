package com.company;

abstract class Furniture{
    abstract boolean testFire();
    abstract int testStress();
}

class WoodenFurniture extends Furniture
{
    String type;
    WoodenFurniture(String type)
    {
        this.type = type;
    }
    @Override
    boolean testFire() {
        return false;
    }
    @Override
    int testStress() {
        if(type.equals("Chair"))
        {
            return 4;
        }
       else
           return 6;
    }
    void showTest()
    {
        System.out.println("\nResult of Test for Wooden "+type+" is \nStress Test Result(out of 10): "+testStress()+"\nFire Stress Result: "+testFire());
    }
}

class MetallicFurniture extends Furniture
{
    String type;
    MetallicFurniture(String type)
    {
        this.type = type;
    }
    @Override
    boolean testFire() {
        return true;
    }
    @Override
    int testStress() {
        if(type.equals("Chair"))
        {
            return 7;
        }
        else
            return 9;
    }
    void showTest()
    {
        System.out.println("\nResult of Test for Metallic "+type+" is \nStress Test Result(out of 10): "+testStress()+"\nFire Stress Result: "+testFire());
    }
}

public class Ques9 {
    public static void main(String[] args) {

        WoodenFurniture w1 = new WoodenFurniture("Chair");
        w1.showTest();
        WoodenFurniture w2 = new WoodenFurniture("Table");
        w2.showTest();
        MetallicFurniture m1 = new MetallicFurniture("Chair");
        m1.showTest();
        MetallicFurniture m2 = new MetallicFurniture("Table");
        m2.showTest();

    }
}

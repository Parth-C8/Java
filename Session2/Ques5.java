package com.company;

class Point implements Cloneable
{
    int x,y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    Point(Point q)
    {
        x = q.x;
        y = q.y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
public class Ques5 {
    public static void main(String[] args) {

        Point obj1 = new Point(20,10);
        System.out.println("\nValues of X and Y for Obj1 are: "+obj1.x+" & "+obj1.y);
        try {
            Point obj2 = (Point) obj1.clone();
            System.out.println("\nValues of X and Y for Obj2(Clone) are: "+obj2.x+" & "+obj2.y);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Point obj3 = new Point(40, 60);
        System.out.println("\nValues of X and Y for Obj3 are: "+obj3.x+" & "+obj3.y);
        Point obj4 = new Point(obj3);
        System.out.println("\n" +
                "Values of X and Y for Obj4(Copied) are: "+obj4.x+" & "+obj4.y);

    }
}

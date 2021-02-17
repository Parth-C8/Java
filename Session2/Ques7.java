package com.company;
class Second{

    int days,hrs,mins,secs;

    public void timeChanger(int time)
    {
        days = time / 86400;
        time %= 86400;
        hrs = time / 3600;
        time %=3600;
        mins = time / 60;
        time %=60;
        secs = time;
    }
    void showTime()
    {
        System.out.println("\nThe given time in \nDays : Hours : Minutes : Seconds is");
        System.out.println(days+" : "+hrs+" : "+mins+" : "+secs);
    }
}
public class Ques7 {
    public static void main(String[] args) {

        Second s1 = new Second();
        s1.timeChanger(248700);
        s1.showTime();
    }
}

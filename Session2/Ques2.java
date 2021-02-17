package com.company;
public class Ques2 {
    public static void main(String[] args) {
        String string = "javaprogramming";
        char str[] = string.toCharArray();
        char temp[] = new char[str.length];
        System.out.println("\nOriginal String is: "+string);
        for(int i = 0; i < str.length; i++)
        {
            for(int j = i+1; j < str.length; j++)
            {
                if(str[i] > str[j])
                {
                    temp[i] = str[i];
                    str[i] = str[j];
                    str[j] = temp[i];
                }
            }
        }
        System.out.print("\nSorted String is: ");
        for(int i = 0; i < str.length; i++)
        {
            System.out.print(""+str[i]);
        }
    }
}

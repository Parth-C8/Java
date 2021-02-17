package com.company;

public class Ques6 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[7];
            arr[7] = 30;
            arr[6] = 5/0;
            System.out.println(arr[20]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }
        catch (Exception e){
            System.out.println("Exception: "+e);
        }
        finally {
            System.out.println("\n\n.....This finally block executes after try block completes.....");
        }
    }
}

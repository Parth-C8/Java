package com.company;

abstract class User
{
    abstract void createDetails(int id, String name, String dept);
}
class Student extends User
{
    String name, dept;
    int id;
    @Override
    void createDetails(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    void showDetails()
    {
        System.out.println("ID: "+id+" \nName: "+name+" \nDepartment: "+dept);
    }
}
class Staff extends User
{
    String name, dept;
    int id;
    @Override
    void createDetails(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    void showDetails()
    {
        System.out.println("ID: "+id+" \nName: "+name+" \nDepartment: "+dept);
    }
}

class Book
{
    String name, author;
    boolean isAvailable;
    Book(String name, String author, boolean isAvailable)
    {
        this.name = name;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public void displayDetails()
    {
        System.out.println("\nBook Name: "+name+"\nAuthor name: "+author+"\nType: "+"Available in library: "+isAvailable);
    }
}
class Magzines extends Book
{
    String type;

    Magzines(String name, String author, boolean isAvailable , String type) {
        super(name, author, isAvailable);
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("\nBook Type is: "+type);
    }
}

class Librarian implements libManagement
{
    String name;
    int id;
    Librarian(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public void addBook() {
        System.out.println("\nNew Book Added successfully!!");
    }

    @Override
    public void deleteBook() {
        System.out.println("\nBook Deleted successfully!!");
    }

    @Override
    public void addUser() {
        System.out.println("\nNew User Added successfully!!");
    }

    @Override
    public void deleteUser() {
        System.out.println("\nUser Deleted successfully!!");
    }

    @Override
    public void issueBook() {
        System.out.println("Checking User Details");
        System.out.println("\nBook is issued successfully!!");
    }

    @Override
    public void receiveIssuedBook() {
        System.out.println("Checking User Details");
        System.out.println("\nBook returned successfully!!");
    }

    @Override
    public void generateBill_Fines() {
        System.out.println("Checking User Details");
        System.out.println("Bills and Fine Generated successfully!!");
    }
}


public class Ques1 {
    public static void main(String[] args) {

        System.out.println("This is a demo representation of library management system showing OOP concepts");
        System.out.println("....Different Object can be created and methods can be implemented Here....");
    }
}

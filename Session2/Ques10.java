package com.company;

class Customer
{
    String custName;
    String email;
    Customer(String custName, String email)
    {
        this.custName = custName;
        this.email = email;
    }

    public void receiveToken(String msg)
    {
        System.out.println(msg);

    }
    public void receiveNotification(String msg)
    {
        System.out.println(msg);
        System.out.println("\n.....Order Received Enjoying My Coffee....");
    }
}
class Cashier
{    static int token_no=1;
    Customer customer1;

    int order_id;
    int bill_amount;
    String coffee;
    int noOfItems;
    Cashier(int bill_amount, String coffee,int noOfItems,Customer cust)
    {
        customer1=cust;
        this.bill_amount=bill_amount;
        this.coffee=coffee;
        this.noOfItems = noOfItems;
        createOrder();
    }
    public void receiveOrder()
    {
        System.out.println("\nFor "+customer1.custName+" : Order of "+noOfItems+" "+coffee+" and payment of "+bill_amount+" rupees received");
        Barista barsita=new Barista();
        barsita.receiveOrderId(order_id,customer1);
    }
    public void createOrder()
    {
        order_id = token_no;
        System.out.println("\nOrder no: "+order_id+" is created for "+customer1.custName);
        System.out.println("Token no: "+token_no);
        token_no++;
        returnToken();
        receiveOrder();
    }
    public void returnToken()
    {
        customer1.receiveToken("\nYour order no "+ order_id+" is placed in queue please wait!!");
    }
}
class Barista
{
    Customer customer;
    public void receiveOrderId(int order_id,Customer customer)
    {
        this.customer=customer;
        System.out.println("\nOrder no: "+order_id+" is processing");
        orderCompleted(order_id);
    }
    public void orderCompleted(int order_id)
    {
        System.out.println("\nOrder is completed");
        generateNotification(order_id);
    }
    public void generateNotification(int order_id)
    {
        customer.receiveNotification("\nOrder No: "+order_id+ " is ready please collect your order and enjoy your coffee!!");
    }
}


public class Ques10 {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Parth" , "abc@mail.com");
        Cashier cash1 =new Cashier(2000,"Caffe Latte",3,cust1);


    }
}

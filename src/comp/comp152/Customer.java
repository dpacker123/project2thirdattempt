package comp.comp152;

import java.util.ArrayList;

public class Customer {
    private ArrayList<ShippingAddress> addresses;
    private String name;
    private int CustomerID;

    public Customer(String customerName, int custID){
        name = customerName;
        CustomerID = custID;
        addresses = new ArrayList<ShippingAddress>();



    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name + CustomerID;
    }
    public void Test(){
        System.out.println("Test" + CustomerID);
    }



}



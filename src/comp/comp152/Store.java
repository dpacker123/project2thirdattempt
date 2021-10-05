package comp.comp152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Store {
    private ArrayList<Customer> Customers;
    private ArrayList<Order> Orders;


    public static void main(String[] args) throws IOException { // This is able to read the Customer.txt file
        var filename = "Customer.txt";//                               However it does not save the name nor the Customer ID
        var getFile = Paths.get(filename);//                     To the desired customer array list
        var Customers = new ArrayList<String>();
        var CustomerID = new ArrayList<Integer>();
        var CustomerLines = Files.readAllLines(getFile);
        for(var line : CustomerLines){
            var splitLine = line.split(",");
            Customers.add(splitLine[0]);
            CustomerID.add(Integer.valueOf(splitLine[1]));

        }
        new Customer("JOE", 2); // attempt to create a pre existing list of customers and IDs because
        new Customer("JOHN", 3);// I was unable to add the Customer.txt File
        new Customer("jane", 5);
        System.out.println("" +CustomerID + Customers);
        runStore();



    }
    public static void runStore(){
        var userInput = new Scanner(System.in); // creates scanner for user input
        while(true){
            Menu();
            var userChoice = userInput.nextInt();
            switch (userChoice){
                case 1:
                    addCustomer(userInput);
                case 2:
                    selectCustomer(userInput);
                case 3:
                    ManageCustomer();
                case 4:
                    System.exit(0);
            }
        }
    }

    private static void ManageCustomer() {
        var userInput = new Scanner(System.in); // Creates Scanner for user input allowing user to interact
        while(true){
            SecondMenu();
            var userChoice = userInput.nextInt();
            switch (userChoice){
                case 1:
                    addAddress(userInput);
                case 2:
                    makeOrder(userInput);
                case 3:
                    Menu();
                    userInput.nextInt(); //eats user input
                    break;
            }
        }
    }

    private static void makeOrder(Scanner userInput) {
        userInput.nextLine(); // eats previous input
        System.out.println("Please Select the customer you would like to place an order for");
        var userChoice = userInput.nextLine();
        // var customer =
    }

    private static void addAddress(Scanner userInput) {
        userInput.nextLine(); // eats previous input
        System.out.println("Please enter the address you would like to add");
        var newAddress = userInput.nextLine();
        System.out.println("Please enter the city");
        var newCity = userInput.nextLine();
        System.out.println("Please enter the state");
        var newState = userInput.nextLine();
        System.out.println("Please enter the zip code");
        var newZipCode = userInput.nextLine();
        var updateAddress = new ArrayList<ShippingAddress>();
        updateAddress.add(new ShippingAddress(newAddress, null, newCity, newState, newZipCode)); // This updates the shipping address
        System.out.println("Thank you for adding " + newAddress +", " + newCity + ", "//                  with the shipping address added by
                + newState+ ", " +newZipCode+ " to the Shipping address list");//                         The user.

    }

    private static void SecondMenu() { // Simple menu that runs when the user selects manage customer in the first menu
        System.out.println("=============================================");
        System.out.println("Please select one of the following choices:");
        System.out.println("      [1] Add an Address");
        System.out.println("      [2] Make an Order");
        System.out.println("      [3] Go Back");
        System.out.println("=============================================");
    }

    private static void selectCustomer(Scanner userInput) {
        userInput.nextLine(); //                      eats previous call for next int
        System.out.println("Please type the name of the Customer you would like to slect");
        var selectCust = userInput.nextLine(); //saves user input as a string

        System.out.println("Thank you, " + selectCust + " has been added to the list");

    }

    private static void addCustomer(Scanner userInput) {

        userInput.nextLine(); //                    eats \n from previous call
        System.out.println("Please the name of the customer you would like to add");
        var newCustomer = userInput.nextLine();
        var randomID = new Random(); //             creates random variable for the new customer
        var ID = 1000;//                            unable to use the random variable in the customer array because it requires an int
        new Customer(newCustomer,ID );
        System.out.println(" Thank you for adding " + newCustomer + ", their Customer Id is " + ID);
    }

    private static void Menu() {
        System.out.println("=============================================");
        System.out.println("      [1] Add a new Customer");
        System.out.println("      [2] Select a Customer");
        System.out.println("      [3] Manage a Customer");
        System.out.println("      [4[ Exit the program");
        System.out.println("=============================================");
    }

}




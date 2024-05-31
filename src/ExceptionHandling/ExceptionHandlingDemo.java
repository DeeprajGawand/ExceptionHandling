package ExceptionHandling;
//EXCEPTION DEFINATION
//Exception is unwanted or unexpected event which occurs during the execution of the program

//EXCEPTION HANDLING DEFINATION
//Handling that unwanted or unexpected event is called exception handling

//Every exception occurs during the run time of the program
//Compiler does not throw exception it tells that exception can occur

//object class is the parent class in java

//Throwable class is the parent class of exception class

//There are two types of exception 1.Checked and Unchecked

//1. Checked exception are also called complie time exception
//2. Unchecked exception are also called runtime exception

// Whenever there is exception occurs the method in which exception occurs creates an object and stored 3 things
//1. Exception name 2.Description 3.Stack race

//Exception can be handle by try catch block . try catch block are always together
//

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
    try {
        int a = 10;
        int b = 0;

        int c = a / b;
        System.out.println(c);
    }
    catch (Exception e) {
        e.printStackTrace();
        System.out.println(e);

        System.out.println("cannot divide be zero");


    }}
}

package ExceptionHandling;

// Finally is the block that will always execute wether there is exception or not

//try and finally block will work but there is no catch so the exception will not be handled

// We use finally block to clean up the code


public class ExceptionHandlingFinallyBlock {

    public static void main(String[] args) {
        try{
            int c = 10/0;
        }
        catch (Exception e){
            System.out.println("cannot divide by zero");
        }
        finally {
            System.out.println("this is mathematics");
        }
    }
}

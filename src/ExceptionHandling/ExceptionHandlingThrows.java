package ExceptionHandling;


//throws keywords is used to declare an exception .It gives information to caller method that there may be exception occur
public class ExceptionHandlingThrows {
    static void checkElegibility(int age) throws Exception{
        if(age<18){
            throw new Exception("Number must not be less ");

        }else {
            System.out.println("eligible to work");
        }
    }

    public static void main(String[] args) {
        try{
            checkElegibility(17);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            checkElegibility(20);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}

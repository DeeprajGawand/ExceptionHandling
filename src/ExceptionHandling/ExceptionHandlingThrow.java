package ExceptionHandling;

// throw keyword in exception handling is used for custom exception or user defined exception not for predefine exception
public class ExceptionHandlingThrow {

    static void checkEligibilty(int age){

            if(age<18){
                throw new ArithmeticException("age is less to vote");

            }
            else {
                System.out.println("eligible to vote");
            }
        }


    public static void main(String[] args) {

        try{
            checkEligibilty(20);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            checkEligibilty(16);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

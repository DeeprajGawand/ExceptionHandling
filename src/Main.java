

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world!");
            System.out.println(10 / 2);
            System.out.println(10 / 0); //{An exception id an unwanted or unexpected
            // event which occurss during the execution of program (at run time) and disrupts the normal
            // flow of the program}

            //Handling the unwanted event by taking an alternative is called exception handling
            System.out.println(5 / 2);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

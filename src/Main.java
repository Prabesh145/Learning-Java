public class Main {
    public static void main(String[] args){
    /*
    Data types:
    Primitive: simple value stored directly in memory (stack)
    Reference: memory address (stack) that points to the (heap)

     */
        int age = 30;
        double temperature = -23.5;
        char Currency = '$';
        Boolean isMale = true;
        String Name = "Prabesh Niroula";

        //System.out.println("My name is "+ Name + ". "+ "My age is :"+ age + "."+ "The currency I use is :"+ Currency + "."+ "My temperature is: "+ temperature+".");
        if (isMale){
            System.out.println("You are a grizzly man.");
        }
        else {
            System.out.println("You are a female.");
        }

    }

}

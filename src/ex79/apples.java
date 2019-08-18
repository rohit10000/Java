package ex79;

import java.util.Formatter;

public class apples {
    public static void main(String[] args) {
        //formatter variable puts the strings to file
        final Formatter x;

        try{
            x = new Formatter("fred.txt");
            System.out.println("you created a file");
        }
        catch(Exception e){
            System.out.println("You got an error");

        }
    }
}

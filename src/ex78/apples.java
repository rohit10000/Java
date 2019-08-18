package ex78;
//File exists or not
import java.io.File;

public class apples {
    public static void main(String[] args) {

        File x = new File("C:\\Users\\Rohit\\Desktop\\amz.txt");
        if(x.exists())
            System.out.println(x.getName() + "exists");
        else
            System.out.println(x.getName() + " does not exists");
    }
}

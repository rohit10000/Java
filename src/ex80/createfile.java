package ex80;

import java.util.Formatter;

public class createfile {
    private Formatter x;
    public void openFile(){
        try {
            x = new Formatter("fred.txt");
        }
        catch(Exception e){
            System.out.println("you have an error");
        }
    }
    public void addRecords(){
        x.format("%s%s%s", "20 ", "bucky ", "roberts");
    }

    public  void closeFile(){
        x.close();
    }
}

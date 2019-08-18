package ex80;
//writting to a file
public class apples {
    public static void main(String[] args) {
        createfile f = new createfile();
        f.openFile();
        f.addRecords();
        f.closeFile();
    }
}

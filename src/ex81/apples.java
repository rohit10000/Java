package ex81;
//reading from a file

public class apples {
    public static void main(String[] args) {
        readfile f = new readfile();
        f.openFile();
        f.readFile();
        f.closeFile();
    }
}

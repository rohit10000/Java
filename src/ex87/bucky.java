package ex87;
//Strings
public class bucky {
    public static void main(String[] args) {
        String a = "apples";
        String b = "apples";
        String c = "BUCKY";
        System.out.println(a.length());

        if(a.equals("apples")){
            System.out.println("it equals apples!");
        }
        if(b.equalsIgnoreCase(c))
            System.out.println("buckys match");
        if(a == b){
            System.out.println("it equals apples!");
        }
        else{
            System.out.println("it doesnot equals apples!");
        }
    }
}

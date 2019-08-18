package ex55_56;
// Inheritence: it is when a class inherits some methods from the super class. Here food is super class of
// potpie and tuna.
//Polymorphism: it is when the food class is used as a datatype for the object declaration of potpie and tuna.
//It is shown below.
public class apples {
    public static void main(String[] args) {
        //polymorphic behavior
        food bucky[] = new food[2];
        bucky[0] = new tuna();
        bucky[1] = new potpie();
        for(int j=0; j<2; j++)
            bucky[j].eat();
//=========== This is second part
        food fo = new food();
        fatty bucky_ = new fatty();
        bucky_.digest(fo);
    }
}

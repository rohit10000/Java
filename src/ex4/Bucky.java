package ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Bucky {
    public static void main(String[] args) {
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        //add array items to list1
        for(String x: things)
            list1.add(x);

        String[] morethings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();
        //add array items to list2
        for(String y: morethings)
            list2.add(y);

        for(int i=0; i<list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }
        System.out.println();


        editlist( list1, list2);
        for (int i=0; i<list1.size(); i++)
            System.out.printf("%s ", list1.get(i));
        System.out.println();
    }
    public static void editlist(Collection<String> l1, Collection<String > l2){
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next()))
                    it.remove();
        }
    }
}

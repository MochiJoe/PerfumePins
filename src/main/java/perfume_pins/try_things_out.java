package perfume_pins;

import java.lang.reflect.Array;
import java.util.*;

public class try_things_out {
    Scanner console = new Scanner(System.in);

    public static void main(String args[]){



        String name = "Kashi";
        String me = "";
        //String initial ;


        //System.out.print("Enter Middle Initial: ");
        //initial = console.next();
        //initial.toUpperCase();


        for (int i = 0 ; i <3 ; i++){
            me = me + name.charAt(i);

        }
        System.out.println(me);
        System.out.println(name.charAt(0));
        //System.out.print(initial);
        //return me;
    }

}

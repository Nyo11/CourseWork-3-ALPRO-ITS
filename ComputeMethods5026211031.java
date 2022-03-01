import java.util.*;
import java.lang.*;

class ComputeMethods5026211031 {
    public double fToC (double degreesF) {
        
        double result = (double) 5/9 * (degreesF - 32);
        System.out.println("Temp in celsius is " + result);
        return result;

    }

    public double hypotenuse (int a, int b) {

        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hypotenuse is " + c);
        return c;

    }

    public int roll() {

        Random d1 = new Random();
        Random d2 = new Random();
        int sides = 6;


        int y = d1.nextInt(sides);
        y++;
        int z = d2.nextInt(sides);
        z++;
        
        int total = y+z;
        System.out.println("The sum of the dice values is " + total);
        return total; 

        
        
    }
}
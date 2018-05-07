/* When you pass an array as a parameter, Java does not create a new copy of the array.  
 * That would be very inefficient for large arrays.  Instead, the parameter variable 
 * stores a reference (or pointer) to the same array.  What this means is that if the 
 * method modifies the array, then those modifications will be seen 
 * outside the method. */

import java.util.Arrays;
public class ReferenceExample {
    public static void main(String[ ] args) {
        double value1 = 3.14;
        System.out.println("The double, value1, before the method call: " + value1);
        setToZero(value1);
        System.out.println("The double, value1, after the method call:  " + value1);

        double[ ] array1 = {1.0, 0.5, 0.25, 0.125, 0.0625};
        System.out.println("The array before the method call: " + 
                           Arrays.toString(array1));
        set2Zero(array1, 3);
        System.out.println("The array after the method call:  " + 
                           Arrays.toString(array1));
    }

    /* methods creates copies of primitive types (int, double, boolean, char). 
     * The copy gets a new, different memory location. So, changes inside the method are
     not seen outside the method. */
    
    public static void setToZero(double value1) {
        value1 = 0;
        System.out.println("value1 during method call, i.e. inside setToZero function: " + value1);
    }

    /* This method succeeds in changing array1. Passes the memory address so as to avoid
    inefficient use of memory. Arrays, objects, etc can be quite large. */
    public static void set2Zero(double[ ] array1, int index) {
        array1[index] = 0;
        System.out.println("The array after inside the function, during method call:  " + 
                           Arrays.toString(array1));
        
    }
}
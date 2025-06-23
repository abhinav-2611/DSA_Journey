public class DefaultvalOfDatatypes {
    // Instance variables
    byte a;
    short b;
    int c;
    float d;
    double e;
    long f;
    char g;                         
    boolean h;
     /*
       Key Notes:
-->Instance Variables: Instance variables are initialized automatically with their default values when an object of the class is created, 
even if you don't explicitly assign values to them.
-->Local Variables: Local variables, on the other hand, are not automatically initialized and must be explicitly assigned a value before
 they are used.
      */
    public static void main(String[] args) {
        DefaultvalOfDatatypes obj = new DefaultvalOfDatatypes();

        // Printing default values of instance variables
        System.out.println("byte: " + obj.a);
        System.out.println("short: " + obj.b);
        System.out.println("int: " + obj.c);
        System.out.println("long: " + obj.f);
        System.out.println("float: " + obj.d);
        System.out.println("double: " + obj.e);
        System.out.println("char: [" + obj.g + "]");
        System.out.println("boolean: " + obj.h);
    }
}
/*Default Values: When an object of the class DefaultvalOfDatatypes is created, the instance variables get default values as follows:

byte: 0
short: 0
int: 0
long: 0L
float: 0.0f
double: 0.0d
char: \u0000 (null character)
boolean: false
*/


//size of dataTypes 
/*byte  :	1 byte	
short :	2 bytes	
int	  :  4 bytes	
long  :	8 bytes	
float :	4 bytes	
double:	8 bytes	
char  :	2 bytes	
boolean :1 bit
*/
/* 
Literal is the source code representation of a fixed value
Types of literals:-
1.Integer Literals
2.Floating-Point Literals
3.Character & String Literals
4.null Literals
5.Class Literals
*/

public class Literals {
    public static void main(String[] args) {
        // Integer Literal - byte, short, int, long
        //we can express Integer literals in these number systems
        int decVal = 26 ;
        int hexVal = 0x1a ;
        int octVal = 032 ;
        int binVal = 0b11010 ;

        // Floating-Point Literal
        float floatVal = 1.23f ;
        float floatVal1 = 2 ; // 2.0
        double doubleVal = 1.23; // or 1.23d or 1.23D

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2; // it means 1.234 * 10^2 = 123.4
        
        // Character Literal
        char charVal = 'A' ;
        //char as unicode escape sequence
        char unicodeChar = '\u0041' ; // Unicode representation of 'A'  

        // String Literal
        String strVal = "Hello, World!" ;

        // null Literal - it can be used as a value for reference types
        String nullStr = null ;

        // Class literals - they are used to refer to the class itself
        Class<String> stringClass = String.class ;
        System.out.println(stringClass); // Output: class java.lang.String

        //USING UNDERSCORE in numeric literals for better readability

        //long creditCardNumber = 1234_5678_9012_3456_L ; this gives error
        //cant use underscore at the end of the literal and after the suffix L or l and start of the literal
        long creditCardNumber = 1234_5678_9012_3456L ;

       // float pi = 3._1415f ; // this gives error because we cant use underscore after & before the decimal point
        float pi = 3.14_15f ;
       // long hexBytes = 0x_FF_EC_DE_5E ; this gives error because we cant use underscore after & before & between 0x

        long hexBytes = 0xF_F_EC_DE_5EL ;
        int underInt = 1____0_10 ; 





        
        
    }
    
}

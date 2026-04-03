//This program demonstrates the use of variables
public class Operators {
    public static void main(String[] args) {
        System.out.println("hello");
        // Types of operators in Java
        // 1. Arithmetic Operators + ,- ,* ,/ ,%
        // Additive Operator +
        int add = 1 + 2 ;
        float addFloat = 1.f + 2 ;// 3.0 This operation is done with 32-bit float precision 
        float addFloat1 = 2.f + 2f ; // 4.0
        
        int addRange = 2147483647 + 1 ;
        System.out.println("cyclic nature of int " + addRange ); // -2147483648

        //String concatenation
        String str1 = "abc" + 1.4F ;
        System.out.println(str1 + 2.9F);// abc1.42.9
        
        // Subtraction Operator -
        int a = 4 ;
        int b = 5 ;
        int sub = a - b ;
        int sub1 = (int)(3.3f -  2.4f) ; // 0
        
        int subRange = (2147483647 + 2147483647 + 2147483647) ; // 2147483645

        //Multiplication Operator
        int mulNum1 = 2 * 2147483647; ; //-2
        // int mulNum2 = mulNum2 * 2 ;// can't use before initialize the variable

        //Division Operator
        float divFloat1 = 2.f /2 ; // 1.0
        float divFloat2 = 4.0f /0.0f  ; // Infinity
        float divFloat3 = 0.0f /0.0f  ; // Nan

        int divInt1 =(int)( 4.0f /0.0f)  ; // 2147483647
        int divInt2 =(int)( 0.0f /0.0f)  ; // 0




        System.out.println( divFloat3);
        
        
    }
}
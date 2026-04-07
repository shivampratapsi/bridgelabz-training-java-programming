//This program demonstrates the use of variables

public class Operators {
    public static void main(String[] args) {
        System.out.println("hello");

        // All binary operators except for the assignment operators are evaluated from
        // left to right; assignment operators are evaluated right to left .

        // Types of operators in Java
        // 1. Arithmetic Operators + ,- ,* ,/ ,%

        // Additive Operator +
        float addFloat = 1.f + 2;// 3.0 This operation is done with 32-bit float precision
        float addFloat1 = 2.f + 2f; // 4.0

        int addRange = 2147483647 + 1;
        System.out.println("cyclic nature of int " + addRange); // -2147483648

        byte i = 1;
        byte j = 2;
        byte k = (byte) (i + j); // 3

        // Here numeric conversion not happen
        final byte aa = 1;
        final byte bb = 2;
        byte c = aa + bb; // 3

        float f1 = Float.NaN + 2; // NaN
        float f2 = Float.POSITIVE_INFINITY + Float.NEGATIVE_INFINITY; // NaN
        float infinit = Float.POSITIVE_INFINITY + Float.POSITIVE_INFINITY; // Infinity
        float infinit1 = Float.NEGATIVE_INFINITY + Float.NEGATIVE_INFINITY; // -Infinity
        System.out.println(f2);

        // String concatenation
        String str1 = "abc" + 1.4F;
        System.out.println(str1 + 2.9F);// abc1.42.9

        // The + operator is syntactically left-associative

        String show = 1 + 2 + "sum"; // 3sum
        String show1 = "sum" + 1 + 2.d; // sum12.0

        // Subtraction Operator -
        int sub1 = (int) (3.3f - 2.4f); // 0

        int subRange = (2147483647 + 2147483647 + 2147483647); // 2147483645

        // Multiplication Operator *
        int mulNum1 = 2 * 2147483647; // -2
        // int mulNum2 = mulNum2 * 2 ;// can't use before initialize the variable
        double dubble = 1e308 * 2.0; // Infinity e1 means 10^1

        float infinityFloat = Float.NEGATIVE_INFINITY * 0; // NaN
        float infinityFloat1 = Float.POSITIVE_INFINITY * 0; // NaN

        // Division Operator /
        float divFloat1 = 2.f / 2; // 1.0
        float divFloat2 = 4.0f / 0.0f; // Infinity
        float divFloat3 = 0.0f / 0.0f; // NaN
        float divFloat4 = 1.0f / -0.0f; // -Infinity

        int divInt1 = (int) (4.0f / 0.0f); // 2147483647
        int divInt2 = (int) (0.0f / 0.0f); // 0
        int divInt3 = -2147483648 / -1; // 0
        int divInt4 = (-2) / (-1); // 2
        int divInt5 = (-5) / 2; // -2

        // Remainder Operator %
        int remInt1 = -2147483648 % 2147483647; // -1
        int remInt2 = Integer.MAX_VALUE % 2; // 1
        int remInt3 = (int) 2.f % 2; // 0

        // float remFloat1 = 1 % 0 ; this result in Arithmetic Exception / by 0
        float remFloat1 = 3.0f % 0.0f; // NaN

        double remDouble = 3L + 2; // 5.0

        // 2.Unary Operator +, -, ++, --, !
        int q = +1;
        int p = -1;
        System.out.println("+++++");
        int unNum = q++ + ++q; // q++(1) + ++q(3) = 4
        System.out.println(q); // 3
        int unNum1 = p-- + --p; // p--(-1) + --p(-3) = -4
        System.out.println(q++ + ++q + ++q); // 3 + 5 + 6 = 14

        float unFLoat = 0.0f;
        System.out.println(unFLoat++ - --unFLoat + --unFLoat); // 0.0 - 0.0 + (-1.0) = -1.0

        // 3. Relational Operator > , < , >= , <=, ==, !=
        System.out.println(5.8d == 5.8f); // false
        System.out.println(2.4 == 2.4); // true
        System.out.println(2.4 != 2.4); // false
        System.out.println(1.0 == 1f); // true
        System.out.println(0.0 > 0.0); // false
        System.out.println(0.0 == 0.0); // true
        System.out.println(0.0 != 0.0); // false
        System.out.println(Float.NEGATIVE_INFINITY == Float.NEGATIVE_INFINITY); // true
        System.out.println(Float.POSITIVE_INFINITY > Float.NEGATIVE_INFINITY); // true
        System.out.println(Float.NaN != Float.NaN); // true
        System.out.println(Float.NaN == Float.NaN); // false
        System.out.println(Float.NaN <= Float.NaN); // false
        System.out.println("==========================");
        System.out.println(Double.NaN != Double.NaN); // true
        System.out.println(2.0f != 2.0d); // false
        System.out.println(2.0 == 2L); // true

        System.out.println(-0.0 == 0.0); // true Positive zero and negative zero are considered equal
        System.out.println(null == null); // true
        System.out.println(null != null); // false

        // 4. Logical Operator && , || , !

        System.out.println(2 > 1 && 1.1d == 1.1); // true
        System.out.println(2.0d == 2.f && 2.1 == 2.1); // (true) && (true)

        int lo = 1, lo2 = 2;
        // System.out.println((lo++ == lo2) && (lo++ == ++lo2) ); // false(1==2) &&
        // (2==3)
        System.out.println((++lo == lo2) || (++lo == ++lo2)); // false(1==2) && (2==3) lo =2 , lo2 =2

        System.out.println(lo);
        System.out.println(lo2);

        // 5. Bitwise &, | , ^
        System.out.println(1 + 1 & 2 * 3); // 2
        System.out.println(2 | 4); // 6
        System.out.println(2 ^ 1); // 3

        // Ternary Operator
        // The conditional operator is syntactically right-associative (it groups
        // right-to-left).
        // Thus, a?b:c?d:e?f:g means the same as a?b:(c?d:(e?f:g))

        int terOp = true ? 1 : 2;
        int complexTerOp = (false ? 1 : (false ? 3 : (true ? 5 : 6))); // 5
        System.out.println(complexTerOp);

        // Shift Operator >> , <<
        int leftShift1 = 3 << 1; // 3* (2^1)=6
        int leftShift2 = leftShift1++ << 1; // 6*(2^1)=12
        int leftShift3 = ++leftShift1 << 1; // 8*(2^1)=16

        float rightShift1 = 2 >> 2; // 2/ (2*2) =0
        int rightShift2 = -8 >> 4; // -8 / (2*4) = -1

        int tripleRightShift1 = -1 >>> 1; // 2147483647
        int tripleRightShift2 = 128 >>> 3;// 16

    }
}
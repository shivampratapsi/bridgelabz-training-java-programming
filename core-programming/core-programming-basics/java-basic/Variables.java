// There are 3 scopes of variable
// Local variable , instance variable, class variable

// There are 2 types of variables
//1. Primitive variable - byte, short, int, long, float, double, char, boolean
//2. Reference variable - String, Arrays, Objects

public class Variables {
    // class variable
    static int totalCount = 0;

    // instance variable
    String name;

    Variables(String name) {
        this.name = name;
        totalCount++;
    }

    public boolean isStudent() {
        // local variable
        boolean flag = false;
        return flag;
    }

    public static void main(String[] args) {

        // naming of varibales should be meaningful
        // it should not start with number and
        // should not contain special characters except _ and $

        int _a = 2; // This is valid variable name but not recommended
        int $ = 1; // This is valid variable name but not recommended
        int varName = 3;
        System.out.println($);

        // primitives type variable are stored in stack memory
        // 1.byte
        byte b = 127; // This will give error because byte range is -128 to 127
        byte ii = 1;
        byte jj = 2;
        byte k = (byte) (ii + jj);
        // 2.short
        short s = 32767;
        // 3.int
        int i = 2147483647;
        // 4.long
        long l = 9223372036854775807L;
        // 5.float
        float f = (float) 1.4; // bydefault, floating-point literals are double, so we need to cast it to float
                               // or use f
        float f1 = 1.4f;
        System.out.println(f);

        // 6.double
        double d = 1.4;
        double d1 = 1.4d;
        // 7.char
        char c = 'A';
        char c1 = 65; // this is A in ASCII value
        char c2 = '\u0041'; // Unicode representation of 'A'
        // char c3 = 'aa' ; This will give error , char can only hold single character
        // 8.boolean
        boolean bool = true;

        // Reference type variable store the heap reference
        // and they hold the reference of the object created in heap memory
        // and the reference stored in stack memory
        // here obj1 is stored in stack memory
        // because obj1 is reference type variable

        Variables obj1 = new Variables("Dell");
        System.out.println(obj1.name);

        // arrays are also reference type variable
        // here arr1 & arr2 are reference variable
        int[] arr1 = { 5, 10, 15 };
        int[] arr2 = new int[3];

        String str1 = "string";

        // var is used to declare local variable
        // compiler decide what is the real type of the variable you create
        var message = "Hello world!";
        var num = 1;
        System.out.println(((Object) num).getClass().getSimpleName()); // Integer

    }
}
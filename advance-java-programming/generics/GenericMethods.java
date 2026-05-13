import java.util.*;

public class GenericMethods<T extends Number> { // now we can only make use of byte , int , long, short

    static <T> void m1(T arr[]) {
        System.out.println("using <T> in m1 method");
        for (T i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

    }

    // using <?> can only read elements
    static void print(List<?> list) {// This list could contain anything—Integers, Strings, Custom Objects, etc.

        System.out.println("Using <?> in print method");

        for (Object i : list) {// can't use bcz compiler doesn't guarantee that element is String
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    // using <? extends T> ->only for reading , it means we can use subtype of T
    // also
    public void upperBoundMethod(List<? extends Number> num) {// here we can use List of type <Integer> , <Long>
                                                              // ,<Float> ,etc.

    }

    public void upperBoundMethod1(Map<String, ? extends Number> map) {
        // inside this we can't put(add) anything in map while using upperbound generics
        // only get works

    }

    public void upperBoundMethod2(Set<? extends Number> s) {

    }

    //

    // accepting List<Number> , in this we can add Integer, Float, Byte, Short
    // below method cant take list of type List<Integer> or List<Double> or any
    // other subclass of Number
    public static void addToList(List<Integer> list) {
        list.add(5);// Integer
        // list.add(4.5);//Double
        // list.add(4.5f);//Float
        list.addAll(list);// now it will append all above three values to end of same list

    }

    // uisng <? extends Type>
    // This one will accept List of subclasses of type given
    // Number is an abstract class which implement Serializable interface
    public static Number getListItem(List<? extends Number> list) {
        // list.add(2);// will give compile error , cant do change operation only get or
        // print type operation
        return list.get(0);

    }

    // using <? super Type> lower bound type
    // we can only change like add, delete but not get operation
    public static void addListUsingSuper(List<? super Integer> list, int a) {
        // I can only use list type Integer and superclasses of Integer
        list.add(a);

    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        // addToList(numberList);
        addToList(integerList);
        // process(integerList); // this will give error bcz type is different than
        // expected
        // System.out.println(numberList.toString());

        // getListItem method work on any subtype of list
        // System.out.println(getListItem(numberList));
        System.out.println(getListItem(integerList));

        addListUsingSuper(integerList, 8); // this will add elements in it
        System.out.println(integerList.toString());

        System.out.println("==========================");
        Integer[] arr = { 1, 2, 3 };

        GenericMethods.m1(arr);
        // GenericMethods <String> gm= new GenericMethods<>();// this will give error
        // Bound mismatch
        // Only use subclasses of Number
        GenericMethods<Integer> gm = new GenericMethods<>();
        GenericMethods<Byte> gm1 = new GenericMethods<>();
        GenericMethods<Number> gm2 = new GenericMethods<>();
        GenericMethods<Short> gm3 = new GenericMethods<>();
        GenericMethods<Float> gm4 = new GenericMethods<>();

        List<String> lst = Arrays.asList("a", "b");
        System.out.println(lst);

        // Wildcards are of 3 types <?> unbounded wildcards, <?extends T> upper bound,
        // <? super T> lower
        // bound
        // we can use PECS means producer extends , consumer super
        // Generics are invarient means Integer is subclass of Number , but
        // List<Integer> is not subclass of List<Number>
        // means if the methods is process(List <Number> list){} then we can't pass
        // another list of type List<Integer> to method, but we can pass Integer, FLoat,
        // Short ,Double, Byte value to it
        // compiler prevents this otherwise someone could pass <Double> also
        // so upper bound wildcard solve above problem by using <? extends Number>
        // only use when we read data from collection

        // By using <?> it means we can only read from list
        //

        GenericMethods.print(lst);

    }

}
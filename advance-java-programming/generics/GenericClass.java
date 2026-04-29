
public class GenericClass<T> implements interface1 {
    // For below methods class or interface must be defined with type parameter
    void m1(T i) { // internally it becomes void m1(Integer i)
        System.out.println("m1 method" + i);
        // return "shiva";
    }

    <E> E a1(E i) {// added return type T , also for this you have to declare T at toplevel , but
                   // if you use <E> then not need for top level
        return i;
    }

    public static void main(String[] args) {
        GenericClass<Integer> gc = new GenericClass<>();
        gc.m1(2);
        GenericClass<String> gc1 = new GenericClass<>();
        gc1.m1("shivam");
        gc.m2(2);
        gc1.m3("int");// <M> is decide via which object we call method here String type

    }
}

interface interface1 {
    default <M> void m2(M w) { // its a generic method
        System.out.println("m2 interface" + w);
    }

    default <M> void m3(M name) { // <M> its scope is method only
        System.out.println("m3 interface " + name);
    }

}

// if method is a utility then use <T> void m1( T i){} this is generic method
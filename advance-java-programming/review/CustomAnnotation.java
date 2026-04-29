import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD })

public @interface CustomAnnotation {
    String name();

    int a = 3;
}

@CustomAnnotation(name = "Interface")
interface CustomInterfaceAnnot {

    void m1();
}

@CustomAnnotation(name = "Class")
class CustomAnnot {

    @CustomAnnotation(name = "Field")
    int a;

    @CustomAnnotation(name = "Constructor")
    CustomAnnot() {
        System.out.println("Use custom annotation.");
    }

    @CustomAnnotation(name = "Method")
    void method() {
        System.out.println("I am method.");
    }

    @CustomAnnotation(name = "Method")
    public static void main(String[] args) {

    }
}

package polymorphism;


//public final class Shapes{}
//prevent inheritance
//if we declare the class as final implicitly its methods will also be final

public class Shapes {

    //late Binding
    void area(){
        System.out.println("Area of Shapes");
    }

    static void greating(){
        System.out.println("we are inside the shapes class");
    }


    //Early Binding

//this will show error becaue final keyword prevent from overriding this method
    //also used to prevent inheritance when final key word is used in class defination
//    final void area(){
//        System.out.println("Area of Shapes");
//    }
}

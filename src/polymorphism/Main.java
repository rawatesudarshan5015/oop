package polymorphism;

public class Main {

    public static void main(String[] args){
        Shapes shape = new Shapes();
        Shapes square = new Square();
        Shapes triangle = new Triangle();
        Shapes circle = new Circle();


        shape.area();
        shape.greating();//you can inherite but can't override methods
        Square.greating();//can't override the static methods
        square.area(); // java at run time decide which version of the method to call
                        // called as dynamic method dispatch
                        // it depends on the object type not the reference type
                        //
    }
}

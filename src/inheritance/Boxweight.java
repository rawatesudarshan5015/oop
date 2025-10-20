package inheritance;

public class Boxweight extends Box {

    int weight;

    Boxweight(double w,double l, double h,int weight) {

        //super calls just above class constructors
        super(w,h,l);//if not define it is called automatically in java
        this.weight = weight;
    }
}

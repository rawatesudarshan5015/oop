package inheritance;

public class Box {
    double w;
    double h;
    double l;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double w,double h,double l){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box box){
        this.l = box.l;
        this.h = box.h;
        this.w = box.w;
    }

}

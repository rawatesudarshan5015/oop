package inheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Box box = new Box();
        Box box1 = new Box(15);
        Box box2 = new Box(10,15,12);
        Box box3 = new Box(box1);
//        System.out.println(box.h+" "+box.l+" "+box.w);
//
//        System.out.println(box1.h+" "+box1.l+" "+box1.w);
//        System.out.println(box2.h+" "+box2.l+" "+box2.w);
//
//        System.out.println(box1.h+" "+box1.l+" "+box1.w);
//
//        System.out.println(box3.h+" "+box3.l+" "+box3.w);


        Boxweight bx1 = new Boxweight(10,12,13,14);
        System.out.println(bx1.weight+" "+bx1.h+" "+bx1.l+" "+bx1.w);
        Boxweight bx2 = new Boxweight(15,15,85,96);
        System.out.println(bx2.weight+" "+bx2.h+" "+bx2.l+" "+bx2.w);

    }
}
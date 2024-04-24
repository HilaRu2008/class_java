public class Tester {

    public static void main(String[]args){


        //******************************************************
        //point

        Point p1 = new Point(1,1);
        Point p2 = new Point(3,3);


        //p1.printStatus();
        //p1.move(1,1);
        //p1.printStatus();
        //System.out.println(p1);
        //System.out.println(p1._x);
        //System.out.println(p1.getY());

        //p2.printStatus();
        //p2.move(1,1);

        //p2.printStatus();
        //System.out.println(p2.equals(4,4));

        //p2.printStatus();




        //**************************************************
        //series progression

        ArithmeticProgression prog = new ArithmeticProgression(2,2);
//
//        prog.printGeneralSeries();
//        System.out.println(prog.memberCalculation(10));
//        System.out.println(prog.calculateN(8));
        //System.out.println("1:  " + prog.toString());

        ArithmeticProgression prog2 = new ArithmeticProgression(prog);
        ArithmeticProgression prog3 = new ArithmeticProgression(3,2);

        //System.out.println("2:  " + prog.toString());
//
        //System.out.println(prog.equals(prog2));
        System.out.println(prog.smallDiff(prog3));


        //**************************************************
        // student class
        /*

        Student student = new Student("Hila", "Rubin", 217112408);
        System.out.println(student.toString());


        //****************************************************
        // book class

        Book book = new Book("percy jackson", "rick", 3);
        System.out.println(book.toString());

*/

    }





}

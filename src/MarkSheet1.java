public class MarkSheet1 {
        static int total;
        static  int markes = 100;
        static double percentage;


        public static void markSheet(String name  ,int roll_no,  int maths, int english, int science ) {
            total = maths + science + english;
            percentage = total / 3;
            System.out.println(name + ": total Marks = " + total + " & percentage =" + percentage);
        }
        public static void main(String[] args) {

            markSheet("ABC", 1,22,48,55);
            if(markes>=35) {
                System.out.println("pass");
            } else{
                System.out.println("fail");}{

                markSheet("DEF",2,55,58,59);
                if(markes>=35) {
                    System.out.println("pass");
                } else {
                    System.out.println("fail");
                }{
                    markSheet("GHI", 3,10,13,11);
                    if(markes>=35) {
                        System.out.println("pass");
                    } else{
                        System.out.println("fail");
                    }}}}}


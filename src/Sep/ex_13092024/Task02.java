package Sep.ex_13092024;

public class Task02 {
    public static void main(String[] args) {
        //Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
        //double a = 34;
        //double b = 10;
        //Print - a+b, a-b, ab, a/b, a%b all the outputs.

        double a = 34;
        double b = 10;

        System.out.printf("%f + %f = %f\n",a,b,a+b);
        System.out.println();
        System.out.printf("%f - %f = %f\n",a,b,a-b);
        System.out.println();
        System.out.printf("%f x %f = %f\n",a,b,a*b);
        System.out.println();
        System.out.printf("%f / %f = %f\n",a,b,a/b);
        System.out.println();
        System.out.printf("%f mod %f = %f\n",a,b,a%b);
        System.out.println();


    }
}

package Sep.ex_16092024;

public class Tasks {
    public static void main(String[] args) {
        // 1. Difference between = and  ==
        // "=" is assignment operator. It assigns the value to the variable . e.g. int a = 10;
        //"==" is comparison operator. It compares value between two operands and its output is always a Boolean.(TRUE/FALSE)
        //e.g. System.out.println( a==10);

        //2. byte b = 10; long l = 10l; → How much Byte will be used.
        byte b = 10;
        // 1 byte & 8 bits
        long l = 10;
        // 8 byte & 64 bits
        String s = "sarika";
        // 8 byte & 64 bits

        System.out.println(s);
        System.out.println(l);
        System.out.println(b);

        // 3. Another byte b = 10; byte c = 10;
        // What is the answer if we perform b+c, What is the data type it will give in result.
        byte b = 10;
        byte c = 10;
        int a = b+c;
        System.out.printf("%d+%d=%d",b,c,a);
        System.out.println(a);
        //As per java rules Byte + Byte = int,
        //so if Byte b = 10 and Byte c = 10 then the answer 20 is stored in int.

        // Extra info
        char x = 'A';
        char y = 'B';
        int z = x+y;
        System.out.println(z);

       //4
        short s = 10;
        char c = 'A'; //65
        int ss = s+c;
        System.out.println(ss);

      //  We get the output 75, as ASCII Value of A is used

    }
}

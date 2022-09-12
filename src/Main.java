public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // comments
        /*
        variables have 4 integer based types EX BYTE, SHORT
        2 real number types
        boolean data type = true or false
        character data -> a single character
        */

        byte value = 14; // value can be set from -128 to 127                   takes 8-bit of comp memory aka byte
        short anotherValue = -15367; //value range from -32768 to 32767         16 bit integers aka 2 byte
        int mostPopularValue = 43; //range from -2147483648 to 2147483647        32 bit
        long extremeBigNumber =  -233;// -9 quintillion to 9 quintillion          64 bit
        // all powers of 2 bc binary 0 or 1 2 possible value

        // real num types
        float realValue = 3.6F; //32 bit range from -big to big ~7 sig figs put f at end to turn it to float value
        double popularRealValue = -234.36463; // 64 bit ~15 sig figs

        boolean lightswitch = true; // only values of true or false

        char singleCharacter = '#'; // unicode system 65535 character have been assigned           made from integers
        // 'A' == 65 'a' == 97 '0' == 48      B = 66
        // 01000001  01100001    00110000

        // strings - collections of information between quotation marks

        String schoolName = "fdh";
        // names rules: no spaces, no num at beginning, camel case = capitalize second word and beyond

        int z = 'c';
        System.out.println(z);

    }
}
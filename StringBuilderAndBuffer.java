public class StringBuilderAndBuffer {
    public static void main(String[] args) {
        // string builder it is mutable
        StringBuilder str = new StringBuilder("hello");
        str.append("hiii");
        System.out.println(str);

        StringBuilder str1 = new StringBuilder(15);
        str1.append("hello");
        System.out.println(str1.length());
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder(10);
        str2.append("hello hiii byeeee");
        System.out.println(str2.length());
        System.out.println(str2.capacity());   // formula (old*2+2) here old is capacity 10


        // string buffer
        StringBuffer s0 = new StringBuffer(10);
        s0.append("hello");
        System.out.println(s0.length());
        System.out.println(s0.capacity());


        StringBuffer s1 = new StringBuffer("hiii");
        s1.append("hello");
        System.out.println(s1.length());
        System.out.println(s1.capacity());


        StringBuffer s2 = new StringBuffer("loohiiio");
        System.out.println(s2.length());
        System.out.println(s2.capacity());
    }
}

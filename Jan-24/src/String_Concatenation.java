public class String_Concatenation {

    public static void main(String[] args) {
        String s="Sachin"+" Tendulkae";
        s= s+" mahi";
        String s2 = s+" mahi";
        s= s+" ravi";

        String s3 = s;
        String s4 = s2;


        System.out.println(s);
        System.out.println(s2);

        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        System.out.println(s3==s);
        System.out.println(s4==s2);

    }

}

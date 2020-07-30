package li_thuyet;

public class CompareString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = str1;
        String str4 = new String("Hello");
        String str5 =  new String("Hello");
        String str6 =  new String("C0520K1");
//        System.out.println(str1 == str2);
//        System.out.println(str2 == str3);
//        System.out.println(str4 == str1);
//        System.out.println(str4 == str5);
//        System.out.println(str5 == str6);
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str4));
//        System.out.println(str4.equals(str6));
//        System.out.println(str4.equals(str5));

        System.out.println(str1.compareTo(str2));
        System.out.println(str4.compareTo(str6));
        System.out.println(str1.compareTo(str6));

    }
}

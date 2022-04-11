public class TestString {

    public static void main(String[] args) {
        String a= "123";
        String b=a;
        a = "234";
        System.out.println(b);


        String c =b;
        changeString(a);
        System.out.println(c);






    }

    public static void changeString (String a){
        a= "345";
    }
}

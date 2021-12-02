package task2;

public class RegularExpression {
    public static void main(String[] args) {
   String test = "2222222222222@qq.com";
        System.out.println(is_email_address(test));
    }


    public static boolean is_email_address(String address)
    {
        String regular="^[A-Za-z\\d]+([-_.][A-Za-z\\d]+)*@([A-Za-z\\d]+[-.])+[A-Za-z\\d]{2,4}$";
        return address.matches(regular);
    }

}

package task1.Test;

import task1.Cat.BlackCat;
import task1.Cat.Cat;
import task1.Cat.OrangeCat;
import task1.CatCafe.MyCatCafe;
import task1.Customer;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //猫列表
         ArrayList<Cat>  Cats= new ArrayList<>();
         //用户列表
         ArrayList<Customer> Customers = new ArrayList<>();
         //创建猫咖
        MyCatCafe myCatCafe = new MyCatCafe(20000,Cats,Customers);
        myCatCafe.buy_cat(new OrangeCat("橘猫1号",2,"F",false));
        myCatCafe.buy_cat(new BlackCat("黑猫1号",2,"F"));
        Customer customer1 = new Customer("张三");
        myCatCafe.entertain(customer1);
        Customer customer2 = new Customer("李四");
        myCatCafe.entertain(customer2);
        myCatCafe.entertain(customer2);
        myCatCafe.entertain(customer2);
        myCatCafe.Shutdown();

    }
}

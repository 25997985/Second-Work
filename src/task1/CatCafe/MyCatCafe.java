package task1.CatCafe;

import task1.Cat.Cat;
import task1.CatCafe.CatCafe;
import task1.Customer;
import task1.Exception.CatNotFoundException;
import task1.Exception.InsufficientBalanceException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements CatCafe {
    private double money;
    public ArrayList<Cat> Cats;
    public ArrayList<Customer> Customers ;
    public MyCatCafe() {
    }

    public MyCatCafe(double money ,ArrayList<Cat> Cats,ArrayList<Customer> Customers) {
        this.money = money;
        this.Cats=Cats;
        this.Customers=Customers;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void buy_cat( Cat cat) {
        //钱足够
       if(this.getMoney()-cat.getPrice()>=0)
       {
           //向猫列表添加新的猫
           Cats.add(cat);
           //余额减少
           this.setMoney(money-cat.getPrice());
       }
       //钱不够买猫
       else throw new InsufficientBalanceException("余额不足");

    }

    @Override
    public void entertain(Customer customer) {
        //如果没有猫
      if(Cats.size()==0)throw new CatNotFoundException("不好意思，店里没有猫呦");
       //有猫的情况
      else
      {
          //赚取15元，余额增加
          this.setMoney(this.getMoney()+15);
          //设置用户的到店时间
          customer.setArrive_time(LocalDate.now());
          //用户的rua猫次数增加
          customer.setRua_cat(customer.getRua_cat()+1);
          //看看是否是老用户
          if(!Customers.contains(customer))
          {
              Customers.add(customer);
          }
          //猫的数量
          int numberOfCat =Cats.size();
          Random random = new Random();
          //选猫
          int cat_number = random.nextInt(numberOfCat);
          Cat cat = Cats.get(cat_number);
          System.out.println(cat);
      }
    }

    @Override
    public void Shutdown() {
        int total_earn=0;
    for(int number=0;number<Customers.size();number++)
    {
        //找日期是今天的用户
        if(LocalDate.now().equals(Customers.get(number).getArrive_time()))
        {
            System.out.println(Customers.get(number));
            //增加金额rua猫次数*单价15
            total_earn+=Customers.get(number).getRua_cat()*15;
        }
    }
        System.out.println("总利润为： "+total_earn);
    }
}

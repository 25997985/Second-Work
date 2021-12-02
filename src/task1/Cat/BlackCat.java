package task1.Cat;

import task1.Cat.Cat;

public class BlackCat extends Cat {


    public BlackCat(String name, int age, String sex) {
        super(name, age, sex, 350);
    }

    @Override
    public String toString() {
        return "BlackCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }


}

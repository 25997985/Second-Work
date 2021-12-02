package task1.Cat;

import task1.Cat.Cat;

public class OrangeCat extends Cat {
    public boolean isFat;

    public OrangeCat(String cat, int age, String sex,boolean isFat) {
        super(cat, age, sex, 200);
        this.isFat=isFat;
    }


    @Override
    public String toString() {
        return "OrangeCat{" +
                "cat='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", isFat=" + isFat +
                '}';
    }



}

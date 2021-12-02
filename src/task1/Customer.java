package task1;

import java.time.LocalDate;

public class Customer {
    private String name ;
    private int rua_cat;
    private LocalDate arrive_time;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", rua_cat=" + rua_cat +
                ", arrive_time=" + arrive_time +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRua_cat() {
        return rua_cat;
    }

    public void setRua_cat(int rua_cat) {
        this.rua_cat = rua_cat;
    }

    public LocalDate getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(LocalDate arrive_time) {
        this.arrive_time = arrive_time;
    }

    public Customer(String name) {
        this.name = name;
    }
}

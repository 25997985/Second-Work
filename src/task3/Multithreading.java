package task3;

public class Multithreading {
    public static void main(String[] args) {
        int [] one = {1,3,5};
        int [] two = {2,4,6};

    out(one,two);
    }

    public static void out(int []array1,int []array2)
    {
        Multithreading multithreading1=new Multithreading();
        Multithreading multithreading2=new Multithreading();
        Thread one = new Thread(){
            public void run()
            {
               multithreading1.array_one(array1);
            }

        };
        Thread two = new Thread(){
            public void run()
            {
                multithreading1.array_two(array2);
            }

        };
        one.start();
        two.start();

    }

    public synchronized void array_one(int[] array1)
    {
        int number = 0;
        while(number<array1.length)
        {
            System.out.println(array1[number]);
            number++;

            try {
                this.notify();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
    }

    public  synchronized void array_two(int []array2)
    {
        int number = 0;
        while(number<array2.length)
        {
            System.out.println(array2[number]);
            number++;

            try {
                this.notify();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
    }
}

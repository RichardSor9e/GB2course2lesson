package lesson5;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];
    static  long a = System.currentTimeMillis();



    public static void main(String[] args) {


        for (int i = 0; i < size; i++) {
            Main.arr[i] = 1;
        }
        System.out.println("Задаем еденицы в массив за: " + (System.currentTimeMillis() - a));

        Main.createArr1();
        Main.createArr2();


        Thread t1 = new FirstTread();
        Thread t2 = new SecondTread();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Main.splicing();


    }
    public static void createArr1 (){

        for (int i = 0; i < size; i++) {

            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Первое мат выражение за: " + (System.currentTimeMillis() - a));



    }
    public static void createArr2 (){

        long b = System.currentTimeMillis();
        System.arraycopy(arr,0,a1,0,h);
        System.arraycopy(arr,h,a2,0,h);
        System.out.println("Скорость разделения массива на 2: " + (System.currentTimeMillis() - b));

    }
    public static void splicing(){
        long b = System.currentTimeMillis();
        System.arraycopy(a1,0,arr,0,h);
        System.arraycopy(a2,0,arr,h,h);

        System.out.println("Скорость склейки массивов: " + (System.currentTimeMillis() - b));
    }
}

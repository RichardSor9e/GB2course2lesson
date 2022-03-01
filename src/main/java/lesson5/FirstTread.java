package lesson5;

public class FirstTread extends Thread {

    @Override
    public void run() {
        long b = System.currentTimeMillis();
        for (int i = 0; i < Main.h; i++) {

            Main.a1[i] = (float) (Main.a1[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Скорость подсчета для 2.1 массива: " + (System.currentTimeMillis() - b));
    }
    }


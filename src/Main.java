public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int [] first = new int [] {1, 2, 3};
        double [] second = {1.57, 7.654, 9.986};
        int [] third = new int [5];


    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int [] first = new int [] {1, 2, 3};
        double [] second = {1.57, 7.654, 9.986};
        int [] third = new int [5];
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);
            if (i < first.length-1) {
                System.out.print(", ");
            }
                else {
                    System.out.println();
                }
        }

        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]);
            if (i < second.length-1) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }


        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i]);
            if (i < third.length-1) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }



    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3

        int [] first = new int [] {1, 2, 3};
        double [] second = {1.57, 7.654, 9.986};
        int [] third = new int [5];

        for (int i = first.length-1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

        }

        for (int i = second.length-1; i >= 0; i--) {
            System.out.print(second[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

        }

        for (int i = third.length-1; i >= 0; i--) {
            System.out.print(third[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

        }



    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4

    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5

    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6

    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7

    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8

    }

}
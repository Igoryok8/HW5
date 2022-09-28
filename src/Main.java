public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        int age =18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задание 2");
        int age1 = 24;
        if (age1 >= 7) {
            System.out.println("Ребёнок ходит в школу");
        }

        if (age1 >= 18) {
            System.out.println("Чловек закончил школу и может отправляться в университет");
        }
        if (age1 >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("Задание 3");
        int passenger = 101;
        if (passenger < 60) {
            System.out.println("Есть сидячее место");
        }

        if (passenger >= 60) {
            System.out.println("Есть стоячее место");
        }
        if (passenger >102) {
            System.out.println("Вагон полностью забит");
        }
    }
}
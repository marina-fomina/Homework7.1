public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задача №1");
        int [] numbers = new int [3];
        double [] secrets = {1.57, 7.654, 9.986};
        int [] years = {1994, 1996, 2001, 2007, 2018, 2021};

        // Задание 2
        System.out.println("Задача №2");
        for (int index = 0; index < numbers.length; index ++) {
            numbers[index] = index + 1;
            if (index == numbers.length - 1) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }

        for (double variant : secrets) {
            if (variant != secrets [secrets.length - 1]) {
                System.out.print(variant + ", ");;
            } else {
                System.out.println(variant);
            }
        }

        for (int variant : years) {
            if (variant != years [years.length - 1]) {
                System.out.print(variant + ", ");
            } else {
                System.out.println(variant);
            }
        }

        // Задание 3
        System.out.println("Задача №3");
        for (int index = numbers.length - 1; index >= 0; index --) {
            if (index != 0) {
                System.out.print(numbers[index] + ", ");
            } else {
                System.out.println(numbers [index]);
            }
        }

        for (int i = secrets.length - 1; i >= 0; i --) {
            if (i != 0) {
            System.out.print(secrets [i] + ", ");
            } else {
                System.out.println(secrets [i]);
            }
        }

        for (int i = years.length - 1; i >= 0; i --) {
            if (i != 0) {
                System.out.print(years [i] + ", ");
            } else {
                System.out.println(years [i]);
            }
        }


        // Задание 4
        System.out.println("Задача №4");
        for (int index = 0; index < numbers.length; index ++) {
            if (numbers[index] % 2 != 0) {
                numbers[index] = numbers[index] + 1;
            }
                System.out.print(numbers[index] + " ");

    }
}}
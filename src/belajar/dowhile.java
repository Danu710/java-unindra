package belajar;

public class dowhile {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String args[]) {

        Integer mount = input("Input bilangan");

        int i = 1;

        System.out.print("Bilangan yang merupakan kelipatan 3 atau 5 adalah : ");

        do {

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(" " + i);
            }

            i++;

        } while (i <= mount);
    }

    public static Integer input(String info) {
        System.out.print(info + " : ");
        Integer data = scanner.nextInt();
        return data;
    }

}

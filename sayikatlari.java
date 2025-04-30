import java.util.Scanner;

public class sayikatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        // 4'ün katları
        System.out.println("\n4'ün katları:");
        for (int i = 4; i <= sayi; i += 4) {
            System.out.println(i);
        }

        // 5'in katları
        System.out.println("\n5'in katları:");
        for (int i = 5; i <= sayi; i += 5) {
            System.out.println(i);
        }

        input.close();
    }
}

import java.util.Scanner;

public class PemilihanPercobaan108 {
    public static void main(String[] args) {
        
        Scanner input00 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input00.nextInt();

        String hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);

        input00.close();
    }
}
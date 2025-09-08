import java.util.Scanner;

public class PemilihanPercobaan308 {
    public static void main(String[] args) {
        
        Scanner input00 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan angka pertama: ");
        angka1 = input00.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        angka2 = input00.nextDouble();
        System.out.println("Masukkan operator (+ - * /): ");
        operator = input00.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                if (angka2 != 0){
                    hasil = angka1 / angka2;
                    System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan. ");
                }
                break;

        }

        input00.close();
    }
}
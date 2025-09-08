import java.util.Scanner;

public class HargaBayar08 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        int harga,jumlah;
        double dis=0.1, total, bayar, jmlDis;

        System.out.println("Masukkan harga barang yang akan dibeli: ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang akan dibeli: ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang anda harus bayar adalah: " + bayar);

        input.close();
    }
}
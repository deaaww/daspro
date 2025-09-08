import java.util.Scanner;

public class PemilihanPercobaan208 {
    public static void main(String[] args) {
        
        Scanner input00 = new Scanner(System.in);

        System.out.print("Nilai UAS     : ");
        float UAS = input00.nextFloat();
        System.out.print("Nilai UTS     : ");
        float UTS = input00.nextFloat();
        System.out.print("Nilai KUIS    : ");
        float KUIS = input00.nextFloat();
        System.out.print("Nilai TUGAS   : ");
        float TUGAS = input00.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (KUIS * 0.1F) + (TUGAS + 0.2F);
        String nilaiHuruf;
        String kualifikasi;

        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (total > 73 && total <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (total > 65 && total <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (total > 60 && total <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (total > 50 && total <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (total > 39 && total <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir = " + total + "sehingga " + message);

        input00.close();
    }
}
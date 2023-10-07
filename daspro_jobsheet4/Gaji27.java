import java.util.Scanner;

public class Gaji27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int JumlahMasuk, JumlahTidakMasuk, TotalGaji, Gaji, PotonganGaji;

        System.out.print("Masukkan jumlah Hari Masuk kerja anda :");
        JumlahMasuk = input.nextInt();

        System.out.print("Masukkan jumlah hari tidak masuk kerja anda :");
        JumlahTidakMasuk = input.nextInt();

        System.out.print("masukkan gaji per hari :");
        Gaji = input.nextInt();

        System.out.print("masukkan potongan gaji :");
        PotonganGaji = input.nextInt();

        TotalGaji = (JumlahMasuk*Gaji)-(JumlahTidakMasuk*PotonganGaji);

        System.out.println("Gaji yang anda terima adalah " + TotalGaji);

    }
}

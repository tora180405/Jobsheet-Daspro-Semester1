import java.util.Scanner;

public class HargaBayar27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merkBuku;
        int harga, jumlah, halaman;
        double dis, total, bayar, JmlDis;

        System.out.println("masukkan merek buku :");
        merkBuku=input.next();

        System.out.println("masukkan jumlah halaman buku :");
        halaman=input.nextInt();

        System.out.println("masukkan harga barang yang dibeli :");
        harga=input.nextInt();

        System.out.println("Masukkan Jumlah barang yang dibeli :");
        jumlah=input.nextInt();

        System.out.println("masukkan diskon :");
        dis=input.nextDouble();

        total=harga*jumlah;
        JmlDis=total*dis;
        bayar=total-JmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + JmlDis);
        System.out.println("jumlah yang harus dibayar adalah " + bayar);

    }
}

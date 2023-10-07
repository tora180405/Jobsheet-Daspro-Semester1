import java.util.Scanner;

public class Bank27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah_tabungan_awal, lama_menabung; 
        double presentase_bunga = 0.02, bunga, jumlah_tabungan_akhir;

        System.out.println ("masukkan jumlah tabungan awal anda"); 
        jumlah_tabungan_awal = input.nextInt();
        System.out.println ("masukkan lama menabung anda"); 
        lama_menabung = input.nextInt();

        bunga = lama_menabung * presentase_bunga * jumlah_tabungan_awal;

        jumlah_tabungan_akhir = bunga + jumlah_tabungan_awal;

        System.out.println("bunga :" + bunga);

        System.out.println("jumlah tabungan akhir anda adalah :" + jumlah_tabungan_akhir);

    }
}

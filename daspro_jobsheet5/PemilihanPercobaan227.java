import java.util.Scanner;

public class PemilihanPercobaan227 {
    public static void main(String[] args) {
        Scanner input27 =  new Scanner(System.in);

        System.out.print("Nilai UAS     :");
        float uas = input27.nextFloat();
        System.out.print("Nilai UTS     :");
        float uts = input27.nextFloat();
        System.out.print("Nilai kuis    :");
        float kuis = input27.nextFloat();
        System.out.print("Nilai tugas   :");
        float tugas = input27.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if(total > 80 && total <= 100){
            System.out.println("Nilai akhir anda adalah " +total+ " sehingga nilai anda adalah A dengan nilai setara 4 kualifikasi anda adalah Sangat Baik");
        }
        else if(total > 73 && total <= 80){
            System.out.println("Nilai akhir anda adalah " +total+ " sehingga nilai anda adalah B+ dengan nilai setara 3,5 kualifikasi anda adalah Lebih Baik Dari");
        }
        else if(total > 65 && total <= 73){
            System.out.println("Nilai akhir anda adalah " +total+ " sehingga nilai anda adalah B dengan nilai setara 3 kualifikasi anda adalah Baik");
        }
        else if(total > 60 && total <= 65){
            System.out.println("Nilai akhir anda adalah " +total+ " sehingga nilai anda adalah C+ dengan nilai setara 2,5 kualifikasi anda adalah Lebih Dari Cukup");
        }
        else if(total > 50 && total <= 60){
            System.out.println("Nilai akhir anda adalah " +total+ " sehingga nilai anda adalah C dengan nilai setara 2 kualifikasi anda adalah Cukup");
        }
        else if(total > 39 && total <= 50){
            System.out.println("Nilai akhir anda adalah " +total+ " sehingga nilai anda adalah D dengan nilai setara 1 kualifikasi anda adalah Kurang");
        }
        else if(total <= 39){
            System.out.println("Nilai akhir anda adalah " +total+ " sehingga nilai anda adalah E dengan nilai setara 0 kualifikasi anda adalah Gagal");
        }else{
            System.out.println("masukkan format yang sesuai");
        }
        
    }
}

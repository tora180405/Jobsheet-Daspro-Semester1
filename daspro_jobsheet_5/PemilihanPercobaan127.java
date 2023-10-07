import java.util.Scanner;

public class PemilihanPercobaan127 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka  = input27.nextInt();

        String hasil = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka " + angka + " bilangan ganjil";

        System.out.println(hasil);      
    }
}
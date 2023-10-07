import java.util.Scanner;

public class Lingkaran27{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double keliling, luas, p =3.14;

        System.out.print("masukkan jari-jari lingkaeran :");
        r = input.nextInt();

        keliling = 2*p*r;
        luas = p*r*r;

        System.out.println("keliling : " + keliling);
        System.out.println("luas     : " + luas);
    }
}
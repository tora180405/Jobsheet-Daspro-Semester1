import java.util.Scanner;

public class IndividuFPSno27{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jarak;

        System.out.print("Masukkan jarak musuh");
        jarak = input.nextInt();

        if(jarak < 5){
            System.out.println("pakai meele weapon");
        }else{
            System.out.println("pakai ranged weapon");
        }
        
    }
}
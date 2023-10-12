import java.util.Scanner;

public class Pemilihan2Percobaan2_27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.print("Masukkan sudut 1 :");
        int sudut1 = input27.nextInt();
        System.out.print("Masukkan sudut 2 :");
        int sudut2 = input27.nextInt();
        System.out.print("Masukkan sudut 3 :");
        int sudut3 = input27.nextInt();

        int totalSudut = sudut1 + sudut2 +sudut3;

        if(totalSudut == 180){
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else if((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            }else if((sudut1==sudut2) || (sudut1==sudut3) || (sudut3==sudut2)){
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }else{
                System.out.println("Segitiga tersebut adalah Segitiga sembarang");
            }
        }else{
            System.out.println("Bukan segitiga");
        }
    }
}

import java.util.Scanner;

public class IndividuLoginno27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "ToraDK", password = "ToraDigda", inuser, inpass;

        System.out.print("masukkan username :");
        inuser = input.nextLine();

        System.out.print("masukkan Password :");
        inpass = input.nextLine();

        if(inuser.equals(username) && inpass.equals(password)){
            System.out.println("anda berhasil masuk kedalam sistem");
        }else{
            System.out.println("username dan password yang anda masukkan salah");
        }
    }
}

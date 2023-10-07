import java.util.Scanner;

public class Inputnamasistemakademik {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);

            String username = "tora";
            String password = "halo";
    
            System.out.print("Masukkan username: ");
            username = scanner.nextLine();
    
            System.out.print("Masukkan password: ");
            password = scanner.nextLine();
    
            // Implementasikan validasi login di sini
            if (validateLogin(username, password)) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal. Coba lagi.");
            }
    
            scanner.close();
        }
    
            // Implementasikan metode validasi login di sini
            private static boolean validateLogin(String username, String password) {
            // Contoh validasi sederhana (username: admin, password: admin)
            return username.equals("admin") && password.equals("admin");
    
    }
}

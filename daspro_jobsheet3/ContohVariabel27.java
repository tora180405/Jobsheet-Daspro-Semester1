public class ContohVariabel27 {
    public static void main(String[] args) {
        String Hoby = "hoby saya adalah bermain game";
        boolean pintar = true;
        char jeniskelamin = 'L';
        byte umur = 20;
        double ipk = 3.24, tinggi = 1.78;
        
        System.out.println(Hoby);
        System.out.println("apakah pandai? " + pintar);
        System.out.println("jenis kelamin " + jeniskelamin);
        System.out.println("umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}

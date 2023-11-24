import java.util.Scanner;

public class Kubus07 {

    static double VolumeKubus(double sisi){
        double vol;
        vol = sisi * sisi * sisi;
        return vol;
    }

    static double luasKubus(double sisi){
        double luas;
        luas = 6 * (sisi *sisi);
        return luas;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sisi;
        System.out.print("Masukan sisi kubus: ");
        sisi = scan.nextDouble();
        double volumeKubus = VolumeKubus(sisi);
        double luasKubus = luasKubus(sisi);
        System.out.println("Volume Kubus: " + volumeKubus);
        System.out.println("Luas Kubus: " + luasKubus);
        scan.close();
    }
    
}

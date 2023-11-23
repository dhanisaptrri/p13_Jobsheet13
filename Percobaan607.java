import java.util.Scanner;

public class Percobaan607 {

    static int hitungLuas (int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int p,l,t,L, vol;
        System.out.println("Masukan panjang");
        p = scan.nextInt();
        System.out.println("Masukan lebar");
        l = scan.nextInt();
        System.out.println("Masukan tinggi");
        t = scan.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah "+L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah "+vol);
    }
    
}

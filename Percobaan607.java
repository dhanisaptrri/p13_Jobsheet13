import java.util.Scanner;

public class Percobaan607 {

    public static void main(String[] args){
        
        Scanner scan  = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukan panjang");
        p = scan.nextInt();
        System.out.println("Masukan lebar");
        l = scan.nextInt();
        System.out.println("Masukan tinggi");
        t = scan.nextInt();

        L = p*l;
        System.out.println("Luas persegi panjang adalah "+L);

        vol = p*l*t;
        System.out.println("Volume balok adalah "+vol);
    }
 
}

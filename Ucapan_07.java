import java.util.Scanner;

public class Ucapan_07 {

    public static String PenerimaUcapan(){

    Scanner scan = new Scanner(System.in);
    System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
    String namaOurang = scan.nextLine();
    scan.close();
    return namaOurang;
    }

    public static void main(String[] args){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you.");
    }
    
}
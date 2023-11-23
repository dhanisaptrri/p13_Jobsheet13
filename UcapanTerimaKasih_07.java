import java.util.Scanner;

public class UcapanTerimaKasih_07 {

    public static String PenerimaUcapan() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tuliskan NAMA orang yang ingi Anda beri ucapan");
        String namaOrang = scan.nextLine();
        scan.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih(){

        String nama = PenerimaUcapan();
        System.out.println("Thank you"+nama+"for being the best teacher in the world.\n"+"You inspired in me a love for learning and made me feel like I could ask you anything");
    }

    public static void main(String[] args){
        UcapanTerimakasih();
    }
}

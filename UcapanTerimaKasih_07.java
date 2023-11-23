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
        System.out.println("Jangan lupa untuk tetap tersenyum " +nama+ "\nKarena senyum sebagian iman");
    }

    public static void UcapanTambahan(String Ucapan){

        System.out.println(Ucapan);
    }
    public static void main(String[] args){
        UcapanTerimakasih();
        String khusus = "Semoga kamu besok bisa ketemu jemin";
        UcapanTambahan(khusus);
    }
}

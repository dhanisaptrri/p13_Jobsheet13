import java.util.Scanner;

public class TugasMahasiswa07 {

    static int[][] nilaiMahasiswa;
    static String[] namaMahasiswa;
    static int jmlMahasiswa;
    static int jmlTugas;

    static void inputNilai() {
        Scanner scan = new Scanner (System.in);

        System.out.print("Jumlah Mahasiswa : ");
        jmlMahasiswa = scan.nextInt();
        System.out.print("Jumlah Tugas yang Dikerjakan : ");
        jmlTugas = scan.nextInt();

        namaMahasiswa = new String[jmlMahasiswa];
        nilaiMahasiswa = new int[jmlMahasiswa][jmlTugas];

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.print("Masukan Nama Mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = scan.next();
            for(int j = 0; j < jmlTugas; j++){
                System.out.print("Nilai Tugas " + namaMahasiswa[i] + " Minggu ke-" + (j + 1) + " : ");
                nilaiMahasiswa[i][j] = scan.nextInt();
            }
        }
        scan.close();
    }

    static void daftarNilai() {
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.print("Total Nilai Tugas Milik " + namaMahasiswa[i] + ": ");
            for (int j = 0; j< jmlTugas; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

     static void mingguTertinggi(){

        int minggu = 0;

        for(int i = 0; i < jmlTugas; i++) {
            int tinggi = nilaiMahasiswa[0][i];
            for (int j = 1; j < jmlMahasiswa; j++) {
                if (nilaiMahasiswa[j][i] > tinggi) {
                    tinggi = nilaiMahasiswa[j][i];
                    minggu = j;
                }
            }
            System.out.println("Nilai Tertinggi Pada Minggu ke-" + (i + 1) + " oleh " + namaMahasiswa[minggu]);
        }
    }

    static void nilaiTertinggi() {
        for (int j = 0; j < jmlTugas; j++) {
            int nilaiTinggi = nilaiMahasiswa[0][j];
            int mhsTinggi = 0;

            for (int i = 1; i < jmlMahasiswa; i++) {
                if (nilaiMahasiswa[i][j] > nilaiTinggi) {
                    nilaiTinggi = nilaiMahasiswa[i][j];
                    mhsTinggi = i;
                }
            }
            System.out.println("Mahasiswa dengan Nilai Tertinggi Pada Minggu ke-" + (j + 1) + " adalah");
            System.out.println("Nama : " +  namaMahasiswa[mhsTinggi]);
            System.out.println("Nilai Tertinggi " + nilaiTinggi + " Pada Tugas Minggu ke-" + (j + 1));
            System.out.println();
        }
    }
    public static void main(String[] args){
        inputNilai();
        daftarNilai();
        mingguTertinggi();
        nilaiTertinggi();

    }
}
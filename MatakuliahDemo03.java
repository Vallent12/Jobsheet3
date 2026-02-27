import java.util.Scanner;
public class MatakuliahDemo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matakuliah03[] arrayOfMatakuliah03 = new Matakuliah03[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke- " + (i + 1));
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine();
            System.out.print("Sks          : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumalah jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayOfMatakuliah03[i] = new Matakuliah03(kode, nama, sks, jumlahJam);
        }

    }
    
}

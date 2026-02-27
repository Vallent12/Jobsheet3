import java.util.Scanner;
public class DosenDemo03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Dosen03[] arrayOfDosen03 = new Dosen03[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke- " + (i + 1));
            System.out.print("Kode         : ");
            String kode = sc.nextLine();
            System.out.print("Nama         : ");
            String nama = sc.nextLine();
            System.out.print("Jenis kelamin (Pria/Wanita) : ");
            String dummy = sc.nextLine();
            Boolean jenisKelamin = dummy.equalsIgnoreCase("Pria"); 
            System.out.print("Usia         : ");
            dummy = sc.nextLine();
            int usia = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");

            arrayOfDosen03[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen03 dsn : arrayOfDosen03) {
            System.out.println("Data Dosen ke- " + no++);
            System.out.println("Kode          : " + dsn.kode); 
            System.out.println("Nama          : " + dsn.nama); 
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("---------------------------------");
        }

        DataDosen03 data = new DataDosen03();

        data.dataSemuaDosen(arrayOfDosen03);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen03);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen03);
        data.infoDosenPalingTua(arrayOfDosen03);
        data.infoDosenPalingMuda(arrayOfDosen03);

        sc.close();
      }
    }

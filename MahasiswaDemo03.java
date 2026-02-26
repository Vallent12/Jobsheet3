package Jobsheet3;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Mahasiswa03[] arrayOfMahasiswa03 = new Mahasiswa03[3];
        arrayOfMahasiswa03[0] = new Mahasiswa03();
        arrayOfMahasiswa03[0].nim = "244107060033";
        arrayOfMahasiswa03[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa03[0].kelas = "SIB-1E";
        arrayOfMahasiswa03[0].ipk = (float) 3.75;

        arrayOfMahasiswa03[1] = new Mahasiswa03();
        arrayOfMahasiswa03[1].nim = "2341720172";
        arrayOfMahasiswa03[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa03[1].kelas = "TI-2A";
        arrayOfMahasiswa03[1].ipk = (float) 3.36;

        arrayOfMahasiswa03[2] = new Mahasiswa03();
        arrayOfMahasiswa03[2].nim = "244107023006";
        arrayOfMahasiswa03[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa03[2].kelas = "TI-2E";
        arrayOfMahasiswa03[2].ipk = (float) 3.80;

        System.out.println("NIM       : " + arrayOfMahasiswa03[0].nim);
        System.out.println("Nama      : " + arrayOfMahasiswa03[0].nama);
        System.out.println("Kelas     : " + arrayOfMahasiswa03[0].kelas);
        System.out.println("IPK       : " + arrayOfMahasiswa03[0].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM       : " + arrayOfMahasiswa03[1].nim);
        System.out.println("Nama      : " + arrayOfMahasiswa03[1].nama);
        System.out.println("Kelas     : " + arrayOfMahasiswa03[1].kelas);
        System.out.println("IPK       : " + arrayOfMahasiswa03[1].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM       : " + arrayOfMahasiswa03[2].nim);
        System.out.println("Nama      : " + arrayOfMahasiswa03[2].nama);
        System.out.println("Kelas     : " + arrayOfMahasiswa03[2].kelas);
        System.out.println("IPK       : " + arrayOfMahasiswa03[2].ipk);
        System.out.println("----------------------------------------");
    }
    
}

public class DataDosen03 {

    public void dataSemuaDosen(Dosen03[] arrayOfDosen03) {
        System.out.println("\n======= DATA SEMUA DOSEN =======");
        for (Dosen03 dsn : arrayOfDosen03) {
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen03) {
        int pria = 0, wanita = 0;
        for (Dosen03 dsn : arrayOfDosen03) {
            if (dsn.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\n======= JUMLAH DOSEN PER JENIS KELAMIN =======");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen03) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen03 dsn : arrayOfDosen03) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                jmlWanita++;
            }
        }

        System.out.println("\n======= RATA-RATA USIA PER JENIS KELAMIN =======");
        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double)totalUsiaPria/jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double)totalUsiaWanita/jmlWanita : 0));
    }

    public void infoDosenPalingTua(Dosen03[] arrayOfDosen03) {
        Dosen03 tertua = arrayOfDosen03[0];
        for (Dosen03 dsn : arrayOfDosen03) {
            if (dsn.usia > tertua.usia) tertua = dsn;
        }
        System.out.println("\n======= DOSEN PALING TUA =======");
        System.out.println("Nama : " + tertua.nama + " (Usia: " + tertua.usia + ")");
    }

    public void infoDosenPalingMuda(Dosen03[] arrayOfDosen03) {
        Dosen03 termuda = arrayOfDosen03[0];
        for (Dosen03 dsn : arrayOfDosen03) {
            if (dsn.usia < termuda.usia) termuda = dsn;
        }
        System.out.println("\n======= DOSEN PALING MUDA =======");
        System.out.println("Nama : " + termuda.nama + " (Usia: " + termuda.usia + ")");
    }
}
   

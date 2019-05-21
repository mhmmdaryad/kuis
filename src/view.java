import java.util.Scanner;

public class view {

    int poin = 0;
    boolean x = false;

    public void menuUtama() {

        OptionPane panel = new OptionPane();
        mulai start = new mulai();
        Scanner s = new Scanner(System.in);
        String opsi;
        int pilih = 0;
        String pertama = "1";
        String kedua = "2";

        System.out.println("\n=============== SELAMAT DATANG DI KUIS ISLAM ===============\n");
        System.out.println(" UNTUK MEMENUHI TUGAS BESAR MATA KULIAH PEMROGRAMAN LANJUT\n");
        System.out.println("\n Dengan nama kelompok: \n 1. MUHAMMAD ARYA DEWANGGA (201810370311209)\n 2. HANIF VARIANTO WARMAN (201810370311225)\n");

        System.out.println("\n SILAHKAN PILIH SALAH SATU OPSI DIBAWAH");
        System.out.println("\n 1. MULAI");
        System.out.println("\n 2. PERATURAN");


        while (x = true) {
            try {
                System.out.println("\nPilih ?");
                opsi = s.nextLine();

                if (opsi.equals(pertama)) {
                    pilih = 1;
                } else if (opsi.equals(kedua)) {
                    pilih = 2;
                } else {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                panel.salahInput();
                //   x = false;

            }
        }

        switch (pilih) {
            case 1:
                panel.masukkanNama();
                start.mulai();
                break;
            case 2:

                panel.peraturan();
                break;
        }
    }


}



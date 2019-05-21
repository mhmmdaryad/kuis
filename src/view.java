import java.util.Scanner;

public class view {

    int poin = 0;
    boolean x = false;

    public void menuUtama() {

        OptionPane panel = new OptionPane();
        mulai start= new mulai();
        peraturan aturan=new peraturan();
        Scanner s = new Scanner(System.in);
        int pilih;

        System.out.println("\n=============== SELAMAT DATANG DI KUIS ISLAM ===============\n");
        System.out.println(" UNTUK MEMENUHI TUGAS BESAR MATA KULIAH PEMROGRAMAN LANJUT\n");
        System.out.println("\n Dengan nama kelompok: \n 1. MUHAMMAD ARYA DEWANGGA (201810370311209)\n 2. HANIF VARIANTO WARMAN (201810370311225)\n");

        System.out.println("\n SILAHKAN PILIH SALAH SATU OPSI DIBAWAH");
        System.out.println("\n 1. MULAI");
        System.out.println("\n 2. PERATURAN");

        for (; ; ) {
            try {
                System.out.println("\nPilih ?");
                pilih = s.nextInt();
                break;
            } catch (Exception e) {
                panel.salahInput();
            }
        }

        switch (pilih) {
            case 1:
                panel.masukkanNama();
                start.mulai();
                break;
            case 2:

               aturan.peraturan();
                break;
        }
    }


}



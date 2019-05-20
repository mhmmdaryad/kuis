import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class view {

    OptionPane panel = new OptionPane();
    private boolean x = false;
    int poin;

    public void menuUtama() {
        data data = new data();
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
                mulai();
                break;
            case 2:

                //    peraturan();
                //  data.
                break;
        }
    }

    void mulai() {

        Scanner s = new Scanner(System.in);
        String jawab;
        JFrame f = new JFrame();

        for (int i = 1; i <= 5; i++) {

            switch (i) {
                case 1:
                    String kunci = "b";

                    System.out.println("1. Siapakah pendiri Organisasi Muhammadiyah?\n");
                    System.out.println("\ta. Ahmad Yani\n\tb. K.H. Ahmad Dahlan\n\tc. Hasyim Asy'ari\n\td. Abbdurahman Wahid\n");
                    System.out.println("Ketik 'H' untuk memilih opsi bantuan	 \n");


                    while (x = true) {
                        try {
                            System.out.println("Jawaban : ");
                            jawab = s.nextLine();

                            if (jawab.equals(kunci)) {
                                poin = poin + 10;
                            } else {
                                throw new Exception();
                            }
                            break;
                        } catch (Exception e) {
                            panel.salahInput();
                            x = true;
                        }
                    }
                    break;

                case 2:

                    kunci = "b";
                    System.out.println("\n\n2. Zakat terbagi menjadi dua macam, yaitu:");
                    System.out.println("\n\ta. Zakat Beras dan Zakat Uang\n\tb. Zakat Fitrah dan Zakat Maal \n\n");


                    while (x = true) {
                        try {
                            System.out.println("Jawaban : ");
                            jawab = s.nextLine();

                            if (jawab.equals(kunci)) {
                                poin = poin + 10;
                            } else {
                                throw new Exception();
                            }
                            break;
                        } catch (Exception e) {
                            panel.salahInput();
                            x = true;
                        }
                    }
                    break;

                case 3:
                    kunci = "empat";
                    System.out.println("\n\n3. Jumlah istri Nabi Muhammad adalah...(huruf)\n");

                    while (x = true) {
                        try {
                            System.out.println("Jawaban : ");
                            jawab = s.nextLine();

                            if (jawab.equals(kunci)) {
                                poin = poin + 10;
                            } else {
                                throw new Exception();
                            }
                            break;
                        } catch (Exception e) {
                            panel.salahInput();
                            x = true;
                        }
                    }
                    break;
            }

        }
        panel.hasil();
    }
}



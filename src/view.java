import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class view {

    public void menuUtama() {
        data data = new data();
        Scanner s = new Scanner(System.in);
        int pilih;
        String player;
        System.out.println("\n=============== SELAMAT DATANG DI KUIS ISLAM ===============\n");
        System.out.println(" UNTUK MEMENUHI TUGAS BESAR MATA KULIAH PEMROGRAMAN LANJUT\n");
        System.out.println("\n Dengan nama kelompok: \n 1. MUHAMMAD ARYA DEWANGGA (201810370311209)\n 2. HANIF VARIANTO WARMAN (201810370311225)\n");

        System.out.println("\n SILAHKAN PILIH SALAH SATU OPSI DIBAWAH");
        System.out.println("\n 1. MULAI");
        System.out.println("\n 2. PERATURAN");

        System.out.println("\nPilih ?");
        pilih = s.nextInt();

        System.out.println("\b");
        // player = s.nextInt();

        switch (pilih) {
            case 1:
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
        int poin = 0;
        JFrame f = new JFrame();

        for (int i = 1; i <= 5; i++) {

            switch (i) {
                case 1:
                    String kunci = "a";

                    System.out.println("1. Siapakah pendiri Organisasi Muhammadiyah?\n");
                    System.out.println("\ta. Ahmad Yani\n\tb. K.H. Ahmad Dahlan\n\tc. Hasyim Asy'ari\n\td. Abbdurahman Wahid\n");
                    System.out.println("Ketik 'H' untuk memilih opsi bantuan	 \n");
                    ulang1:
                    System.out.println("Jawaban : ");
                    jawab = s.nextLine();

                    if (jawab.equals(kunci)) {
                        poin = poin + 10;


                    } else {
                        //masih harus di perbaiki biar mutar ke atas
                        JOptionPane.showMessageDialog(f, "Successfully Updated.", "Alert", JOptionPane.WARNING_MESSAGE);
                        System.out.println("Jawaban SALAH");

                    }
                    break;
                case 2:

                    kunci = "a";
                    System.out.println("\n\n2. Zakat terbagi menjadi dua macam, yaitu:");
                    System.out.println("\n\ta. Zakat Fitrah dan Zakat Maal\n\tb. Zakat Beras dan Zakat Uang\n\n");
                    System.out.println("Ketik 'H' untuk memilih opsi bantuan	 \n");
                    System.out.println("Jawaban : ");
                    jawab = s.nextLine();

                    if (jawab.equals(kunci)) {
                        poin = poin + 10;


                    } else {
                        //masih harus di perbaiki biar mutar ke atas
                      //  JOptionPane.showMessageDialog(f, "Successfully Updated.", "Alert", JOptionPane.WARNING_MESSAGE);
                        System.out.println("Jawaban SALAH");

                    }
                    break;

                case 3:
                    kunci= "empat";
                    System.out.println("\n\n3. Jumlah istri Nabi Muhammad adalah...(huruf)\n");
                    System.out.println("Jawaban : ");
                    jawab=s.nextLine();

                    if (jawab.equals(kunci)) {
                        poin = poin + 10;

                    } else {
                        //masih harus di perbaiki biar mutar ke atas
                        //  JOptionPane.showMessageDialog(f, "Successfully Updated.", "Alert", JOptionPane.WARNING_MESSAGE);
                        System.out.println("Jawaban SALAH");

                    }
                    break;
            }

        } System.out.println("TOTAL POIN= "+poin);
    }

    public static void clrscr() {
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
}


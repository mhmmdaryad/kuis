import javax.swing.*;
import java.util.Scanner;


public class OptionPane extends view {
    //class untuk menampilkan pemberitahuan
    mulai m = new mulai();
    JFrame f = new JFrame();
    String name;
    String x;
    Scanner s = new Scanner(System.in);


    void masukkanNama() {
        name = JOptionPane.showInputDialog(f, "MASUKKAN NAMA");
        System.out.println("\n===Halo " + name + ", Selamat Mengerjakan===\n");
    }

    void salahInput() {
        JOptionPane.showMessageDialog(f, "JAWABAN ANDA SALAH !", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
    }

    void setHasil(int poin) {
        String hasil = "Selamat poin kamu " + poin;
        JOptionPane.showMessageDialog(f, hasil);
        System.out.println("\n\t\tTERIMA KASIH\n=====KUIS TELAH BERAKHIR=====");
        System.exit(0);
    }

    void peraturan() {
        JOptionPane.showMessageDialog(f, "[1].Jangan matikan Komputer saat sedang mengerjakan soal!!\n" +
                "[2].Dilarang untuk mencontek jawaban melalui internet\n" +
                "[3].Dianjurkan untuk mengerjakan disamping DIA\n" +
                "\n" +
                "Tolong kerjakan soal ini dengan hati yang ikhlas\n" +
                "Soal ini telah dibuat dengan mencurahkan air mata,keringat,dan mungkin darah\n" +
                "\t");
        boolean u;
        while (u = true) {
            try {
                System.out.println("Mulai Kuis? (y/n)");
                x = s.nextLine();
                if (x.equals("y")) {
                    m.mulai();
                } else if (x.equals("n")) {
                    System.out.println("\n TERIMA KASIH");
                    System.exit(0);
                } else {
                    throw new Exception();
                }
            } catch (Exception E) {
                salahInput();
                u = true;
            }
        }
    }
}
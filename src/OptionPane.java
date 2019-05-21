import javax.swing.*;


public class OptionPane extends view {
    //class untuk menampilkan pemberitahuan
    JFrame f = new JFrame();
    String name;

    void masukkanNama() {
        String name = JOptionPane.showInputDialog(f, "MASUKKAN NAMA ANDA");
        this.name = name;
    }

    void salahInput() {
        JOptionPane.showMessageDialog(f, "JAWABAN ANDA SALAH !", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
    }

    void setHasil(int poin) {
        JOptionPane.showMessageDialog(null, "Selamat " + name + ", poin anda " + poin);
        tesNama();
    }

    void tesNama() {

        System.out.println(name);
    }

}  
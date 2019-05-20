import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OptionPane extends view {
    //class untuk menampilkan pemberitahuan
    JFrame f = new JFrame();


    void masukkanNama() {
        String name = JOptionPane.showInputDialog(f, "MASUKKAN NAMA ANDA");
    }

    void salahInput() {
        JOptionPane.showMessageDialog(f, "JAWABAN ANDA SALAH !", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
    }

    void peraturan()throws IOException {
        //try {
            BufferedReader in = new BufferedReader(new FileReader("peraturan.txt"));
            String aLineFromFile = null;
            while ((aLineFromFile = in.readLine()) != null){
                JOptionPane.showMessageDialog(null, aLineFromFile);
            }
            in.close();
            return;
       // } catch (FileNotFoundException e) {
       // }


    }

    void hasil() {
        // JOptionPane.showMessageDialog(f,poin);
    }

}  
import javax.swing.*;

public class OptionPane extends view {
    //class untuk menampilkan pemberitahuan
    JFrame f = new JFrame();

    void masukkanNama() {

        String name = JOptionPane.showInputDialog(f, "Enter Name");
    }

    void salahInput() {
        JOptionPane.showMessageDialog(f, "JAWABAN ANDA SALAH !", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
    }

    void hasil() {
        JOptionPane.showMessageDialog(f, poin);
    }

   /* String output = "";
        for(
          int i = 0; i<games.size();i++)

    {
        String everything = sku.get(i).toString();
        String everything2 = games.get(i).toString();

        output += everything + " " + everything2 + "\n";
    }
JOptionPane.showMessageDialog(null,output);
*/
}  
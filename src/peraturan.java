import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class peraturan {

    void peraturan(){
        try {
            BufferedReader in = new BufferedReader(new FileReader("peraturan.txt"));

            String aLineFromFile = null;
            while ((aLineFromFile = in.readLine()) != null) {
                JOptionPane.showMessageDialog(null, aLineFromFile);
            }
            in.close();
            return;
        }catch (IOException e){

        }
    }
}

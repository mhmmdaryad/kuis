import java.util.Scanner;

public class mulai extends view {

    void mulai() {
        OptionPane panel = new OptionPane();
        Scanner s = new Scanner(System.in);
        String jawab;

        for (int i = 1; i <= 5; i++) {

            switch (i) {
                case 1:
                    String kunci = "b";

                    System.out.println("1. Siapakah pendiri Organisasi Muhammadiyah?\n");
                    System.out.println("\ta. Ahmad Yani\n\tb. K.H. Ahmad Dahlan\n\tc. Hasyim Asy'ari\n\td. Abbdurahman Wahid\n");
                   
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

                    kunci = "a";
                    System.out.println("\n\n2. Zakat terbagi menjadi dua macam, yaitu:");
                    System.out.println("\n\ta. Zakat Fitrah dan Zakat Maal\n\tb. Zakat Beras dan Zakat Uang\n\n");

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
        panel.setHasil(poin);
    }
}

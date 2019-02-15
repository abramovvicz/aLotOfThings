package execrcise_2.sda_powtorka;

import javax.swing.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        swingMethod();
//        scannerMethod();
//        trickString(args);

//        trickIfContinue(args);


        String[][] dwuwymiar = {{"ala", "ma", "kota"}, {"ala", "ma", "kota"}};
        label: // label ale rzadko się korzysta raczej nie bardzo
        for (int i = 0; i < dwuwymiar.length; i++) {
            for (int j = 0; j < dwuwymiar[i].length; j++) {
                System.out.println(dwuwymiar[i][j]);
                if (j == 1 && i == 0) {
                    break label;
                }
            }
        }

    }

    private static void trickIfContinue(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println("to jest parzysty element " + args[i]);
            }
            if (i % 3 == 0) {
                System.out.println("to jest  podzielne przez 3 " + args[i]);
            }
        }
    }

    private static void trickString(String[] args) {
        String s = "";
        String aa = ""; //zawsze wiemy gdzie jest początek a nie koniec korzystav wiedze jaka mamy
        for (String string : args) {
            s += aa + string;
            aa = ", ";
        }
        System.out.println(s);
    }

    private static void scannerMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masz  " + scanner.nextLine() + " lat");
    }

    private static void swingMethod() {
        String some_txt = JOptionPane.showInputDialog("some txt");
        JOptionPane.showMessageDialog(null, some_txt);
        System.out.println(some_txt);
    }
}

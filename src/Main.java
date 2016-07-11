import javax.swing.*;
import java.io.File;
import java.util.Scanner;

/**
 * Created by Stan on 03.07.2016.
 */
public class Main {
    static String[][] strings = new String[5][3];
    static Scanner scanner;

    public static void main(String[] args) {
        openFile();
        readFile();
        out();
    }

    private static void openFile() {
        try {
            scanner = new Scanner(new File("res//1.txt"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No file");
        }

    }

    private static void readFile() {
        while (scanner.hasNext()) {
            for (int row = 0; row < strings.length; row++) {
                for (int col = 0; col < strings[row].length; col++) {
                    strings[row][col] = scanner.next();
                }
            }
        }
    }

    private static void out() {
        for (int row = 0; row < strings.length; row++) {
            for (int col = 0; col < strings[row].length; col++) {
                System.out.print(strings[row][col]);
            }
            System.out.println("");
        }
    }
}
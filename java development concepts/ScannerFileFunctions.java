package JavaGeneralPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerFileFunctions {
    public static void main(String[] args) {
        try {
            File f = new File("D:/zemoso/java progs/JavaGeneralPrograms/input.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String readFileString = sc.nextLine();
                System.out.println(readFileString);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileWriter fw = new FileWriter("D:/zemoso/java progs/JavaGeneralPrograms/output.txt");
            PrintWriter p = new PrintWriter(fw);
            p.println("sudheshna edited the file");
            p.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package JavaGeneralPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderFiles {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("D:/zemoso/java progs/JavaGeneralPrograms/input.txt");
        BufferedReader br = new BufferedReader(f);
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String streamString = br.readLine();
        System.out.println("line read from input file are" + streamString);
        String readLString;
        while ((readLString = br.readLine()) != null) {
            System.out.println(readLString);
        }
        FileWriter fw = new FileWriter("D:/zemoso/java progs/JavaGeneralPrograms/output.txt");
        BufferedWriter br3 = new BufferedWriter(fw);
        br3.write("heyy this is buffered writer");
    }
}

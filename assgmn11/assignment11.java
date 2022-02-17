package assgmn11;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class assignment11 {

    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        try {
            File f = new File(args[0]);
            FileReader fr = new FileReader(f);
            int i;
            while ((i = fr.read()) != -1) {
                Character c = (char) i;
                if (myMap.containsKey(c))
                    myMap.put(c, myMap.get(c) + 1);
                else
                    myMap.put(c, 1);
            }
        }
        finally {
            FileWriter resultsFile = new FileWriter("testfile.txt");
            for (Map.Entry<Character, Integer> entry : myMap.entrySet())
                resultsFile.write(String.valueOf(entry.getKey()) + " " + String.valueOf(entry.getValue()) + "\n");
        }

    }
}
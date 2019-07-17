import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws IOException{
        solution();
    }

    public static void solution() throws IOException{
        HashMap abbreviations = new HashMap();
        abbreviations.put ("PLZ", "please");
        abbreviations.put ("FYI", "for your information");
        abbreviations.put ("GTFO", "please, leave me alone");
        abbreviations.put ("ASAP", "as soon as possible");
        abbreviations.put(":)", "[smiling]");
        abbreviations.put(":(", "[sad]");
        abbreviations.put("¯ \\ _ (ツ) _ / ¯", "[such is life]");
        String [] x = {"PLZ", "FYI", "GTFO", "ASAP", ":)", ":(", "¯ \\ _ (ツ) _ / ¯"};
        String b = readFromInput();
        for ( int i = 0; i < x.length; i++){
            if (b.contains(x[i])){
                b = b.replace(x[i], abbreviations.get(x[i]).toString());
            }
        }
        writeInOutput(b);
    }

    public static String readFromInput() throws IOException{
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        String x = scanner.nextLine();
        reader.close();
        return x;
    }
    public static void writeInOutput (String s) throws IOException{
        FileWriter writer = new FileWriter("output.txt");
        writer.write(s);
        writer.close();
    }
}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void intoOutput(String s) throws IOException{
        FileWriter writer = new FileWriter("output.txt");
        writer.write(s);
        writer.close();
    }

    public static String fromInput() throws IOException{
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        String i = scanner.nextLine();
        reader.close();
        return i;
    }

    public static void solution() throws IOException{
        intoOutput(fromInput());
    }
}

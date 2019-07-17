import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void intoOutput(String s) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write(s);
        writer.close();
    }

    public static String[] fromInput() throws IOException {
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        String[] s = scanner.nextLine().split(" ");
        return s;
    }

    public static void solution() throws IOException {
        double a = Double.valueOf(fromInput()[0]);
        double b = Double.valueOf(fromInput()[1]);
        double c = Double.valueOf(fromInput()[2]);
        if (((a-b) < c & c < (a+b)) | ((a-c) < b & b <(a+c)) | (b-c) < a & a <(b+c)){
            intoOutput("TRUE");
        }
        else {
            intoOutput("FALSE");
        }
    }
}

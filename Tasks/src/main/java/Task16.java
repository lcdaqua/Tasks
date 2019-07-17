import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void intoOutput(String s) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write(s);
        writer.close();
    }

    public static int[] fromInput() throws IOException {
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        String[] strings = scanner.nextLine().split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.valueOf(strings[i]);
        }
        reader.close();
        return ints;
    }

    public static void solution() throws IOException {
        int answer = 0;
        if (fromInput().length >= 3) {
            for (int i = 0; i < fromInput().length; i++) {
                answer = answer + fromInput()[i];
            }
            StringBuilder builder = new StringBuilder();
            String s = builder.append(answer).toString();
            intoOutput(s);
        }
        else {
            String s = "Not enought numbers";
            intoOutput(s);
        }
    }
}

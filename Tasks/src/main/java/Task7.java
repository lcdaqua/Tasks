import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        FileReader reader = new FileReader("input.txt");
        FileWriter writer = new FileWriter("output.txt");
        Scanner scanner = new Scanner(reader);
        StringBuilder string = new StringBuilder();
        while (scanner.hasNextLine()) {
            string.append(scanner.nextLine()).append("\n");
        }
        String[] dataFromInputLoop = string.toString().split("\n");
        if (Integer.valueOf(dataFromInputLoop[0]) == dataFromInputLoop.length - 1) {
            for (int i = 1; i < dataFromInputLoop.length; i++) {
                writer.write(dataFromInputLoop[i] + "\n");
            }
        } else {
            writer.write("Указанный размер массива не соответствует действительности");
        }
        writer.close();
        reader.close();
    }
}

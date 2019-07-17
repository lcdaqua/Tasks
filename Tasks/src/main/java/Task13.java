import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void intoOutput(String s) throws IOException{
        FileWriter writer = new FileWriter("output.txt");
        writer.write(s);
        writer.close();
    }

    public static int fromInput() throws IOException{
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        int i = scanner.nextInt();
        reader.close();
        return i;
    }

    public static int fibonacci(int n) {
        int [] cache = new int [1000];
        if (cache[n] == 0) {
            if (n == 1 || n == 2) {
                cache[n] = 1;
            }
            else {
                cache[n] = fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        return cache[n];
    }

    public static void solution() throws IOException{
        StringBuilder builder = new StringBuilder();
        builder.append(fibonacci(fromInput()));
        String s = builder.toString();
        intoOutput(s);
    }
}

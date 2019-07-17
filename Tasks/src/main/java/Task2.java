import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException{
        solution();
    }

    public static class InputData {
        static FileReader is;

        static {
            try {
                is = new FileReader("input.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        static Scanner sc = new Scanner(is);
        static int i2 = sc.nextInt();
    }

    public static class OutputData {
        static FileWriter os;
        static {
            try {
                os = new FileWriter("output.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void solution() throws IOException {
        int k = 1;
        int i = InputData.i2;
        while (i >= k) {
            if (i % k == 0) {
                try {
                    OutputData.os.write(k + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                k++;
            } else {
                k++;
            }
        }
        OutputData.os.close();
        InputData.is.close();
    }
}


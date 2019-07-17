import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask8 {

    public static void testInput(String s) throws IOException{
        FileWriter writer = new FileWriter("input.txt");
        writer.write(s);
        writer.close();
    }

    public static String testOutput() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        StringBuilder builder = new StringBuilder();
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine()).append("\n");
            }
        String x = builder.toString();
        reader.close();
        return x;
    }

    @Test
    public void testTask9() throws IOException{
        testInput("5\n" + "13 23 12 44 55");
        Task8.solution();
        Assert.assertEquals("Тест не пройден", "Mean - 29.4\n" + "Median - 23.0\n" + "Mode - 12 13 23 44 55 \n", testOutput());
    }
}

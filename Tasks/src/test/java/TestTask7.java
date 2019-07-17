import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask7 {

    public static void testInput (String s) throws IOException {
        FileWriter writer = new FileWriter("input.txt");
        writer.write(s);
        writer.close();
    }

    public static String testOutput() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine()).append("\n");
        }
        reader.close();
        return stringBuilder.toString();
    }

    @Test
    public void testTask7() throws IOException{
        testInput("3\n" + "1 2 3\n" + "7 8 9\n" + "85 14 8");
        Task7.solution();
        Assert.assertEquals("Тест не пройден", "1 2 3\n" + "7 8 9\n" + "85 14 8\n", testOutput());
    }
}

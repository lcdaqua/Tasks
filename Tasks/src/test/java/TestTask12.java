import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask12 {

    public static void testInput(String s) throws IOException {
        FileWriter writer = new FileWriter("input.txt");
        writer.write(s);
        writer.close();
    }

    public static String testOutput() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String s = scanner.nextLine();
        reader.close();
        return s;
    }

    @Test
    public void testTask12() throws IOException{
        testInput("5 5 5");
        Task12.solution();
        Assert.assertEquals("Тест не пройден", "TRUE", testOutput());
    }
}

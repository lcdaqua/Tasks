import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask16 {

    public static void testInput(String i) throws IOException {
        FileWriter writer = new FileWriter("input.txt");
        writer.write(i);
        writer.close();
    }

    public static String testOutput() throws IOException {
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String s = scanner.nextLine();
        reader.close();
        return s;
    }

    @Test
    public void testTask16() throws IOException {
        testInput("1 2");
        Task16.solution();
        Assert.assertEquals("Тест не пройден", "Not enought numbers", testOutput());
    }
}

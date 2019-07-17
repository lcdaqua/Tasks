import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask15 {

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
    public void testTask15() throws IOException {
        testInput("_\n" + "The_extremely_quick_brownywbndkjas_fox_jumps_over_the_lazy_dog");
        Task15.solution();
        Assert.assertEquals("Тест не пройден", "brownywbndkjas", testOutput());
    }
}

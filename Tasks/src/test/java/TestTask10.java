import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask10 {

    public static String testOutput() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String s = scanner.nextLine();
        reader.close();
        return s;
    }

    public static void testInput(String s) throws IOException{
        FileWriter writer = new FileWriter("input.txt");
        writer.write(s);
        writer.close();
    }

    @Test
    public void testTask10() throws IOException{
        testInput("1 0 0");
        Task10.solution();
        Assert.assertEquals("Тест не пройден", "Один корень: 0.0", testOutput());
    }
}

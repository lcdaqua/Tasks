import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask11 {

    public static String testOutput() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String x = scanner.nextLine();
        reader.close();
        return x;
    }

    public static void testInput(String s) throws IOException{
        FileWriter writer = new FileWriter("input.txt");
        writer.write(s);
        writer.close();
    }

    @Test
    public void testTask11() throws IOException{
        testInput("51");
        Task11.solution();
        Assert.assertEquals("Тест не пройден", "110011", testOutput());
    }
}

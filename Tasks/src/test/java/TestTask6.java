import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask6 {

    public static void testDataInput(String s) throws IOException{
        FileWriter writer = new FileWriter("input.txt");
        writer.write(s);
        writer.close();
    }

    public static String testDataOutput() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String n = scanner.nextLine();
        reader.close();
        return n;
    }

    @Test
    public void testTask6() throws IOException {
        testDataInput("6 8 9");
        Task6.solution();
        Assert.assertEquals("Тест не пройден", "A", testDataOutput());
    }
}

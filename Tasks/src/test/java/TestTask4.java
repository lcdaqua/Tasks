import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask4 {

    public static String testOutputData() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String x = scanner.nextLine();
        reader.close();
        return x;
    }

    public static void testInputData(String n) throws IOException{
        FileWriter writer = new FileWriter("input.txt");
        writer.write(n);
        writer.close();
    }

    @Test
    public void testTask4() throws IOException{
        testInputData("4 3 +");
        Task4.solution();
        Assert.assertEquals("Тест не пройден", "Ответ: 7", testOutputData());
    }
}

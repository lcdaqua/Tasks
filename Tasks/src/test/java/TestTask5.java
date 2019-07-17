import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask5 {

    public static void testInputData(String n) throws IOException{
        FileWriter writer = new FileWriter("input.txt");
        writer.write(n);
        writer.close();
    }

    public static String testOutputData() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String x = scanner.nextLine();
        reader.close();
        return x;
    }

    @Test
    public void testTask5() throws IOException{
        testInputData("Twenty one pilots");
        Task5.solution();
        Task5.closeStreams();
        Assert.assertEquals("Тест не пройден", "Twenty 1 pilots ", testOutputData());
    }
}

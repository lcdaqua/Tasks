import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class TestTask2 {

    public String testTask()throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String x = scanner.nextLine();
        reader.close();
        return x;
    }

    public static void testSolution(String s) throws IOException{
        FileWriter writer = new FileWriter("input.txt");
        writer.write("6");
        writer.close();
    }

    @Test
    public void testTask2() throws IOException {
        testSolution("6");
        Task2.solution();
        Assert.assertEquals("Тест не пройден", "1 2 3 6 ", testTask());
    }
}

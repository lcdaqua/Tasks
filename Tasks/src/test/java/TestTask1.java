import org.junit.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask1 {


    public TestTask1() throws IOException {
    }

    private FileReader reader = new FileReader("output.txt");
    private Scanner scanner = new Scanner(reader);
    private FileWriter writer = new FileWriter("input.txt");

    private void testSolution() throws IOException {
            writer.write("8");
            writer.close();
        }

    @Test
    public void testTask1() throws IOException {
        testSolution();
        Task1.solution();
        Assert.assertEquals("Тест не пройден", "Число шагов равно 3", scanner.nextLine());
    }

    @After
    public void closeStreams() throws IOException {
        reader.close();
        writer.close();
    }
}

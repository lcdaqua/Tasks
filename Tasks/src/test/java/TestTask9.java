import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestTask9 {

    @Test
    public void testTask9() throws IOException{
        testInput("FYI my dog is very :(. ¯ \\ _ (ツ) _ / ¯ PLZ stay down or GTFO ASAP :)");
        Task9.solution();
        Assert.assertEquals("Тест не пройден", "for your information my dog is very [sad]. [such is life] please stay down or please, leave me alone as soon as possible [smiling]", testOutput());
    }

    public static void testInput(String s) throws IOException{
        FileWriter writer = new FileWriter("input.txt");
        writer.write(s);
        writer.close();
    }

    public static String testOutput() throws IOException{
        FileReader reader = new FileReader("output.txt");
        Scanner scanner = new Scanner(reader);
        String x = scanner.nextLine();
        return x;
    }

}

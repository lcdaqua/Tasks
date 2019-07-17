import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static String [] fromInput() throws IOException{
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        String [] s = scanner.nextLine().split(" ");
        reader.close();
        return s;
    }

    public static void intoOutput(String s) throws IOException{
        FileWriter writer = new FileWriter("output.txt");
        writer.write(s);
        writer.close();
    }

    public static void solution() throws IOException{
        double a = Double.valueOf(fromInput()[0]);
        double b = Double.valueOf(fromInput()[1]);
        double c = Double.valueOf(fromInput()[2]);
        double d = b*b - 4*a*c;
        if (d >= 0){
            if (d > 0){
                double dOff = Math.round(Math.sqrt(d)*100.0)/100.0;
                double x1 = Math.round(((-b + dOff) / (2*a)) * 100.0) / 100.0;
                double x2 = Math.round(((-b - dOff) / (2*a)) * 100.0) / 100.0;
                intoOutput("Два корня: " + x1 + " " + x2);
                System.out.println(d + " " + dOff + " " + x1 + " " + x2);
            }
            else{
                double x = 0 -(b / 2*a);
                intoOutput("Один корень: " + x);
            }
        }
        else {
            intoOutput("Корней нет");
        }
    }
}

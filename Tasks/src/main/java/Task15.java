import java.io.*;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static String [] fromInput() throws IOException{
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        StringBuilder builder = new StringBuilder();
        String spliter = scanner.nextLine();
        while (scanner.hasNextLine()){
            builder.append(scanner.nextLine());
        }
        String s = builder.toString();
        reader.close();
        String [] strings = s.split(spliter);
        return strings;
    }

    public static void intoOutput(String s) throws IOException{
        FileWriter writer = new FileWriter("output.txt");
        writer.write(s);
        writer.close();
    }

    public static void solution() throws IOException{
        String s = null;
        int j = fromInput()[0].length();
        for (int i = 0; i < fromInput().length; i++){
            int b =fromInput()[i].length();
            if (j <= b){
                j = fromInput()[i].length();
                s = fromInput()[i];
            }
        }
        intoOutput(s);
    }
}

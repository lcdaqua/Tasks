import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static int fromInput() throws IOException{
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        int s = Integer.valueOf(scanner.nextLine());
        reader.close();
        return s;
    }

    public static void intoOutput(String s) throws IOException{
        FileWriter writer = new FileWriter("output.txt");
        writer.write(s);
        writer.close();
    }

    public static void solution() throws IOException{
        ArrayList list = new ArrayList();
        int answer = fromInput();
        if ( answer >= 0){
            if (answer <= 10000){
                while (answer > 2){
                    list.add(answer % 2);
                    answer = answer / 2;
                }
                if (answer == 2 ){
                    list.add("10");
                }
                else {
                    list.add("1");
                }
            }
            else {
                intoOutput("Иди нахрен с таким числом");
            }
        }
        else {
            intoOutput("Иди нахрен с таким числом");
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++){
            builder.append(list.get(i));
        }
        String s = builder.toString();
        intoOutput(s);
    }
}

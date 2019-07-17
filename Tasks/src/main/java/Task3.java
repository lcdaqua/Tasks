import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        solution();
    }

    public static class InputData {
        static FileReader fr;

        static {
            try {
                fr = new FileReader("input.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        static Scanner sc = new Scanner(fr);
        static String i2 = sc.nextLine();
    }

    public static class OutputData {
        static FileWriter fw;

        static {
            try {
                fw = new FileWriter("output.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void solution(){
        int x = 0;
        int y = 0;
        char left = 'L';
        char right = 'R';
        char down = 'D';
        char up = 'U';
        String i = InputData.i2;
        char [] inputStringToArray = i.toCharArray();
        for (int a = 0; a < inputStringToArray.length; a++){
            if (inputStringToArray[a] == left){
                x = x - 1;
            }
            else if (inputStringToArray[a] == right){
                x = x + 1;
            }
            else if (inputStringToArray[a] == up){
                y = y + 1;
            }
            else {
                y = y - 1;
            }
        }
        try {
            OutputData.fw.write(x + " " + y);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            OutputData.fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            InputData.fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

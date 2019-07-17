import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws IOException{
        solution();
    }

    public static int square(int n){
        return n*n;
    }

    public static void solution() throws IOException{
        FileReader reader = new FileReader("input.txt");
        FileWriter writer = new FileWriter("output.txt");
        Scanner scanner = new Scanner(reader);
        String [] dataToMassive = scanner.nextLine().split(" ");
        int [] dataToIntMassive = new int[3];
        for (int i = 0; i < dataToMassive.length; i++){
            dataToIntMassive[i] = Integer.valueOf(dataToMassive[i]);
        }
        if (square(dataToIntMassive[0]) + square(dataToIntMassive[1]) > square(dataToIntMassive[2])){
            writer.write("A");
        }
        else if (square(dataToIntMassive[0]) + square(dataToIntMassive[1]) < square(dataToIntMassive[2])){
            writer.write("O");
        }
        else {
            writer.write("R");
        }
        writer.close();
        reader.close();
    }
}

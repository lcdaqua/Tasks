import java.io.*;

public class Task4 {
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
        static BufferedReader br = new BufferedReader(fr);
        static String inputNumber;

        static {
            try {
                inputNumber = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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

    public static void solution (){
        String [] dataToMassive = InputData.inputNumber.split(" ");
        String firstNumber1 = dataToMassive[0];
        String secondNumber1 = dataToMassive[1];
        String symbol = dataToMassive[2];
        int firstNumber = Integer.valueOf(dataToMassive[0]);
        int secondNumber = Integer.valueOf(dataToMassive[1]);
        int result;
        if (symbol.equals("+")){
            result = firstNumber + secondNumber;
            try {
                OutputData.fw.write("Ответ: " + result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (symbol.equals("-")){
            result = firstNumber - secondNumber;
            try {
                OutputData.fw.write("Ответ: " + result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (symbol.equals("*")){
            result = firstNumber * secondNumber;
            try {
                OutputData.fw.write("Ответ: " + result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (symbol.equals("/")){
            result = firstNumber / secondNumber;
            try {
                OutputData.fw.write("Ответ: " + result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            result = firstNumber % secondNumber;
            try {
                OutputData.fw.write("Ответ: " + result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            InputData.fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            OutputData.fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        solution();
        closeStreams();
    }

        public static void closeStreams(){
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

    public static class InputData {
        static FileReader fr;

        static {
            try {
                fr = new FileReader("input.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        static Scanner scanner = new Scanner(fr);
        static String inputInfo = scanner.nextLine();
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

    public static void solution() {
        String [] infoInMassive = InputData.inputInfo.split(" ");
        for (int i = 0; i < infoInMassive.length; i++) {
            if (infoInMassive[i].equals("zero")){
                try {
                    OutputData.fw.write("0 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("one")){
                try {
                    OutputData.fw.write("1 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("two")){
                try {
                    OutputData.fw.write("2 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("three")){
                try {
                    OutputData.fw.write("3 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("four")){
                try {
                    OutputData.fw.write("4 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("five")){
                try {
                    OutputData.fw.write("5 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("six")){
                try {
                    OutputData.fw.write("6 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("seven")){
                try {
                    OutputData.fw.write("7 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("eight")){
                try {
                    OutputData.fw.write("8 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (infoInMassive[i].equals("nine")){
                try {
                    OutputData.fw.write("9 ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    OutputData.fw.write(infoInMassive[i] + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


import java.io.*;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        solution();
    }

    public static class InputData {
        static FileReader is;

         static {
            try {
                is = new FileReader("input.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        static Scanner inputNumber = new Scanner(is);
        static int i = inputNumber.nextInt();
    }

    public static class OutputData {
        static FileWriter os;

        static {
            try {
                os = new FileWriter("output.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void solution() {
        int k = 1;
        int i2 = InputData.i;
        int l = 0;
        if (i2 <= 0) {
            try {
                OutputData.os.write("Число должно быть больше 0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
//            try {
//                OutputData.os.write(i2 + "\n");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            if (i2 % 2 == 0) {
                i2 /= 2;
                l++;
            } else {
                i2 = 3 * i2 + 1;
                l++;
            }
            while (i2 != k) {
//                try {
//                    OutputData.os.write(i2 + "\n");
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
                if (i2 % 2 == 0) {
                    i2 = i2 / 2;
                    l++;
                } else {
                    i2 = 3 * i2 + 1;
                    l++;
                }
            }
            try {
                OutputData.os.write("Число шагов равно " + l);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            InputData.is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            OutputData.os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


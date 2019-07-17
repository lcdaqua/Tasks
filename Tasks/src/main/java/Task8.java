import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task8 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Mean - " + mean() + "\n" + "Median - " + median() + "\n" + "Mode - " + mode());
        writer.close();
    }

    public static String[] inputToString;
    public static ArrayList<Integer> list = new ArrayList();

    public static double mean() throws IOException {
        FileReader reader = new FileReader("input.txt");
        Scanner scanner = new Scanner(reader);
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append(" ");
        }
        inputToString = builder.toString().split(" ");
        for (int i = 0; i < inputToString.length; i++) {
            list.add(Integer.valueOf(inputToString[i]));
        }
        int mean = 0;
        for (int i = 1; i < list.size(); i++) {
            mean = mean + list.get(i);
        }
        reader.close();
        return (double) mean / list.get(0);
    }

    public static double median() {
        list.remove(0);
        Collections.sort(list);
        if (list.size() % 2 == 0) {
            double medianEven = (double) (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
            return medianEven;
        } else {
            int medianOdd = list.get(list.size() / 2);
            return medianOdd;
        }
    }


    public static String mode() {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); i++){
            int currentValue = list.get(i);
            if (!map.containsKey(currentValue)){
                map.put(currentValue, 1);
            }
            else {
                map.put(currentValue, map.get(currentValue) + 1);
            }
        }
        int maxCount = Collections.max(map.values());
        int maxValue = 0;
        int massiveSize = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++){
            if(maxCount == map.get(list.get(i))){
                maxValue = list.get(i);
                massiveSize++;
            }
        }
        int [] maxValues = new int [massiveSize];
        for (int i = 0; i < list.size(); i++){
            if(maxCount == map.get(list.get(i))){
                maxValues [i] = list.get(i);
            }
            builder.append(maxValues[i]).append(" ");
        }
        String x = builder.toString();
        return x;
    }
}

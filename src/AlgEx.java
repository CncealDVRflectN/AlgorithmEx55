import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class AlgEx {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter writer = new FileWriter("output.txt");
        long num = scanner.nextLong();
        int counter = 0;
        while (num > 0) {
            if(num % 2 != 0) {
                writer.write(counter + "\n");
            }
            num /= 2;
            counter++;
        }
        writer.close();
        scanner.close();
    }
}

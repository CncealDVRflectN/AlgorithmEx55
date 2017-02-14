import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class AlgEx {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        List<Integer> treeDeg = new ArrayList<>();
        String bin = Long.toString(scanner.nextLong(), 2);
        int size = bin.length();
        for(int i = 0; i < size; i++){
            if(bin.charAt(i) == '1'){
                treeDeg.add(size - i - 1);
            }
        }
        Collections.reverse(treeDeg);
        print(treeDeg);
        scanner.close();
    }

    private static void print(List<Integer> result) throws Exception {
        FileWriter writer = new FileWriter("output.txt");
        Iterator<Integer> iter;
        if (result.size() != 0) {
            iter = result.iterator();
            while (iter.hasNext()) {
                writer.write(iter.next() + "\n");
            }
        } else {
            writer.write(-1 + "");
        }
        writer.close();
    }
}

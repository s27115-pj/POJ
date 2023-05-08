package evenNumvers;

import java.util.ArrayList;

public class evenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        long startTime = System.nanoTime();
        int i = 2;
        while (evenNumbers.size() < 50) {
            evenNumbers.add(i);
            i += 2;
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000.0;
        StringBuilder sb = new StringBuilder();
        i = 0;
        while (i < evenNumbers.size()) {
            int number = evenNumbers.get(i);
            sb.append (number).append(" indeks: ").append(i).append("\n");
            i++;
        }
        System.out.print(sb);
        System.out.println("Całkowity czas operacji: " + duration + " ms");
    }
}

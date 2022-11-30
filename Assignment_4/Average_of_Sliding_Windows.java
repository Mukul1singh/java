import java.util.*;
public class Average_of_Sliding_Windows
{
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();

            if (n == -1)
                break;

            list.add(n);
        }

        int j = 0;
        int i = 0;
        int sum = 0;
        while (j < list.size()) {
            sum += list.get(j);
            System.out.format("%.4f ", ((float) (sum) / (j - i + 1)));
            if (j - i + 1 < k) {
                j++;
            } else {
                sum -= list.get(i);
                i++;
                j++;
            }
        }
    }
}
    

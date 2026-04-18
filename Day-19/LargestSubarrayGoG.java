import java.util.*;
public class LargestSubarrayGoG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> Map = new HashMap<>();
        int Sum = 0;
        int maxlen = 0;

        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];

            if (Sum == 0) {
                maxlen= i + 1;
            }

            if (!Map.containsKey(Sum)) {
                int len=i-Map.get(Sum);
                maxlen = Math.max(maxlen, len);
            }else{
                Map.put(Sum, i);
            }
            }
            System.out.println("Length of the largest subarray with sum 0: " + maxlen);
        }

    }

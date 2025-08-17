package prctice;

public class SecondLargestNumberinArray {

        public static void main(String[] args) {
            int[] arr = {10, 20, 4, 45, 99, 99};

            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > firstMax) {
                    secondMax = firstMax;
                    firstMax = num;
                } else if (num > secondMax && num < firstMax) {
                    secondMax = num;
                }
            }
            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("No second max (all elements are same)");
            } else {
                System.out.println("Second maximum is: " + secondMax);
            }
        }
    }
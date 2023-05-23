public class MaximumProductSubArray {

    public static void main(String[] args) {
        int input[] = { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println(getMaxProduct(input));
    }

    private static int getMaxProduct(int [] input) {
        int maxSoFar = 0;
        int maxEndingHere = 1;
        int minEndingHere = 1;
        int flag = 0;

        for(int i=0;i<input.length;i++) {
            if(input[i] > 0) {
                maxEndingHere = maxEndingHere * input[i];
                minEndingHere = Math.min(minEndingHere*input[i], 1);
                flag = 1;
            } else if (input[i] == 0) {
                maxEndingHere = 1;
                minEndingHere = 1;
            } else {
                int temp = maxEndingHere;
                maxEndingHere = Math.max(minEndingHere*input[i], 1);
                minEndingHere = temp * input[i];
            }

            if(maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }

        } // end for

        if(flag==0) {
            return 0;
        }
        return maxSoFar;
    }
}

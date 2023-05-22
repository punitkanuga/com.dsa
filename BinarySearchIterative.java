public class BinarySearchIterative {
    public static void main(String[] args) {

        int [] input = {3,4,6,9,10,67};

        System.out.println("For 3: " + getIndex(input, 3));
        System.out.println("For 67: " + getIndex(input, 67));
        System.out.println("For 4: " + getIndex(input, 4));
        System.out.println("For 9: " + getIndex(input, 9));
        System.out.println("For 93: " + getIndex(input, 93));
        System.out.println("For 0: " + getIndex(input, 0));
        System.out.println("For -4: " + getIndex(input, -4));
    }

    private static int getIndex(int [] input, int n) {

        int low=0;
        int high = input.length-1;

        while(low <= high) {
            int mid=(high+low)/2;

            if(input[mid] == n) {
                return mid;
            }

            if(input[mid] < n) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        } // end-while
        return -1;
    }

}

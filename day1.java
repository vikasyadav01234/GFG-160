public class day1{

    public static int secondlargest(int [] a){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }

        // If no second largest found, return -1
        if (second == Integer.MIN_VALUE) {
            return -1;
        }

        return second;
    }
    public static void main(String [] args){
        int [] arr = {10,5,10};
        System.out.print(secondlargest(arr));
    }

    }

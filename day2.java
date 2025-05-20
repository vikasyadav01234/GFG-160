public class day2 {
    // public static int[] shiftzero(int[] a){
    //     int[] b = new int[a.length];
    //     int index = 0; // b[] me non-zero elements insert karne ke liye index

    //     // Pehle non-zero elements copy karo
    //     for (int i = 0; i < a.length; i++) {
    //         if (a[i] != 0) {
    //             b[index++] = a[i];
    //         }
    //     }

    //     // Baaki jagah automatically 0 rahega (Java default value of int = 0)
    //     return b;
    // }

    void pushZerosToEnd(int[] arr) {
        // code here
        
    }
    public static void main(String [] args){
        int[] a = {1, 2, 0, 4, 3, 0, 5, 0};
        int [] b = pushZerosToEnd(a);
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]);
        }
        

    }
}

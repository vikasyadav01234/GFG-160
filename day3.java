public class day3 {
    public static int[] reverse(int[] a){
        int [] b=new int[a.length];
        int s = a.length-1;
        for(int i =0;i<a.length;i++){
            b[s]=a[i];
            s--;
            //System.out.print(a[i]+ " "+a[s-i]);
        }
        return b;
        
    }
    public static void main(String [] args){
        int [] a ={1, 4, 3, 2, 6, 5};
        int[] b=reverse(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}

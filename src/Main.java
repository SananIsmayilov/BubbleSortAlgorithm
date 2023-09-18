public class Main {
    public static void main(String[] args) {
      //1 5 8 2 5 8 35
        // 1 5 2 5 8 35
        int[] a = {1,5,3,7,2,4,8,1,5,2,7};
        bubblesort(a);
    }

   static   void bubblesort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j = 1;j<a.length-i;j++){
                if(a[j-1] > a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
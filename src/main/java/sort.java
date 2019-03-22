/**
 * 冒泡排序和快速排序
 */
public class sort {
    //bubble sort
    public void bubble(int[] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){//从小到大排序
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }

    public void quick(int[] arr,int start,int end){
        int l = start;
        int r = end;
        if(l>r){
            return;
        }
        int cmp = arr[start];
        while(l<r){
            while(l<r&&arr[r]>cmp){
                r--;
            }
            while(l<r&&arr[l]<=cmp){
                l++;
            }
            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        //将cmp放在他应该在的位置
        int temp = arr[r];
        arr[r] = arr[start];
        arr[start] = temp;

        //递归调用
        quick(arr,start,l-1);
        quick(arr,r+1,end);
    }

    public static void main(String[] args) {
        sort s = new sort();
        int[] arr = {8,9,1,2,3,6,4};
        s.bubble(arr);
        s.quick(arr);
    }

    private void quick(int[] arr) {
        this.quick(arr,0,arr.length-1);
        print(arr);
    }

    public void print(int[] arr){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}

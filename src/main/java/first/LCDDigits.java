package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LCDDigits {
    public static void main(String[] args) {
        show(189);
        show(1489);
    }
    public static void show(int n){
        HashMap<Integer,char[][]> map = new HashMap<>();
        map.put(0,new char[][]{{'.','_','.'},{'|','.','|'},{'|','_','|'}});
        map.put(1,new char[][]{{'.','.','.'},{'.','.','|'},{'.','.','|'}});
        map.put(2,new char[][]{{'.','_','.'},{'.','_','|'},{'|','_','.'}});
        map.put(3,new char[][]{{'.','_','.'},{'.','_','|'},{'.','_','|'}});
        map.put(4,new char[][]{{'.','.','.'},{'|','_','|'},{'.','.','|'}});
        map.put(5,new char[][]{{'.','_','.'},{'|','_','.'},{'.','_','|'}});
        map.put(6,new char[][]{{'.','_','.'},{'|','_','.'},{'|','_','|'}});
        map.put(7,new char[][]{{'.','_','.'},{'.','.','|'},{'.','.','|'}});
        map.put(8,new char[][]{{'.','_','.'},{'|','_','|'},{'|','_','|'}});
        map.put(9,new char[][]{{'.','_','.'},{'|','_','|'},{'.','.','|'}});
        List<char[][]> list = new ArrayList<>();
        while(n!=0){
            list.add(map.get(n%10));
            n /= 10;
        }
        for(int j=0;j<3;j++){
            for(int i=list.size()-1;i>=0;i--){
                char[][] temp = list.get(i);
                for (char c:temp[j]
                ) {
                    System.out.print(c+" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}

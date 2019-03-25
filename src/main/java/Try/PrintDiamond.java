package Try;
/**
 * 规定初始字符 'A' 给定一个字符 例如 'E'
 *
 * 打印出类似钻石的要求形状
 */

import org.junit.Test;

public class PrintDiamond {

    public void printDiamondSolution(char c){
        int len = c-'A';
        for(int i=0;i<len+1;i++){
            eachFloor(len, i);
            System.out.println();
        }
        for(int i=len-1;i>=0;i--){
            eachFloor(len, i);
            System.out.println();
        }
    }

    //每层打印
    private void eachFloor(int len, int i) {
        for (int j = 0; j < 2 * len + 1; j++) {
            if (j == len - i || j == len + i) {
                System.out.print((char) ('A' + i));
            } else {
                System.out.print(" ");
            }
        }
    }

    @Test
    public void printDiamondSolutionTest(){
        printDiamondSolution('E');
    }
}

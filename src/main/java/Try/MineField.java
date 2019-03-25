package Try;
/**
 * 求出给定矩阵中的每个位置的金矿数目
 */

import org.junit.Test;

public class MineField {
    public char[][] mineValue(char[][] chars){
        char[][] newChars = new char[chars.length][chars[0].length];
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<chars[0].length;j++){
                newChars[i][j] = '0';
                if(chars[i][j]=='*'){
                    newChars[i][j] = '*';
                }else{
                    newChars[i][j] += add(chars,i,j);
                }
            }
        }
        return newChars;
    }

    private int add(char[][] chars, int i, int j) {
        int count = 0;
        if(i-1>=0){
            count += addOne(chars,i-1,j);
            if(j-1>=0){
                count += addOne(chars,i,j-1);
                count += addOne(chars,i-1,j-1);
            }
            if(j+1<chars[0].length){
                count += addOne(chars,i,j+1);
                count += addOne(chars,i-1,j+1);
            }
        }
        if(i+1<chars.length){
            count += addOne(chars,i+1,j);
            if(j-1>=0){
                if(chars[i][j-1]=='*'&&i-1<0){
                    count++;
                }
                count += addOne(chars,i+1,j-1);
            }
            if(j+1<chars[0].length){
                if(chars[i][j+1]=='*'&&i-1<0){
                    count++;
                }
                count += addOne(chars,i+1,j+1);
            }
        }
        return count;
    }

    private int addOne(char[][] chars,int i,int j){
        if(chars[i][j]=='*'){
            return 1;
        }else{
            return 0;
        }
    }

    @Test
    public void mineValueTest(){
        //given
        char[][] c = {{'*','.','.','.'},{'.','.','*','.'},{'.','.','.','.'},{'*','.','.','*'}};
        //when
        char[][] chars = mineValue(c);
        //then
        for (char[] c1:chars
             ) {
            for (char c2:c1
                 ) {
                System.out.print(c2+" ");
            }
            System.out.println();
        }
    }
}

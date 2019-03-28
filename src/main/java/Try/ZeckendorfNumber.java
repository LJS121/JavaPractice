package Try;

import org.junit.Test;

public class ZeckendorfNumber {

    public void zeckendorfNumberSolution(){
        int[] num = {13,8,5,3,2,1};
        for(int i=0;i<=20;i++){
            int[] flag = {0,0,0,0,0,0};
            int count = i;
            for (int j = 0; j < num.length; j++) {
                if(num[j]>count){
                    continue;
                }else{
                    flag[j]=1;
                    count -= num[j];
                    j++;
                }
            }
            String s = "";
            for (int k = 0; k < num.length; k++) {
                s += k!=num.length-1?flag[k]+"*"+num[k]+" + ":flag[k]+"*"+num[k];
            }
            System.out.println(s+" = "+i);
        }
    }

    @Test
    public void zeckendorfNumberSolutionTest(){
        zeckendorfNumberSolution();
    }
}

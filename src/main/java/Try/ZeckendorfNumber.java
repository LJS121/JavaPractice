package Try;

import org.junit.Test;

public class ZeckendorfNumber {

    public void zeckendorfNumberSolution(){
        int[] num = {13,8,5,3,2,1};
        for (int i = 0; i <= 20; i++) {
            String result = "";
            compute(i,num,result);
            System.out.println(result);
        }
    }

    public void compute(int i,int[] num,String result){
        for (int j = 0; j < num.length; j=j+2) {
            if(i<num[j]){
                j--;
                continue;
            }
            result += 1*num[j];
            compute(i,num,result);
        }
    }

    @Test
    public void zeckendorfNumberSolutionTest(){
        zeckendorfNumberSolution();
    }
}

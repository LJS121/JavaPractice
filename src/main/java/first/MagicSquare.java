package first;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Random;

public class MagicSquare {
    public void magicSquareSolution(){
        double[] doubles = {1,1.5,2,2.5,3,3.5,4,4.5,5};
        while(!judge(doubles)){
            upset(doubles);
        }
        System.out.println(JSON.toJSONString(doubles));
    }

    private void upset(double[] doubles) {
        for(int i=doubles.length-1;i>=0;i--){
            Random random = new Random();
            int index = random.nextInt(i+1);
            double temp = doubles[index];
            doubles[index] = doubles[i];
            doubles[i] = temp;
        }
    }

    public boolean judge(double[] doubles){
        //分别检验竖排 横排 对角线 是否满足
        for(int i=0;i<3;i++){
            if(doubles[i]+doubles[i+3]+doubles[i+6]!=9){
                return false;
            }
            if(doubles[i*3]+doubles[i*3+1]+doubles[i*3+2]!=9){
                return false;
            }
        }
        if(doubles[0]+doubles[4]+doubles[8]!=9||doubles[2]+doubles[4]+doubles[6]!=9){
            return false;
        }
        return true;
    }
    @Test
    public void magicSquareSolutionTest(){
        magicSquareSolution();
    }
}

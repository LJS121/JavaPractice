package Try;
import java.util.Scanner;

/**
 * @author jinsong.Liang
 * @date 2019/3/28 13:14
 */
public class Tennis {
    static Scanner sc = new Scanner(System.in);
    //存放每局每队的的成绩(0 15 30 40)
    static int[][] score = new int[3][2];
    //每局获得的分数(0-4)
    static int[][] point = new int[3][2];
    //点数对应的分数
    static int[] pointScore = {0,15,30,40,40,40,40,40};
    //存放每轮的结果
    static String[] result = new String[3];
    //计算每人赢得局数
    static int countA = 0,countB = 0;
    public static void main(String[] args){
        for(int i=0;i<3;){
            System.out.println("请选择你要执行的操作: 1.计分 2.查分 3.退出");
            int exec = sc.nextInt();
            if(exec==3){
                return;
            }else if(exec==2){
                System.out.println("请输入你要查分的局数:");
                int time = sc.nextInt();
                if(result[time-1]==null){
                    System.out.println("第"+time+"局比赛还没开始");
                }else{
                    System.out.println(result[time-1]);
                }
            }else if(exec==1){
                System.out.println("第"+(i+1)+"局开始计分:");
                eachRound(i);
                i++;
            }
        }
        System.out.println("比赛结束 "+(countA>countB?"PlayerA获胜! 总比分为:"+countA+":"+countB:"PlayerB获胜! 总比分为:"+countB+":"+countA));

    }

    private static void eachRound(int i) {
        for(int j=0;j<13;j++){
            System.out.println("给赢得本球的人计分: 1.PlayerA   2.PlayerB");
            int temp = sc.nextInt();
            if(temp==1){
                point[i][0] ++;
                score[i][0] = pointScore[point[i][0]];
            }else if(temp==2){
                point[i][1] ++;
                score[i][1] = pointScore[point[i][1]];
            }
            System.out.println("当前比分为:"+score[i][0]+":"+score[i][1]);
            //获胜判定
            if((point[i][0]-point[i][1]>1&&point[i][0]>=4)||point[i][0]==7){
                countA++;
                result[i] = "第"+(i+1)+"轮比赛PlayerA获胜 比分为:"+score[i][0]+":"+score[i][1];
                System.out.println("本轮比赛结束,PlayerA获胜 比分为:"+score[i][0]+":"+score[i][1]);
                return;
            }else if((point[i][1]-point[i][0]>1&&point[i][0]>=4)||point[i][1]==7){
                countB++;
                result[i] = "第"+(i+1)+"轮比赛PlayerB获胜 比分为:"+score[i][1]+":"+score[i][0];
                System.out.println("本轮比赛结束,PlayerB获胜 比分为:"+score[i][1]+":"+score[i][0]);
                return;
            }
        }
    }
}

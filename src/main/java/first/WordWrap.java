package first;
/**
 * 给定一个字符串 给定每行指定长度
 *
 * 这里如果给定的长度小于最长单词的长度 就会有问题
 */

import org.junit.Test;

public class WordWrap {

    public String wordWrapSolution(String str,int len){
        String[] strings = str.split(" ");
        int count = 0;
        String result = "";
        for (String s:strings
             ) {
            if(count+s.length()<=len){
                result += s+" ";
                count += s.length()+1;
            }else{
                result += "\n"+s+" ";
                count = s.length()+1;
            }
        }
        return result;
    }
    @Test
    public void wordWrapSolutionTest(){
        //given
        String str = "hello everyboby, I'm LJS, you can also call me SongSong.";
        //when
        String s = wordWrapSolution(str, 15);
        System.out.println(s);

    }
}

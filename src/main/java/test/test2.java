package test;

public class test2 {
    public static void main(String[] args) {
        String s = new String("nihao");
        System.out.println(s.charAt(5));
    }
    public int normal(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
                count++;
            }
        }
        return count;
    }

    public int recursive(String str){
        int count = 0;
        if(str.substring(0,1)=="A"){
            count = 1;
        }
        return count+recursive(str.substring(1));
    }

}

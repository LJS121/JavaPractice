package redo;

public class intToRoman {
    public static void main(String[] args) {
        intToRoman tm = new intToRoman();
        System.out.println(tm.transfer(1888));
    }
    public String transfer(int num){
        int[] numArray=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romaArray=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        if(num>3999||num<0){
            return null;
        }
        for(int i=0;i<numArray.length;i++){
            int temp = num/numArray[i];
            while(temp>0){
                sb.append(romaArray[i]);
                temp--;
            }
            num = num%numArray[i];
        }
        return sb.toString();
    }
}

package test;

public class test5 {
    public static void main(String[] args) {
        char[][] chars = {{'.','_','.'},{'|','.','|'},{'|','_','|'}};
        show(chars);
    }
    public static void show(char[][] chars){
        for (char c:chars[0]
             ) {
            System.out.print(c+" ");
        }
    }
}

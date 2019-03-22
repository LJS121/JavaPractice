//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//
//public class SortList {
//
//
//    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(3);
//        a.add(4);
//        a.add(8);
//        System.out.println("sum(a):"+sum(a));
//        List<Integer> b = new ArrayList<>();
//        b.add(2);
//        b.add(6);
//        b.add(7);
//        b.add(5);
//        System.out.println("sum(b):"+sum(b));
//        List<Integer> ab = new ArrayList<>();
//        ab.addAll(a);
//        ab.addAll(b);
//        Collections.sort(ab);
//        System.out.println(ab.toString());
//        System.out.println("sum(ab):"+sum(ab));
//        a = new ArrayList<>();
//        b = new ArrayList<>();
//
//        int size = ab.size();
//        for(int i=0; i<size;i=i+2){
//            if(a.size()<1 && b.size()<1){
//                a.add(ab.get(i));
//                b.add(ab.get(i+1));
//                continue;
//            }
////集合的和大的先放小的数据
//            if(sum(a)>sum(b)){
//                a.add(ab.get(i));
//                b.add(ab.get(i+1));
//                continue;
////集合的和大的先放小的数据
//            }else if(sum(b)>sum(a)){
//                b.add(ab.get(i));
//                a.add(ab.get(i+1));
//                continue;
////一样大
//            }else{
//                a.add(ab.get(i));
//                b.add(ab.get(i+1));
//                continue;
//            }
//
//        }
//
//        int suma = sum(a);
//        int sumb = sum(b);
//
//        System.out.println(suma>sumb ? suma-sumb : sumb-suma);
//
//    }
//
//    public static int sum(List<Integer> list){
//        int sum=0;
//        for(int num : list){
//            sum+=num;
//        }
//        return sum;
//    }
//
//
//}

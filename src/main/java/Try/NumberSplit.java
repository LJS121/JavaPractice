//import org.junit.Test;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class NumberSplit{
//    public class fun{
//        Integer total;
//        String str;
//        Integer[] arr;
//        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
//        Integer[] splitIndex = {0,0,0};
//        boolean checkInt = true;
//
//        public fun(String str){
//            this.str = str;
//            arr = new Integer[str.length()];
//            int sum = 0;
//            for(int index=0;index<str.length();index++){
//                if(this.str.charAt(index)<48||this.str.charAt(index)>57){
//                    this.checkInt = false;
//                    return;
//                }
//                sum += this.str.charAt(index)-48;
//                arr[index] = sum;
//                map.put(sum,index);
//            }
//        }
//
//        /**
//         * 执行判断函数
//         */
//        boolean excute(){
//            boolean flag = false;
//            //每部分的总和不超过全部的1/4
//            total = arr[str.length()-1]/4;
//            //遍历第一个元素
//            for(int index=0;index<this.str.length();index++){
//                //第一个元素不可能为第一位
//                if(index==0){
//                    continue;
//                }
//                if(arr[index-1]>total){
//                    break;
//                }
//                int _total = arr[index-1];
//                //找第二个元素
//                int _secondSum = arr[index] + _total;
//                if(map.get((_secondSum))!=null){
//                    int _secondIndex = map.get(_secondSum)+1;
//                    int _threeSum = arr[_secondIndex] + _total;
//                    if(map.get(_threeSum)!=null){
//                        int _threeIndex = map.get(_threeSum)+1;
//                        int _fourSum = arr[_threeIndex] + _total;
//                        if(_fourSum==arr[this.str.length()-1]){
//                            splitIndex[0] = index;
//                            splitIndex[1] = _secondIndex;
//                            splitIndex[2] = _threeIndex;
//                            total = _total;
//                            flag = true;
//                        }
//                    }
//                }
//            }
//            return flag;
//        }
//
//        public void print(){
//            if(!checkInt){
//                System.out.println("输入含有不合法的非数字字符");
//            }
//            if(!excute()){
//                System.out.println("不存在这样的分隔符");
//            }else{
//                System.out.println("存在~");
//            }
//        }
//    }
//
//    @Test
//    public void fun1(){
//        new fun("14514514514").print();
//    }
//}
package first;

import java.util.ArrayList;
import java.util.List;

public class RecentlyList {
    List<String> list = new ArrayList<>();
    int capacity = 0;

    public RecentlyList(){}

    public RecentlyList(int capacity){
        this.capacity = capacity;
    }

    public void add(String str) throws Exception {
        if(str.equals("")){
           throw new Exception("不能输入空字符串！");
        }
        if(capacity>0){
            if(list.size()==capacity){
                if(list.contains(str)){
                    list.remove(str);
                    list.add(str);
                }else{
                    list.remove(0);
                    list.add(str);
                }
            }else{
                if(list.contains(str)){
                    list.remove(str);
                    list.add(str);
                }else{
                    list.add(str);
                }
            }
        }else{
            if(list.contains(str)){
                list.remove(str);
                list.add(str);
            }else{
                list.add(str);
            }
        }

    }

    public String find(int index){
        //因为要求是最近添加的作为第一个 最远添加的是最后一个 所以遍历的时候倒序遍历
        return list.get(list.size()-1-index);
    }

    public int size(){
        return list.size();
    }

}

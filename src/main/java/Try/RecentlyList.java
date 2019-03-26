package Try;

import java.util.ArrayList;
import java.util.List;

public class RecentlyList {
    List<String> list = new ArrayList<>();
    int capacity = 0;
    public RecentlyList(){}
    public RecentlyList(int capacity){
        this.capacity = capacity;
    }
    public void add(String str){
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
        return list.get(index);
    }
}

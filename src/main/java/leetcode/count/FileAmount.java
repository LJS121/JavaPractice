package leetcode.count;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 统计leetcode包下除了本文件外的其他文件数量和类型
 *
 * @author jinsong.Liang
 * @date 2019/4/2 16:36
 */
public class FileAmount {
    public static void main(String[] args) {
        String filePath = "D:\\download\\JavaPractice\\src\\main\\java\\leetcode";
        Map<String, Integer> map = new HashMap<>();
        getFileMapping(filePath, map);
        map.forEach((key,value)-> System.out.println("file type:"+key+" count:"+value));
    }

    private static void getFileMapping(String filePath, Map<String, Integer> map) {
        File file = new File(filePath);
        if(file.exists()){
            if(file.isDirectory()){
                String[] list = file.list();
                for(String childPath:list){
                    if(childPath.equals("FileAmount.java")){
                        continue;
                    }
                    getFileMapping(filePath+"\\"+childPath,map);
                }
            }else{
                int lastgg = filePath.lastIndexOf("\\");
                String fileName = filePath.substring(lastgg+1);
                String suffix = "no_type";
                suffix = fileName.lastIndexOf('.')>0?fileName.substring(fileName.lastIndexOf('.')+1):suffix;

                if(!map.containsKey(suffix)){
                    map.put(suffix,1);
                }else{
                    map.put(suffix,map.get(suffix)+1);
                }
            }
        }
    }
}

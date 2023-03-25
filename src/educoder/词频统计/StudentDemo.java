package 词频统计;
import java.util.*;

public class StudentDemo{
    //使用String.split()方法分割
    public List<String> splitPartition(String str){
        List<String> list=new ArrayList<String>();
        //请在此添加实现代码
        /********** Begin **********/
        String[] strings = str.split("\\|");
        for(String string: strings){
            list.add(string);
        }
        /********** End **********/
        return list;
    }
    //使用StringTokenizer类进行分割
    public List<String> tokenPartition(String str){
        List<String> list=new ArrayList<String>();
        //请在此添加实现代码
        /********** Begin **********/
        StringTokenizer strings = new StringTokenizer(str, "?");
        while (strings.hasMoreTokens()) {
            list.add(strings.nextToken());
        }
        /********** End **********/
        return list;
    }
    public Map<String, Integer> getMap(String str){
        Map<String, Integer> map = new HashMap<String, Integer>();
        //对str进行分割   再加入map集合中
        //请在此添加实现代码
        /********** Begin **********/
        StringTokenizer strings = new StringTokenizer(str," ,?.!:\n");
        while(strings.hasMoreTokens()){
            String s = strings.nextToken();
            int n=str.indexOf(s);
            map.put(s,n);
        }
        /********** End **********/
        return map;
    }
    public Map<String, Integer> getWordCount(String str) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        //请在此添加实现代码
        /********** Begin **********/
        StringTokenizer strings = new StringTokenizer(str," ;’,?.!:\n");
        while(strings.hasMoreTokens()){
            String s = strings.nextToken();
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }
        /********** End **********/
        return map;
    }
}

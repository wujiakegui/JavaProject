package base;


import java.util.ArrayList;

public class ForEachCircular {
    public static void main(String[] args) {
        // foreach循环遍历数组
        String[] names = {"xiao", "xian", "hua", "nian"};
        for (String name : names) {
            System.out.print(name + "\t");
        }
        System.out.println();
        // foreach循环遍历集合
        ArrayList<String> ming = new ArrayList<String>();
        ming.add("xiao");
        ming.add("xian");
        ming.add("hua");
        ming.add("nian");
        for (String m : ming) {
            System.out.print(m + "\t");
        }
    }
}










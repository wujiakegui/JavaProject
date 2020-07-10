package common_class;

/*
 * 20200429
 * */

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        String name;
        int age;
        String address;
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("请输入姓名：");
        name = sc.nextLine();
        System.out.println("请输入年龄：");
        age = sc.nextInt();
        System.out.println("请输入地址：");
        address = sc.next();
        System.out.println("姓名： " + name);
        System.out.println("年龄： " + age);
        System.out.println("地址： " + address);
    }
}


package object_oriented;


public class ObjectAllMethodUse {
    public static void main(String[] args) {
        Student s = new Student();                    // 创建学生对象 s
        System.out.println("输出学生对象s的 对象类型 :" + s.getClass());            // 输出学生对象s的 对象类型
        Object o = new Object();                    // 创建Object对象o 
        System.out.println("输出o对象的 对象类型: " + o.getClass());                // 输出o对象的 对象类型
        Animal d = new Dog();                        // 创建Dog对象d
        System.out.println("输出d对象的 对象类型: " + d.getClass());                // 输出d对象的 对象类型
        System.out.println("输出d对象的 对象类型: " + d.getClass().getName());    // 输出d对象的 名称
        Animal a1 = new Cat();
        Object a2 = new Cat();
        if (a1.getClass() == a2.getClass()) {      // a1、a2对象都是Cat类型，所以一样
            System.out.println("一样");
        } else {
            System.out.println("不一样");
        }
        System.out.println(a1.hashCode());        // 返回该对象的哈希码值
        System.out.println(a1.toString());      // 返回a1对象的字符串表示
        System.out.println(a1.equals(a1));        // equals比较的是内容  
        System.out.println(a1 == a2);                // == 比较的是地址

    }
}

class Student {
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class Bird extends Animal {
}



package reflex;


public class ClassObject {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取类对象的方式  第一种方式
        Student1 stu = new Student1();
        Class c = stu.getClass();                   // c是类对象，一个类对象代表一个.class文件
        System.out.println(c);
        // 获取类对象的方式  第二种方式    类名.class
        Class c1 = Teacher.class;
        System.out.println(c1);
        // 获取类对象的方式  第三种方式    包名.类名
        Class c2 = Class.forName("reflex.Worker");
        System.out.println(c2);

        // 类对象的常用方法
        System.out.println(c2.getPackage());    // 获得类对象的包名
        System.out.println(c2.getName());       // 获得类对象的名称
        System.out.println(c2.getSuperclass()); // 获得父类的Class对象

    }
}

class Teacher {
}

class Student1 {
    String name;
    int age;
    String sex;

    public Student1() {
    }

    public Student1(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void study() {
    }

    public int exam() {
        return 0;
    }
}

class Worker {
}
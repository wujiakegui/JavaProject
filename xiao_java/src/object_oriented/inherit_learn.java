package object_oriented;

public class inherit_learn {
    String name;
    private int age;//私有属性（本类可见）
    private String sex;
    double score;

    public void setAge(int age) {
        if (age > 0 && age <= 253) {
            this.age = age;
        } else {
            //Future:抛出异常
            this.age = 18;
        }
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        inherit_learn stu = new inherit_learn();
        stu.name = "tom";
        //stu.age = 20;//Error 不能直接访问私有属性	
        //获得stu对象的age属性的值
        stu.setAge(20);
        System.out.println(stu.getAge());
    }
}



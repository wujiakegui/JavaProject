package object_oriented;


public class MemberInnerClass {
    public static void main(String[] args) {

        Outer1 out = new Outer1();            // 创建一个外部类对象
        Outer1.Inner in = out.new Inner();   // 创建一个内部类对象（必须依赖外部类对象）创建语法特殊
        System.out.println(in.b);            // 调用成员内部类的变量
        in.xiao();                            // 调用成员内部类的方法
//		System.out.println(out.a);  		// 报错，无法访问Outer类的私有属性
//		Outer.Inner.field 					//Error 无法脱离外部类对象进行静态的调用

    }
}

class Outer1 {
    private int a = 33;
    private String c = "xiao";

    // 成员内部类，依赖外部类
    class Inner {
        //		static String field = "abc";   //成员内部类不能定义静态成员	
        int b = 5;
        int a = 66;

        public void xiao() {
            int a = 99;
            System.out.println("xiao一xiao" + " " + c);  // 内部类可以直接访问外部类对象
            System.out.println(a);   //内部类可以直接访问自身的局部变量
            System.out.println(this.a);  //内部类可以访问内部类的实例变量
            System.out.println(Outer1.this.a);  //内部类可以访问外部类实例变量
        }
    }
}
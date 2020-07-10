package TiMu;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*  20200525
 *   xiao
 * */
public class Collection_TreeSet implements Comparable {  // implements java.lang.Comparable 依据博客 https://blog.csdn.net/qq_23195583/article/details/44174181
    public static void main(String[] args) {
        Set set = new TreeSet();

        set.add(new Collection_TreeSet("zhang3", 18, 1500));
//        set.add(new Worker("zhang3", 18, 1500)); //重复元素
        set.add(new Collection_TreeSet("li4", 18, 1500));
        set.add(new Collection_TreeSet("wang5", 18, 1600));
        set.add(new Collection_TreeSet("zhao6", 17, 2000));
        set.add(new Collection_TreeSet("zhao6", 19, 2000));

        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Collection_TreeSet w = (Collection_TreeSet) iter.next();
            System.out.println(w.getName() + " " + w.getAge() + " " + w.getSalary());
        }
    }

    private String name;
    private int age;
    private double salary;

    public Collection_TreeSet() {
    }

    public Collection_TreeSet(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int hashCode() {
        int result = 0;
        result += (int) (age + salary);
        if (name != null) result += name.hashCode();
        return result;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (this.getClass() != obj.getClass()) return false;
        Collection_TreeSet w = (Collection_TreeSet) obj;
        if (w.name.equals(name)
                && w.age == age
                && w.salary == salary
        ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        Collection_TreeSet p = (Collection_TreeSet) o;
        return this.age;
    }
}

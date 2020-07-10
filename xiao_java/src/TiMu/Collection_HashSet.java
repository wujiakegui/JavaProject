package TiMu;


import java.util.*;

/*  20200525
 *   xiao
 * */
public class Collection_HashSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Collection_HashSet("Tom", 18, 1000));
        set.add(new Collection_HashSet("Jim", 19, 2000));
        set.add(new Collection_HashSet("Tom", 18, 1000)); // 测试重复元素
        set.add(new Collection_HashSet("xiao", 19, 1000));

        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            Collection_HashSet w = (Collection_HashSet) obj;
            System.out.println(w.getName() + " " + w.getAge() + " " + w.getSalary());
        }
    }

    private String name;
    private int age;
    private double salary;

    public Collection_HashSet() {
    }

    public Collection_HashSet(String name, int age, double salary) {
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
        Collection_HashSet w = (Collection_HashSet) obj;
        if (w.name.equals(name)
                && w.age == age
                && w.salary == salary
        ) {
            return true;
        } else {
            return false;
        }
    }
}

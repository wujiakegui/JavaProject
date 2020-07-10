package test;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.workVehicle();
    }
}

class Father {
    public static void workVehicle() {
        System.out.println("骑自行车去上班");
    }
}

class Son extends Father {
    public static void workVehicle() {
        System.out.println("开车去上班");
    }
}
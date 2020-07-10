package TiMu;

import java.util.Random;
import java.util.Scanner;

/**
 * 20200602
 */

public class ScissorsStonePaperGame {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("欢迎来到超级简单的剪刀石头布游戏！！！");
        System.out.println("EveryBody 嗨起来");
        System.out.println("------------------------------");
        Game game = new Game();
        game.start();
    }
}

class Game {
    private Player player;//组合
    private Computer computer;

    //用户  和  电脑
    public Game() {
        System.out.println("请输入您的名字：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        player = new Player(str);
        computer = new Computer("电脑");
    }

    //三局两胜  胜者加分  比赛三局自动结束  每玩一局，判断赢家并输出。
    private void playThreeTime() {
        int count = 0;
        while (count < 3) {
            int pFirst = player.first();
            int cFirst = computer.first();
            if (pFirst == 0 && cFirst == 1 ||
                    pFirst == 1 && cFirst == 2 ||
                    pFirst == 2 && cFirst == 0) {//石头剪刀布，人赢
                System.out.println(player.getName() + "：此局获胜");
                player.addScore();
            } else if (pFirst == cFirst) {
                System.out.println("此局平局");
            } else {
                computer.addScore();
                System.out.println(computer.getName() + "：此局获胜");
            }
            count++;
        }
    }

    //获得比赛结果  分别输出此次比赛  各得到多少分  胜负情况
    private void getResult() {
        int pScore = player.getScore();
        int cScore = computer.getScore();
        if (pScore > cScore) {
            System.out.println(player.getName() + "：最终结果赢了");

        } else if (pScore == cScore) {
            System.out.println("平局");
        } else {
            System.out.println(computer.getName() + "：最终结果赢了");
        }
        System.out.println(player.getName() + " : " + computer.getName() + " = "
                + player.getScore() + " : " + computer.getScore());
    }

    public void start() {
        while (true) {
            playThreeTime();
            getResult();
            System.out.println("是否继续？【0】是  【1】否");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 0) {
                continue;
            } else {
                break;
            }
        }
    }
}

class Computer {
    private String name;  //私有成员变量
    private int score;

    public Computer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Computer(String name) {
        this.name = name;
        this.score = 0;
    }

    public int first() {   //电脑随机出
        Random random = new Random();
        int n = random.nextInt(3) + 1;//[1,3] [0,3) == > 1, 2  3
        switch (n) {
            case 1:
                System.out.println(name + ":" + "出石头");
                n = 0;
                break;
            case 2:
                System.out.println(name + ":" + "出剪刀");
                n = 1;
                break;
            case 3:
                System.out.println(name + ":" + "出布");
                n = 2;
                break;
        }
        return n;
    }

    public void addScore() { //增加分数
        this.score += 1;
    }

    public int getScore() { //得到分数
        return score;
    }

    public String getName() {//得到名字
        return name;
    }
}

class Player {
    private String name;  //私有成员变量
    private int score;

    public Player(String str) {
        this.name = name;
        this.score = score;
    }

    public static int first() {
        System.out.println("请输入你要出的拳：【0】石头，【1】剪刀，【2】布");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        judge(n);
        return n;
    }

    public static int judge(int p) {
        if (p < 0 || p >= 3) {
            System.out.println("输入有误！重新输入！！！");
            first();
        }
        return p;
    }

    public void addScore() { //增加分数
        score += 1;
    }

    public int getScore() { //得到分数
        return score;
    }

    public String getName() { //得到名字
        return name;
    }
}


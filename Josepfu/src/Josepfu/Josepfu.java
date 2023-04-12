package Josepfu;

public class Josepfu {
    public static void main(String[] args) {
        JosepfuCircle josepfuCircle =new JosepfuCircle();
        josepfuCircle.addTourists(30);
        josepfuCircle.display();
        System.out.println("游戏开始！");
        josepfuCircle.killGame(9,30,15);
        josepfuCircle.display();
        System.out.println("死亡的游客的编号分别为：");
        for(int i=0;i<15;i++) {
            System.out.print(josepfuCircle.dead[i]+"  ");
        }
    }
}

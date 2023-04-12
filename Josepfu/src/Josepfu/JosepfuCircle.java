package Josepfu;
//首先单向循环链表构建出这个环
//通过环实现添加人的功能
//当加入了目标人数后，进行游戏
public class JosepfuCircle {
    Tourist first=null;
    Tourist display=null;
    int []dead=new int[15];
    //参数里面传递的是加入的人数。
    public void addTourists(int num){
        Tourist helper =null;
        for(int i =1;i<=num;i++){
            Tourist addTourist = new Tourist(i);
            if(i==1){//为了形成环，当仅有一个人的时候，应该实现指向自己
                first = addTourist;
                addTourist.setNext(first);//此时形成了环了
                helper=addTourist;
            }else{
                helper.setNext(addTourist);//先实现链接
                helper=addTourist;//此处将helper转移指向新的，为形成环做准备
                helper.setNext(first);//再次指向第一个，形成了环
            }
        }
    }

    //当形成环之后，可以开始考虑游戏设计了
    //参数分别是多少的循环和参加的总人数、最终留下的人数
    public void killGame(int xunhuan,int num,int sava){
        Tourist helper=null;
        Tourist temp=first;
        int count=0;
        helper=temp;//不可以放里面，不然要出错
        while(true){
            if(helper.getNext()==temp){
                break;
            }
            helper=helper.getNext();//循环结束以后，实现了helper指向了first前的那个
        }

        while(true){//该循环用于扔出游客
            for(int i=1;i<xunhuan;i++){//由于报数的时候，自己也算一个，所以代码实现的时候，其实只要循环数-1次
                temp=temp.getNext();
                helper=helper.getNext();
                if(i==xunhuan-1){
                    System.out.println("编号为"+temp.getNo()+"的游客被扔入海中");
                    dead[count]=temp.getNo();
                    temp=temp.getNext();
                    helper.setNext(temp);//通过上面的两步，扔掉了循环到的元素
                    count++;
                }
            }
            if(count==sava){
                System.out.println("游戏结束，最终剩余"+sava+"人");
                return;
            }
        }
    }

    public void display(){
        System.out.println("当前存活者的编号为：");
        System.out.print(first.getNo()+"  ");
        display=first;
        while(true){
            if(display.getNext().equals(first)){
                break;
            }
            display=display.getNext();
            System.out.print(display.getNo()+"  ");
        }
        System.out.println("\n");
    }
}

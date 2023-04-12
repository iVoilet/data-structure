package Josepfu;

public class Tourist {
    private int no;
    private Tourist next;

    public Tourist(){

    }
    public Tourist(int no){
        this.no=no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    /*
    public Josepfu.Tourist getNext() {
        return next;
    }

    public void setNext(Josepfu.Tourist next) {
        this.next = next;
    }

     */
    public Tourist getNext() {
        return next;
    }
    public void setNext(Tourist next) {
        this.next = next;
    }
}

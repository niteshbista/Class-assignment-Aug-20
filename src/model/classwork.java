package model;

public class classwork {
    public Integer value;

    public classwork(Integer value){

    }

    public int getcm(){
        return value  * 100;

    }
    public int getkm(){
        return value / 100;

    }
    public int getmm(){
        return value * 1000;

    }
    public int getdm(){
        return value * 10;
    }
}


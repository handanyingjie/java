package com.lyj.hello;

public class Demo{
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.dostuff();
    }
}
class Outer{
    private int size;
    public class Inner{
        public void dostuff(){
            size ++;
        }
    }

    public void testTheInner(){
        Inner in = new Inner();
        in.dostuff();
    }
}
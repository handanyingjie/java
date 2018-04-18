import java.text.SimpleDateFormat;
import java.util.Date;

public class ep1_2 {
    public static void main(String args[]){
        Date da = new Date();   //时间对象
        SimpleDateFormat mat1 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH : mm : ss : E 北京时间");
        System.out.println(mat1.format(da)); //显示时间和日期

        //以毫秒返回从1970年01月01日00时到目前的时间
        long msec = da.getTime();
        System.out.println("从1970年1月1日0时到现在共有：" + msec + "毫秒");

        Date da2 = new Date(2017,11,1,12,12);
        System.out.println(mat1.format(da2));

        //若调用Date对象所包含的日期比date指定的对象所包含的日期晚，返回true,否则返回false
        System.out.println(da.after(da2));

        //若调用Date对象所包含的日期比date指定的对象所包含的日期早，返回true,否则返回false
        System.out.println(da.before(da2));

        //复制调用Date对象
        System.out.println(mat1.format(da.clone()));

        //比较调用对象所包含的日期和指定的对象包含的日期，若相等返回0;若前者比后者早，返回负值；否则返回正值
        System.out.println(da.compareTo(da2));

        //根据time的值，设置日期和时间。time值从1970年01月01日00时开始计算。
        da.setTime(msec - 1000000);
        System.out.println(mat1.format(da));
    }
}

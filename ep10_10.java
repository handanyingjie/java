import java.io.IOException;

//输入一串字符显示出来，并显示 System.in 和 System.out 所属的类
public class ep10_10 {
    public static void main(String args[]){
        try{
            byte a[] = new byte[128];   //设置输入缓存区
            System.out.print("请输入字符串: ");
            int count = System.in.read(a);   //读取标准输入输出流
            System.out.println("输入的是: ");
            for(int i = 0; i < count; i++){
                System.out.println(a[i] + "");   //输出数组元素的ASCII值
            }
            System.out.println();

            for(int i = 0; i < count;i++){    //不显示回车和换行符
                System.out.print((char) a[i] + ""); //按字符方式输出元素
            }
            System.out.println();

            System.out.println("输入的字符个数为: " + count);
            Class InClass = System.in.getClass();
            Class OutClass = System.out.getClass();
            System.out.println("in 所在的类为: "+ InClass.toString());
            System.out.println("out 所在的类为: " + OutClass.toString());
        }catch (IOException e){}
    }
}

import java.io.*;
public class File {
    public static void main(String args[]) throws IOException{
        char a[] = new char[1000];
        FileReader b = new FileReader("D:/test2.txt");
        int num = b.read(a);
        String str = new String(a, 0, num);
        System.out.println("读取的字符个数为:"+num+",内容为：\n");
        System.out.println(str);
    }
}

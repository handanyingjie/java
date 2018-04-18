import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//实现对二进制图形文件(.jpg)的备份。
public class ep10_6 {
    public static void main(String args[]) throws IOException{
        FileInputStream a = new FileInputStream("./alien.jpg");
        FileOutputStream b =  new FileOutputStream("./alien_bak.jpg");
        System.out.println("文件的大小为:" + a.available());
        byte c[] = new byte[a.available()];
        a.read(c);  //将图形文件读入数组
        b.write(c); //将数组中的数据写入到新文件中
        System.out.println("文件已经被更名复制!");
        a.close();
        b.close();
    }
}

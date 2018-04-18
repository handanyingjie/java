import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//读取数据文件ep10_7.dat 中的三个 int 型数字，求和并显示
public class ep10_8 {
    public static void main(String args[]){
        String fileName = "ep10_7.dat";
        int sum = 0;
        try{
            DataInputStream a = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
            sum += a.readInt();
            sum += a.readInt();
            sum += a.readInt();
            System.out.println("三个数的和为:" + sum);
            a.close();
        }catch (IOException e){}
    }
}

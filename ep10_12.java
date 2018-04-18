import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

//模仿系统日志，将数据写入到文件末尾部。
public class ep10_12 {
    public static void main(String args[]) throws IOException{
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String s = in.readLine();
            RandomAccessFile myFile = new RandomAccessFile("ep10_12.log","rw");
            myFile.seek(myFile.length());   //移动到文件末尾
            myFile.writeBytes( s + "\n");   //写入数据
            myFile.close();
        }catch (IOException e){}
    }
}

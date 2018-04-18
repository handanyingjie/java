import java.io.*;

//将三个 int 数字 100，0，-100 写入数据文件 ep10_7.dat中。
public class ep10_7 {
    public static void main(String args[]){
        String fileName = "ep10_7.dat";
        int value1 = 100, value2 =0, value3 = -100;

        try{
            //将DataOutPutStream 与 FileOutPutStream 链接输出不同类型的数据
            DataOutputStream a = new DataOutputStream(new FileOutputStream(fileName));
            a.writeInt(value1);
            a.writeInt(value2);
            a.writeInt(value3);
            a.close();
        }catch (IOException e){
            System.out.println("出现错误!" + fileName);
        }
    }
}

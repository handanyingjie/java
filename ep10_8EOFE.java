import java.io.*;

/*
    readInt() 方法可以从输入输出流中读入4个字节并将其作为int型数据直接参与运算。
    由于已知ep10_7.dat文件中有3个数据，所以可以使用3个读入语句，但若只知道文件中是int 型数据而不知道数据的个数时该怎么办呢？
    因为DataInputStream的读入操作如遇到文件结尾时会抛出EOFException异常，所以可将读操作放入try中。
 */
public class ep10_8EOFE {
    public static void main(String args[]) throws IOException{
        String fileName = "ep10_7.dat";
        int sum = 0;
        DataInputStream a = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
        try{
            while (true){
                sum += a.readInt();
            }
        }catch(EOFException e){
            System.out.println("三个数的和为:" + sum);
            a.close();
        }
    }
}

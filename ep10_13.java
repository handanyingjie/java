import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

//输入若干文件名，将所有文件压缩为"ep10_13.zip",再从压缩文件中解压并显示。
public class ep10_13 {
    public static void main(String args[]) throws IOException{
        FileOutputStream a = new FileOutputStream("ep10_13.zip");
        //处理压缩文件
        ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(a));
        for(int i = 0; i < args.length; i++){   //对命令行输入的每个文件进行处理
            System.out.println("Writing file" + args[i]);
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(args[i]));
            out.putNextEntry(new ZipEntry(args[i]));    //设置ZipEntry对象
            int b;
            while ((b = in.read()) != -1){
                out.write(b);   //从源文件读出，往压缩文件中写入
            }
            in.close();
        }
        out.close();

        //解压文件并显示
        System.out.println("Reading file.");
        FileInputStream d = new FileInputStream("ep10_13.zip");
        ZipInputStream inout = new ZipInputStream(new BufferedInputStream(d));
        ZipEntry z;

        while ((z = inout.getNextEntry()) != null){ //获得入口
            System.out.println("Reading file" + z.getName());   //显示文件初始名
            int x;
            while ((x = inout.read()) != -1){
                System.out.write(x);
            }
            System.out.println();
        }
        inout.close();
    }
}
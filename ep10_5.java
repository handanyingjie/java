import java.io.*;

//通过程序创建一个文件，从键盘输入字符，当遇到字符”#“时结束，在屏幕上显示该文件的所有内容。
public class ep10_5 {
    public static void main(String args[]){
        char ch;
        int data;
        try{
            FileInputStream a = new FileInputStream(FileDescriptor.in); //创建文件输入流对象
            FileOutputStream b = new FileOutputStream("ep10_5"); //创建文件输出流对象
            System.out.println("请输入字符，以#号结束：");
            while ((ch = (char) a.read()) != '#'){
                b.write(ch);
            }
            a.close();
            b.close();
            System.out.println();

            FileInputStream c = new FileInputStream("ep10_5");
            FileOutputStream d = new FileOutputStream(FileDescriptor.out);
            while (c.available() > 0){
                data = c.read();
                d.write(data);
            }
            c.close();
            d.close();
        }catch (FileNotFoundException e){
            System.out.println("找不到该文件!");
        }catch (IOException io){
            System.out.println("IOException:" + io);
        }
    }
}

import java.io.*;

public class ep10_4 {
    public static void main(String args[]){
        String str = new String();
        try{
            BufferedReader in = new BufferedReader(new FileReader("D:/ep10_4_a.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("D:/ep10_4_b.txt"));

            while ((str = in.readLine()) != null) {
                System.out.println(str);
                //调用out对象的write()方法写入数据时，不会写入回车，因此需要使用newLine()方法在每行数据后加入回车，以保证目标文件与源文件一致
                out.write(str);
                out.newLine();
            }
            out.flush();
            in.close();
            out.close();
        }catch (IOException io){
            System.out.println("出现错误:" + io);
        }
    }
}

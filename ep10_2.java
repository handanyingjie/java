import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ep10_2 {
    public static void main(String args[]) throws IOException {
        String OneLine;
        int count = 0;

        try{
            FileReader a = new FileReader("D:/test2.txt");
            BufferedReader b = new BufferedReader(a);
            while ((OneLine = b.readLine()) != null){
                count++;
                System.out.println(OneLine);
            }
            System.out.println("\n 共去读了" + count + "行");
            b.close();
        }catch (IOException io){
            System.out.println("出错了" + io);
        }
    }
}

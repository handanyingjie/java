import java.io.FileWriter;
import java.io.IOException;

public class ep10_3 {
    public static void main(String args[]){
        try{
            FileWriter a = new FileWriter("D:/test2.txt");
            for(int i = 32; i < 126; i ++){
                a.write(i);
            }
            a.close();
        }catch (IOException io){
            System.out.println("EOException:" + io);
        }
    }
}

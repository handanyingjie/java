import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ep10_13 {
    public static void main(String args[]) throws IOException{
        FileOutputStream a = new FileOutputStream("ep10_13.zip");
        ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(a));
        for(int i = 0; i < args.length; i++){
            System.out.println("Writing file" + args[i]);
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(args[i]));
            out.putNextEntry(new ZipEntry(args[i]));
            int b;
            while ((b = in.read()) != -1){
                out.write(b);
            }
            in.close();
        }
        out.close();

        System.out.println("Reading file.");
        FileInputStream d = new FileInputStream("ep10_13.zip");
        ZipInputStream inout = new ZipInputStream(new BufferedInputStream(d));
        ZipEntry z;

        while ((z = inout.getNextEntry()) != null){
            System.out.println("Reading file" + z.getName());
            int x;
            while ((x = inout.read()) != -1){
                System.out.write(x);
            }
            System.out.println();
        }
        inout.close();
    }
}

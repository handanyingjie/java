//产生10个10-100之间的随机整数。
public class ep8_2 {
    public static void main(String args[]){
        int a;
        System.out.print("随机数为:");
        for (int i = 1; i <= 10; i++){
//            a = (int) ((100 - 10 + 1)* Math.random() + 10);
            a = (int) (99 * Math.random() + 10);
            System.out.print(" " + a);
        }
        System.out.println();
    }
}

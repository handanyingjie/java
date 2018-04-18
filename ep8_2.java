//产生10个10-100之间的随机整数。
//若要产生[a,b]之间的随机数其通式为:(b - a + 1) * Math.random() + a
public class ep8_2 {
    public static void main(String args[]){
        int a;
        System.out.print("随机数为:");
        for (int i = 1; i <= 10; i++){
            a = (int) ((100 - 10 + 1)* Math.random() + 10);
            System.out.print(" " + a);
        }
        System.out.println();
    }
}

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ep1_3 {
    public static void main(String args[]){
        String greeting = "Hello";

        /*
            子串
            substring 的工作方式有一个优点：容易计算子串的长度。字符串s.substring(a,b)的长度未b-a。
        */
        String s = greeting.substring(0,3);
        System.out.println(s);

        /*
            拼接
            与绝大多数的程序设计语言一样，Java语言允许使用 + 号链接(拼接)两个字符串
         */
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);

        /*
            当将一个字符串值与一个非字符串的值进行拼接时，后者被转换成字符串
         */
        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);

        /*
            检测字符串是否相等
            可以用equals 方法检测两个字符串是否相等

            要检测两个字符串是否相等，而不区分大小写，可以使用equalsIgnoreCase 方法
         */
        boolean bA = "hel".equals(s);
        System.out.println(bA);
        boolean bB = "hel".equalsIgnoreCase(s);
        System.out.println(bB);

        /*
            一定不能使用 == 运算符检测两个字符串是否相等！这个运算符只能确定两个字符串是否放置在同一个位置上。当然如果字符串
            放置在同一个位置上，他们必然相等。但是，完全有可能将内容相同的多个字符串的拷贝放置在不同的位置上
         */
        String sA = "abcdef";
        System.out.println(("abcdef" == sA.substring(0,sA.length())) ? true : false);

        /*
            空串与Null串
         */
        String sB = "";
        //检测空字符串
        if(sB.length() == 0){
            System.out.println("sB为空!");
        }
        if(sB.equals("")){
            System.out.println("sB为空!");
        }

        //检测是否未赋值
        sB = null;
        if(sB == null){
            System.out.println("sB为null");
        }

        //既不是null也不为空字符串
        if(sB != null && sB.length() > 0){
            System.out.println("sB既不是null也不为空字符串!");
        }

        /*
            代码点与代码单元
         */
        String hello ="Hello";
        int n = hello.length();
        System.out.println(n);

        //要想得到实际的长度，即代码点数量，可以调用
        int cpCount = hello.codePointCount(0,n);
        System.out.println(cpCount);

        //调用s.charAt(n)将返回位置n的代码单元，n介于0 - s.length() - 1之间
        char first = hello.charAt(0);
        System.out.println(first);

        char second = hello.charAt(1);
        System.out.println(second);

        //要向得到第i个代码点(ASCII对应的十进制)，应该使用下例语句
        int index = hello.offsetByCodePoints(0,0);
        int cp = hello.codePointAt(index);
        System.out.println(cp);
    }
}

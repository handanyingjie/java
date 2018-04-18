/*
    String类不能改变字符串对象中的内容，只能通过建立一个新串来实现字符串的变化。如果字符串需要动态改变，就需要用StringBuffer类。
    StringBuffer类主要用来实现字符串的添加、修改、删除，也就是说该类对象实体的内存空间可以自动改变大小，以便于存放一个可变的字
    符序列。
 */
public class ep1_1 {
    public static void main(String args[]){
        StringBuffer str = new StringBuffer("abcdefghijklmn");
        str.append(true);   //使用append方法可以将其他Java类型数据转化为字符串后再追加到StringBuffer的对象中。
        System.out.println(str);

        str.insert(1,"b"); // insert方法将一个字符串插入对象的字符序列中的某个位置。
        System.out.println(str);

        //将当前StringBuffer对象中的字符序列n处的字符用参数ch指定的字符替换，n的值必须是非负的，并且小于当前对象中字符串序列
        // 的长度
        str.setCharAt(2,'c');
        System.out.println(str);

        str.reverse();  //使用reverse方法可以将对象中的字符序列翻转。
        System.out.println(str);

        //从当前StringBuffer对象中的字符序列删除一个子字符序列。这里的n指定了需要删除的第一个字符的下标,m指定了需要删除的最后
        //一个字符的下一个字符的小标，因此删除的子字符从n-m-1
        str.delete(1,3);
        System.out.println(str);

        //用str替换对象中的字符序列，被替换的子字符序列由下标n和m指定,被替换的子字符范围从n…m-1
        str.replace(1,3,"poi");
        System.out.println(str);
    }
}

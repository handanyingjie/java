public class Teacher extends People {
    String school;  //所在学校
    String subject; //学科
    int seniority;  //教龄

    //覆盖People类中的say()方法
    void say(){
        System.out.println("我叫" + name + ",在" + school + "教" + subject + ",有" + seniority + "年教龄!");
    }

    void lecturing(){
        System.out.println("我已经" + age + "岁了，依然站在讲台商讲课!");
    }
}

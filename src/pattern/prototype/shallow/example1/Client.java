package pattern.prototype.shallow.example1;

/**
 * Author li.ling
 * Description
 * Date 2021/6/21 12:04
 */
public class Client {

    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2001","XX公司");
        Resume b = a.clone();
        b.setWorkExperience("1998-2006","YY公司");
        Resume c = a.clone();
        c.setPersonalInfo("男","24");
        c.setWorkExperience("1998-2003","ZZ公司");
        // 工作经验最后输出是最后设置的1998-2003，ZZ公司这条记录，说明三个实例都指向同一个引用。这也是浅拷贝的特点，
        // 被拷贝的对象如果含有对象的引用如本例的WorkExperience对象，那么它是不会被拷贝到新对象的
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}

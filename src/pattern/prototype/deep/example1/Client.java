package pattern.prototype.deep.example1;


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
        // 此时的深拷贝，已经将三个实例的工作经验设置成功了，他们不再指向同一个WorkExperience实例
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}

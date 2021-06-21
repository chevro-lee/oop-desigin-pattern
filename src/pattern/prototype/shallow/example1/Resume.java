package pattern.prototype.shallow.example1;

import java.io.Serializable;

/**
 * Author li.ling
 * Description 原型类，被克隆的类型
 * 被克隆的类，必须实现Cloneable,Serializable接口
 * Date 2021/6/21 11:39
 */
public class Resume implements Cloneable, Serializable {

    private String name;

    private String sex;

    private String age;

    private WorkExperience workExperience;

    public Resume(String name)  {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public void setPersonalInfo(String age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String workDate, String company) {
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setCompany(company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 克隆方法
     *
     * @return Resume
     */
    public Resume clone() {
        Object o;
        try {
            o = super.clone();
            return (Resume) o;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", workExperience.workDate=" + workExperience.getWorkDate() + '\'' +
                ", workExperience.company=" + workExperience.getCompany() +
                '}';
    }
}

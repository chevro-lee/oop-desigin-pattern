package pattern.prototype.deep.example1;

import java.io.Serializable;

/**
 * Author li.ling
 * Description
 * Date 2021/6/21 11:57
 */
public class WorkExperience implements Cloneable, Serializable {

    private String workDate;

    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

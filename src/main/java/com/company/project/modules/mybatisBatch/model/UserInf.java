package com.company.project.modules.mybatisBatch.model;

import java.io.Serializable;

/**
 * 
 * UserInf
 * 数据库表：user_inf
 * 
 * @author Lijingrun
 * @version 1.0 2018-10-18
 */
public class UserInf implements Serializable {

    /**
     * 
     * 表字段 : user_inf.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : user_inf.uname
     */
    private String uname;

    /**
     * 
     * 表字段 : user_inf.passwd
     */
    private String passwd;

    /**
     * 
     * 表字段 : user_inf.gentle
     */
    private String gentle;

    /**
     * 
     * 表字段 : user_inf.email
     */
    private String email;

    /**
     * 
     * 表字段 : user_inf.city
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_inf
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getGentle() {
        return gentle;
    }

    public void setGentle(String gentle) {
        this.gentle = gentle == null ? null : gentle.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uname=").append(uname);
        sb.append(", passwd=").append(passwd);
        sb.append(", gentle=").append(gentle);
        sb.append(", email=").append(email);
        sb.append(", city=").append(city);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserInf other = (UserInf) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getPasswd() == null ? other.getPasswd() == null : this.getPasswd().equals(other.getPasswd()))
            && (this.getGentle() == null ? other.getGentle() == null : this.getGentle().equals(other.getGentle()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getPasswd() == null) ? 0 : getPasswd().hashCode());
        result = prime * result + ((getGentle() == null) ? 0 : getGentle().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        return result;
    }
}
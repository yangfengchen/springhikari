package com.yangfeng.entity;

import java.io.Serializable;

public class TblUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.id
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.name
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.id
     *
     * @return the value of tbl_user.id
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.id
     *
     * @param id the value for tbl_user.id
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.name
     *
     * @return the value of tbl_user.name
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.name
     *
     * @param name the value for tbl_user.name
     *
     * @mbg.generated Sat Nov 10 19:31:33 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
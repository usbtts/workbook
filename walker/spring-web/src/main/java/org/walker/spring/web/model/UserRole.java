package org.walker.spring.web.model;

public class UserRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.UserID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.RoleID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    private Integer roleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.UserID
     *
     * @return the value of user_role.UserID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.UserID
     *
     * @param userid the value for user_role.UserID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.RoleID
     *
     * @return the value of user_role.RoleID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.RoleID
     *
     * @param roleid the value for user_role.RoleID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}
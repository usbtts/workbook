package org.walker.spring.web.model;

public class Permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.ID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.Title
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.Action
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    private String action;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.ID
     *
     * @return the value of permission.ID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.ID
     *
     * @param id the value for permission.ID
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.Title
     *
     * @return the value of permission.Title
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.Title
     *
     * @param title the value for permission.Title
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.Action
     *
     * @return the value of permission.Action
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.Action
     *
     * @param action the value for permission.Action
     *
     * @mbg.generated Tue Oct 20 17:57:38 CST 2020
     */
    public void setAction(String action) {
        this.action = action;
    }
}
package com.timmy.po;

public class Manager {
    private Integer managerid;

    private String managername;

    private String managerrepertory;

    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername == null ? null : managername.trim();
    }

    public String getManagerrepertory() {
        return managerrepertory;
    }

    public void setManagerrepertory(String managerrepertory) {
        this.managerrepertory = managerrepertory == null ? null : managerrepertory.trim();
    }
}
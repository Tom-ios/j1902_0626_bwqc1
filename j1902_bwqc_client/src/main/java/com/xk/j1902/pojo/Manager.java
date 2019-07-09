package com.xk.j1902.pojo;

import lombok.Data;

/**
 * Created by Qxk on 2019/6/29.
 */
@Data
public class Manager {
    private int id;
    private String name;
    private String password;
    private String account;
    private String role;
    private String section;
    private String phone;
    private String uemail;
    private String remarks;

    public Manager(int id, String name, String password, String account, String role, String section, String phone, String uemail, String remarks) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.account = account;
        this.role = role;
        this.section = section;
        this.phone = phone;
        this.uemail = uemail;
        this.remarks = remarks;
    }
}

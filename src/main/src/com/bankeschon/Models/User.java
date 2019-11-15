package com.bankeschon.Models;

import java.sql.Timestamp;

public class User extends BaseModelORM {
    private String tableName = "users";

    private String login;
    private String password;
    private Integer role;
    private Timestamp created_at;
    private Timestamp updated_at;

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;

        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;

        return this;
    }

    public Integer getRole() {
        return role;
    }

    public User setRole(Integer role) {
        this.role = role;

        return this;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public User setCreated_at(Timestamp created_at) {
        this.created_at = created_at;

        return this;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public User setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;

        return this;
    }

    @Override
    public String getTableName()
    {
        return this.tableName;
    }
}

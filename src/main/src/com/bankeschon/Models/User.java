package com.bankeschon.Models;

public class User extends BaseModelORM {
    private String tableName = "users";

    private String login;
    private String password;
    private Integer role;
    private String created_at;
    private String updated_at;

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

    public String getCreated_at() {
        return created_at;
    }

    public User setCreated_at(String created_at) {
        this.created_at = created_at;

        return this;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public User setUpdated_at(String updated_at) {
        this.updated_at = updated_at;

        return this;
    }

    @Override
    public String getTableName()
    {
        return this.tableName;
    }
}

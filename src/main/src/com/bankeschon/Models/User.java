package main.src.com.bankeschon.Models;

import java.util.UUID;

public class User {
    private String tableName = "users";

    public UUID _id;
    private String login;
    private String password;
    private Integer role;
    public String created_at;
    public String updated_at;
}

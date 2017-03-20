package com.crest.backend.dao.nosql.DTO.users;

/**
 * Created by sgangras on 3/20/17.
 */
public class User {
    private String _id ;
    private String _rev;
    private String userId;
    private String emailId;
    private String password;
    private Role role;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role.name() +
                '}';
    }
}

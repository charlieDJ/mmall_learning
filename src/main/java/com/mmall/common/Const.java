package com.mmall.common;

public class Const {
    public static final String CURRENT_USER="currentUser";

    public static final String EMAIL="email";
    public static final String USERNAME="username";

    public interface Role {
        int ROLR_CUSTOMER = 0;//普通用户
        int ROLR_AMDIN = 1;//管理员用户
    }
}

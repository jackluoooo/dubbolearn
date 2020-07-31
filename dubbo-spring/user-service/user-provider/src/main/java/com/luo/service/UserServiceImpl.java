package com.luo.service;

/**
 * @description:
 * @author: ljx
 * @create: 2020/07/30 14:10
 */
public class UserServiceImpl implements IUserService {
    public String getNameById(String uid) {
        System.out.println("receive uid "+uid);
        return "ljx";
    }
}
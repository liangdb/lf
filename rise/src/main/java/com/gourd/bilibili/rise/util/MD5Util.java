package com.gourd.bilibili.rise.util;

import java.security.MessageDigest;

/**
 * 用于密码加密
 */
public class MD5Util {
    private static final String SALT = "CPDown";//这是自己加的前缀

    public static String encode(String password) {
        password = password + SALT;             //用户密码拼上前缀进行加密
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        char[] charArray = password.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
 /*   public static void main(String[] args) {
        System.out.println(encode("pengpeng"));
    }*/

}

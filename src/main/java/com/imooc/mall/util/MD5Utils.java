package com.imooc.mall.util;

import com.imooc.mall.common.Constant;
import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @ClassName: MD5Utils
 * @Description: md5工具类
 * @author: XU
 * @date: 2022年09月05日 16:20
 **/

public class MD5Utils {
    public static String getMD5Str(String strValue) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return Base64.encodeBase64String(md5.digest((strValue + Constant.SALT).getBytes()));
    }
    public static void main(String[] args) {
        String md5 = null;

        try {
            md5 = getMD5Str("12345678");
        } catch (NoSuchAlgorithmException var3) {
            var3.printStackTrace();
        }

        System.out.println(md5);
    }
}

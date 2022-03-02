package com.encryption;

import org.apache.http.util.TextUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EncryptionTest {

    public static void main(String[] args) {
        System.err.println(decrypt("q~tb\u007Fyt>s\u007F~du~d>`}>@qs{qwu@qbcub4@qs{qwu"));
        System.err.println(decrypt("哈哈，你好哟~"));
        System.err.println(encryption("哘哘＜佰奭哏n"));
        System.err.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    /**
     * 解密
     */
    public static String decrypt(String paramString) {
        if (TextUtils.isEmpty(paramString))
            return "";
        char[] arrayOfChar = paramString.toCharArray();
        for (int i = 0; i < arrayOfChar.length; i++)
            arrayOfChar[i] = (char) (arrayOfChar[i] ^ 0x10);
        return String.valueOf(arrayOfChar);
    }

    /**
     * 加密
     */
    private static String encryption(String str) {
        return decrypt(str);
    }
}

package com.example.anymouseweb.CommonUtill;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class Des {
    //Des加密的密钥
    private static final String key = "1234567812345678";

    /**
     * 加密方法 返回一个数组类型
     * @param message
     * @return
     */
    public static byte[] encypt(String message) {
        try
        {
/**
 * des算法需要一个值得信赖的随机数据源
 */
            SecureRandom random = new SecureRandom();
/**
 * 将秘钥转换成byte
 */
            DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
/**
 * 实例化一个秘钥工厂
 */
            SecretKeyFactory secretKeyFactory = SecretKeyFactory
                    .getInstance("DES");
/**
 * 使用秘钥工厂生成一个秘钥
 */
            javax.crypto.SecretKey securekey = secretKeyFactory
                    .generateSecret(desKeySpec);
/**
 * 设置加密类型为DES
 */
            Cipher cipher = Cipher.getInstance("DES");
/**
 * 初始化加密
 */
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
/**
 * 做加密
 */
            return cipher.doFinal(message.getBytes());
        } catch (InvalidKeyException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidKeySpecException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchPaddingException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalBlockSizeException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BadPaddingException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    /**
     * DES解密
     *
     * @param message
     * @return
     * @throws Exception
     */
    public static byte[] deencypt(byte[] message) {
        try
        {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            Cipher cipher = Cipher.getInstance("DES");
/**
 * 初始化解密
 */
            cipher.init(Cipher.DECRYPT_MODE, secretKey, random);
            return cipher.doFinal(message);
        } catch (InvalidKeyException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidKeySpecException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchPaddingException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalBlockSizeException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BadPaddingException e)
        {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}

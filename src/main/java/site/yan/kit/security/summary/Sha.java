package site.yan.kit.security.summary;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update("你好,界！".getBytes(StandardCharsets.UTF_8));
       System.out.print(byteArrayToHexString(messageDigest.digest()));
    }

    /**
     * byte[] 按位转换为 16 进制 String
     * @param aData 需要转换的 byte[]
     * @return byte[] 按位转换为的 16 进制 String
     */
    public static String byteArrayToHexString(byte[] aData) {
        final char[] hexChars = "0123456789abcdef".toCharArray();
        // 一个字节用两个 16 进制字符表示
        StringBuilder stringBuilder = new StringBuilder(aData.length * 2);
        for (byte b : aData) {
            // 高 4 位转换为 16 进制
            stringBuilder.append(hexChars[(b >>> 4) & 0x0f]);
            // 低 4 位转换为 16 进制
            stringBuilder.append(hexChars[b & 0x0f]);
        }
        return stringBuilder.toString();
    }
}

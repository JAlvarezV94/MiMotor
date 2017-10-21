package Helpers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncodeHelper {
	
	
	public static String toSHA1(String password) {
		byte[] byteArray;
		MessageDigest md;
		StringBuffer sb;
		
		try {
			md = MessageDigest.getInstance("SHA1");
			byteArray = md.digest(password.getBytes());
			sb = new StringBuffer();
			
			for (byte b : byteArray) {
				sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1,3));
			}
			
			return sb.toString();
		}catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}

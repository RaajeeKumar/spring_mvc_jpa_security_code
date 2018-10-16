import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import junit.framework.TestCase;

public class PasswordHash extends TestCase {

	
	public void testPasswordMD5() {
		String password = "secret";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String encodedPassword = passwordEncoder.encodePassword(password, null);
		System.out.println(encodedPassword);
	}
	
	public void testPasswordBcrypt() {
		String password = "secret";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(password);
		System.out.println(encodedPassword);
	}
}

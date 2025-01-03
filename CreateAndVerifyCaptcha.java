package captcha;

import java.util.Scanner;

public class CreateAndVerifyCaptcha {

	public static void main(String[] args) {
		String generatedCaptcha = generatedCaptcha();
		System.out.println("Captcha : " + generatedCaptcha);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Verify Captcha : ");
		String VerifiedCaptcha = sc.next();
		if(generatedCaptcha.equals(VerifiedCaptcha)) {
			System.out.println("Verified : You can enter into the application.");
		}
		else {
			System.out.println("Invalid captcha!, Please try again");
		}
		
		sc.close();

	}

	
	//Generating a 6 element captcha
	
	private static String generatedCaptcha() {
		String captchaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@!#$%^&*1234567890";
		String captcha = "";
		for(int i = 0; i < 6; i++) {
			int index = (int) (Math.random() * captchaString.length());
			captcha = captcha + captchaString.charAt(index);
		}
		return captcha;
	}

}

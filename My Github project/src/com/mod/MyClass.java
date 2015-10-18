package com.mod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.config.DisplayClass;

public class MyClass {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		DisplayClass.display();
		System.out.println("Third commit");
		System.out.println("Fourth commit");

	}

}

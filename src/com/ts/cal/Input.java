package com.ts.cal;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Input {
	private static final String FONT = "宋体";
	private static final String PIC_ROUTE = "result.png";
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Please print your expression");
		String expression = scanner.nextLine();
		File directory = new File("");
		try {
			Path route = Paths.get(directory.getCanonicalPath(), PIC_ROUTE);
			ImageProducerUtil.createImage(expression, new Font(FONT, Font.PLAIN, 100), route.toFile());
			System.out.println("result route:" + route);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
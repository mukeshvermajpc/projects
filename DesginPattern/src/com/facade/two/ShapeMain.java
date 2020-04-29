package com.facade.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeMain {
	public static void main(String args[]) throws NumberFormatException, IOException {
		boolean state = true;
		do {
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			System.out.println("3. Square");
			System.out.println("Select your option");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int option = Integer.parseInt(br.readLine());
			ShapeMaker sm=new ShapeMaker();
			switch (option) {
			case 1: sm.drawCircle();break;
			case 2:sm.drawRectangle();break;
			case 3:sm.drawSquare();break;
			case 4:System.out.println("You are not exit !!");state=false;break;
			default:System.out.println("Select correct option");break;
			}
		} while (state);
	}
}

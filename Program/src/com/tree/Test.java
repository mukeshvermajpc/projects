package com.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

abstract class CTest{
  void display()	
  {
	  System.out.println("test display");
  }
}


public class Test extends CTest implements Shape {
	public static void main(String[] args) throws IOException {
     new Test().display();
     new Test().draw();
	}

	@Override
	public void draw() {
		System.out.println("drawing");
		
	}
}

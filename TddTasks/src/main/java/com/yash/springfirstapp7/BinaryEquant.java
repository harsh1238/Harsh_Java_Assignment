package com.yash.springfirstapp7;
/**
 * @author harshavardhan.patil
 *
 */
public class BinaryEquant {
public String findBinaryEquant(int num) {
		
		int temp=num,rem;
		String binary="";
		rem=temp%2;
		binary+=Integer.toBinaryString(num);
		return binary;
	}
}

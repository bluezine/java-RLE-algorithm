package kr.co.bluezine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		System.out.println("********************************************");
		System.out.println("*                                          *");
		System.out.println("*             RLE Algorithm                *");
		System.out.println("*                                          *");
		System.out.println("********************************************");
		System.out.print("Insert Data : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data = reader.readLine();
		Long startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		int completeSize = 0;
		int line = 0;
		for (int i = 0; i < data.length(); i++) {
			line++;
			int runLength = 1;
			while (i + 1 < data.length()
					&& data.charAt(i) == data.charAt(i + 1)) {
				runLength++;
				i++;
			}
			buffer.append("[" + data.charAt(i) + "," + runLength + "]");
			completeSize++;
			if (line == 5) {
				buffer.append("\n");
				line = 0;
			}
		}
		System.out.println(buffer);
		System.out.println("Original Size : " + data.length());
		System.out.println("Compress Size : " + completeSize);
		System.out.println("================================");
		System.out.println("Execute Time : "
				+ (System.currentTimeMillis() - startTime) / 1000.0 + "s");
	}
}

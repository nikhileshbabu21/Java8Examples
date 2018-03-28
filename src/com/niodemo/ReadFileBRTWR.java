package com.niodemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedReader + try-with-resources 

public class ReadFileBRTWR {

	public static void main(String args[]) {

		String fileName = "src/lines.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
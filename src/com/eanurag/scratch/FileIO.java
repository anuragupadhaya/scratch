package com.eanurag.scratch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileIO {

	public static void main(String[] args) {
		// create file

		try {
			File file = new File("c:\\bank_transaction.txt");

			if (file.createNewFile()) {
				System.out.println("File created");
			} else {
				System.out.println("File exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// read file
		BufferedReader br = null;

		try {

			String currentLine;

			br = new BufferedReader(new FileReader("c:\\bank_transaction.txt"));
			while ((currentLine = br.readLine()) != null) {
				if (currentLine.contains("Lin"))
					System.out.println(currentLine);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// write file

		BufferedWriter bw = null;

		try {
			String content = "\nLine4";

			bw = new BufferedWriter(new FileWriter("c:\\bank_transaction.txt",
					true));
			bw.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

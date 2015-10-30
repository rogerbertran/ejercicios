package NF10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici1 {

	public static void write(FileInputStream arxiu, FileOutputStream arxiu2) throws IOException {
		int x;
		try {
			while ((x = arxiu.read()) > -1) {
				arxiu2.write(x);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file1 = null;
		FileInputStream file2 = null;
		FileInputStream file3 = null;
		FileOutputStream out = null;

		try {
			file1 = new FileInputStream("file1.txt");
			file2 = new FileInputStream("file2.txt");
			file3 = new FileInputStream("file3.txt");
			out = new FileOutputStream("lastFile.txt");

			write(file1, out);
			write(file2, out);
			write(file3, out);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			file1.close();
			file2.close();
			file3.close();
			out.close();
		}
	}

}

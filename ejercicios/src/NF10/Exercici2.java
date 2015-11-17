package NF10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici2 {
	public static void main(String[] args) throws IOException, FileNotFoundException {

		FileInputStream in = new FileInputStream("bigOne.txt");
		FileOutputStream out = new FileOutputStream("outagain0.txt");
		int c = 0;
		int i = 0;
		int j = 1;
		while ((c = in.read()) != -1) {
			out.write(c);
			i++;
			if (i % 8 == 0) {
				out.close();
				out = new FileOutputStream("outagain" + j + ".txt");
				j++;
			}
		}
		out.close();
		in.close();

	}

}

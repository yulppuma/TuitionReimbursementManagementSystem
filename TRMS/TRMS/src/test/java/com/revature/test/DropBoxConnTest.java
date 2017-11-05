package com.revature.test;

import java.io.File;

import org.junit.Test;

import com.revature.dropbox.DropBoxConnection;

public class DropBoxConnTest {
	
	private DropBoxConnection dbc = DropBoxConnection.getInstance();
	
	@Test
	public void UploadTest() {
		File file = new File("test.txt");
		dbc.uploadFile(file);;
	}
	
	@Test
	public void DownloadTest() {
		String filename = "test.txt";
		String filepath = "downloads/test.txt";
		dbc.downloadFile(filename, filepath);
	}

}

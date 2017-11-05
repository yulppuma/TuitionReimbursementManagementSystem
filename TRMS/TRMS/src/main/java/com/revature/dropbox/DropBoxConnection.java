package com.revature.dropbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.UploadErrorException;

public class DropBoxConnection {
	private static final String ACCESS_TOKEN = "cm-u8knZVRAAAAAAAAAALJHcAr5m9vK4Phhdo1OVyYb2HcdZw5IUJeVLnhPTTIul";
	private DbxRequestConfig config;
	private DbxClientV2 client;
	private static DropBoxConnection dbc = null;
	
	private DropBoxConnection() {
		config = new DbxRequestConfig("dropbox/java-tutorial", "en_US");
		client = new DbxClientV2(config, ACCESS_TOKEN);
	}
	
	public static synchronized DropBoxConnection getInstance() {
		if(dbc == null) {
			dbc = new DropBoxConnection();
		}
		
		return dbc;
		
	}
	
	public void downloadFile(String filename, String path) {
		OutputStream out;
		try {
			out = new FileOutputStream(path);
			FileMetadata metadata = client.files().downloadBuilder("/" + filename).download(out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DbxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void uploadFile(File file) {
		try {
			InputStream in = new FileInputStream(file);
			FileMetadata metadata = client.files().uploadBuilder("/" + file).uploadAndFinish(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UploadErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DbxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

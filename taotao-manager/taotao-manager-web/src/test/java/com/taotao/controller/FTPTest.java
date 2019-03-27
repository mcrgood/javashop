package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import com.taotao.common.utils.FtpUtil;

public class FTPTest {
	
	/*@Test
	public void FtpTestClient() throws Exception{
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect("192.168.217.131", 21);
		ftpClient.login("ftpuser", "ftpuser");
		FileInputStream fileInputStream =new FileInputStream(new File("D:\\phpems\\files\\attach\\files\\content\\20181010\\15391360719906.jpg"));
		ftpClient.changeWorkingDirectory("/var/www/html/images/");
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.storeFile("hello.jpg", fileInputStream);
		ftpClient.logout();
	}*/
	@Test
	public void testFtpUtils() throws Exception{
		FileInputStream fileInputStream =new FileInputStream(new File("D:\\phpems\\files\\attach\\files\\content\\20181010\\15391360719906.jpg"));
		FtpUtil.uploadFile("192.168.217.131", 21, "ftpuser", "ftpuser", "/var/www/html/images", "/2019/03/22", "hello.jpg", fileInputStream);
	}
}

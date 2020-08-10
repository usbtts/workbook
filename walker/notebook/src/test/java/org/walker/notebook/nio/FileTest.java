package org.walker.notebook.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private File file;
	
	@Before
	public void setUp() {
		logger.debug("set up test context");
		file = new File(this.getClass().getClassLoader().getResource("file.txt").getFile());
		logger.debug("file name is: {}", file.getName());
	}
	
	@Test
	public void fileOprationNioRead() {
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream(file);
			FileChannel fileChannel = fileStream.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(64);
			int length = -1;
			while ((length = fileChannel.read(buffer)) != -1) {
				logger.info("Read 1024 byte: {}", new String(buffer.array(), 0, length));
				buffer.clear();
			}
			fileChannel.close();
		} catch (FileNotFoundException e) {
			logger.error("File " + file.getName() + " cannot be found", e);
		} catch (IOException e) {
			logger.error("Exception in writing file", e);
		} finally {
			if (fileStream != null) {
				try {
					fileStream.close();
				} catch (IOException e) {
					logger.error("Cannot close file stream", e);
				}
			}
		}
	}
	
	@Test
	public void fileOperationNioWrite() {
		FileOutputStream fos = null;
		try {
			 fos = new FileOutputStream(file);
			 FileChannel channel = fos.getChannel();
			 ByteBuffer buffer = ByteBuffer.allocate(8);
			 buffer.put("write into file".getBytes());
			 while (buffer.hasRemaining()) {
				 channel.write(buffer);
			 }
		} catch (FileNotFoundException e) {
			logger.error("File " + file.getName() + " cannot be found", e);
		} catch (IOException e) {
			logger.error("Exception in writing file", e);
		}
	}
	
}

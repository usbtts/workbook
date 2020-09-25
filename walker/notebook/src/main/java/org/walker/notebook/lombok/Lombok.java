package org.walker.notebook.lombok;

import java.nio.charset.Charset;

import org.springframework.util.Base64Utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lombok {
	
	
	public static final String s = new String("");
	public static void main(String[] args) {
		System.out.println(new String(Base64Utils.decodeFromString("R96rGagmQKuL4bU0zzHJFp1H0QPXhr7KtrVXaBR2JWsPRnQf0Tk2cegFZVzsO3XtGLuvHepdRq"), Charset.forName("GB2312")));
		//log.info("test");
	}
}

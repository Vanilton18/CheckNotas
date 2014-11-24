package br.checknotaspos.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propriedades {
	public static final String LOGIN_DADOS = "C:/keys/dados.properties";
	
	public static String getProp(String key) throws IOException {

		Properties props = new Properties();
		FileInputStream file = new FileInputStream(LOGIN_DADOS);
		props.load(file);
		return props.getProperty(key);

	}

}

package br.com.mercadolivre.main;

import java.io.IOException;

/**
 * Essa classe � responsavel por iniciar todo o processo
 * 
 * @author Jefferson
 */
public class Run {

	public static void main(String[] args) throws IOException {
		
		System.out.println("==================================================");
		
		Factory factory = new Factory();
		
		factory.process();
		
		System.out.println("==================================================");
	}

}

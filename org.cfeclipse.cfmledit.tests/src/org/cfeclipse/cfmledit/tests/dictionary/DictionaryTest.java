package org.cfeclipse.cfmledit.tests.dictionary;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.cfeclipse.cfmledit.dictionary.Dictionary;
import org.cfeclipse.cfmledit.dictionary.Version;
import org.junit.Test;

public class DictionaryTest {

	public void startup(){
		
	}
	
	@Test
	public void TestIsSingleton() {
		try{
			Dictionary dic1 = Dictionary.getInstance();
			Dictionary dic2 = Dictionary.getInstance();
			assertEquals(dic1, dic2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	@Test
	public void TestLoadDictionary(){
	/*	
		Dictionary dic1 = null;
		try {
			dic1 = Dictionary.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ArrayList<Version> versions = dic1.getVersions();
		assertEquals(10, versions.size());
		*/
	}

}

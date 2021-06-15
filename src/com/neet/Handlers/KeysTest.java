package com.neet.Handlers;

import java.awt.event.KeyEvent;

import org.junit.Test;

import junit.framework.TestCase;


public class KeysTest extends TestCase {
	
	Keys k = new Keys();
	int i=KeyEvent.VK_SPACE; //space btn
	boolean b;
	
	@Test
	public void testKeySet() {
		k.keySet(i,b);
		
		
	} 

	public void testUpdate() {
		k.update();
	}
//
//	public void testIsPressed() {
//		fail("Not yet implemented");
//	}
//
//	public void testAnyKeyPress() {
//		fail("Not yet implemented");
//	}

}

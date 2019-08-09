package com.testedu.class11.wbit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

import com.testedu.class11.FuCard;

@FixMethodOrder()
public class FukaTest {
	
	private static FuCard myCard;
	
	@BeforeClass
	public static void ClassSetup() {
		myCard=new FuCard();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("开局送一张福卡");
		myCard.count=1;
	}


	@Test
	public void testGetCard() {
		myCard.showCard();
		myCard.getCard(3);
		assertEquals(myCard.count, 4);
	}
	
	@Test
	public void testShare() {
		myCard.share();
		assertEquals(myCard.count, 0);
		
	}


	@Test
	public void testShowCard() {
		@SuppressWarnings("unused")
		int count=myCard.showCard();
		assertEquals(myCard.count, 1);
	}

}

package IntegrationContinue.IntegrationContinue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class FIFOTest extends TestCase {

	FIFO meth = new FIFO();
	ArrayList<Integer> list = new ArrayList<Integer>();

	@BeforeEach
	protected void setUp() throws Exception {

	}
	
	@Test
	void getQueueTest() {
		FIFO meth = new FIFO();
		assertNotNull(meth.getQueue());
	}
	
	@Test
	void addTest() {
		list.clear();
		list.add(1);
		list.add(3);
		meth.add(1);
		meth.add(3);
		assertEquals(list, meth.getQueue());
	}
	
	@Test
	void add2Test() {
		list.clear();
		list.add(7);
		list.add(2);
		meth.add(7);
		meth.add(2);
		assertEquals(list, meth.getQueue());
	}

	@Test
	void firstTest()
	{
		meth.add(1);
		meth.add(3);
		Integer i = 1;
		assertEquals(i, meth.first());
	}
	
	@Test
	void first2Test()
	{
		meth.add(8);
		meth.add(2);
		Integer i = 8;
		assertEquals(i, meth.first());
	}
	
	@Test
	void isEmptyTrueTest() {
		assertEquals(true, meth.isEmpty());
	}
	
	@Test
	void isEmptyFalseTest() {
		meth.add(1);
		meth.add(3);
		assertEquals(false, meth.isEmpty());
	}
	
	@Test
	void sizeTest() {
		meth.add(1);
		meth.add(3);
		assertEquals(2, meth.size());
	}
	
	@Test
	void size2Test() {
		meth.add(1);
		meth.add(3);
		meth.add(5);
		meth.add(4);
		meth.add(11);
		meth.add(50);
		assertEquals(6, meth.size());
	}
	
	@Test
	void removeFirstTest() {
		Integer i = 1;
		
		meth.add(8);
		meth.add(1);
		meth.add(3);
		meth.removeFirst();
		assertEquals(i, meth.first());
	}
	
	@Test
	void removeFirst2Test() {
		Integer i = 14;
		
		meth.add(11);
		meth.add(14);
		meth.add(56);
		meth.add(80);
		meth.add(50);
		meth.add(10);
		meth.removeFirst();
		assertEquals(i, meth.first());
	}
}

package testing.demojunit;

import static org.junit.Assert.*;
import  org.junit.*;

import org.junit.Test;


public class addtest {
	add a=new add();
	@Test
	public void test() {
		assertEquals(6,a.addn(2, 4));
	}

}

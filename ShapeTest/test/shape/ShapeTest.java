package shape;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.Shape;

public class ShapeTest {
	
	@Test
	public void isVailShape()
	{
		assertTrue(new Shape(new double[]{1,3,4,5}).isValidShape());
		assertTrue(new Shape(new double[]{3,3,1,2}).isValidShape());
		assertTrue(new Shape(new double[]{1,3,3,2}).isValidShape());
		assertTrue(new Shape(new double[]{1,2,3,3}).isValidShape());
		assertTrue(new Shape(new double[]{3,3,3,2}).isValidShape());
		assertTrue(new Shape(new double[]{2,3,3,3}).isValidShape());
		assertTrue(new Shape(new double[]{3,2,3,3}).isValidShape());
		assertTrue(new Shape(new double[]{3,3,2,3}).isValidShape());
		assertTrue(new Shape(new double[]{3,3,3,3}).isValidShape());
		
		assertFalse(new Shape(new double[]{}).isValidShape());
		assertFalse(new Shape(new double[]{1}).isValidShape());
		assertFalse(new Shape(new double[]{1,2}).isValidShape());
		assertFalse(new Shape(new double[]{1,2,3,9}).isValidShape());
		assertFalse(new Shape(new double[]{0,2,3,9}).isValidShape());
		assertFalse(new Shape(new double[]{1,0,3,9}).isValidShape());
		assertFalse(new Shape(new double[]{1,2,0,9}).isValidShape());
		assertFalse(new Shape(new double[]{1,2,3,0}).isValidShape());
		assertFalse(new Shape(new double[]{1,2,3,-1}).isValidShape());
	}
	
	@Test
	public void hasNEqualSides()
	{
		assertTrue(new Shape(new double[]{3,3,3,3}).hasNEqualSides(4));
		assertTrue(new Shape(new double[]{3,3,3,2}).hasNEqualSides(3));
		assertTrue(new Shape(new double[]{3,2,3,2}).hasNEqualSides(2));
		assertTrue(new Shape(new double[]{1,2,3,4}).hasNEqualSides(1));
		assertTrue(new Shape(new double[]{3,3,3,3,3,3,3,3,3,3,3}).hasNEqualSides(11));
		
		assertFalse(new Shape(new double[]{3,3,3,2}).hasNEqualSides(4));
		assertFalse(new Shape(new double[]{0,0,0,0}).hasNEqualSides(4));
		assertFalse(new Shape(new double[]{3,0,0,0}).hasNEqualSides(3));
		assertFalse(new Shape(new double[]{3,-3,-3,-3}).hasNEqualSides(3));
		
		
	}

}

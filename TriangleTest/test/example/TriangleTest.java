package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void twoSidesBiggerThanThird()
	{
		assertTrue(new Triangle(2,2,3).isValid());
		assertTrue(new Triangle(20000000,20000000,30000000).isValid());
		assertTrue(new Triangle(3,4,5).isValid());
		assertTrue(new Triangle(3,3,3).isValid());
		assertFalse(new Triangle(-2,2,3).isValid());
		assertFalse(new Triangle(2,-2,3).isValid());
		assertFalse(new Triangle(2,2,-3).isValid());
		assertFalse(new Triangle(0,2,3).isValid());
		assertFalse(new Triangle(0,0,3).isValid());
		assertFalse(new Triangle(0,0,0).isValid());
		assertFalse(new Triangle(-2,-2,3).isValid());
		assertFalse(new Triangle(-2,-2,-3).isValid());
	}
	
	@Test
	public void isGeneralTriangle()
	{
		assertFalse(new Triangle(2,2,3).isValidGeneralTriangle());
		assertFalse(new Triangle(20000000,20000000,30000000).isValidGeneralTriangle());
		assertTrue(new Triangle(3,4,5).isValidGeneralTriangle());
		assertFalse(new Triangle(3,3,3).isValidGeneralTriangle());
		assertFalse(new Triangle(-2,2,3).isValidGeneralTriangle());
		assertFalse(new Triangle(2,-2,3).isValidGeneralTriangle());
		assertFalse(new Triangle(2,2,-3).isValidGeneralTriangle());
		assertFalse(new Triangle(0,2,3).isValidGeneralTriangle());
		assertFalse(new Triangle(0,0,3).isValidGeneralTriangle());
		assertFalse(new Triangle(0,0,0).isValidGeneralTriangle());
		assertFalse(new Triangle(-2,-2,3).isValidGeneralTriangle());
		assertFalse(new Triangle(-2,-2,-3).isValidGeneralTriangle());
		
	}
	
	//等腰三角形
	@Test
	public void isoscelesHasTwoEqualSides()
	{
		assertTrue(new Triangle(2,2,3).isValidIsosceles());
		assertTrue(new Triangle(20000000,20000000,30000000).isValidIsosceles());
		assertFalse(new Triangle(3,4,5).isValidIsosceles());
		assertFalse(new Triangle(3,3,3).isValidIsosceles());
		assertFalse(new Triangle(-2,2,3).isValidIsosceles());
		assertFalse(new Triangle(2,-2,3).isValidIsosceles());
		assertFalse(new Triangle(2,2,-3).isValidIsosceles());
		assertFalse(new Triangle(0,2,3).isValidIsosceles());
		assertFalse(new Triangle(0,0,3).isValidIsosceles());
		assertFalse(new Triangle(0,0,0).isValidIsosceles());
		assertFalse(new Triangle(-2,-2,3).isValidIsosceles());
		assertFalse(new Triangle(-2,-2,-3).isValidIsosceles());
	}
	//等边三角形
	@Test
	public void equilateralHas3EqualSides()
	{
		assertFalse(new Triangle(2,2,3).isValidEquilateral());
		assertFalse(new Triangle(20000000,20000000,30000000).isValidEquilateral());
		assertFalse(new Triangle(3,4,5).isValidEquilateral());
		assertTrue(new Triangle(3,3,3).isValidEquilateral());
		assertFalse(new Triangle(-2,2,3).isValidEquilateral());
		assertFalse(new Triangle(2,-2,3).isValidEquilateral());
		assertFalse(new Triangle(2,2,-3).isValidEquilateral());
		assertFalse(new Triangle(0,2,3).isValidEquilateral());
		assertFalse(new Triangle(0,0,3).isValidEquilateral());
		assertFalse(new Triangle(0,0,0).isValidEquilateral());
		assertFalse(new Triangle(-2,-2,3).isValidEquilateral());
		assertFalse(new Triangle(-2,-2,-3).isValidEquilateral());
	}

}

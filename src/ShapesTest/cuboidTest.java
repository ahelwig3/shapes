package ShapesTest;

import static org.junit.Assert.*;
import org.junit.Test;

import cvtc.org.shapes.Cuboid;
import cvtc.org.shapes.Sphere;

public class cuboidTest {

	@Test
	public void testSurfaceArea() {
		Cuboid cuboid1 = new Cuboid(3, 3, 3);
		assertEquals(18, cuboid1.surfaceArea(), 0.0002);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testSurfaceArea2() {
		Cuboid cuboid1 = new Cuboid(1, 3, 6);
		assertEquals(18, cuboid1.surfaceArea(), 0.0002);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testSurfaceArea3() {
		Cuboid cuboid1 = new Cuboid(2, 4, 6);
		assertEquals(24, cuboid1.surfaceArea(), 0.0002);
		//fail("Not yet implemented");
	}

	@Test
	public void testVolume() {
		Cuboid cuboid1 = new Cuboid(6, 5, 1);
		assertEquals(30, cuboid1.volume(), 0.0002);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testVolume2() {
		Cuboid cuboid1 = new Cuboid(2, 2, 2);
		assertEquals(8, cuboid1.volume(), 0.0002);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testVolume3() {
		Cuboid cuboid1 = new Cuboid(2, 4, 6);
		assertEquals(48, cuboid1.volume(), 0.0002);
		
		//fail("Not yet implemented");
	}

	
	public void testCuboid() {
		Cuboid cuboid1 = new Cuboid(1, 2, 2);
		assertEquals(2, cuboid1.surfaceArea(), 0.0002);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetWidth() {
		Cuboid cuboid1 = new Cuboid (1, 2, 2);
		assertEquals(1, cuboid1.getWidth(), 0.0002);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetHeight() {
		Cuboid cuboid1 = new Cuboid(1, 2, 2);
		assertEquals(2, cuboid1.getHeight(), 0.0002);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetDepth() {
		Cuboid cuboid1 = new Cuboid(1, 2, 2);
		assertEquals(2, cuboid1.getDepth(), 0.0002);
		//fail("Not yet implemented");
	}
	
	@Test
    public void testSphere(){
    	Sphere sphere = new Sphere(-1);
       assertEquals(1, sphere.getRadius(), 0.0002);
       
    }
    


}

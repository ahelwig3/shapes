package cvtc;

import ShapesTest.MessageBoxSub;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dialog MessageBox = new MessageBox();
		// Generates the math for each shape using these numbers.
		Cuboid cuboid = new Cuboid(2, 2, 2, MessageBox);
		Cylinder cylinder = new Cylinder(5, 3, MessageBox);
		Sphere sphere = new Sphere(2, MessageBox);
		
		// Prints the shapes by calling render.
		cuboid.Render();
		cylinder.Render();
		sphere.Render();
		
		
		

	}

}

package cvtc;

import cvtc.org.shapes.*;

public class ShapesFactory {
	
	   public Shape getRender(String renderType){
		      if(renderType == null){
		         return null;
		      }		
		      Dialog MessageBox = null;
			if(renderType.equalsIgnoreCase("Cuboid")){
		         return new Cuboid(1, 2, 2, MessageBox);
		         
		      } else if(renderType.equalsIgnoreCase("Cylinder")){
		         return new Cylinder(3, 5, MessageBox);
		         
		      } else if(renderType.equalsIgnoreCase("Sphere")){
		         return new Sphere(4, MessageBox);
		      }
		      
		      return null;
		   }



	}



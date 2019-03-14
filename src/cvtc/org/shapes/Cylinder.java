public class Cylinder extends Shape {

    //set radius to zero
    private float radius = 0;

    //set height to 0
    private float height = 0;

    //super constructor
    public Cylinder(float radius, float height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    // make and set variables to public
    public float getRadius(){
        return radius;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    //create formula for surface area
    @Override
    public float surfaceArea(){
        float surface = (float)(2*Math.PI * radius * height + 2 * Math.PI * (radius * radius));
        return surface;
    }

    //create formula for volume
    @Override
    public float volume(){
        float volume = (float) (Math.PI * (radius * radius) * height);
        return volume;
    }

    //print outcome of surface area and volume
    public void render() {
        System.out.println("The surface area of your Cylinder is : " + surfaceArea());
        System.out.println("The volume of your cylinder is : " + volume());
        System.out.println("");
    }

}

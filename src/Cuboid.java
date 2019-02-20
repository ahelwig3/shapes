public class Cuboid extends Shape {

    //set width to zero
    private float width = 0;

    //set height to zero
    private float height = 0;

    //set depth to zero
    private float depth = 0;

    //create super constructor and reinstate vars
    public Cuboid(float width, float height, float depth){
        super();
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // set vars to public
    public float getWidth(){
        return width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getDepth(){
        return depth;
    }

    public void setDepth(float depth){
        this.depth = depth;
    }

    //create formula for surface area of a cuboid
    @Override
    public float surfaceArea(){
        float surface = 6 * this.height;
        return surface;
    }

    //create formula for volume of cuboid
    @Override
    public float volume(){
        float volume = height * width * depth;
        return volume;
    }

    @Override
    public void render(){
        System.out.println("The surface area of your cuboid is: " + surfaceArea());
        System.out.println("the volume of your cuboid is: " + volume());
        System.out.println("");
    }








}

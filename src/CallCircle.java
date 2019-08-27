public class CallCircle {
    public static void main(String[] args) {
        //create Circle object
        Circle ff = new Circle(5.5);
        //call non-static variable
        System.out.println("Radius : " +Math.floor(ff.getRadius()));
        //call non-static methods
        System.out.println("Area : " +Math.floor(ff.computeArea()));
        
        System.out.println("Circumference : " +Math.floor(ff.computeCircumference()));
        System.out.println("Diameter  : " +Math.floor(ff.computeDiameter())); 
        
        System.out.println(Math.floor(125.562));
    }
}

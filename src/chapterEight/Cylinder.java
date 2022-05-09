package chapterEight;


public class Cylinder {
    private double radius = 1;
    private double height = 1;

    public void setRadius(double radius){
        if(radius <= 0){
            throw new IllegalArgumentException("invalid input, enter any number greater 0:");
        }
        this.radius = radius;
    }
    public void setHeight(double height){
        if(height <= 0){
            throw new IllegalArgumentException("Invalid input, enter any value greater than 0: ");
        }
        this.height = height;
    }


    public void calculateVolume(){
        double volume = Math.PI * radius * radius * height;
        System.out.printf("The volume of the cylinder is %.2f",volume);
    }

}

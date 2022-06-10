package turtle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final Turtle turtle = new Turtle();
    private static final SketchPad floor = new SketchPad(20,20);
    private static int response = 0;
    public static void main(String[] args) {
        runApp();
    }


    public static void runApp(){
        while (response != -1){
            System.out.println("Enter command: ");
            try{
            response = input.nextInt();}

            catch (InputMismatchException | IllegalArgumentException e){
                System.out.println("Invalid Input!");
            }

            switch (response){
                case 1:
                    penUp();
                    break;
                case 2:
                    penDown();
                    break;
                case 3:
                    turnRight();
                    break;
                case 4:
                    turnLeft();
                    break;
                case 5:
                    move();
                    break;
                case 6:
                    displaySketchPad();
                    break;
                case 7:
                    System.out.println("End of data!");
                    response = -1;
                default:
                    runApp();
                    break;
            }
        }
    }

    private static void displaySketchPad() {
        turtle.displaySketchPad(floor);
    }

    private static void move() {
        System.out.println("Enter the number of steps");
        try{
            int steps = input.nextInt();
        if(steps <= 0 || steps > 20){
            System.out.println("You can't make such move!");
        }
        else{
            turtle.move(steps,floor);
            System.out.printf("turtle has successfully moved by %d steps! %n",steps);
        }
    }
        catch (InputMismatchException e){
            System.out.println("Invalid input!");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You can only move within the sketchPad!");
        }
    }

    private static void turnRight() {
        turtle.turnRight();
        System.out.println("turtle has turned right");
    }

    private static void turnLeft() {
        turtle.turnLeft();
        System.out.println("turtle has turned left");
    }

    private static void penDown() {
        turtle.penDown();
        System.out.println("Pen is now down!");

    }

    private static void penUp() {
        turtle.penUp();
        System.out.println("Pen is now up!");
    }
}

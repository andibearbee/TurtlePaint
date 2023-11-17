import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(300, 300);
        Turtle turtle = new Turtle(world,-45, -45);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(50);
        turtle.penUp();
        turtle.goTo(45, 45);


        turtle.penDown();
        turtle.setColor(Color.MAGENTA);
        turtle.turnRight(90);
        turtle.forward(60);
        turtle.turnRight(90);
        turtle.forward(60);
        turtle.turnRight(90);
        turtle.forward(60);
        turtle.turnRight(90);
        turtle.forward(60);

        turtle.penUp();


        //turtle.forward(hypotenuse);

//
//        turtle.forward(hypotenuse);
    }
}

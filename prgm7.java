
import java.util.Scanner;

interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void resizeHeight(int newHeight){
        this.height = newHeight;
        System.out.println("New Height: "+ height);
    }

    public void resizeWidth(int newWidth){
        this.width = newWidth;
        System.out.println("New Height: "+ width);
    }

    public void displayDimenstions(){
        System.out.println("Current dimenstions: " + width + " x " + height);
    }
}


public class prgm7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.displayDimenstions();

        System.out.println("Enter new width and height: ");
        int newWidth = sc.nextInt();
        int newHeight = sc.nextInt();

        rectangle.resizeHeight(newHeight);
        rectangle.resizeWidth(newWidth);
        rectangle.displayDimenstions();
    }
}

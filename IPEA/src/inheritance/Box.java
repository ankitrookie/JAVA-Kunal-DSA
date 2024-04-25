package inheritance;

public class Box {
    double length;
    double height;
    double width;

    double weight;

    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(double side){
        this.length = side;
        this.height = side;
        this.width = side;
    }

    Box(Box old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }
}

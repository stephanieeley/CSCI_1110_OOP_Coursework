//Stephanie Eley 
//3.25.2020

public class Rectangle{

    double width = 1;
    double height = 1;

    Rectangle(){

    }
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return height * width;
    }
    double getPerimeter(){
        return height * 2 + width * 2;
    }
}
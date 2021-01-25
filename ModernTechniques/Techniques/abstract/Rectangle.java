public class Rectangle extends GeometricObject{

  private double width;
  private double height;

  public Rectangle(){

  }

  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }

  public Rectangle(double width, double height, String color, boolean filled){
    this.width = width;
    this.height = height;
    setColor(color);
    setFilled(filled);
  }

  public void setWidth(double width){
    this.width = width;
  }

  public double getWidth(){
    return width;
  }

  public void setHeight(){
    this.height = height;
  }

  public double getHeight(){
    return height;
  }

  public double getArea(){
    return width * height;
  }

  public double getPerimeter(){
    return 2 * (width + height);
  }

  public void printRectangle(){
    System.out.println("The Rectangle is created " + getDateCreated() + " and " +
    " width is " + getWidth() + " and height is " + getHeight());
  }
  
}

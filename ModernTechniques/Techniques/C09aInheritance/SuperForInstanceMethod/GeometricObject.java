/**
 * From Chapter 11 in Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */
import java.util.Date;

public class GeometricObject {
  private String color = "white";
  private boolean filled;
  Date dateCreated;

  /** Construct a default geometric object */
  public GeometricObject() {
    dateCreated = new Date();
  }

  /** Construct a geometric object with the specified color
    *  and filled value */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
     its get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public Date getDateCreated() {
    System.out.println("Executing getDateCreated() defined in the GeometricObject class.");
    return dateCreated;
  }

  /** Return a string representation of this object */
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }
}

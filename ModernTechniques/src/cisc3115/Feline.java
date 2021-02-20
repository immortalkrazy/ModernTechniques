package cisc3115;

public class Feline extends Animal {

      public Feline(String name) {
            super(name);
            // TODO Auto-generated constructor stub
      }

      public Feline() {
            // TODO Auto-generated constructor stub
      }

      public String toString() {
            return this.getClass() + " " + this.getName();
      }

      public boolean equals(Object other) {
            if (other instanceof Animal) {
                  return name.equals(((Feline) other).name);
            } else {
                  return false;
            }
      }

}

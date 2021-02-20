package cisc3115;

public class Animal {

      public String name;

      public Animal(String name) {
            this.name = name;
      }

      public Animal() {
            // TODO Auto-generated constructor stub
      }

      public String getName() {
            return name;
      }

      @Override
      public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
      }

      @Override
      public boolean equals(Object obj) {
            if (this == obj)
                  return true;
            if (!(obj instanceof Animal))
                  return false;
            Animal other = (Animal) obj;
            if (name == null) {
                  if (other.name != null)
                        return false;
            } else if (!name.equals(other.name))
                  return false;
            return true;
      }
}

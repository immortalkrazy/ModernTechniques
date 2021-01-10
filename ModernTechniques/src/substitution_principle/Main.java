package substitution_principle;

import java.util.List;

public class Main {

      public static void main(String[] args) {

            Building building = new Building();
            Office office = new Office();

            build(building);
            build(office);

      }

      static void build(Building building) {

            System.out.println("Constructing a new " + building.toString());

      }

      static void printBuildings(List<Building> buildings) {

      }
}

package liWildcard;

import java.util.ArrayList;
import java.util.List;

import substitution_principle.Building;
import substitution_principle.Office;

public class Main {

      public Main() {
            // TODO Auto-generated constructor stub
      }

      public static void main(String[] args) {

            // List of buildings
            List<Building> buildings = new ArrayList<Building>();
            buildings.add(new Building());
            buildings.add(new Office());
            printBuildings(buildings);

            // List of offices
            List<Office> offices = new ArrayList<Office>();
            offices.add(new Office());
            offices.add(new Office());
            printBuildings(offices);

            // List of houses
            List<House> houses = new ArrayList<House>();
            houses.add(new House());
            houses.add(new House());
//            printBuildings(houses);

            addHouseToList(offices);
            addHouseToList(buildings);

      }

      static void build(Building building) {

            System.out.println("Constructing a new " + building.toString());

      }

      // use of wild card in method's arguments
      // addition of "? extends" we will be able to pass the list of houses and list
      // offices
      // where otherwise only list of buildings can only be passed

      static void printBuildings(List<? extends Building> buildings) {

            for (int i = 0; i < buildings.size(); i++) {
                  System.out.println(buildings.get(i).toString() + " " + (i + 1));
            }

            System.out.println();
      }

      // use of wild card to use parent class addition
      static void addHouseToList(List<? super Office> buildings) {

            buildings.add(new Office());
            System.out.println();
      }

}

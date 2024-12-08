/*
package GenericClasses;

import javax.swing.plaf.basic.BasicIconFactory;
import java.util.ArrayList;
import java.util.List;

//variable of  agiven type can be assigned the same as subtype
public class substitutionPrinciple {
    public static void main(String[] args) {
        Building building= new Building();
        Office office= new Office();
        build(building);
        build(office);

        List<Building> buildings=new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);
    }
//wildcard = add ? and word extends
    //means now e can pass any subtype of builing in it
    //extends:print builidngs method used inside the variable so we use for invariables extends
    //super:adds additional data hence uses super keyword
    //used for making it flexible and easier
    static void build(Building building){
        System.out.println("contruct "+building.toString());

    }
    static void printBuildings(List< ? extends Building> buildings){
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i+1+":"+buildings.get(i).toString());

        }
    }
}
*/

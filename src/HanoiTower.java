import java.util.HashMap;
import java.util.Map;


public class HanoiTower {

    Map<Integer, HanoiTowerRod> rodMap;

    int numDisks;
    int numRods;

    public HanoiTower (int numDisks, int numRods) {
        this.numDisks = numDisks;
        this.numRods = numRods;

        rodMap = new HashMap<>();

        //Create the rods
        rodMap.put(1, new HanoiTowerRod());
        rodMap.put(2, new HanoiTowerRod());
        rodMap.put(3, new HanoiTowerRod());

        //Fill the first rod with disks
        //We need to go in *descending* order
        for (int i = numDisks; i >= 1; i--) {
            rodMap.get(1).add(i);
        }
    }

    public String toString () {
        String response = "";
        for (Integer i : rodMap.keySet()) {
            response += "\nRod " + i + ": " + rodMap.get(i);
        }
        response += "\nSolved: " + solved();
        return response;
    }

    public boolean move (int startingRodIndex, int endingRodIndex) {
        // remove the disc from the set
        Integer discToMove = rodMap.get(startingRodIndex).removeTop();
        System.out.println(discToMove);

        rodMap.get(endingRodIndex).add(discToMove);

        return true;
    }

    public boolean solved () {
        for (Integer i : rodMap.keySet()) {
            if (i == 1) {
                continue;
            }
            if (rodMap.get(i).discs.size() == numDisks) {
                return true;
            }
        }
        return false;
    }


}

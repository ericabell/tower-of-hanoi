import java.util.HashSet;


public class HanoiTowerRod extends HashSet<Integer> {

    public HashSet<Integer> discs = new HashSet<Integer>();

    public HanoiTowerRod () {
        super();
    }

    @Override
    public boolean add (Integer e) {
        discs.add(e);
        return true;
    }

    public Integer removeTop () {
        Integer smallest = findSmallestValue();

        if (discs.size() == 0) {
            return null;
        }
        discs.remove(smallest);
        return smallest;
    }

    public Integer findSmallestValue () {
        Integer response = Integer.MAX_VALUE;

        for (Integer i : discs) {
            if (i < response) {
                response = i;
            }
        }
        return response;
    }

    public Integer findLargestValue () {
        Integer response = 0;

        for (Integer i : this) {
            if( i > response) {
                response = i;
            }
        }
        return response;
    }

    @Override
    public String toString() {
        return "HanoiTowerRod{" +
                "discs=" + discs +
                '}';
    }
}

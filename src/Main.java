public class Main {

    public static void main(String[] args) {
        HanoiTower tower = new HanoiTower(3, 3);
        System.out.println(tower);

        tower.move(1, 2);
        tower.move(1, 3);

        System.out.println(tower);

        tower.move(2, 3);

        System.out.println(tower);

        tower.move(1, 2);
        tower.move(3, 2);
        tower.move(3, 2);

        System.out.println(tower);

        tower.move(2,3);
        tower.move(2,1);
        tower.move(3,1);
        tower.move(2,3);
        tower.move(1,2);
        tower.move(1,3);
        tower.move(2,3);

        System.out.println(tower);


        if (tower.solved()) {
            System.out.println("Success!");
        } else {
            System.out.println("Something went wrong.");
        }
    }
}

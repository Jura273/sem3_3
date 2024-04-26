package sem3;

public class FreeLancer extends Emploee {

    private static double workRate;

    private FreeLancer(String name, double workRate) {
        super(name);
        this.workRate = workRate;
    }

/*
    <workRate> double calculation() {
        // среднемесячная заработная плата = 20.8 * 8 * почасовую ставку
        return workRate * 20.8 * 8;
    }
*/

    @Override
    public void printDisplayInfo() {
        System.out.printf("%s; %d\n", name, workRate);
    }

    public static Emploee create(String name, Double workRate) {

        if (name == null || name.length() < 3) {
            throw new RuntimeException("Некорректное имя человека.");
        }

        return new FreeLancer(name, workRate);

    }
}
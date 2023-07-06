package chapter14_project1;

/**
 *  A singleton class.
 */
public class SaintGeorgeKnight {
    private static SaintGeorgeKnight instance;

    private SaintGeorgeKnight() {
        // private constructor to prevent instantiation
    }

    public static SaintGeorgeKnight getInstance() {
        if (instance == null) {
            synchronized (SaintGeorgeKnight.class) {
                if (instance == null) {
                    instance = new SaintGeorgeKnight();
                }
            }
        }
        return instance;
    }

    public void embarkOnMission() {
        System.out.println("The knight is embarking on a mission.");
        // Add mission logic here
    }
}

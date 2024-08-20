package OOPs.EnumExamples;

public class Basic {
    enum Week {
        Monday, tuesday, Wednesday, Thursday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you can create child enums
        // type is Week

        Week() {
            System.out.println("Constructor call for " + this);
        }

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week day : Week.values()) {
            System.out.println(day);
        }

        System.out.println();
        System.out.println(week);
        System.out.println(week.ordinal());
    }
}
// enums can use interfaces

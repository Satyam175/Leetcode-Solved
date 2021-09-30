// An Enum class
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}
public class Enumrators {
    Day day ;

    public Enumrators(Day day) {
        this.day = day;
    }

    public void dayIsLike(){
        switch (day) {
            case MONDAY -> System.out.println("Mondays are bad.");
            case FRIDAY -> System.out.println("Fridays are better.");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are best.");
            default -> System.out.println("Midweek days are so-so.");
        }
    }

    public static void main(String[] args) {
        String str = "SATURDAY";
        Enumrators e1 = new Enumrators(Day.valueOf(str));
        e1.dayIsLike();
    }
}

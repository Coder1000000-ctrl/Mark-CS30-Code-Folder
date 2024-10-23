public class MilesPerhourRunner {
    public static void main(String[] args) throws Exception {
        MilesPerHour miles = new MilesPerHour();
        int distance = miles.ask("Distance");
        int hours = miles.ask("Hours");
        int minutes = miles.ask("Minutes");
    }
}

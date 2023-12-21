public class Main {
    public static void main(String[] args) {
        Football football = new Football("Football", 11, true, "Premier League");
        Basketball basketball = new Basketball("Basketball", 5, true, 305);

        SportsComplex sportsComplex = new SportsComplex("SportsCenter");

        sportsComplex.testComplexDemo(football, basketball);

        // Виведення інформації про футбол та баскетбол
        football.displayFootballInfo();
        basketball.displayBasketballInfo();
    }
}
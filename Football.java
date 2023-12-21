class Football {
    private String sportName;
    private int numberOfPlayers;
    private boolean hasReferee;
    private String leagueName;

    Football(String sportName, int numberOfPlayers, boolean hasReferee, String leagueName) {
        this.sportName = sportName;
        this.numberOfPlayers = numberOfPlayers;
        this.hasReferee = hasReferee;
        this.leagueName = leagueName;
    }

    void displayFootballInfo() {
        System.out.println("Football Info:");
        System.out.println("Sport Name: " + sportName);
        System.out.println("Number of Players: " + numberOfPlayers);
        System.out.println("Has Referee: " + hasReferee);
        System.out.println("League Name: " + leagueName);
    }
}

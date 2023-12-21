class Sport {
    private String sportName;
    private int numberOfPlayers;
    private boolean isTeamSport;

    Sport() {
        this.sportName = "Unknown";
        this.numberOfPlayers = 0;
        this.isTeamSport = false;
    }

    String getSportName() {
        return sportName;
    }

    void setSportName(String sportName) {
        this.sportName = sportName;
    }

    int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers > 0) {
            this.numberOfPlayers = numberOfPlayers;
        }
    }

    boolean isTeamSport() {
        return isTeamSport;
    }

    void setTeamSport(boolean teamSport) {
        isTeamSport = teamSport;
    }

    void doubleNumberOfPlayers() {
        this.numberOfPlayers *= 2;
    }

    void performLogic(Sport sport1, Sport sport2) {
        System.out.println("Performing logic using sports:");
        System.out.println("Sport 1 Name: " + sport1.getSportName());
        System.out.println("Sport 2 Name: " + sport2.getSportName());
        System.out.println("Sport 1 Players: " + sport1.getNumberOfPlayers());
        System.out.println("Sport 2 Players: " + sport2.getNumberOfPlayers());
    }
}


class Basketball {
    private String sportName;
    private int numberOfPlayers;
    private boolean hasReferee;
    private int basketHeight;

    Basketball(String sportName, int numberOfPlayers, boolean hasReferee, int basketHeight) {
        this.sportName = sportName;
        this.numberOfPlayers = numberOfPlayers;
        this.hasReferee = hasReferee;
        this.basketHeight = basketHeight;
    }

    void displayBasketballInfo() {
        System.out.println("Basketball Info:");
        System.out.println("Sport Name: " + sportName);
        System.out.println("Number of Players: " + numberOfPlayers);
        System.out.println("Has Referee: " + hasReferee);
        System.out.println("Basket Height: " + basketHeight + " cm");
    }
}


package org.academiadecodigo.bootcamp;

public class Genie {

    private int maxWishes;
    private int grantedWishes;

    public Genie (int maxWishes) {
        this.maxWishes = maxWishes;
        grantedWishes = 0;
    }

    public void grantWish() {
        grantedWishes++;
    }

    public int getMaxWishes() {
        return maxWishes;
    }

    public int getGrantedWishes() {

        return grantedWishes;
    }

}

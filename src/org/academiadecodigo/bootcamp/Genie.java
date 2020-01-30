package org.academiadecodigo.bootcamp;

public class Genie {

    private int maxWishes;
    private int grantedWishes;
    //private boolean isEvil;

    public Genie (int maxWishes) {
        this.maxWishes = maxWishes;
        grantedWishes = 0;
        //isEvil = false;
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

    public boolean isEvil() {
        return false;
    }

    /*public void setEvil(boolean isEvil) {
         this.isEvil = isEvil;
    }

    public boolean getIsEvil() {
        return isEvil;
    }*/

}

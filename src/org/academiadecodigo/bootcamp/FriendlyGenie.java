package org.academiadecodigo.bootcamp;

public class FriendlyGenie extends Genie {



    public FriendlyGenie (int maxWishes){

        super(maxWishes);
    }

    @Override
    public void grantWish() {

        if (getMaxWishes() > getGrantedWishes()) {
            super.grantWish();
            int wishesRemaining = getMaxWishes() - getGrantedWishes();
            System.out.println("I am the Friendly Genie, you have " + wishesRemaining + " wishes remaining.");

        } else {
            System.out.println("I am the Friendly Genie, you can not make more wishes.");
        }
    }

}

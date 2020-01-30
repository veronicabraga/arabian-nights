package org.academiadecodigo.bootcamp;

public class GrumpyGenie extends Genie {



    public GrumpyGenie(int maxWishes){

        super(maxWishes);
    }


    @Override
    public void grantWish() {

        if (getGrantedWishes() == 0) {
            super.grantWish();
            System.out.println("I am a GrumpyGenie. You have use your one wish. I can not give you more wishes.");
        } else {
            System.out.println("I can not give you a wish, you have already used it.");
        }
    }
}

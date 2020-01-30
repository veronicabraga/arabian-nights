package org.academiadecodigo.bootcamp;

public class Demon extends Genie {

    //private int grantedWishes;
    private boolean recycled;

    public Demon (int maxWishes){

        super(maxWishes);
        recycled = false;
        //super.setEvil(true);
    }

    @Override
    public void grantWish() {

        if (!recycled) {
            super.grantWish( );
            System.out.println("I am the Demon, you have made " + getGrantedWishes() + " wish(es)!");

        } else {
            System.out.println("I am the Demon, I was recycled, so you can not make more wishes to me!");
        }
    }

    public boolean getRecycled() {
        return recycled;
    }

    public void setRecycled() {

            recycled = true;
    }

    @Override
    public boolean isEvil() {
        return true;
    }


}

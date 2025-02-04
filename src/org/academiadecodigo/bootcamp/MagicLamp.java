package org.academiadecodigo.bootcamp;

public class MagicLamp {

    private int numGenies;
    private int remainingGenies;
    private int recharged;

    public MagicLamp(int numGenies) {
        this.numGenies = numGenies;
        remainingGenies = numGenies;
        recharged = 0;
    }

    public Genie rubbed(int maxWishes) {

        if (remainingGenies > 0) {

            int numberGenie = (int) (Math.random() * 3);
            if (numberGenie % 2 == 0) {
                remainingGenies --;
                System.out.println("Hi! I am the FriendlyGenie and you have more " + remainingGenies + " genies remaining.");

                return new FriendlyGenie(maxWishes);
            } else {
                remainingGenies --;
                System.out.println("Hi! I am the GrumpyGenie and you have more " + remainingGenies + " genies remaining.");
                return new GrumpyGenie(maxWishes);
            }
        } else {
            System.out.println("Hi! I am the Demon!");
            return new Demon(maxWishes);
        }
    }

    public void recharge(Genie genie) {

        if (genie.isEvil()) {
            Demon genieDemon = (Demon) genie;


            if (!genieDemon.getRecycled()) {
                recharged++;
                remainingGenies = numGenies;
                genieDemon.setRecycled();
                System.out.println("You recycled the Demon, so your Magic Lamp now returned to have " + remainingGenies + " genies.");
            } else {
                System.out.println("You have already recycled this Demon, you can not recharge again the lamp.");
            }
        } else {
            System.out.println("Your are not a Demon, you can not recycle the lamp.");
        }

    }

    public int getRemainingGenies() {
        System.out.println("Your magic Lamp has " + remainingGenies + " genies to use.");
        return remainingGenies;
    }

    public int getRecharged() {
        System.out.println("Your Magic Lamp has been recharged " + recharged + " time(s).");
        return recharged;
    }


    public boolean equals(MagicLamp lamp) {

        return lamp.numGenies == numGenies && lamp.remainingGenies == remainingGenies && lamp.recharged == recharged;

    }


}

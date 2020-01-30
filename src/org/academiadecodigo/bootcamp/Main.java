package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        MagicLamp lamp1 = new MagicLamp(3);


        Genie genie1 = lamp1.rubbed(3);
        //Genie genie2 = lamp1.rubbed(3);

        /*genie1.grantWish();
        //genie2.grantWish();
        genie1.grantWish();
        genie1.grantWish();
        genie1.grantWish();
        genie1.grantWish();
        //lamp1.rubbed(3);
        //lamp1.rubbed(3);
        //lamp1.rubbed(3);*/

        Genie genie2 = lamp1.rubbed(3);
        Genie genie3 = lamp1.rubbed(3);
        Genie genie4 = lamp1.rubbed(3);
        genie4.grantWish();
        genie4.grantWish();

        // I can not use the genie4, that is a Demon, to recharge the lamp.
        //lamp1.recharge(genie4);


        Demon demon = new Demon(3);
        lamp1.recharge(demon);
        lamp1.recharge(demon);
        Demon demon2 = new Demon(3);
        lamp1.recharge(demon2);
        lamp1.recharge(demon2);
        lamp1.recharge(demon2);

        lamp1.getRemainingGenies();
        lamp1.getRecharged();




    }
}

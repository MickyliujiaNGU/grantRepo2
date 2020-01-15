package com.kingstar.decorator.version3;

public class TestDecoratePattern {
    public static void main(String[] args) {
        Person person = new Person();
        Finery finery = new Finery();
        finery.decorate(person);
    //    finery.show();
   //     finery.decorate(person);
       // finery.show();
  //      tShirts.decorate(finery);
      //  tShirts.show();
        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.decorate(finery);
        TShirts tShirts = new TShirts();
        tShirts.decorate(bigTrouser);
        Leather leather = new Leather();
        leather.decorate(tShirts);
        //tShirts.decorate(leather);
        //tShirts.show();
        leather.show();
    }
}

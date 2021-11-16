package com.artzvrzn;

import com.artzvrzn.Sandwich.Builder;

public class Main {

  public static void main(String[] args) {
    Sandwich.Builder builder = new Builder();
    builder.cheese("Mozzarella").dressing("Ketchup").meat("Ham").salad("Salad");
    builder.bread("Black");

    Sandwich sandwich = builder.build();
    System.out.println(sandwich.getBread());
  }
}

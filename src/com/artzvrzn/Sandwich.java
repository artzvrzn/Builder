package com.artzvrzn;

public class Sandwich {
  private String bread;
  private String dressing;
  private String meat;
  private String cheese;
  private String salad;

  public static class Builder {
    private String bread;
    private String dressing;
    private String meat;
    private String cheese;
    private String salad;

    public Sandwich build() {
      if (bread == null) {
        throw new IllegalArgumentException();
      }
      return new Sandwich(this);
    }

    public Builder bread(String bread) {
      this.bread = bread;
      return this;
    }

    public Builder dressing(String dressing) {
      this.dressing = dressing;
      return this;
    }

    public Builder meat(String meat) {
      this.meat = meat;
      return this;
    }

    public Builder cheese(String cheese) {
      this.cheese = cheese;
      return this;
    }

    public Builder salad(String salad) {
      this.salad = salad;
      return this;
    }
  }

  private Sandwich(Builder builder) {
    this.bread = builder.bread;
    this.dressing = builder.dressing;
    this.meat = builder.meat;
    this.cheese = builder.cheese;
    this.salad = builder.salad;
  }

  public String getBread() {
    return bread;
  }

  public String getDressing() {
    return dressing;
  }

  public String getMeat() {
    return meat;
  }

  public String getCheese() {
    return cheese;
  }

  public String getSalad() {
    return salad;
  }
}

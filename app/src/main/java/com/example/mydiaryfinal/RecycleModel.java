package com.example.mydiaryfinal;

public class RecycleModel {

     String rcy_Time;
     String rcy_Context;
     String rcy_Money;

     int mn_type;
     String rcy_Group;
     String rb_car;
     String rb_house;
     String rb_cook;
     String rb_etc;

    public RecycleModel(String rcy_Time, String rcy_Context, String rcy_Money) {
        this.rcy_Time = rcy_Time;
        this.rcy_Context = rcy_Context;
        this.rcy_Money = rcy_Money;
    }


    public String getRcy_Time() {
        return rcy_Time;
    }

    public void setRcy_Time(String rcy_Time) {
        this.rcy_Time = rcy_Time;
    }

    public String getRcy_Context() {
        return rcy_Context;
    }

    public void setRcy_Context(String rcy_Context) {
        this.rcy_Context = rcy_Context;
    }

    public String getRcy_Money() {
        return rcy_Money;
    }

    public void setRcy_Money(String rcy_Money) {
        this.rcy_Money = rcy_Money;
    }

    public int getMn_type() { return mn_type; }

    public void setMn_type(int mn_type) {
        this.mn_type = mn_type;
    }

    public String getRcy_Group() { return rcy_Group; }

    public void setRcy_Group(String rcy_Group) { this.rcy_Group = rcy_Group; }

    public String getRb_car() { return rb_car; }

    public void setRb_car(String rb_car) { this.rb_car = rb_car; }

    public String getRb_house() { return rb_house; }

    public void setRb_house(String rb_house) { this.rb_house = rb_house; }

    public String getRb_cook() { return rb_cook; }

    public void setRb_cook(String rb_cook) { this.rb_cook = rb_cook; }

    public String getRb_etc() { return rb_etc; }

    public void setRb_etc(String rb_etc) { this.rb_etc = rb_etc; }
}

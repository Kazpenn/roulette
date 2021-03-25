package edu.cnm.deepdive.roulette.model.dto;

import com.google.gson.annotations.Expose;

public class PocketDto {

  @Expose
  private String name;

  @Expose
  private int position;

  @Expose
  private int spot;

  @Expose
  private int span;

  @Expose
  private String color;

  private ColorDto colorDto;

  @Expose
  private int payout;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public int getSpot() {
    return spot;
  }

  public void setSpot(int spot) {
    this.spot = spot;
  }

  public int getSpan() {
    return span;
  }

  public void setSpan(int span) {
    this.span = span;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ColorDto getColorDto() {
    return colorDto;
  }

  public void setColorDto(ColorDto colorDto) {
    this.colorDto = colorDto;
  }

  public int getPayout() {
    return payout;
  }

  public void setPayout(int payout) {
    this.payout = payout;
  }
}

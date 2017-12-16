/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.currencycon.model;

/**
 *
 * @author Arif
 */
public interface RateDTO {
  Currency getFrom();

  void setFrom(Currency from);

  Currency getTo();

  void setTo(Currency to);

  float getRate();

  void setRate(float rate);
}

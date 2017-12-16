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
import javax.persistence.*;
import java.io.Serializable;

@NamedQueries({
  @NamedQuery(
    name = "getRateFromCurrencies",
    query = "SELECT rate FROM Rate rate WHERE rate.from=:fromCurr AND rate.to=:toCurr"
  )
})

@Entity(name = "Rate")
public class Rate implements RateDTO, Serializable {
  @Id @ManyToOne
  private Currency from;
  @Id @ManyToOne
  private Currency to;
  private float rate;

  public Rate() {
  }

  public Rate(Currency from, Currency to, float rate) {
    this.from = from;
    this.to = to;
    this.rate = rate;
  }

  public Currency getFrom() {
    return from;
  }

  public void setFrom(Currency from) {
    this.from = from;
  }

  public Currency getTo() {
    return to;
  }

  public void setTo(Currency to) {
    this.to = to;
  }

  public float getRate() {
    return rate;
  }

  public void setRate(float rate) {
    this.rate = rate;
  }
}

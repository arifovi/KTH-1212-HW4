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
    name = "getAllCurrencies",
    query = "SELECT curr FROM Currency curr"
  )
})

@Entity(name = "Currency")
public class Currency implements CurrencyDTO, Serializable {
  @Id @GeneratedValue
  private long id;
  @Column(unique = true, nullable = false)
  private String name;

  public Currency() {
  }

  public Currency(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

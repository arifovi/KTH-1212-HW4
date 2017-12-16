/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.currencycon.view;

import converter.currencycon.controller.CurrencyController;
import converter.currencycon.model.CurrencyDTO;

import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author Arif
 */


/**
 * Methods callable from the JSF view.
 */
@Named("conversionManager")
@RequestScoped
public class ConversionManager implements Serializable {
  @EJB
  private CurrencyController currencyFacade;
  private float amntToConvert = 0;
  private float amntConverted = 0;
  private long fromId = 1;
  private long toId = 1;

  /**
   * @return All currencies as a <code>List</code>.
   */
  public List<? extends CurrencyDTO> getCurrencies() {
    return currencyFacade.getCurrencies();
  }

  public void convert() {
    amntConverted = currencyFacade.convert(fromId, toId, amntToConvert);
  }

  public CurrencyController getCurrencyFacade() {
    return currencyFacade;
  }

  public void setCurrencyFacade(CurrencyController currencyFacade) {
    this.currencyFacade = currencyFacade;
  }

  public float getAmntToConvert() {
    return amntToConvert;
  }

  public void setAmntToConvert(float amntToConvert) {
    this.amntToConvert = amntToConvert;
  }

  public float getAmntConverted() {
    return amntConverted;
  }

  public void setAmntConverted(float amntConverted) {
    this.amntConverted = amntConverted;
  }

  public long getFromId() {
    return fromId;
  }

  public void setFromId(long fromId) {
    this.fromId = fromId;
  }

  public long getToId() {
    return toId;
  }

  public void setToId(long toId) {
    this.toId = toId;
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.currencycon.controller;

import converter.currencycon.integration.CurrencyDAO;
import converter.currencycon.integration.RateDAO;
import converter.currencycon.model.Currency;
import converter.currencycon.model.CurrencyDTO;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author Arif
 */
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
@Stateless
public class CurrencyController {
  @EJB CurrencyDAO currencyDAO;
  @EJB RateDAO rateDAO;

  public List<? extends CurrencyDTO> getCurrencies() {
    return currencyDAO.getCurrencies();
  }

  /**
   * Converts <code>amntToConvert</code> which is of the currency type corresponding to <code>fromId</code> to
   * the currency corresponding to <code>toId</code>.
   *
   * @param fromId The id of the currency <code>amntToConvert</code> is in.
   * @param toId The id of the currency to convert to.
   * @param amntToConvert The amount to convert.
   * @return The converted amount.
   */
  public float convert(long fromId, long toId, float amntToConvert) {
    Currency from = currencyDAO.findCurrencyById(fromId);
    Currency to = currencyDAO.findCurrencyById(toId);

    return rateDAO.getRate(from, to).getRate() * amntToConvert;
  }
}

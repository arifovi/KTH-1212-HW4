/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.currencycon.integration;

import converter.currencycon.model.Currency;


import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Arif
 */
@TransactionAttribute(TransactionAttributeType.MANDATORY)
@Stateless
public class CurrencyDAO {
  @PersistenceContext(unitName = "HibernatePU")
  private EntityManager em;

  /**
   * @return All currencies.
   */
  public List<Currency> getCurrencies() {
    return em.createNamedQuery("getAllCurrencies", Currency.class).getResultList();
  }

  /**
   * @param fromId The currency with the provided id to find.
   * @return The currency corresponding to the provided id.
   */
  public Currency findCurrencyById(long fromId) {
    Currency currency = em.find(Currency.class, fromId);

    if (currency == null)
      throw new EntityNotFoundException(String.format("No currency with the id \"%d\" was found!", fromId));

    return currency;
  }
}

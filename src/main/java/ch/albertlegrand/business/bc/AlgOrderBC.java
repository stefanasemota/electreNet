package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.dao.DAOAlgOrder;

/**
 * Provides basic methods and operations for a AlgObject
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:09
 */
public interface AlgOrderBC {
    /**
     * Member class object DAOAlgOrderImpl
     */
    public DAOAlgOrder daoAlgOrder = null;
    /**
     * Member class object Service
     */
    public ServiceBC serviceBC = null;

    /**
     * Creates a new order
     *
     * @param newOrder AlgOrder to be created
     */
    public void addOrder(AlgOrderBC newOrder);

    /**
     * Sends an order
     */
    public void sendOrder();

    /**
     * Searches for an order
     */
    public void searchOrder();

    /**
     * Return the current order status
     *
     * @return boolean
     */
    public boolean getOrderStatus();

}
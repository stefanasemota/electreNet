package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOAlgOrder;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DAOAlgOrderImpl implements DAOAlgOrder{
    @Autowired(required = true)
    private SessionFactory sessionFactory;

}

package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.service.businesslogic.BookDistributorService;
import ch.albertlegrand.data.dao.DAOBookDistributor;
import ch.albertlegrand.data.model.BookDistributor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:19
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BookDistributorServiceImpl implements BookDistributorService {
    @Autowired(required = true)
    private DAOBookDistributor daoBookDistributor;

    @Override
    @Transactional
    public BookDistributor addBookDistributor(BookDistributor addBookDistributor) {
        return daoBookDistributor.addBookDistributor(addBookDistributor);
    }

    @Override
    @Transactional
    public void updateBookDistributor(BookDistributor updateBookDistributor) {
        daoBookDistributor.updateBookDistributor(updateBookDistributor);
    }

    @Override
    @Transactional
    public void deleteBookDistributor(BookDistributor deleteBookDistributor) {
        daoBookDistributor.deleteBookDistributor(deleteBookDistributor);
    }

    @Override
    public Object getById(long id) {
        return daoBookDistributor.getById(id);
    }

    @Override
    public BookDistributor findObject(BookDistributor bookDetail) {
        return daoBookDistributor.findObject(bookDetail);
    }

    @Override
    public List<BookDistributor> findAll() {
        return daoBookDistributor.findAll();
    }
}

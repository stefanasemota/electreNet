package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.data.dao.DAOBookTitle;
import ch.albertlegrand.data.model.Booktitle;
import ch.albertlegrand.service.businesslogic.BookTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BookTitleServiceImpl implements BookTitleService {
    @Autowired(required = true)
    private DAOBookTitle daoBookTitle;

    @Override
    @Transactional
    public Object getById(long id) {
        return daoBookTitle.getById(id);
    }

    @Override
    @Transactional
    public Booktitle addBookTitle(Booktitle addBookTitle) {
        return daoBookTitle.addBookTitle(addBookTitle);
    }

    @Override
    @Transactional
    public void updateBookTitle(Booktitle updateBookTitle) {
        daoBookTitle.updateBookTitle(updateBookTitle);
    }

    @Override
    @Transactional
    public void deleteBookTitle(Booktitle deleteBookTitle) {
        daoBookTitle.deleteBookTitle(deleteBookTitle);
    }

    @Override
    @Transactional
    public List<Booktitle> findPossibleMatch(String booktitle) {
        return daoBookTitle.findPossibleMatch(booktitle);
    }

    @Override
    @Transactional
    public List<Booktitle> findAll() {
        return daoBookTitle.findAll();
    }
}

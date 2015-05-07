package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.service.businesslogic.BookDetailService;
import ch.albertlegrand.data.dao.DAOBookDetail;
import ch.albertlegrand.data.model.BookDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BookDetailServiceImpl implements BookDetailService {
    @Autowired(required = true)
    private DAOBookDetail daoBookDetail;

    @Override
    @Transactional
    public BookDetail addBookDetail(BookDetail addBookDetail) {
        return daoBookDetail.addBookDetail(addBookDetail);
    }

    @Override
    @Transactional
    public void updateBookDetail(BookDetail updateBookDetail) {
        daoBookDetail.updateBookDetail(updateBookDetail);
    }

    @Override
    @Transactional
    public void deleteBookDetail(BookDetail deleteBookDetail) {
        daoBookDetail.deleteBookDetail(deleteBookDetail);
    }

    @Override
    public BookDetail findObject(BookDetail bookDetail) {
        return daoBookDetail.findObject(bookDetail);
    }

    @Override
    public Object getById(long id) {
        return daoBookDetail.getById(id);
    }

    @Override
    public List<BookDetail> findAll() {
        return daoBookDetail.findAll();
    }
}

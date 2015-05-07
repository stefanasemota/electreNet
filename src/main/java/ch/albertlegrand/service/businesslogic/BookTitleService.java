package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.data.model.Booktitle;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
public interface BookTitleService {
    public Object getById(long id);

    public Booktitle addBookTitle(Booktitle addBookTitle);

    public void updateBookTitle(Booktitle updateBookTitle);

    public void deleteBookTitle(Booktitle deleteBookTitle);

    public List<Booktitle> findPossibleMatch(String booktitle);

    public List<Booktitle> findAll();
}

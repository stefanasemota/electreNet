package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.data.model.AlgSystem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
public interface AlgSystemService {
    /**
     * @param algSystem book to added or created
     */
    public void addAlgSystem(AlgSystem algSystem);


    public void changeExtractionFlag(boolean flag,Long id);
    /**
     * @param algSystem book to be updated
     */
    public void updateAlgSystem(AlgSystem algSystem);

    /**
     * Find an existing AlgSystem
     *
     * @param algSystem object
     * @return AlgSystem
     */
    public AlgSystem findObject(AlgSystem algSystem);

    public AlgSystem getById(long id);

    /**
     * Searches for all AlgSystem
     *
     * @return List of AlgSystem
     */
    public List<AlgSystem> findAll();
}

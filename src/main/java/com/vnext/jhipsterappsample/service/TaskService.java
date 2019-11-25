package com.vnext.jhipsterappsample.service;

import com.vnext.jhipsterappsample.domain.Task;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Task}.
 */
public interface TaskService {

    /**
     * Save a task.
     *
     * @param task the entity to save.
     * @return the persisted entity.
     */
    Task save(Task task);

    /**
     * Get all the tasks.
     *
     * @return the list of entities.
     */
    List<Task> findAll();


    /**
     * Get the "id" task.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Task> findOne(String id);

    /**
     * Delete the "id" task.
     *
     * @param id the id of the entity.
     */
    void delete(String id);

    /**
     * Search for the task corresponding to the query.
     *
     * @param query the query of the search.
     * 
     * @return the list of entities.
     */
    List<Task> search(String query);
}

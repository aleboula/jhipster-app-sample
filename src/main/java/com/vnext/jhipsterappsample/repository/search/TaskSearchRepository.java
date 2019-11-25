package com.vnext.jhipsterappsample.repository.search;
import com.vnext.jhipsterappsample.domain.Task;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Task} entity.
 */
public interface TaskSearchRepository extends ElasticsearchRepository<Task, String> {
}

package com.vnext.jhipsterappsample.repository.search;
import com.vnext.jhipsterappsample.domain.Job;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Job} entity.
 */
public interface JobSearchRepository extends ElasticsearchRepository<Job, String> {
}

package com.vnext.jhipsterappsample.repository.search;
import com.vnext.jhipsterappsample.domain.Project;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Project} entity.
 */
public interface ProjectSearchRepository extends ElasticsearchRepository<Project, String> {
}

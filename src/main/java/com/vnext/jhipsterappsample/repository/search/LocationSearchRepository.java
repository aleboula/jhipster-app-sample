package com.vnext.jhipsterappsample.repository.search;
import com.vnext.jhipsterappsample.domain.Location;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Location} entity.
 */
public interface LocationSearchRepository extends ElasticsearchRepository<Location, String> {
}

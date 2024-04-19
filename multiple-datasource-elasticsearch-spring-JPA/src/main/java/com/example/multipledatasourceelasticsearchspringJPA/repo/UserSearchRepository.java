package com.example.multipledatasourceelasticsearchspringJPA.repo;

import com.example.multipledatasourceelasticsearchspringJPA.entity.UserDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserSearchRepository extends ElasticsearchRepository<UserDocument, String> {
}


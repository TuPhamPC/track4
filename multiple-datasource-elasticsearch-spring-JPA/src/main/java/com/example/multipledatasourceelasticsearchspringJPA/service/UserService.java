package com.example.multipledatasourceelasticsearchspringJPA.service;

import co.elastic.clients.elasticsearch.core.SearchRequest;
import com.example.multipledatasourceelasticsearchspringJPA.entity.User;
import com.example.multipledatasourceelasticsearchspringJPA.entity.UserDocument;
import com.example.multipledatasourceelasticsearchspringJPA.repo.UserRepository;
import com.example.multipledatasourceelasticsearchspringJPA.repo.UserSearchRepository;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserSearchRepository userSearchRepository;

    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    public UserDocument saveOrUpdateUserToElastic(UserDocument userDocument) {
        return userSearchRepository.save(userDocument);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<UserDocument> getUserDocumentById(String id) {
        return userSearchRepository.findById(id);
    }



    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void deleteUserInElastic(String id) {
        userSearchRepository.deleteById(id);
    }


}


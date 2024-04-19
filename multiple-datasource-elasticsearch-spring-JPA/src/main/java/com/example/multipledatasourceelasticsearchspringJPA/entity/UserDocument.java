package com.example.multipledatasourceelasticsearchspringJPA.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDocument {
    @Id
    private String id;
    private String name;
    private String email;
    private Date date;
}


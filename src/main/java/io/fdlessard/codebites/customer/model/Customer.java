package io.fdlessard.codebites.customer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "customers")
@Data
@AllArgsConstructor
public class Customer implements Serializable {

    @Id
    private Long id;
    private String lastName;
    private String firstName;
    private String company;
}

package com.skp.spring.react.azure.demo.models;

import com.skp.spring.react.azure.demo.repository.constants.DatabaseConstants;
import com.skp.spring.react.azure.demo.repository.model.DatabaseDocument;
import com.skp.spring.react.azure.demo.repository.model.DatabaseDocumentImpl;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Document(collection = DatabaseConstants.USERS)
public class User extends DatabaseDocumentImpl {
    @NotBlank
    @Size(max = 20)
    public String username;
    @NotBlank
    @Size(max = 50)
    @Email
    public String email;
    @NotBlank
    @Size(max = 120)
    public String password;
    @DBRef
    public List<Role> roles;
    public User() {
    }
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}

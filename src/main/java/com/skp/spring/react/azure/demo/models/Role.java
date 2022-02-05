package com.skp.spring.react.azure.demo.models;
import com.skp.spring.react.azure.demo.repository.constants.DatabaseConstants;
import com.skp.spring.react.azure.demo.repository.model.DatabaseDocumentImpl;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = DatabaseConstants.ROLES)
public class Role extends DatabaseDocumentImpl {
    public ERole name;
    public Role() {
    }
    public Role(ERole name) {
        this.name = name;
    }
}

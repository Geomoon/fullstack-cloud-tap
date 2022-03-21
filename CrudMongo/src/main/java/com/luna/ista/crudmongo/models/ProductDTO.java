package com.luna.ista.crudmongo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "products")
public class ProductDTO {

    @Id
    private String _id;
    private String name;
    private Double precio;
    private LocalDate expiry_date;

}

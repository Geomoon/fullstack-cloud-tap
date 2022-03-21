package com.luna.ista.crudmongo.controllers;

import com.luna.ista.crudmongo.models.ProductDTO;
import com.luna.ista.crudmongo.repositories.IProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@CrossOrigin(originPatterns = "*", methods = {
        POST, GET, PUT, DELETE
})
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductoRestController {

    private final IProductDAO productoDAO;

    @PostMapping("/product")
    public ProductDTO create(@Validated @RequestBody ProductDTO productDTO) {
        return productoDAO.insert(productDTO);
    }

    @GetMapping("/")
    public List<ProductDTO> readAll() {
        return productoDAO.findAll();
    }

    @PutMapping("/producto/{id}")
    public ProductDTO update(@PathVariable String id, @Validated @RequestBody ProductDTO productDTO) {
        return productoDAO.save(productDTO);
    }

    @DeleteMapping("/producto/{id}")
    public void delete(@PathVariable String id) {
        productoDAO.deleteById(id);
    }

}

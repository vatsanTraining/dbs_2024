package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.model.Product;

public interface SortingRepository extends CrudRepository {

	List<Product> sort(String prop);
}

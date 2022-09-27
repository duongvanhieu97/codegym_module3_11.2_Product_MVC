package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Tủ lạnh", 10, "Panasonic","Tiki"));
        products.put(2,new Product(2,"Nồi cơm", 2, "Cuckoo","Shoppe"));
        products.put(3,new Product(3,"Điều hòa", 12, "Panasonic","Điện máy xanh"));
        products.put(4,new Product(4,"Iphone", 22, "Apple","Apple store"));
        products.put(5,new Product(5,"Cây nước", 4, "Sun House","Lazada"));
        products.put(6,new Product(6,"Máy Tính", 20, "Asus","FPT shop"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}

package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        // 示例数据（imageUrl 使用公开占位图，你可以替换为真实图片 URL）
        products.add(new Product(1L, "保温不锈钢水杯 - 350ml", "双层真空不锈钢，保温保冷，便携带杯盖设计。", 89.0, "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=800&q=80"));
        products.add(new Product(2L, "简约玻璃杯 - 400ml", "耐热玻璃，简约外形，适合办公室与家用。", 59.0, "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=800&q=80"));
        products.add(new Product(3L, "运动水杯 - 600ml", "防漏吸嘴设计，适合户外运动与健身使用。", 69.0, "https://images.unsplash.com/photo-1519074002996-a69e7ac46a42?w=800&q=80"));
    }

    public List<Product> findAll() {
        return products;
    }

    public Optional<Product> findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}

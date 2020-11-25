package edu.nf.bookshop.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Administrator
 */
@Data
public class Product {
    private String name;
    private BigDecimal price;
}

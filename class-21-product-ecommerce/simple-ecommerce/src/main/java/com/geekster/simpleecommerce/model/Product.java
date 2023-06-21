package com.geekster.simpleecommerce.model;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer productId;
    private String productName;

    private Category productCategory;
    private Double productPrice;

}

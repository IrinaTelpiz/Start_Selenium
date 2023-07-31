package com.selenium.workShop.SmadShop.Dto;

import com.selenium.workShop.SmadShop.components.CatalogProduct;
import com.selenium.workShop.SmadShop.components.DetailedProduct;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class ProductDto {

    private String description;
    private int price;

    public ProductDto(CatalogProduct catalogProduct) {
        setDescription(catalogProduct.getName());
        setPrice(catalogProduct.getPrice());
    }

    public ProductDto(DetailedProduct detailedProduct) {
        setDescription(detailedProduct.getName());
        setPrice(detailedProduct.getPrice());
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ProductDto that = (ProductDto) o;
//        return price == that.price && Objects.equals(description, that.description);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(description, price);
//    }
}

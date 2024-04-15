package com.dfx.manuel.repository;

import jakarta.persistence.*;

@Entity
@Table
public class loader {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
   @Column(name = "product_name")
   private String product;
   @Column(name = "product_price")
   private long Amount;

    /**
     * get field @Column(name = "product_name")
     *
     * @return product @Column(name = "product_name")

     */
    public String getProduct() {
        return this.product;
    }

    /**
     * set field @Column(name = "product_name")
     *
     * @param product @Column(name = "product_name")

     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get field @Column(name = "product_price")
     *
     * @return Amount @Column(name = "product_price")

     */
    public long getAmount() {
        return this.Amount;
    }

    /**
     * set field @Column(name = "product_price")
     *
     * @param Amount @Column(name = "product_price")

     */
    public void setAmount(long Amount) {
        this.Amount = Amount;
    }
}

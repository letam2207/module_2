package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private int price;
    private String manufacturer;
    private String describe;

    public Product() {
    }

    public Product(int productId, String productName, int price, String manufacturer, String describe) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.describe = describe;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "mã sản phẩm=" + productId +
                ", Tên sản phẩm='" + productName + '\'' +
                ", Giá=" + price +
                ", Hãng sản xuất='" + manufacturer + '\'' +
                ", Mô tả='" + describe + '\'' +
                '}';
    }
}

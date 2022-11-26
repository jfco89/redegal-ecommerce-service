package es.redegal.prueba.ecomerceservice.service.dto;

import java.util.Date;

public class PriceDto {

    public PriceDto() {
    }
    private Integer brandId;
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private Integer productId;
    private Integer priority;
    private Double price;
    private String curr;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriceDto priceDto = (PriceDto) o;

        if (!brandId.equals(priceDto.brandId)) return false;
        if (!startDate.equals(priceDto.startDate)) return false;
        if (!endDate.equals(priceDto.endDate)) return false;
        if (!priceList.equals(priceDto.priceList)) return false;
        if (!productId.equals(priceDto.productId)) return false;
        if (!priority.equals(priceDto.priority)) return false;
        if (!price.equals(priceDto.price)) return false;
        return curr.equals(priceDto.curr);
    }

    @Override
    public int hashCode() {
        int result = brandId.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        result = 31 * result + priceList.hashCode();
        result = 31 * result + productId.hashCode();
        result = 31 * result + priority.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + curr.hashCode();
        return result;
    }
}

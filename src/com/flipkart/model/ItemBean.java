package com.flipkart.model;

public class ItemBean {

	private int item_id,name,price,discount;
	private String description,pic_location,seller_id,cat_id,sub_cat_id;
	public int getItem_id() {
	return item_id;
	}
	public void setItem_id(int item_id) {
	this.item_id = item_id;
	}
	public int getName() {
	return name;
	}
	public void setName(int name) {
	this.name = name;
	}
	public int getPrice() {
	return price;
	}
	public void setPrice(int price) {
	this.price = price;
	}
	public int getDiscount() {
	return discount;
	}
	public void setDiscount(int discount) {
	this.discount = discount;
	}
	public String getDescription() {
	return description;
	}
	public void setDescription(String description) {
	this.description = description;
	}
	public String getPic_location() {
	return pic_location;
	}
	public void setPic_location(String pic_location) {
	this.pic_location = pic_location;
	}
	public String getSeller_id() {
	return seller_id;
	}
	public void setSeller_id(String seller_id) {
	this.seller_id = seller_id;
	}
	public String getCat_id() {
	return cat_id;
	}
	public void setCat_id(String cat_id) {
	this.cat_id = cat_id;
	}
	public String getSub_cat_id() {
	return sub_cat_id;
	}
	public void setSub_cat_id(String sub_cat_id) {
	this.sub_cat_id = sub_cat_id;
	}

	@Override
	public String toString() {
	return "ItemInfo [item_id=" + item_id + ", name=" + name + ", price=" + price + ", discount=" + discount
	+ ", description=" + description + ", pic_location=" + pic_location + ", seller_id=" + seller_id
	+ ", cat_id=" + cat_id + ", sub_cat_id=" + sub_cat_id + "]";
	}
	
}
//123

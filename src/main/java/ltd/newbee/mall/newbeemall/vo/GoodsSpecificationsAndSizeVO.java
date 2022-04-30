package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;

public class GoodsSpecificationsAndSizeVO implements Serializable {
	private Long goodsId;

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getWrapSize() {
		return wrapSize;
	}

	public void setWrapSize(String wrapSize) {
		this.wrapSize = wrapSize;
	}

	private String color;

	private String size;

	private String material;

	private String warranty;

	private String wrapSize;
}

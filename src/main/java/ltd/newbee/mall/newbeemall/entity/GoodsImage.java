package ltd.newbee.mall.newbeemall.entity;

public class GoodsImage {
	private int goodsId;
	private String Image;
	private int goodsRank;
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public int getGoodsRank() {
		return goodsRank;
	}
	public void setGoodsRank(int goodsRank) {
		this.goodsRank = goodsRank;
	}
	@Override
	public String toString() {
		return "GoodsImage [goodsId=" + goodsId + ", Image=" + Image + ", goodsRank=" + goodsRank + "]";
	}
	
	

}

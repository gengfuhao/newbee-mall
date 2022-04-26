package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class GoodsImageVO implements Serializable{
	private int goodsId;
	private String Image;
	private int goodsRank;
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
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	@Override
	public String toString() {
		return "GoodsImageVO [goodsId=" + goodsId + ", Image=" + Image + ", goodsRank=" + goodsRank + "]";
	}
	
	
	

}

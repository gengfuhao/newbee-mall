package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TbNewMallGoodsInfo {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_id")
	private Long goodsId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_name")
	private String goodsName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_intro")
	private String goodsIntro;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_category_id")
	private Long goodsCategoryId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_cover_img")
	private String goodsCoverImg;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_carousel")
	private String goodsCarousel;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.original_price")
	private Integer originalPrice;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.selling_price")
	private Integer sellingPrice;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.stock_num")
	private Integer stockNum;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.tag")
	private String tag;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_sell_status")
	private Byte goodsSellStatus;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.create_user")
	private Integer createUser;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.create_time")
	private Date createTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.update_user")
	private Integer updateUser;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.update_time")
	private Date updateTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_detail_content")
	private String goodsDetailContent;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_name")
	public String getGoodsName() {
		return goodsName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_name")
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName == null ? null : goodsName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_intro")
	public String getGoodsIntro() {
		return goodsIntro;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_intro")
	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro == null ? null : goodsIntro.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_category_id")
	public Long getGoodsCategoryId() {
		return goodsCategoryId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_category_id")
	public void setGoodsCategoryId(Long goodsCategoryId) {
		this.goodsCategoryId = goodsCategoryId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_cover_img")
	public String getGoodsCoverImg() {
		return goodsCoverImg;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_cover_img")
	public void setGoodsCoverImg(String goodsCoverImg) {
		this.goodsCoverImg = goodsCoverImg == null ? null : goodsCoverImg.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_carousel")
	public String getGoodsCarousel() {
		return goodsCarousel;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7015234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_carousel")
	public void setGoodsCarousel(String goodsCarousel) {
		this.goodsCarousel = goodsCarousel == null ? null : goodsCarousel.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.original_price")
	public Integer getOriginalPrice() {
		return originalPrice;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.original_price")
	public void setOriginalPrice(Integer originalPrice) {
		this.originalPrice = originalPrice;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.selling_price")
	public Integer getSellingPrice() {
		return sellingPrice;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.selling_price")
	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.stock_num")
	public Integer getStockNum() {
		return stockNum;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.stock_num")
	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.tag")
	public String getTag() {
		return tag;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.tag")
	public void setTag(String tag) {
		this.tag = tag == null ? null : tag.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_sell_status")
	public Byte getGoodsSellStatus() {
		return goodsSellStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_sell_status")
	public void setGoodsSellStatus(Byte goodsSellStatus) {
		this.goodsSellStatus = goodsSellStatus;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.create_user")
	public Integer getCreateUser() {
		return createUser;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.create_user")
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.create_time")
	public Date getCreateTime() {
		return createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.create_time")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.update_user")
	public Integer getUpdateUser() {
		return updateUser;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.update_user")
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.update_time")
	public Date getUpdateTime() {
		return updateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.update_time")
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_detail_content")
	public String getGoodsDetailContent() {
		return goodsDetailContent;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-04-26T19:26:15.7025234+09:00", comments = "Source field: tb_newbee_mall_goods_info.goods_detail_content")
	public void setGoodsDetailContent(String goodsDetailContent) {
		this.goodsDetailContent = goodsDetailContent == null ? null : goodsDetailContent.trim();
	}
}
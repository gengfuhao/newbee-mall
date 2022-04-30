package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;

import javax.xml.crypto.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReviewEntity {
	private int goodsId;
	private int reviewId;
	private int orderId;
	private String nickName;
	private int rating;
	private String title;
	private String content;
	private String photol1;
	private String photol2;
	private String photol3;
	private String photol4;
	private String photol5;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date date;;

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhotol1() {
		return photol1;
	}

	public void setPhotol1(String photol1) {
		this.photol1 = photol1;
	}

	public String getPhotol2() {
		return photol2;
	}

	public void setPhotol2(String photol2) {
		this.photol2 = photol2;
	}

	public String getPhotol3() {
		return photol3;
	}

	public void setPhotol3(String photol3) {
		this.photol3 = photol3;
	}

	public String getPhotol4() {
		return photol4;
	}

	public void setPhotol4(String photol4) {
		this.photol4 = photol4;
	}

	public String getPhotol5() {
		return photol5;
	}

	public void setPhotol5(String photol5) {
		this.photol5 = photol5;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}

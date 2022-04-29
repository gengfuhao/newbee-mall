package ltd.newbee.mall.newbeemall.entity;

public class ReviewEntity {
	private int goodsId;
	private int reviewId;
	private int orderId;
	private String nickName;
	private int rating;
	private String title;
	private String content;
	private String photol;
	private int niceNumber;
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
	public String getPhotol() {
		return photol;
	}
	public void setPhotol(String photol) {
		this.photol = photol;
	}
	public int getNiceNumber() {
		return niceNumber;
	}
	public void setNiceNumber(int niceNumber) {
		this.niceNumber = niceNumber;
	}
	

}

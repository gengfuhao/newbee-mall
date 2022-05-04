package ltd.newbee.mall.newbeemall.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class reviewLikeEntity {
	private int reviewId;
	private int userId;

	private Date reviewDate;

	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	

}

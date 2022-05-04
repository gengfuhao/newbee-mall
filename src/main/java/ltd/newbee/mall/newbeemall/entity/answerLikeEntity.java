package ltd.newbee.mall.newbeemall.entity;

import java.sql.Date;

public class answerLikeEntity {
	private int answerId;
	private int userId;

	private Date likeDate;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(Date likeDate) {
		this.likeDate = likeDate;
	}
	

}

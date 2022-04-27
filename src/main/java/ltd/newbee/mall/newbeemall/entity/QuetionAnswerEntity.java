package ltd.newbee.mall.newbeemall.entity;

public class QuetionAnswerEntity {
	
	private int goodsId;
	private int questionId;
	private int answerId;
	
	private String questionContents;
	public String getQuestionContents() {
		return questionContents;
	}
	public void setQuestionContents(String questionContents) {
		this.questionContents = questionContents;
	}
	private String answerContents;
	
	
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswerContents() {
		return answerContents;
	}
	public void setAnswerContents(String answerContents) {
		this.answerContents = answerContents;
	}
	
	
	 
}

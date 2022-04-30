package ltd.newbee.mall.newbeemall.vo;

public class QuetionAnswerVO {

	private int goodsId;
	private int questionId;
	private int answerId;
	private String questionContents;
	private String totalCount;
	private String answerContents;

	public void settotalCount(int a, int b, int c) {
		this.totalCount = "totalCount=" + a + " ," + "currentPage=" + b + "," + "totallPage=" + c;

	}

	public String gettotalCount() {
		return totalCount;
	}

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

	public String getQuestionContents() {
		return questionContents;
	}

	public void setQuestionContents(String questionContents) {
		this.questionContents = questionContents;
	}

	public String getAnswerContents() {
		return answerContents;
	}

	public void setAnswerContents(String answerContents) {
		this.answerContents = answerContents;
	}

}

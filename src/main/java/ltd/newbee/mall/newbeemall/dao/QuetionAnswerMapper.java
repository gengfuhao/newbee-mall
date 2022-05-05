package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.QuetionAnswerEntity;
import ltd.newbee.mall.newbeemall.entity.answerLikeEntity;
import ltd.newbee.mall.newbeemall.entity.reviewLikeEntity;

public interface QuetionAnswerMapper {
	List<QuetionAnswerEntity> answereEntity(int goodsId, int limitstart, int count, String orderby);

	int numberEntity(int goodsId);

	// 点赞 插入
	// 判断是否点赞了
	List<answerLikeEntity> judgeLike(int answerId, int userId);

	// 插入
	int insertAnswerLike(List<answerLikeEntity> answerLike);
}

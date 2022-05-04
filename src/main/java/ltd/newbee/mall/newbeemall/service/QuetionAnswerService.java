package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.answerLikeEntity;
import ltd.newbee.mall.newbeemall.vo.QuetionAnswerVO;

public interface QuetionAnswerService {

	List<QuetionAnswerVO> answereService(int goodsId, int limitstart, int count, String orderby);
	
	//点赞 插入
			//判断是否点赞了 
			List<answerLikeEntity> judgeLike(int answerId,int userId);
			//插入
			int insertAnswerLike(List<answerLikeEntity> answerLike);

}

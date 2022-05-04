package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.entity.reviewLikeEntity;
import ltd.newbee.mall.newbeemall.entity.starNumberEntity;
import ltd.newbee.mall.newbeemall.vo.ReviewVO;
import ltd.newbee.mall.newbeemall.vo.starNumberVO;

public interface ReviewService {
// review 展示 按rating 和点赞人数排序
	List<ReviewVO> revieService(int goodsId);

//  插入
	int insertGoodsReview(Map<String, Object> review);

	// 判断是否可以插入
	List<ReviewEntity> judgeEntity(int goodsId, int userId);
	
	
	//综合评价 和 评价个数  平均分数
		List<starNumberVO> comStar(int goodsId);
//		
		//点赞 插入
		//判断是否点赞了
		List<reviewLikeEntity> judgeLike(int reviewId,int userId);
		//点赞插入
		int insertReviewLike(List<reviewLikeEntity> reviewLike);
}

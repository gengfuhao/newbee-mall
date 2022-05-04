package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.entity.reviewLikeEntity;
import ltd.newbee.mall.newbeemall.entity.starNumberEntity;

public interface ReviewMapper {
	// review 展示 按rating 和点赞人数排序
	List<ReviewEntity> reviewEntity(int goodsId);

//判断是否可以插入
	List<ReviewEntity> judgeEntity(int goodsId, int userId);

	// 确定review中 最大的review_id 插入
	int insertGoodsReview(Map<String, Object> review);
    int maxReviewId();
	

//	//求各个星的个数    
	List<starNumberEntity> starNumber(int goodsId);
	
	//综合评价 和 评价个数  平均分数
	List<starNumberEntity> comStar(int goodsId);
	
	
	//点赞 插入
	//判断是否点赞了
	List<reviewLikeEntity> judgeLike(int reviewId,int userId);
	//插入
	int insertReviewLike(List<reviewLikeEntity> reviewLike);

}

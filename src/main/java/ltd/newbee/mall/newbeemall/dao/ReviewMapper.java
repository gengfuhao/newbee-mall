package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.entity.reviewLikeEntity;
import ltd.newbee.mall.newbeemall.entity.starNumberEntity;

public interface ReviewMapper {
	// task1 review 展示 按rating 和点赞人数排序
	List<ReviewEntity> reviewEntity(int goodsId);

//task2 判断和插入
	int judgeEntity(int goodsId, int userId);

	// 确定review中 最大的review_id 插入
	int insertGoodsReview(Map<String, Object> review);

	int maxReviewId();

	// task3 求各个星的个数
	starNumberEntity starNumber(int goodsId);

	// task3 综合评价 和 评价个数 平均分数
	starNumberEntity comStar(int goodsId);

	// task4 点赞 插入
	// 判断是否点赞了
	int judgeLike(int reviewId, int userId);

	// 插入
	int insertReviewLike(List<reviewLikeEntity> reviewLike);

}

package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.entity.reviewLikeEntity;
import ltd.newbee.mall.newbeemall.entity.starNumberEntity;
import ltd.newbee.mall.newbeemall.vo.ReviewVO;
import ltd.newbee.mall.newbeemall.vo.starNumberVO;

public interface ReviewService {
// task1 review 展示 按rating 和点赞人数排序
	List<ReviewVO> revieService(int goodsId);

//  task2 插入
	int insertGoodsReview(Map<String, Object> review);

	// 判断是否可以插入
	int judgeEntity(int goodsId, int userId);

	// task3 综合评价 和 评价个数 平均分数
	starNumberVO comStar(int goodsId);

	// task4 点赞 插入
	// 判断是否点赞了
	int judgeLike(int reviewId, int userId);

	// 点赞插入
	int insertReviewLike(List<reviewLikeEntity> reviewLike);
}

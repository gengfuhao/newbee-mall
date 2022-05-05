package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mall.newbeemall.dao.ReviewMapper;
import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.entity.reviewLikeEntity;
import ltd.newbee.mall.newbeemall.entity.starNumberEntity;
import ltd.newbee.mall.newbeemall.service.ReviewService;
import ltd.newbee.mall.newbeemall.vo.ReviewVO;
import ltd.newbee.mall.newbeemall.vo.starNumberVO;

@Service
public class ReviewServicelmpl implements ReviewService {
	@Resource
	ReviewMapper reviewMapper;

	@Override
	public List<ReviewVO> revieService(int goodsId) {
		// task1 review 展示 按rating 和点赞人数排序
		List<ReviewEntity> entity = reviewMapper.reviewEntity(goodsId);
		List<ReviewVO> voList = BeanUtil.copyToList(entity, ReviewVO.class);

		return voList;
	}

	@Override
	public int judgeEntity(int goodsId, int userId) {
//task2 判断是否可以插入
		return reviewMapper.judgeEntity(goodsId, userId);
	}

	@Override
	public int insertGoodsReview(Map<String, Object> review) {

		// task2 插入
		int newReviewId = reviewMapper.maxReviewId() + 1;
		review.replace("reviewId", newReviewId);
		review.replace("reviewDate", new Date());

		return reviewMapper.insertGoodsReview(review);
	}

	@Override
	public starNumberVO comStar(int goodsId) {
//  task3 
		starNumberVO starVO = new starNumberVO();
		// 求各个star的个
		starNumberEntity starEntity = reviewMapper.starNumber(goodsId);
		starVO.setRating5(starEntity.getRating5());
		starVO.setRating4(starEntity.getRating4());
		starVO.setRating3(starEntity.getRating3());
		starVO.setRating2(starEntity.getRating2());
		starVO.setRating1(starEntity.getRating1());
		// 平均レート 总评价 只评论数
		starNumberEntity conyentEntity = reviewMapper.comStar(goodsId);
		starVO.setCountContent(conyentEntity.getCountContent());
		starVO.setCountRating(conyentEntity.getCountRating());
		starVO.setCountStar(conyentEntity.getCountStar());
		return starVO;
	}

	// task4 插入点赞
	@Override
	public int insertReviewLike(List<reviewLikeEntity> reviewLike) {

		return reviewMapper.insertReviewLike(reviewLike);
	}

	@Override
	public int judgeLike(int reviewId, int userId) {
		return reviewMapper.judgeLike(reviewId, userId);
	}

}

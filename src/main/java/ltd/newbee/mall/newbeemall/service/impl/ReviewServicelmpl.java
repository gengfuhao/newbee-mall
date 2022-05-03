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
		// review 展示 按rating 和点赞人数排序
		List<ReviewEntity> entity = reviewMapper.reviewEntity(goodsId);
		List<ReviewVO> voList = BeanUtil.copyToList(entity, ReviewVO.class);

		return voList;
	}

	@Override
	public List<ReviewEntity> judgeEntity(int goodsId, int userId) {

		return reviewMapper.judgeEntity(goodsId, userId);
	}

//	@Override
//	public int insertEntity(List<ReviewEntity> list) {
//		// TODO 自動生成されたメソッド・スタブ
//		return reviewMapper.insertEntity(list);
//
//	}

	@Override
	public int insertGoodsReview(Map<String, Object> review) {
		
		// 插入
		int newReviewId=reviewMapper.maxReviewId()+1;
		review.replace("reviewId", newReviewId);
		review.replace("reviewDate", new Date());
		
		return reviewMapper.insertGoodsReview(review);
	}

@Override
public List<starNumberVO> comStar(int goodsId) {
	// TODO 自動生成されたメソッド・スタ
	starNumberVO starVO =new starNumberVO();
	List<starNumberVO> voList =new ArrayList<>();
	
	List<starNumberEntity> starnumber = reviewMapper.starNumber(goodsId);
	for(starNumberEntity entitynumber : starnumber) {
	starVO.setRating5(entitynumber.getRating5());
	starVO.setRating4(entitynumber.getRating4());
	starVO.setRating3(entitynumber.getRating3());
	starVO.setRating2(entitynumber.getRating2());
	starVO.setRating1(entitynumber.getRating1());
	}
	
	List<ReviewEntity> starEntity1 = reviewMapper.comStar(goodsId);
	for(ReviewEntity entity : starEntity1) {
		int allstar=entity.getSumStar();
		int allpeople=entity.getCountPeople();
		int average=allstar/allpeople;
		starVO.setRatingAverage(average);
		starVO.setEvaluation(entity.getCountPeople());
		
	}

	starVO.setAllStarEvaluation(reviewMapper.ratingNumber(goodsId));
voList.add(starVO);
	return voList;
}

	
}


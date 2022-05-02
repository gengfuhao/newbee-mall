package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.vo.ReviewVO;

public interface ReviewService {
	List<ReviewVO> revieService(int goodsId);

	List<ReviewEntity> judgeEntity(int goodsId, int userId);

	int insertEntity(List<ReviewEntity> list);
	int insertGoodsReview(Map<String,Object> review);

 
}

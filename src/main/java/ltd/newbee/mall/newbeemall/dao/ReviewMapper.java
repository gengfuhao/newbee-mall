package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.ReviewEntity;

public interface ReviewMapper{
	List<ReviewEntity> reviewEntity(int goodsId);
	List<ReviewEntity> judgeEntity(int goodsId,int userId);
	int insertEntity(List<ReviewEntity> list);
	

}

package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.QuetionAnswerEntity;

public interface QuetionAnswerMapper {
	List<QuetionAnswerEntity> answereEntity(int goodsId, int limitstart, int count, String orderby);

	int numberEntity(int goodsId);
}

package ltd.newbee.mall.newbeemall.dao;

import java.util.ArrayList;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.QuetionAnswerEntity;

public interface QuetionAnswerMapper {
	List<QuetionAnswerEntity> queTity(int goodsId,int n,int count);
	List<QuetionAnswerEntity> queTity2(int goodsId);
}

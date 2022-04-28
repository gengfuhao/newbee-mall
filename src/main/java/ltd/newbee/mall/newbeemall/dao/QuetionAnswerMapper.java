package ltd.newbee.mall.newbeemall.dao;

import java.util.ArrayList;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.QuetionAnswerEntity;

public interface QuetionAnswerMapper {
	List<QuetionAnswerEntity> queTity(int goodsId,int n,int count,String countOrder);
	int queTity2(int goodsId);
}

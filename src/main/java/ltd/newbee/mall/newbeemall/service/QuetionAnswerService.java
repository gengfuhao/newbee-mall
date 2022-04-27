package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.QuetionAnswerVO;



public interface QuetionAnswerService {
	
	List<QuetionAnswerVO> queTity(int goodsId,int n,int count);
	List<QuetionAnswerVO> queTity2(int goodsId);
}

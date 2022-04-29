package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.QuetionAnswerVO;



public interface QuetionAnswerService {
	
	List<QuetionAnswerVO> answereService(int goodsId,int limitstart,int count,String orderby);

}

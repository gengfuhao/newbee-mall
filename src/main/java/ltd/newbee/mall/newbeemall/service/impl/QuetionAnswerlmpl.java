package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.entity.QuetionAnswerEntity;
import ltd.newbee.mall.newbeemall.service.QuetionAnswerService;
import ltd.newbee.mall.newbeemall.vo.QuetionAnswerVO;
import ltd.newbee.mall.newbeemall.dao.QuetionAnswerMapper;

@Service
public class QuetionAnswerlmpl implements QuetionAnswerService {
	@Resource
	QuetionAnswerMapper quetionAnswerMapper;

	@Override
	public List<QuetionAnswerVO> answereService(int goodsId,int limitstart,int count,String orderby) {
		// TODO 自動生成されたメソッド・スタブ
//      展示页面
		int newstart = 0;
		newstart = (limitstart - 1) * count;
		List<QuetionAnswerEntity> quetionentity = quetionAnswerMapper.answereEntity(goodsId,newstart,count,orderby);
		List<QuetionAnswerVO> imageVoList = new ArrayList<>();

		// 显示多少页 和一页多少个，总个数quetionentity.size();
		int totalCount = quetionAnswerMapper.numberEntity(goodsId);
		int currentPage = count;
		int totalPage = 0;
		if (totalCount % currentPage == 0) {
			totalPage = totalCount / currentPage;
		} else {
			totalPage = totalCount / currentPage + 1;
		}

		for (QuetionAnswerEntity entity : quetionentity) {

			QuetionAnswerVO vo = new QuetionAnswerVO();
			vo.settotalCount(totalCount, currentPage, totalPage);
			vo.setGoodsId(entity.getGoodsId());
			vo.setQuestionId(entity.getQuestionId());
			vo.setAnswerId(entity.getAnswerId());
			vo.setQuestionContents(entity.getQuestionContents());
			vo.setAnswerContents(entity.getAnswerContents());
			imageVoList.add(vo);

		}
		return imageVoList;

	}

}

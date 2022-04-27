package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mall.newbeemall.entity.QuetionAnswerEntity;
import ltd.newbee.mall.newbeemall.service.QuetionAnswerService;
import ltd.newbee.mall.newbeemall.vo.QuetionAnswerVO;
import ltd.newbee.mall.newbeemall.dao.QuetionAnswerMapper;

@Service
public  class QuetionAnswerlmpl implements QuetionAnswerService {
	@Resource
	QuetionAnswerMapper quetionAnswerMapper;

	@Override
	public List<QuetionAnswerVO> queTity(int goodsId, int n, int count) {
		// TODO 自動生成されたメソッド・スタブ
//		List<QuetionAnswerVO> quetionVO = new ArrayList<>();
//		QuetionAnswerVO quetionvo = new QuetionAnswerVO();
//展示页面
		int m = 0;
		m = (n - 1) * count;
//		List<QuetionAnswerEntity> quetionentity = quetionAnswerMapper.queTity(goodsId, m, count);
//		List<QuetionAnswerVO> imageVoList = BeanUtil.copyToList(quetionentity, QuetionAnswerVO.class);
		List<QuetionAnswerEntity> quetionentity = quetionAnswerMapper.queTity(goodsId, m, count);
		List<QuetionAnswerEntity> quetionentity2 = quetionAnswerMapper.queTity2(goodsId);
		List<QuetionAnswerVO> imageVoList = new ArrayList<>();

		// 显示多少页 和一页多少个，总个数quetionentity.size();
		QuetionAnswerlmpl answerlmpl=new QuetionAnswerlmpl();
		int totalCount=quetionentity2.size();
//		int totalCount=answerlmpl.queTity2(goodsId).size();
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

//			totalCount , currentPage , totalPage
	}

	@Override
	public List<QuetionAnswerVO> queTity2(int goodsId) {
		// TODO 自動生成されたメソッド・スタブ
//		List<QuetionAnswerEntity> quetionentity2 = quetionAnswerMapper.queTity2(goodsId);
//		List<QuetionAnswerVO> imageVoList = BeanUtil.copyToList(quetionentity2, QuetionAnswerVO.class);
//		return imageVoList;
		return null;
	}

	

	

}

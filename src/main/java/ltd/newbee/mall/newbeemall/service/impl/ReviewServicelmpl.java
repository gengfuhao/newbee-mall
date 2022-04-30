package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mall.newbeemall.dao.ReviewMapper;
import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.service.ReviewService;
import ltd.newbee.mall.newbeemall.vo.ReviewVO;

@Service
public class ReviewServicelmpl implements ReviewService {
	@Resource
	ReviewMapper reviewMapper;

	@Override
	public List<ReviewVO> revieService(int goodsId) {
		// TODO 自動生成されたメソッド・スタブ
		List<ReviewEntity> entity = reviewMapper.reviewEntity(goodsId);
		List<ReviewVO> voList = BeanUtil.copyToList(entity, ReviewVO.class);

		return voList;
	}

	@Override
	public List<ReviewEntity> judgeEntity(int goodsId, int userId) {

		return reviewMapper.judgeEntity(goodsId, userId);
	}

	@Override
	public int insertEntity(List<ReviewEntity> list) {
		// TODO 自動生成されたメソッド・スタブ
		return reviewMapper.insertEntity(list);

	}

}

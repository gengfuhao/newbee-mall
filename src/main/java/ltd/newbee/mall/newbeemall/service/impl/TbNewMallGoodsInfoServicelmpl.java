package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mall.newbeemall.dao.TbNewMallGoodsInfoMapper;
import ltd.newbee.mall.newbeemall.entity.TbNewMallGoodsInfo;
import ltd.newbee.mall.newbeemall.vo.TbNewBeeMallGoodsInfoVO;
import ltd.newbee.mall.newbeemall.service.TbNewMallGoodsInfoService;

@Service
public class TbNewMallGoodsInfoServicelmpl implements TbNewMallGoodsInfoService {

	@Resource
	TbNewMallGoodsInfoMapper tbNewMallGoodsInfoMapper;

	@Override
	public List<TbNewBeeMallGoodsInfoVO> tbNewBeeMall(long goodsId) {

		List<TbNewMallGoodsInfo> tbNewBeeMallMapper = tbNewMallGoodsInfoMapper.tbNewBeeMall(goodsId);

		List<TbNewBeeMallGoodsInfoVO> imageVoList = BeanUtil.copyToList(tbNewBeeMallMapper,
				TbNewBeeMallGoodsInfoVO.class);

		return imageVoList;

	}

}

package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsDetailMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsDetail;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.vo.GoodsSpecificationsAndSizeVO;

@Service
public class GoodsDetailServiceImpl implements GoodsDetailService {

	@Resource
	GoodsDetailMapper goodsDetailMapper;

	@Override
	public List<GoodsSpecificationsAndSizeVO> findGoodsDetailsByGoodsId(long goodsId) {

		List<GoodsDetail> entityList = goodsDetailMapper.selectGoodsDetail(goodsId);

		List<GoodsSpecificationsAndSizeVO> voList = new ArrayList<>();
		for (GoodsDetail entity : entityList) {
			GoodsSpecificationsAndSizeVO vo = new GoodsSpecificationsAndSizeVO();
			vo.setGoodsId(entity.getGoodsId());
			vo.setColor(entity.getColor());
			vo.setMaterial(entity.getMaterial());

			if (entity.getSize3() == null) {
				vo.setSize(entity.getSize1Name() + entity.getSize1() + "x" + entity.getSize2Name() + entity.getSize2()
						+ entity.getSizeUnit());
			} else if (entity.getSize3() > 0 && entity.getSize4() == null) {
				vo.setSize(entity.getSize1Name() + entity.getSize1() + "x" + entity.getSize2Name() + entity.getSize2()
						+ "x" + entity.getSize3Name() + entity.getSize3() + entity.getSizeUnit());
			} else if (entity.getSize4() > 0 && entity.getSize5() == null) {
				vo.setSize(entity.getSize1Name() + entity.getSize1() + "x" + entity.getSize2Name() + entity.getSize2()
						+ "x" + entity.getSize3Name() + entity.getSize3() + "x" + entity.getSize4Name()
						+ entity.getSize4() + entity.getSizeUnit());
			} else if (entity.getSize5() > 0) {
				vo.setSize(entity.getSize1Name() + entity.getSize1() + "x" + entity.getSize2Name() + entity.getSize2()
						+ "x" + entity.getSize3Name() + entity.getSize3() + "x" + entity.getSize4Name()
						+ entity.getSize4() + "x" + entity.getSize5Name() + entity.getSize5() + entity.getSizeUnit());
			}
			vo.setWarranty(entity.getWarranty() + entity.getWarrantyUnit());

			if (entity.getWrapSize4() == null) {
				vo.setWrapSize(entity.getWrapSize1Name() + entity.getWrapSize1() + "x" + entity.getWrapSize2Name()
						+ entity.getWrapSize2() + "x" + entity.getWrapSize3Name() + entity.getWrapSize3()
						+ entity.getWrapSizeUnit());
			} else if (entity.getWrapSize4() > 0 && entity.getWrapSize5() == null) {
				vo.setWrapSize(entity.getWrapSize1Name() + entity.getWrapSize1() + "x" + entity.getWrapSize2Name()
						+ entity.getWrapSize2() + "x" + entity.getWrapSize3Name() + entity.getWrapSize3() + "x"
						+ entity.getWrapSize4Name() + entity.getWrapSize4() + entity.getWrapSizeUnit());
			} else if (entity.getWrapSize5() > 0) {
				vo.setWrapSize(entity.getWrapSize1Name() + entity.getWrapSize1() + "x" + entity.getWrapSize2Name()
						+ entity.getWrapSize2() + "x" + entity.getWrapSize3Name() + entity.getWrapSize3() + "x"
						+ entity.getWrapSize4Name() + entity.getWrapSize4() + "x" + entity.getWrapSize5Name()
						+ entity.getWrapSize5() + entity.getWrapSizeUnit());
			}
			voList.add(vo);
		}

		return voList;
	}
}

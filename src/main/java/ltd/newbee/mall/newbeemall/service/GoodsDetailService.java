package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.GoodsSpecificationsAndSizeVO;

public interface GoodsDetailService {
	List<GoodsSpecificationsAndSizeVO> findGoodsDetailsByGoodsId(long goodsId);
}

package ltd.newbee.mall.newbeemall.dao;

import java.util.List;


import ltd.newbee.mall.newbeemall.entity.GoodsDetail;

public interface GoodsDetailMapper {
	List<GoodsDetail> selectGoodsDetail(long goodsId);
}

package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsImage;
import ltd.newbee.mall.newbeemall.entity.TbNewMallGoodsInfo;

public interface TbNewMallGoodsInfoMapper {
	List<TbNewMallGoodsInfo> tbNewBeeMall(long goodsId);

}

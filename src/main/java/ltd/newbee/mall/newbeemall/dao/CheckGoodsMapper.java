package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.CheckGoods;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public interface CheckGoodsMapper {

	List<CheckGoods> findCheckGoodsByUserId(@Param("userId") long userId, @Param("number") int number);

	List<NewBeeMallGoods> findRescentCheckGoodsByJoin(long userId, int number);
}

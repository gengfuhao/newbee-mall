package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;

public interface NewBeeMallCheckGoodsService {
	List<NewBeeMallGoodsDetailVO> getCheckGoodsesForIndex(long userId, int number);

	List<NewBeeMallGoodsDetailVO> getRescentCheckGoodsesForIndex(long userId, int number);
}

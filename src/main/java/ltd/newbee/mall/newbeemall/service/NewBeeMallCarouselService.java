package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCarouselVO;

public interface NewBeeMallCarouselService {
	/**
	 * 返回固定数量的轮播图对象(首页调用)
	 *
	 * @param number
	 * @return
	 */
	List<NewBeeMallIndexCarouselVO> getCarouselsForIndex(int number);
}

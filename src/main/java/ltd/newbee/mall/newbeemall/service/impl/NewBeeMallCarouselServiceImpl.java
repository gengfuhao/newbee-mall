package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CarouselMapper;
import ltd.newbee.mall.newbeemall.entity.Carousel;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCarouselService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCarouselVO;

@Service
public class NewBeeMallCarouselServiceImpl implements NewBeeMallCarouselService {

	@Resource
	CarouselMapper carouselMapper;

	@Override
	public List<NewBeeMallIndexCarouselVO> getCarouselsForIndex(int number) {
		List<NewBeeMallIndexCarouselVO> volist = new ArrayList<>();

		List<Carousel> carouselList = new ArrayList<>();
		carouselList = carouselMapper.findCarouselsByNum(3);

		for (Carousel entity : carouselList) {
			NewBeeMallIndexCarouselVO vo = new NewBeeMallIndexCarouselVO();
			vo.setCarouselUrl(entity.getCarouselUrl());
			vo.setRedirectUrl(entity.getRedirectUrl());

			volist.add(vo);
		}
		return volist;
	}

}

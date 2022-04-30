package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CarouselMapper;
import ltd.newbee.mall.newbeemall.dao.CheckGoodsMapper;
import ltd.newbee.mall.newbeemall.dao.IndexConfigMapper;
import ltd.newbee.mall.newbeemall.entity.CheckGoods;
import ltd.newbee.mall.newbeemall.entity.IndexConfig;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCheckGoodsService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;

@Service
public class NewBeeMallCheckGoodsServiceImpl implements NewBeeMallCheckGoodsService {

	@Resource
	CheckGoodsMapper checkGoodsMapper;

	@Resource
	IndexConfigMapper indexConfigMapper;

	@Override
	public List<NewBeeMallGoodsDetailVO> getCheckGoodsesForIndex(long userId, int number) {
		// TODO 自動生成されたメソッド・スタブ
		List<NewBeeMallGoodsDetailVO> voList = new ArrayList<>();

		List<CheckGoods> checkGoods = checkGoodsMapper.findCheckGoodsByUserId(userId, 6);
		List<Long> a = new ArrayList<>();

		for (CheckGoods cg : checkGoods) {
			a.add(cg.getGoodsId());
		}
		List<NewBeeMallGoods> entityList = indexConfigMapper.selectByPrimarKeys(a);

		for (NewBeeMallGoods entity : entityList) {
			NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();
			vo.setGoodsId(entity.getGoodsId());
			vo.setGoodsName(entity.getGoodsName());
			vo.setGoodsIntro(entity.getGoodsIntro());
			vo.setGoodsCoverImg(entity.getGoodsCoverImg());
			vo.setSellingPrice(entity.getSellingPrice());
			vo.setOriginalPrice(entity.getOriginalPrice());
			vo.setGoodsDetailContent(entity.getGoodsDetailContent());

			String name = entity.getGoodsName();
			if (name.length() > 30) {
				vo.setGoodsName(name.substring(0, 30) + "...");
			}

			voList.add(vo);
		}

		return voList;
	}

	@Override
	public List<NewBeeMallGoodsDetailVO> getRescentCheckGoodsesForIndex(long userId, int number) {
		// TODO 自動生成されたメソッド・スタブ

		List<NewBeeMallGoodsDetailVO> voList = new ArrayList<>();

		List<NewBeeMallGoods> entityList = new ArrayList<>();
		entityList = checkGoodsMapper.findRescentCheckGoodsByJoin(userId, 6);

		// 也可以这么写
		// List<NewBeeMallGoods> entityList =
		// rescentCheckGoodsMapper.getRescentCheckGoodses(userId, number);

		if (entityList != null) {
			for (NewBeeMallGoods entity : entityList) {
				NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();
				vo.setGoodsId(entity.getGoodsId());
				vo.setGoodsName(entity.getGoodsName());
				vo.setGoodsIntro(entity.getGoodsIntro());
				vo.setGoodsCoverImg(entity.getGoodsCoverImg());
				vo.setSellingPrice(entity.getSellingPrice());
				vo.setOriginalPrice(entity.getOriginalPrice());
				vo.setGoodsDetailContent(entity.getGoodsDetailContent());

				String name = entity.getGoodsName();
				if (name.length() > 5) {
					vo.setGoodsName(name.substring(0, 5) + "...");
				}

				voList.add(vo);
			}
		}

		return voList;
	}
}
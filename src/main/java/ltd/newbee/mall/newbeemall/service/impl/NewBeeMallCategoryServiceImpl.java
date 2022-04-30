package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCategoryService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;
import ltd.newbee.mall.newbeemall.vo.SecondLevelCategoryVO;
import ltd.newbee.mall.newbeemall.vo.ThirdLevelCategoryVO;

@Service
public class NewBeeMallCategoryServiceImpl implements NewBeeMallCategoryService {

	@Resource
	private GoodsCategoryMapper goodsCategoryMapper;

	@Override
	public List<NewBeeMallIndexCategoryVO> getCategoriesForIndex() {
		// level1 parentId=0,long类型写成0l,且第一个参数是List
		List<Long> parentId = new ArrayList<Long>();
		parentId.add(0l);

		List<GoodsCategory> level1 = new ArrayList<>();
		level1 = goodsCategoryMapper.selectByLevelAndParentIdsAndNumber(parentId, 1, 20);

		List<Long> categoryList1 = new ArrayList<Long>();

		for (GoodsCategory gc : level1) {
			categoryList1.add(gc.getCategoryId());
		}

		// level2 parentId = level1 categoryId
		List<GoodsCategory> level2 = new ArrayList<>();
		level2 = goodsCategoryMapper.selectByLevelAndParentIdsAndNumber(categoryList1, 2, 100);
		List<Long> categoryList2 = new ArrayList<Long>();
		for (GoodsCategory gc2 : level2) {
			categoryList2.add(gc2.getCategoryId());
		}

		// level3 parentId = level2 categoryId
		List<GoodsCategory> level3 = new ArrayList<>();
		level3 = goodsCategoryMapper.selectByLevelAndParentIdsAndNumber(categoryList2, 3, 100);

		// level1 entity => vo
		List<NewBeeMallIndexCategoryVO> voList1 = new ArrayList<>();
		for (GoodsCategory gc1 : level1) {
			NewBeeMallIndexCategoryVO vo1 = new NewBeeMallIndexCategoryVO();
			vo1.setCategoryId(gc1.getCategoryId());
			vo1.setCategoryLevel(gc1.getCategoryLevel());
			vo1.setCategoryName(gc1.getCategoryName());

			List<SecondLevelCategoryVO> voList2 = new ArrayList<>();
			for (GoodsCategory gc2 : level2) {
				SecondLevelCategoryVO vo2 = new SecondLevelCategoryVO();
				if (gc2.getParentId() == gc1.getCategoryId()) {
					vo2.setCategoryId(gc2.getCategoryId());
					vo2.setCategoryLevel(gc2.getCategoryLevel());
					vo2.setCategoryName(gc2.getCategoryName());
					vo2.setParentId(gc2.getParentId());

					List<ThirdLevelCategoryVO> voList3 = new ArrayList<>();
					for (GoodsCategory gc3 : level3) {
						ThirdLevelCategoryVO vo3 = new ThirdLevelCategoryVO();
						if (gc3.getParentId() == gc2.getCategoryId()) {
							vo3.setCategoryId(gc3.getCategoryId());
							vo3.setCategoryLevel(gc3.getCategoryLevel());
							vo3.setCategoryName(gc3.getCategoryName());
							voList3.add(vo3);
							vo2.setThirdLevelCategoryVOS(voList3);
						}
					}
					voList2.add(vo2);
				}
			}
			vo1.setSecondLevelCategoryVOS(voList2);
			voList1.add(vo1);
		}

		return voList1;
	}
}

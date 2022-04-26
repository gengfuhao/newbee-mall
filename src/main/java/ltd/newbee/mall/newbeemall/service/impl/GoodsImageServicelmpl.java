package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsImageMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsImage;
import ltd.newbee.mall.newbeemall.service.GoodsImageService;
import ltd.newbee.mall.newbeemall.vo.GoodsImageVO;

@Service
public class GoodsImageServicelmpl implements GoodsImageService {
	@Resource
	GoodsImageMapper goodsImageMapper;

	// TODO 自動生成されたメソッド・スタブ
	@Override
	public List<ArrayList<GoodsImageVO>> goodsimage(int goodsId) {
		List<ArrayList<GoodsImageVO>> image00 = new ArrayList<ArrayList<GoodsImageVO>>();
		List<GoodsImage> image = goodsImageMapper.goodsimage(goodsId);
		ArrayList<GoodsImageVO> imagevo = new ArrayList<>();
		int sun = 0;
		int n = image.size();
		for (GoodsImage cg : image) {
			GoodsImageVO goodsimagevo = new GoodsImageVO();
			sun = sun + 1;

			goodsimagevo.setGoodsId(cg.getGoodsId());
			goodsimagevo.setGoodsRank(cg.getGoodsRank());
			goodsimagevo.setImage(cg.getImage());

			imagevo.add(goodsimagevo);

			if (sun % 8 == 0) {
				image00.add((ArrayList<GoodsImageVO>) imagevo.clone());
//				imagevo.clear();
			} else if ((sun == n) && (sun % 8 != 0)) {
				image00.add(imagevo);
			}

			if (sun % 8 == 0) {

				imagevo.clear();
			}
		}

		return image00;

	}

}

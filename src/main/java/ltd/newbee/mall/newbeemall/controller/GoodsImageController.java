package ltd.newbee.mall.newbeemall.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ltd.newbee.mall.newbeemall.service.GoodsImageService;
import ltd.newbee.mall.newbeemall.service.QuetionAnswerService;
import ltd.newbee.mall.newbeemall.service.TbNewMallGoodsInfoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;
import ltd.newbee.mall.newbeemall.vo.TbNewBeeMallGoodsInfoVO;

@Controller
public class GoodsImageController {
	@Resource
	GoodsImageService goodsImageService;

	@GetMapping("/goodsimage")
	@ResponseBody
	public Result goodsimagecontroller(int goodsId) {
		return ResultGenerator.genSuccessResult(goodsImageService.goodsimage(goodsId));
	}

	@Controller
	public class tbNewMallController {
		@Resource
		TbNewMallGoodsInfoService tbNewMallGoodsInfoService;

		@GetMapping("/tbnewbeeall")
		@ResponseBody
		public Result tbNewMallGoodsInfoService(long goodsId) {
			return ResultGenerator.genSuccessResult(tbNewMallGoodsInfoService.tbNewBeeMall(goodsId));
		}
	}

	
	@Controller
	public class QuetionController {
		@Resource
		QuetionAnswerService quetionAnswerService;

		@GetMapping("/answer")
		@ResponseBody
		public Result quetionAnswerService(int goodsId,int limitstart,int count,String orderby) {
			return ResultGenerator.genSuccessResult(quetionAnswerService.answereService(goodsId,limitstart,count,orderby));
		}
	}

}

package ltd.newbee.mall.newbeemall.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.answerLikeEntity;
import ltd.newbee.mall.newbeemall.entity.reviewLikeEntity;
import ltd.newbee.mall.newbeemall.service.GoodsImageService;
import ltd.newbee.mall.newbeemall.service.QuetionAnswerService;
import ltd.newbee.mall.newbeemall.service.TbNewMallGoodsInfoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class GoodsImageController {
	@Resource
	GoodsImageService goodsImageService;
	@Resource
	QuetionAnswerService quetionAnswerService;
//展示照片 八张一组
	@GetMapping("/goodsimage")
	@ResponseBody
	public Result goodsimagecontroller(int goodsId) {
		return ResultGenerator.genSuccessResult(goodsImageService.goodsimage(goodsId));
	}
//展示商品信息
	@Controller
	public class tbNewMallController {
		@Resource
		TbNewMallGoodsInfoService tbNewMallGoodsInfoService;
//商品详细页面-商品表信息抽出
		@GetMapping("/tbnewbeeall")
		@ResponseBody
		public Result tbNewMallGoodsInfoService(long goodsId) {
			return ResultGenerator.genSuccessResult(tbNewMallGoodsInfoService.tbNewBeeMall(goodsId));
		}
	}

	@Controller
	public class QuetionController {
//Q&A展示
		@GetMapping("/answer")
		@ResponseBody
		public Result quetionAnswerService(int goodsId, int limitstart, int count, String orderby) {
			return ResultGenerator
					.genSuccessResult(quetionAnswerService.answereService(goodsId, limitstart, count, orderby));
		}
	}
//Q&A点赞
	@PostMapping("/getanswerlike")
	@ResponseBody
	public Result insterReviewLike(int answerId, int userId) {

		List<answerLikeEntity> servicelist = quetionAnswerService.judgeLike(answerId, userId);

		if (servicelist != null && servicelist.size() == 0) {
			List<answerLikeEntity> insertlist = new ArrayList<>();
			answerLikeEntity likeEntity = new answerLikeEntity();
			likeEntity.setAnswerId(answerId);
			likeEntity.setUserId(userId);
			likeEntity.setLikeDate(new Date());

			insertlist.add(likeEntity);
			quetionAnswerService.insertAnswerLike(insertlist);

			return ResultGenerator.genSuccessResult("successed");
		} else {

			return ResultGenerator.genFailResult("failed");

		}

	}

}

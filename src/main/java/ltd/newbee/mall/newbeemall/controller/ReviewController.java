package ltd.newbee.mall.newbeemall.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.crypto.Data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.dao.ReviewMapper;
import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.service.ReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;
import ltd.newbee.mall.newbeemall.vo.ReviewVO;

@Controller
public class ReviewController {

	@Resource
	ReviewService reviewService;
	@Resource
	ReviewMapper reviewMapper;

	@GetMapping("/review")
	@ResponseBody
	public Result getreviewc(int goodsId) {

		return ResultGenerator.genSuccessResult(reviewService.revieService(goodsId));

	}

//Data date
	@GetMapping("/getreview")
	@ResponseBody
	public Result getReview(int goodsId, int userId, int reviewId, int orderId, String nickName, int rating,
			String title, String content, String photol1, String photol2, String photol3, String photol4,
			String photol5) {
		List<ReviewEntity> entitylist = reviewMapper.judgeEntity(goodsId, userId);

		if (entitylist == null) {
			return ResultGenerator.genFailResult("failed");
		} else {

			List<ReviewEntity> insertlist = new ArrayList<>();
			ReviewEntity vo = new ReviewEntity();
			vo.setGoodsId(goodsId);
			vo.setReviewId(reviewId);
			vo.setOrderId(orderId);
			vo.setNickName(nickName);
			vo.setRating(rating);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setPhotol1(photol1);
			vo.setPhotol2(photol2);
			vo.setPhotol3(photol3);
			vo.setPhotol4(photol4);
			vo.setPhotol5(photol5);
			vo.setDate(new Date());
			insertlist.add(vo);
			reviewService.insertEntity(insertlist);
			int count = reviewService.insertEntity(insertlist);

			return ResultGenerator.genSuccessResult("successed");

		}

	}

}

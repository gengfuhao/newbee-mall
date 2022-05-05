package ltd.newbee.mall.newbeemall.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.crypto.Data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.dao.ReviewMapper;
import ltd.newbee.mall.newbeemall.dao.UserMapper;
import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;
import ltd.newbee.mall.newbeemall.entity.reviewLikeEntity;
import ltd.newbee.mall.newbeemall.service.CheckUserExistsService;
import ltd.newbee.mall.newbeemall.service.ReviewService;
import ltd.newbee.mall.newbeemall.service.impl.ReviewServicelmpl;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;
import ltd.newbee.mall.newbeemall.vo.ReviewVO;

@Controller
public class ReviewController {

	@Resource
	ReviewService reviewService;
	@Resource
	ReviewMapper reviewMapper;
//	@Resource
	UserMapper userMapper;

//getmaping postmaping 一样 goodsId=10180
	@GetMapping("/review")
	@ResponseBody
	public Result getreviewc(int goodsId) {
//task1 展示review
		return ResultGenerator.genSuccessResult(reviewService.revieService(goodsId));

	}

	// postmaping 设置 post-body-raw-json
	@PostMapping("/goodsReview/insert")
	@ResponseBody
	public Result insertReview(@RequestBody HashMap<String, Object> reviewMap) {
//task 2 插入
		String goodsid = reviewMap.get("goodsId").toString();
		String userid = reviewMap.get("userId").toString();
		int newgoodsid = Integer.parseInt(goodsid);
		int newuserid = Integer.parseInt(userid);

		int entitylist = reviewService.judgeEntity(newgoodsid, newuserid);
		// 如果不判断null，直接调用size方法的话会发生nullPointerException 空指针
//		if (entitylist !=null && entitylist.size() == 0) {
		if (entitylist == 0) {
			return ResultGenerator.genFailResult("failed");
		} else {

			ResultGenerator.genSuccessResult(reviewService.insertGoodsReview(reviewMap));
			return ResultGenerator.genSuccessResult("successed");
		}

	}

	@GetMapping("/reviewStar")
	@ResponseBody
	public Result getReviewStar(int goodsId) {
		// task 3

		return ResultGenerator.genSuccessResult(reviewService.comStar(goodsId));

	}

	@PostMapping("/getreviewlike")
	@ResponseBody
	public Result ReviewLikeController(int reviewlikeId, int userId) {
		// task4 点赞
		int reviewLikeList = reviewService.judgeLike(reviewlikeId, userId);

		if (reviewLikeList != 0) {
			return ResultGenerator.genFailResult("failed");
		} else {
			List<reviewLikeEntity> insertlist = new ArrayList<>();
			reviewLikeEntity likeEntity = new reviewLikeEntity();
			likeEntity.setReviewId(reviewlikeId);
			likeEntity.setUserId(userId);
			likeEntity.setReviewDate(new Date());
			insertlist.add(likeEntity);
			return ResultGenerator.genSuccessResult(reviewMapper.insertReviewLike(insertlist));

		}

	}
}

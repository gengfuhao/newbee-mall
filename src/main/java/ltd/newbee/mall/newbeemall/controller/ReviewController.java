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
import ltd.newbee.mall.newbeemall.entity.ReviewEntity;
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

//getmaping postmaping 一样
	@GetMapping("/review")
	@ResponseBody
	public Result getreviewc(int goodsId) {

		return ResultGenerator.genSuccessResult(reviewService.revieService(goodsId));

	}

	// postmaping 设置 post-body-raw-json
	@PostMapping("/goodsReview/insert")
	@ResponseBody
	public Result insertReview(@RequestBody HashMap<String, Object> reviewMap) {
//		int goodsid=(int)(reviewMap.get("goodsId"));
//		int userid=(int)(reviewMap.get("userId"));
		String goodsid=reviewMap.get("goodsId").toString();
		String userid=reviewMap.get("userId").toString();
		int newgoodsid=Integer.parseInt(goodsid);
		int newuserid=Integer.parseInt(userid);
		
		List<ReviewEntity> entitylist = reviewMapper.judgeEntity(newgoodsid,newuserid);
		//如果不判断null，直接调用size方法的话会发生nullPointerException 空指针
		if (entitylist !=null && entitylist.size() == 0) {
			return ResultGenerator.genFailResult("failed");
		} else {
			return ResultGenerator.genSuccessResult(reviewService.insertGoodsReview(reviewMap));
			
		}
		
	}
	@GetMapping("/reviewStar")
	@ResponseBody
	public Result getReviewStar(int goodsId) {
		

		return ResultGenerator.genSuccessResult(reviewService.comStar(goodsId));

	}
	
	

//	// 判断是否可以插入
//	@GetMapping("/checkReview")
//	@ResponseBody
//	public Result checkReview(int goodsId, int userId) {
//		List<ReviewEntity> entitylist = reviewMapper.judgeEntity(goodsId, userId);
//
//		if (entitylist == null) {
//			return ResultGenerator.genFailResult("failed");
//		} else {
//			return ResultGenerator.genSuccessResult("successed");
//		}
//
//	}
////Data date
//	@GetMapping("/getreview")
//	@ResponseBody
//	public Result getReview(int goodsId, int userId, int reviewId, int orderId, String nickName, int rating,
//			String title, String content, String photo1, String photo2, String photo3, String photo4,
//			String photo5) {
//		List<ReviewEntity> entitylist = reviewMapper.judgeEntity(goodsId, userId);
//
//		if (entitylist == null) {
//			return ResultGenerator.genFailResult("failed");
//		} else {
//
//			List<ReviewEntity> insertlist = new ArrayList<>();
//			ReviewEntity vo = new ReviewEntity();
//			vo.setGoodsId(goodsId);
//			vo.setReviewId(reviewId);
//			vo.setOrderId(orderId);
//			vo.setNickName(nickName);
//			vo.setRating(rating);
//			vo.setTitle(title);
//			vo.setContent(content);
//			vo.setPhoto1(photo1);
//			vo.setPhoto2(photo2);
//			vo.setPhoto3(photo3);
//			vo.setPhoto4(photo4);
//			vo.setPhoto5(photo5);
//			vo.setDate(new Date());
//			insertlist.add(vo);
//			reviewService.insertEntity(insertlist);
//			int count = reviewService.insertEntity(insertlist);
//
//			return ResultGenerator.genSuccessResult("successed");
//
//		}
//
//	}

}

package ltd.newbee.mall.newbeemall.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;
import ltd.newbee.mall.newbeemall.service.CheckUserExistsService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCategoryService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCheckGoodsService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.service.RunRecommendApiHistoryService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class IndexController {
	@Resource
	private NewBeeMallIndexConfigService newBeeMallIndexConfigService;

	@Resource
	private NewBeeMallCategoryService newBeeMallCategoryService;

	@Resource
	private CheckUserExistsService checkUserExistsService;

	@Resource
	private NewBeeMallCheckGoodsService newBeeMallCheckGoodsService;

	@Resource
	private RunRecommendApiHistoryService runRecommendApiHistoryService;
//newbeemall-为你推荐商品
	@GetMapping("/Goodses")
	@ResponseBody
	public Result getGoodses(int configType) {

		return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(configType, 5));
	}

	@GetMapping("/categories")
	@ResponseBody
	public Result getCategories() {

		return ResultGenerator.genSuccessResult(newBeeMallCategoryService.getCategoriesForIndex());
	}
//判断用户是否存在
	@GetMapping("/user")
	@ResponseBody
	public Result user(long userId) {
		MallUser user = checkUserExistsService.checkUserExists(userId);
		if (user == null) {
			return ResultGenerator.genFailResult("The user ID you entered does not exist!");

		} else {
			// return ResultGenerator.genSuccessResult("success");

			// List<NewBeeMallGoodsDetailVO> voList =
			// newBeeMallCheckGoodsService.getCheckGoodsesForIndex(userId,6);
			// 分两步做
			// return
			// ResultGenerator.genSuccessResult(newBeeMallCheckGoodsService.getCheckGoodsesForIndex(userId,6));

			// 用表连接 join
			return ResultGenerator.genSuccessResult(newBeeMallCheckGoodsService.getRescentCheckGoodsesForIndex(userId, 6));

		}

		// 方法2
		/*
		 * int count = checkUserExistsService.checkUserExistsReturnCount(userId);
		 * if(count == 0 ) { return ResultGenerator.genFailResult("failed");
		 */
	}
//猜你喜欢
	@GetMapping("/runRecommendApi")
	@ResponseBody
	public Result runRecommendApi() {
		RunRecommendApiHistory runRecommendApiHistory=new RunRecommendApiHistory();
		runRecommendApiHistory.setRunDate(new Date());
		List<RunRecommendApiHistory> list = runRecommendApiHistoryService.selectRescentCategoryId();
		int count = runRecommendApiHistoryService.insertRunRecommendApiHistory(list);

		if (count == 0) {
			return ResultGenerator.genFailResult("failed");
		} else {
			return ResultGenerator.genSuccessResult("successed");
		}
	}

}
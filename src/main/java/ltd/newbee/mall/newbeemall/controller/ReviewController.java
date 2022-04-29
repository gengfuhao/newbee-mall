package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.ReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;
@Controller
public class ReviewController {
	
	@Resource
	ReviewService reviewService;
	
	@GetMapping("/review")
    @ResponseBody
    public Result getreviewc(int goodsId) {
		
		return ResultGenerator.genSuccessResult(reviewService.revieService(goodsId));
        		
        		
        		
        		
        		
    }
	

}




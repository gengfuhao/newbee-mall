package ltd.newbee.mall.newbeemall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;
import ltd.newbee.mall.newbeemall.service.RunRecommendApiHistoryService;

@SpringBootTest
class NewbeeMallApplicationTests {

	@Resource
	RunRecommendApiHistoryService runRecommendApiHistoryService;

	/*
	 * @Test void contextLoads() {
	 * 
	 * List<RunRecommendApiHistory> list = new ArrayList<>(); RunRecommendApiHistory
	 * h1 = new RunRecommendApiHistory(); h1.setUserId(1); h1.setCategoryId(0);
	 * h1.setRunDate(new Date()); list.add(h1);
	 * 
	 * int cnt = runRecommendApiHistoryService.insertRunRecommendApiHistory(list);
	 * assertEquals(1,cnt); }
	 */

	@Test
	void testSelectRescentCategoryId() {
		List<RunRecommendApiHistory> list = runRecommendApiHistoryService.selectRescentCategoryId();
		assertEquals(2, list.size());
		assertTrue(list.contains(51l));
		assertTrue(list.contains(86l));

	}
}

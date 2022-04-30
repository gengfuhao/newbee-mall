package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;

public interface RunRecommendApiHistoryService {
	int insertRunRecommendApiHistory(List<RunRecommendApiHistory> list);

	List<RunRecommendApiHistory> selectRescentCategoryId();
}

package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.RunRecommendApiHistoryMapper;
import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;
import ltd.newbee.mall.newbeemall.service.RunRecommendApiHistoryService;

@Service
public class RunRecommendApiHistoryServiceImpl implements RunRecommendApiHistoryService {

	@Resource
	RunRecommendApiHistoryMapper runRecommendApiHistoryMapper;

	@Override
	public int insertRunRecommendApiHistory(List<RunRecommendApiHistory> list) {

		return runRecommendApiHistoryMapper.insertRunRecommendApiHistory(list);
	}

	@Override
	public List<RunRecommendApiHistory> selectRescentCategoryId() {
		return runRecommendApiHistoryMapper.selectRescentCategoryId();
	}

}

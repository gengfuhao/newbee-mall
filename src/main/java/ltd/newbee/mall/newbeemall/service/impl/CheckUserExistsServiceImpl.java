package ltd.newbee.mall.newbeemall.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.UserMapper;
import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.service.CheckUserExistsService;

@Service
public class CheckUserExistsServiceImpl implements CheckUserExistsService {

	@Resource
	UserMapper userMapper;

	@Override
	public MallUser checkUserExists(long userId) {
		return userMapper.checkUserExists(userId);
	}

	@Override
	public int checkUserExistsReturnCount(Long userId) {
		return userMapper.checkUserExistsReturnCount(userId);
	}

}

package ltd.newbee.mall.newbeemall.service;

import ltd.newbee.mall.newbeemall.entity.MallUser;

public interface CheckUserExistsService {
	MallUser checkUserExists(long userId);

	int checkUserExistsReturnCount(Long userId);
}

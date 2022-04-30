package ltd.newbee.mall.newbeemall.dao;

import ltd.newbee.mall.newbeemall.entity.MallUser;

public interface UserMapper {
	MallUser checkUserExists(long userId);

	int checkUserExistsReturnCount(long userId);
}

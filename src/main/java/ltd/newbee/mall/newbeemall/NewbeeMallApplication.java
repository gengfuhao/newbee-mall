package ltd.newbee.mall.newbeemall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("ltd.newbee.mall.newbeemall.dao")
@SpringBootApplication
public class NewbeeMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewbeeMallApplication.class, args);
	     } 

	
	
}

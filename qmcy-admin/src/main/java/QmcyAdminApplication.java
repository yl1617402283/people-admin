import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableAsync
@EnableScheduling
@MapperScan("com.qmcy.dao")
public class QmcyAdminApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(QmcyAdminApplication.class).properties("spring.config.name=application_data").run(args);
	}
}

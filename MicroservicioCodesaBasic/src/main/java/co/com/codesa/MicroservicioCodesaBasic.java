package co.com.codesa;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
public class MicroservicioCodesaBasic extends AsyncConfigurerSupport {
	
	private static final Logger logger = LogManager.getLogger(MicroservicioCodesaBasic.class);
		
	@Bean
	public CountDownLatch closeLatch() {
		return new CountDownLatch(1);
	}

	public static void main(String[] args) throws InterruptedException {
		logger.info("Se incia el MicroServicioCodesaBasic");
		ApplicationContext ctx = SpringApplication.run(MicroservicioCodesaBasic.class, args);
		CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
		closeLatch.await();
	}
	
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(100000);
		executor.setMaxPoolSize(1000000);
		executor.setQueueCapacity(5000);
		executor.setThreadNamePrefix("CrudDBRest-");
		executor.initialize();
		return executor;
	}
}

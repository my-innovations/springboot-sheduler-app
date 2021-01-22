package com.mightyjava.schedular;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobSchedular {
	
	//private static Logger logger = LoggerFactory.getLogger(JobSchedular.class);
	
	//private UserService userService;
	//private AddressService addressService;
	
	/*@Autowired
	public JobSchedular(UserService userService, AddressService addressService) {
		this.userService = userService;
		this.addressService = addressService;
	}*/

	@Scheduled(cron = "*/5 * * * * *")
	public void scheduleUsingCron() {
		//logger.info(userService.userList());
	}

	@Scheduled(fixedDelay = 1000, initialDelay = 1000)
	public void scheduleUsingFixedDelayWithInitialDelay() {
		//logger.info(userService.findOne(1L)); 
	}

	@Scheduled(fixedDelay = 1000)
	public void scheduleUsingDelay() {
		//logger.info(addressService.addressList());
	}

	@Scheduled(fixedRate = 5000) 
	public void scheduleUsingRate() {
		//logger.info(addressService.findOne(1L));
	}
}

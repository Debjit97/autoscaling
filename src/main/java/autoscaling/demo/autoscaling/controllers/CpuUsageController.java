package autoscaling.demo.autoscaling.controllers;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CpuUsageController {
	
	@GetMapping("/actuator/cpu-usage")
	public String getCpuUsage() {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        double cpuUsage = osBean.getAvailableProcessors();// * 100; // Convert to percentage

        return "Number of DB operations: "+Controller.opCount;
	}
}

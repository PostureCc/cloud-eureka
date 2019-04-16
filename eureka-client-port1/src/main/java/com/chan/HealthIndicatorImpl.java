package com.chan;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class HealthIndicatorImpl implements HealthIndicator {

    /**检测后获取状态*/
    public Health health() {
        if(EurekaClientController.isValid) {
            return new Health.Builder(Status.UP).build();
        } else {
            return new Health.Builder(Status.DOWN).build();
        }
    }

}

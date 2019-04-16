package com.chan;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class HealthCheckHandlerImpl implements HealthCheckHandler {

    @Autowired
    private HealthIndicatorImpl healthIndicator;

    /**根据实时的项目内部运行情况 将其更新值eureka控制台 对应yml中的instanceInfoReplicationIntervalSeconds属性*/
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus currentStatus) {
        Status status = healthIndicator.health().getStatus();
        if (status.equals(Status.UP)) {
            return InstanceInfo.InstanceStatus.UP;
        } else {
            return InstanceInfo.InstanceStatus.DOWN;
        }
    }

}

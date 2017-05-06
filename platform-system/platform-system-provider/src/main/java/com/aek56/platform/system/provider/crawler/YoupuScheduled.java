package com.aek56.platform.system.provider.crawler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;

/**
 * 定时任务
 * Created by zj@aek56.com on 2016/12/12.
 */
@Component
public class YoupuScheduled {

    @Autowired
    private YoupuPipeline ratePipeline;

    @Scheduled(cron = "0 0/1 * * * ? ")
    public void BankOfChinaScheduled() {
        Spider.create(new YoupuProcessor())
                .addUrl("http://www.youpu.cn/Destination")
                .addPipeline(ratePipeline)
                .thread(5)
                .run();
    }

}

package net.java.example.time;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Example {

    public static void main(String[] args) {
        long day = TimeUnit.DAYS.convert(Duration.ofHours(24));

        Assert.assertEquals(1, day);

        log.info("시간을 날짜로 변환 : {}", TimeUnit.DAYS.convert(Duration.ofHours(50)));

        log.info("초를 분으로 변환 : {}", TimeUnit.DAYS.convert(Duration.ofSeconds(60)));
    }
}

package net.java.example.time;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * TimeUnit : {@link TimeUnit}
 *
 * TimeUnit 은 시간 단위를 명시적으로 표현하면서 쉽게 바꿀 수 있습니다.
 * 시간단위를 변환할때 계산 하는 코드가 필요 없음
 */
@Slf4j
public class Example {

    public static void main(String[] args) {
        long day = TimeUnit.DAYS.convert(Duration.ofHours(24));

        Assert.assertEquals(1, day);

        log.info("시간을 날짜로 변환 : {}", TimeUnit.DAYS.convert(Duration.ofHours(50)));

        log.info("초를 분으로 변환 : {}", TimeUnit.DAYS.convert(Duration.ofSeconds(60)));
    }
}

package net.java.example.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

@Slf4j
public class MapOperatorExample {

    public static void main(String[] args) {

        //불변 List
        List immutableList = List.of();

        log.info("[immutable List] list : {}", immutableList);

        // list -> var 변환
        var foo = List.of("creaton60", "github", "Test List");

        log.info("[immutable var List] foo : {}", foo);

        // 불변 empty Map
        Map emptyImmutableMap = Map.of();

        log.info("[immutable Map] empty Map : {}", emptyImmutableMap);

        // Map -> var 변환 object
        var map = Map.of(1, "Test1", 2, "Test2");

        log.info("[immutable var Map] map : {}", map);

        // In Entry Map --> Map Entry
        Map<Integer, String> emptyEntryMap = Map.ofEntries(
                entry(20, "装逼"),
                entry(30, "单身"),
                entry(40, "回家种地")
        );

        log.info("[immutable Entry Map] entry Map : {}", emptyEntryMap);

        // 불변 Map Entry
        Map.Entry<String, String> immutableMapEntry = entry("TestKey", "TestValue");

        // Map Entry
        var result = Map.ofEntries(immutableMapEntry);

        log.info("Result : {}", result);

        // 불변 Set
        Set<String> immutableSet = Set.of();

        log.info("immutable set empty Set : {}", immutableSet);

        // 불변 Set 만들기
        Set<String> bar = Set.of("1", "2", "3", "4", "5");

        log.info("immutable Set : {}", bar);

    }
}

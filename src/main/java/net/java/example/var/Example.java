package net.java.example.var;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Java 11 var 테스트
 *
 * csv 파일 리드 후 var string list 로 출력
 *
 */
public class Example {

    public static void main(String[] args) throws IOException {

        var list = new ArrayList<String>();

        var path = Paths.get("/Users/reactor/IdeaProjects/Java11/src/net/test/var/cancer_rate_2014_2.csv");

        System.out.println(path.getFileName());

        var file = Files.readString(path);

        file.lines().forEach(list::add);

        list.forEach(System.out::println);

    }
}

package net.java.example.trywithresources;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * trywithresouce example
 * Note: https://www.baeldung.com/java-try-with-resources
 */
@Slf4j
public class Example {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("./README.md"));

        try(br) {
            while(br.ready()) {
                log.info(br.readLine());
            }
        } catch (Exception e) {
            log.error("Exception occurs : {}", e.getMessage());
        }
    }
}

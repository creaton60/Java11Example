package net.java.example.collections;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollectionOperatorExample {
    static abstract class MyHandler<T> {

        private T content;

        MyHandler(T content) {
            this.content = content;
            log.info("What Content ?? {} ",content.toString());
        }

        T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        abstract void handle();
    }

    public static void main(String[] args) {
        MyHandler<Integer> intHandler = new MyHandler<>(1) {
            @Override
            public void handle() {
                log.info("Get Content : {}", getContent());
            }
        };
        intHandler.handle();

        log.info("===================Next Step===================");

        MyHandler<? extends Integer> intHandler1 = new MyHandler<>(10) {
            @Override
            void handle() {
                log.info("Get Content : {}", getContent());
            }
        };
        intHandler1.handle();

        log.info("==================Next Step===================");

        MyHandler<?> handler = new MyHandler<>("Test") {
            @Override
            void handle() {
                log.info("Get Content : {}", getContent());
            }
        };
        handler.handle();

    }
}

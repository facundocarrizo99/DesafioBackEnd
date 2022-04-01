package com.facuCarrizo.herosAPI;

public class Hero {

        private final long id;
        private final String content;

        public Hero(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public String getContent() {
            return content;
        }
}

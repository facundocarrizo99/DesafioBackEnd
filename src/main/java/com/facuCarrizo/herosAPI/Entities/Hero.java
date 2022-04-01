package com.facuCarrizo.herosAPI.Entities;

public class Hero {

        private long id;
        private String hero;
        private String publisher;
        private String alterEgo;
        private String firstAppearence;

        public Hero(String hero, String publisher, String alterEgo, String firstAppearence) {
            this.hero = hero;
            this.publisher = publisher;
            this.alterEgo = alterEgo;
            this.firstAppearence = firstAppearence;
        }

        public Hero(long id, String content) {
                this.id = id;
                this.hero = content;
            }


        @Override
        public String toString() {
            return "Hero{" +
                    "id=" + id +
                    ", hero='" + hero + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", alterEgo='" + alterEgo + '\'' +
                    ", firstAppearence='" + firstAppearence + '\'' +
                    '}';
        }

        public long getId() {
            return id;
        }

        public String getContent() {
            return hero;
        }

        public String getHero() {
            return hero;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getAlterEgo() {
            return alterEgo;
        }

        public void setAlterEgo(String alterEgo) {
            this.alterEgo = alterEgo;
        }

        public String getFirstAppearence() {
            return firstAppearence;
        }

        public void setFirstAppearence(String firstAppearence) {
            this.firstAppearence = firstAppearence;
        }
}

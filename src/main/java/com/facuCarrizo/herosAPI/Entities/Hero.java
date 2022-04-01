package com.facuCarrizo.herosAPI.Entities;

import java.util.ArrayList;

public class Hero {

        private long id;
        private String hero;
        private String publisher;
        private String alterEgo;
        private String firstAppearence;
        private Vote vote;

        private ArrayList<Hero> heroList;

        public Hero(String hero, String publisher, String alterEgo, String firstAppearence) {
            this.hero = hero;
            this.publisher = publisher;
            this.alterEgo = alterEgo;
            this.firstAppearence = firstAppearence;
        }

        public void votar(){
            vote.votar();
        }

        public Integer getCantVotos(){
            return vote.getVotos();
        }


        public void sumPublisherVotes(){

        }

        /*
        public void addHeroList(Hero addedHero){
            this.heroList.add(addedHero);
        }

        public Hero(long id, String content) {
                this.id = id;
                this.hero = content;
        }
         */

        public Hero(long id, String hero, String publisher, String alterEgo, String firstAppearence, Vote vote) {
            this.id = id;
            this.hero = hero;
            this.publisher = publisher;
            this.alterEgo = alterEgo;
            this.firstAppearence = firstAppearence;
            this.vote = vote;
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

            public void setId(long id) {
                this.id = id;
            }

            public void setHero(String hero) {
                this.hero = hero;
            }

            public Vote getVote() {
                return vote;
            }

            public void setVote(Vote vote) {
            this.vote = vote;
        }
}

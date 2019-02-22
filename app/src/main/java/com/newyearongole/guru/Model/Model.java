package com.newyearongole.guru.Model;

/**
 * Created by user on 12/15/2017.
 */
public class Model {

        public String title;
        public int image;

        public Model(String title, int image) {
            this.title = title;
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

}



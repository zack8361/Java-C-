package class2;

import java.util.ArrayList;

public class MovieReviewMain {
    public static void main(String[] args) {

        /*
            객체 1생성
         */
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한루프";


        /*
            객체 2생성
         */
        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타입";
        movieReview2.review = "인생 시간 영화";

        ArrayList<MovieReview> movieReviews = new ArrayList<>();
        movieReviews.add(movieReview1);
        movieReviews.add(movieReview2);

        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + " / " + movieReview.review);
        }
    }
}

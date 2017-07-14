package com.truck.floter.utils;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;


public class MyAnimationUtils {


    public static void animate(RecyclerView.ViewHolder holder, boolean goesDown) {

        slidingAnimation(holder, goesDown);

        // slidingWithBounce(holder, goesDown);

    }

    private static void slidingAnimation(RecyclerView.ViewHolder holder, boolean goesDown) {

        ObjectAnimator animatorTranslateY = ObjectAnimator.ofFloat(holder.itemView, "translationY", goesDown ? 200 : -200, 0);

        animatorTranslateY.setDuration(500);

        animatorTranslateY.start();

    }


    private static void slidingWithBounce(RecyclerView.ViewHolder holder, boolean goesDown) {

        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator animatorTranslateY = ObjectAnimator.ofFloat(holder.itemView, "translationY", goesDown ? 200 : -200, 0);
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(holder.itemView, "translationX", -30, 30, -20, 20, -5, 5, 0);

        animatorTranslateX.setDuration(500);
        animatorTranslateY.setDuration(500);

        animatorSet.playTogether(animatorTranslateX, animatorTranslateY);
        animatorSet.start();

    }

}

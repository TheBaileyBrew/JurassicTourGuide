package com.thebaileybrew.jurassictourguide;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.LinearInterpolator;

import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

public class ProgressAnimator {

    public static ValueAnimator makeProgressAnimator(final MaterialProgressBar progressBar) {
        final ValueAnimator animator = ValueAnimator.ofInt(0, 150);
        animator.setDuration(1000);
        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animator.getAnimatedValue();
                progressBar.setProgress(value);
            }
        });
        return animator;
    }

    public static ValueAnimator makeProgressAnimatorTwo(final MaterialProgressBar progressBar) {
        final ValueAnimator animator2 = ValueAnimator.ofInt(100, 0);
        animator2.setDuration(2000);
        animator2.setRepeatCount(ValueAnimator.REVERSE);
        animator2.reverse();
        animator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animator2.getAnimatedFraction();
                progressBar.setProgress(value + 5);
            }
        });
        return animator2;
    }

    public static ValueAnimator makeProgressAnimatorThree(final MaterialProgressBar progressBar) {
        final ValueAnimator animator3 = ValueAnimator.ofInt(1000, 0);
        animator3.setDuration(5000);
        animator3.setRepeatCount(ValueAnimator.RESTART);
        animator3.setInterpolator(new AccelerateDecelerateInterpolator());
        animator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animator3.getAnimatedFraction();
                progressBar.setProgress(value + 5);
            }
        });
        return animator3;
    }
}

package com.liguo.pageindicator.anim.select;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.liguo.pageindicator.anim.base.IndicatorBaseAnimator;

public class RotateEnter extends IndicatorBaseAnimator {
    public RotateEnter() {
        this.duration = 250;
    }

    public void setAnimation(View view) {
        this.animatorSet.playTogether(new Animator[]{
                ObjectAnimator.ofFloat(view, "rotation", 0, 180)});
    }
}

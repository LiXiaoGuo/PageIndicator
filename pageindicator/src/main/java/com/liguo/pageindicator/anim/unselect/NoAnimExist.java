package com.liguo.pageindicator.anim.unselect;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.liguo.pageindicator.anim.base.IndicatorBaseAnimator;

public class NoAnimExist extends IndicatorBaseAnimator {
    public NoAnimExist() {
        this.duration = 200;
    }

    public void setAnimation(View view) {
        this.animatorSet.playTogether(new Animator[]{
                ObjectAnimator.ofFloat(view, "alpha", 1, 1)});
    }
}

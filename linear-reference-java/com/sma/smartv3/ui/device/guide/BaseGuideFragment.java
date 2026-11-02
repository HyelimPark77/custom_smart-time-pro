package com.sma.smartv3.ui.device.guide;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iOiXXO1IO;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseGuideFragment extends BaseFragment implements SlideSelectionListener {
    public Button btnSet;
    public ImageView ivPic;
    public TextView tvTip;
    public TextView tvTitle;

    public BaseGuideFragment() {
    }

    public static /* synthetic */ void XIi00iiXO(BaseGuideFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final void initView$lambda$0(BaseGuideFragment r0, View r1) {
        r0.onSetClick();
    }

    @aa1
    public final Button getBtnSet() {
        Button r0 = this.btnSet;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btnSet");
        return null;
    }

    @aa1
    public final ImageView getIvPic() {
        ImageView r0 = this.ivPic;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("ivPic");
        return null;
    }

    @aa1
    public final TextView getTvTip() {
        TextView r0 = this.tvTip;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvTip");
        return null;
    }

    @aa1
    public final TextView getTvTitle() {
        TextView r0 = this.tvTitle;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvTitle");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        View r0 = getMView().findViewById(R.id.iv);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        setIvPic((ImageView) r0);
        View r1 = getMView().findViewById(R.id.tv_title);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        setTvTitle((TextView) r1);
        View r2 = getMView().findViewById(R.id.tv_tip);
        Intrinsics.O10IXXX0X(r2, "findViewById(...)");
        setTvTip((TextView) r2);
        getTvTip().setMovementMethod(new ScrollingMovementMethod());
        View r3 = getMView().findViewById(R.id.btn_set);
        Intrinsics.O10IXXX0X(r3, "findViewById(...)");
        setBtnSet((Button) r3);
        getBtnSet().setOnClickListener(new iOiXXO1IO(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_app_guide;
    }

    public void onSetClick() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }

    public final void setBtnSet(@aa1 Button r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btnSet = r2;
    }

    public final void setIvPic(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ivPic = r2;
    }

    public final void setTvTip(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvTip = r2;
    }

    public final void setTvTitle(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvTitle = r2;
    }
}

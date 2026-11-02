package com.sma.smartv3.p610ui.device.guide;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
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

    @aa1
    public final Button getBtnSet() {
        Button button = this.btnSet;
        if (button != null) {
            return button;
        }
        Intrinsics.XXO("btnSet");
        return null;
    }

    @aa1
    public final ImageView getIvPic() {
        ImageView imageView = this.ivPic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("ivPic");
        return null;
    }

    @aa1
    public final TextView getTvTip() {
        TextView textView = this.tvTip;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("tvTip");
        return null;
    }

    @aa1
    public final TextView getTvTitle() {
        TextView textView = this.tvTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("tvTitle");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        View viewFindViewById = getMView().findViewById(R.id.f51417iv);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        setIvPic((ImageView) viewFindViewById);
        View viewFindViewById2 = getMView().findViewById(R.id.tv_title);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        setTvTitle((TextView) viewFindViewById2);
        View viewFindViewById3 = getMView().findViewById(R.id.tv_tip);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        setTvTip((TextView) viewFindViewById3);
        getTvTip().setMovementMethod(new ScrollingMovementMethod());
        View viewFindViewById4 = getMView().findViewById(R.id.btn_set);
        Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
        setBtnSet((Button) viewFindViewById4);
        getBtnSet().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iOiXXO1IO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8204IO.onSetClick();
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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

    public final void setBtnSet(@aa1 Button button) {
        Intrinsics.X0O(button, "<set-?>");
        this.btnSet = button;
    }

    public final void setIvPic(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.ivPic = imageView;
    }

    public final void setTvTip(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.tvTip = textView;
    }

    public final void setTvTitle(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.tvTitle = textView;
    }
}

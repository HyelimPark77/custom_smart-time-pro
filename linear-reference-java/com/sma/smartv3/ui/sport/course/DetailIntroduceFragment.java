package com.sma.smartv3.ui.sport.course;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.XO0IX00OO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailIntroduceFragment extends BaseFragment {

    @aa1
    private final Lazy mDetailIntroduce$delegate;

    public DetailIntroduceFragment() {
        this.mDetailIntroduce$delegate = LazyKt__LazyJVMKt.iO(new XO0IX00OO(this));
    }

    public static /* synthetic */ TextView XIi00iiXO(DetailIntroduceFragment r0) {
        return mDetailIntroduce_delegate$lambda$0(r0);
    }

    private final TextView getMDetailIntroduce() {
        return (TextView) getValue();
    }

    private static final TextView mDetailIntroduce_delegate$lambda$0(DetailIntroduceFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.course_detail_introduce);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        TextView r0 = getMDetailIntroduce();
        if (r0 == null) goto L6;
        r0.setText(Html.fromHtml(getMArg0()));
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.course_fragment_detail_introduce;
    }
}

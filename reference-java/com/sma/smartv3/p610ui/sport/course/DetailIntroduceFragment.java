package com.sma.smartv3.p610ui.sport.course;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.p610ui.sport.course.DetailIntroduceFragment;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailIntroduceFragment extends BaseFragment {

    @aa1
    private final Lazy mDetailIntroduce$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO0IX00OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailIntroduceFragment.mDetailIntroduce_delegate$lambda$0(this.f4661IO);
        }
    });

    private final TextView getMDetailIntroduce() {
        return (TextView) this.mDetailIntroduce$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mDetailIntroduce_delegate$lambda$0(DetailIntroduceFragment detailIntroduceFragment) {
        return (TextView) detailIntroduceFragment.getMView().findViewById(R.id.course_detail_introduce);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        TextView mDetailIntroduce = getMDetailIntroduce();
        if (mDetailIntroduce != null) {
            mDetailIntroduce.setText(Html.fromHtml(getMArg0()));
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.course_fragment_detail_introduce;
    }
}

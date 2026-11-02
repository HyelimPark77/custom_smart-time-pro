package com.sma.smartv3.ui.sport.course.item;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X00Xi1i01;
import com.android.mltcode.paycertificationapi.XiI00iO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.AllCourseActivity;
import com.sma.smartv3.ui.sport.course.CourseSearchActivity;
import com.sma.smartv3.util.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class FitnessRecordItem extends BaseDslItem {
    private LinearLayout mCardView;
    public Context mContext;

    public FitnessRecordItem() {
    }

    public static /* synthetic */ void IiI10X(FitnessRecordItem r0, View r1) {
        bindView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void O00(FitnessRecordItem r0, View r1) {
        bindView$lambda$0(r0, r1);
    }

    private static final void bindView$lambda$0(FitnessRecordItem r2, View r3) {
        r2.getMContext().startActivity(new Intent(r2.getMContext(), CourseSearchActivity.class));
    }

    private static final void bindView$lambda$1(FitnessRecordItem r2, View r3) {
        r2.getMContext().startActivity(new Intent(r2.getMContext(), AllCourseActivity.class));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r6) {
        Intrinsics.X0O(r6, "itemHolder");
        View r1 = r6.v(R.id.search_item);
        Intrinsics.XXI(r1);
        LinearLayout r2 = (LinearLayout) r1;
        this.mCardView = r2;
        LinearLayout r3 = null;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mCardView");
        r2 = null;
    L5:
        Context r4 = r2.getContext();
        Intrinsics.O10IXXX0X(r4, "getContext(...)");
        setMContext(r4);
        LinearLayout r5 = this.mCardView;
        if (r5 != null) goto L8;
        Intrinsics.XXO("mCardView");
    L9:
        UtilsKt.IX1XiI(r3, 20.0f);
        r6.click(R.id.search_item, new X00Xi1i01(this));
        r6.click(R.id.fitness_item_all_course, new XiI00iO(this));
        return;
    L8:
        r3 = r5;
        goto L9
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        LinearLayout r0 = this.mCardView;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mCardView");
        r0 = null;
    L5:
        r0.setBackgroundTintList(ColorStateList.valueOf(gk4.iO(getMContext(), R.color.white)));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.fitness_item_top;
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"onThemeChange"});
        initView();
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}

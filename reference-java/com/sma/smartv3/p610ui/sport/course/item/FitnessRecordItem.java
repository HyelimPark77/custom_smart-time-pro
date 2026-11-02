package com.sma.smartv3.p610ui.sport.course.item;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.sport.course.AllCourseActivity;
import com.sma.smartv3.p610ui.sport.course.CourseSearchActivity;
import com.sma.smartv3.p610ui.sport.course.item.FitnessRecordItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class FitnessRecordItem extends BaseDslItem {
    private LinearLayout mCardView;
    public Context mContext;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(FitnessRecordItem fitnessRecordItem, View view) {
        fitnessRecordItem.getMContext().startActivity(new Intent(fitnessRecordItem.getMContext(), (Class<?>) CourseSearchActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(FitnessRecordItem fitnessRecordItem, View view) {
        fitnessRecordItem.getMContext().startActivity(new Intent(fitnessRecordItem.getMContext(), (Class<?>) AllCourseActivity.class));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.search_item);
        Intrinsics.XXI(viewM3483v);
        LinearLayout linearLayout = (LinearLayout) viewM3483v;
        this.mCardView = linearLayout;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.XXO("mCardView");
            linearLayout = null;
        }
        Context context = linearLayout.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        LinearLayout linearLayout3 = this.mCardView;
        if (linearLayout3 == null) {
            Intrinsics.XXO("mCardView");
        } else {
            linearLayout2 = linearLayout3;
        }
        UtilsKt.IX1XiI(linearLayout2, 20.0f);
        itemHolder.click(R.id.search_item, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X00Xi1i01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FitnessRecordItem.bindView$lambda$0(this.f3892IO, view);
            }
        });
        itemHolder.click(R.id.fitness_item_all_course, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XiI00iO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FitnessRecordItem.bindView$lambda$1(this.f5242IO, view);
            }
        });
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        LinearLayout linearLayout = this.mCardView;
        if (linearLayout == null) {
            Intrinsics.XXO("mCardView");
            linearLayout = null;
        }
        linearLayout.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(getMContext(), R.color.white)));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.fitness_item_top;
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onThemeChange");
        initView();
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }
}

package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.IO0XOX;
import com.android.mltcode.paycertificationapi.OIX10;
import com.android.mltcode.paycertificationapi.Oi10iOX;
import com.android.mltcode.paycertificationapi.XOXOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomSportTimeGoalActivity extends BaseCustomSportGoalActivity {

    @aa1
    private final Lazy time1Et$delegate;

    @aa1
    private final Lazy time2Et$delegate;

    @aa1
    private final Lazy time3Et$delegate;

    @aa1
    private final Lazy time4Et$delegate;

    public CustomSportTimeGoalActivity() {
        this.time1Et$delegate = LazyKt__LazyJVMKt.iO(new IO0XOX(this));
        this.time2Et$delegate = LazyKt__LazyJVMKt.iO(new Oi10iOX(this));
        this.time3Et$delegate = LazyKt__LazyJVMKt.iO(new OIX10(this));
        this.time4Et$delegate = LazyKt__LazyJVMKt.iO(new XOXOXI(this));
    }

    public static /* synthetic */ EditText I0iXXO(CustomSportTimeGoalActivity r0) {
        return time3Et_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText O10IXXX0X(CustomSportTimeGoalActivity r0) {
        return time2Et_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1ii(CustomSportTimeGoalActivity r0) {
        return time1Et_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText XXI(CustomSportTimeGoalActivity r0) {
        return time4Et_delegate$lambda$0(r0);
    }

    private static final EditText time1Et_delegate$lambda$0(CustomSportTimeGoalActivity r1) {
        return (EditText) r1.findViewById(R.id.time1Et);
    }

    private static final EditText time2Et_delegate$lambda$0(CustomSportTimeGoalActivity r1) {
        return (EditText) r1.findViewById(R.id.time2Et);
    }

    private static final EditText time3Et_delegate$lambda$0(CustomSportTimeGoalActivity r1) {
        return (EditText) r1.findViewById(R.id.time3Et);
    }

    private static final EditText time4Et_delegate$lambda$0(CustomSportTimeGoalActivity r1) {
        return (EditText) r1.findViewById(R.id.time4Et);
    }

    public final EditText getTime1Et() {
        return (EditText) getValue();
    }

    public final EditText getTime2Et() {
        return (EditText) getValue();
    }

    public final EditText getTime3Et() {
        return (EditText) getValue();
    }

    public final EditText getTime4Et() {
        return (EditText) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.sport.BaseCustomSportGoalActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.custom_duration);
        EditText r0 = getTime1Et();
        EditText r2 = getTime1Et();
        Intrinsics.O10IXXX0X(r2, "<get-time1Et>(...)");
        EditText r3 = getTime1Et();
        Intrinsics.O10IXXX0X(r3, "<get-time1Et>(...)");
        EditText r4 = getTime2Et();
        Intrinsics.O10IXXX0X(r4, "<get-time2Et>(...)");
        r0.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, r2, r3, r4, false, 8, null));
        EditText r1 = getTime2Et();
        EditText r5 = getTime1Et();
        Intrinsics.O10IXXX0X(r5, "<get-time1Et>(...)");
        EditText r6 = getTime2Et();
        Intrinsics.O10IXXX0X(r6, "<get-time2Et>(...)");
        EditText r7 = getTime3Et();
        Intrinsics.O10IXXX0X(r7, "<get-time3Et>(...)");
        r1.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, r5, r6, r7, false, 8, null));
        EditText r8 = getTime3Et();
        EditText r9 = getTime2Et();
        Intrinsics.O10IXXX0X(r9, "<get-time2Et>(...)");
        EditText r10 = getTime3Et();
        Intrinsics.O10IXXX0X(r10, "<get-time3Et>(...)");
        EditText r11 = getTime4Et();
        Intrinsics.O10IXXX0X(r11, "<get-time4Et>(...)");
        r8.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, r9, r10, r11, false, 8, null));
        EditText r12 = getTime4Et();
        EditText r13 = getTime3Et();
        Intrinsics.O10IXXX0X(r13, "<get-time3Et>(...)");
        EditText r14 = getTime4Et();
        Intrinsics.O10IXXX0X(r14, "<get-time4Et>(...)");
        EditText r15 = getTime4Et();
        Intrinsics.O10IXXX0X(r15, "<get-time4Et>(...)");
        r12.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, r13, r14, r15, false, 8, null));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_custom_sport_time_goal;
    }

    @Override // com.sma.smartv3.ui.sport.BaseCustomSportGoalActivity
    public void onTitleRightClick(@aa1 View r6) {
        Intrinsics.X0O(r6, "view");
        String r7 = getTime1Et().getText().toString();
        String r0 = getTime2Et().getText().toString();
        String r1 = getTime3Et().getText().toString();
        String r2 = getTime4Et().getText().toString();
        if (r7.length() != 0) goto L6;
        r7 = "0";
    L6:
        if (r0.length() != 0) goto L9;
        r0 = "0";
    L9:
        if (r1.length() != 0) goto L12;
        r1 = "0";
    L12:
        if (r2.length() != 0) goto L14;
        r2 = "0";
    L14:
        String r3 = r7 + r0 + CertificateUtil.DELIMITER + r1 + r2;
        int r8 = (((Integer.parseInt(r7) * 36000) + (Integer.parseInt(r0) * 3600)) + (Integer.parseInt(r1) * 600)) + (Integer.parseInt(r2) * 60);
        if (r8 != 0) goto L18;
        ToastUtils.showLong(getString(R.string.no_content_set_key), new Object[0]);
        return;
    L18:
        setResult(-1, new Intent().putExtra(uz0.iXiiiO, new Pair(r3, Integer.valueOf(r8))));
        finish();
    }
}

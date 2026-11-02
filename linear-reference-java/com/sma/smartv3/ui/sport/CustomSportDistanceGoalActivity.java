package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.XO0OI01;
import com.android.mltcode.paycertificationapi.XXO1XO0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.iI1111I;
import com.android.mltcode.paycertificationapi.iO0iiOX1X;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCustomSportDistanceGoalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSportDistanceGoalActivity.kt\ncom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,80:1\n19#2:81\n15#2:82\n*S KotlinDebug\n*F\n+ 1 CustomSportDistanceGoalActivity.kt\ncom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity\n*L\n27#1:81\n27#1:82\n*E\n"})
public final class CustomSportDistanceGoalActivity extends BaseCustomSportGoalActivity {

    @aa1
    private final Lazy distance1Et$delegate;

    @aa1
    private final Lazy distance2Et$delegate;

    @aa1
    private final Lazy distance3Et$delegate;

    @aa1
    private final Lazy tvDistanceUtil$delegate;

    @aa1
    private final AppUser userProfile;

    public CustomSportDistanceGoalActivity() {
        this.distance1Et$delegate = LazyKt__LazyJVMKt.iO(new iI1111I(this));
        this.distance2Et$delegate = LazyKt__LazyJVMKt.iO(new iO0iiOX1X(this));
        this.distance3Et$delegate = LazyKt__LazyJVMKt.iO(new XO0OI01(this));
        this.tvDistanceUtil$delegate = LazyKt__LazyJVMKt.iO(new XXO1XO0(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
    }

    public static /* synthetic */ EditText I0iXXO(CustomSportDistanceGoalActivity r0) {
        return distance1Et_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText O10IXXX0X(CustomSportDistanceGoalActivity r0) {
        return distance3Et_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1ii(CustomSportDistanceGoalActivity r0) {
        return distance2Et_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(CustomSportDistanceGoalActivity r0) {
        return tvDistanceUtil_delegate$lambda$0(r0);
    }

    private static final EditText distance1Et_delegate$lambda$0(CustomSportDistanceGoalActivity r1) {
        return (EditText) r1.findViewById(R.id.distance1Et);
    }

    private static final EditText distance2Et_delegate$lambda$0(CustomSportDistanceGoalActivity r1) {
        return (EditText) r1.findViewById(R.id.distance2Et);
    }

    private static final EditText distance3Et_delegate$lambda$0(CustomSportDistanceGoalActivity r1) {
        return (EditText) r1.findViewById(R.id.distance3Et);
    }

    private final TextView getTvDistanceUtil() {
        return (TextView) getValue();
    }

    private static final TextView tvDistanceUtil_delegate$lambda$0(CustomSportDistanceGoalActivity r1) {
        return (TextView) r1.findViewById(R.id.distanceUnit);
    }

    public final EditText getDistance1Et() {
        return (EditText) getValue();
    }

    public final EditText getDistance2Et() {
        return (EditText) getValue();
    }

    public final EditText getDistance3Et() {
        return (EditText) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.sport.BaseCustomSportGoalActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.custom_distance);
        EditText r7 = getDistance1Et();
        EditText r1 = getDistance1Et();
        Intrinsics.O10IXXX0X(r1, "<get-distance1Et>(...)");
        EditText r2 = getDistance1Et();
        Intrinsics.O10IXXX0X(r2, "<get-distance1Et>(...)");
        EditText r3 = getDistance2Et();
        Intrinsics.O10IXXX0X(r3, "<get-distance2Et>(...)");
        r7.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, r1, r2, r3, false, 8, null));
        EditText r8 = getDistance2Et();
        EditText r4 = getDistance1Et();
        Intrinsics.O10IXXX0X(r4, "<get-distance1Et>(...)");
        EditText r5 = getDistance2Et();
        Intrinsics.O10IXXX0X(r5, "<get-distance2Et>(...)");
        EditText r6 = getDistance3Et();
        Intrinsics.O10IXXX0X(r6, "<get-distance3Et>(...)");
        r8.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, r4, r5, r6, false, 8, null));
        EditText r9 = getDistance3Et();
        EditText r10 = getDistance2Et();
        Intrinsics.O10IXXX0X(r10, "<get-distance2Et>(...)");
        EditText r11 = getDistance3Et();
        Intrinsics.O10IXXX0X(r11, "<get-distance3Et>(...)");
        EditText r12 = getDistance3Et();
        Intrinsics.O10IXXX0X(r12, "<get-distance3Et>(...)");
        r9.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, r10, r11, r12, false, 8, null));
        getTvDistanceUtil().setText(getString(cp5.XX0(this.userProfile.getUnit())));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_custom_sport_distance_goal;
    }

    @Override // com.sma.smartv3.ui.sport.BaseCustomSportGoalActivity
    public void onTitleRightClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        String r6 = getDistance1Et().getText().toString();
        String r0 = getDistance2Et().getText().toString();
        String r1 = getDistance3Et().getText().toString();
        if (r6.length() != 0) goto L6;
        r6 = "0";
    L6:
        if (r0.length() != 0) goto L9;
        r0 = "0";
    L9:
        if (r1.length() != 0) goto L11;
        r1 = "0";
    L11:
        int r7 = ((Integer.parseInt(r6) * 10000) + (Integer.parseInt(r0) * 1000)) + (Integer.parseInt(r1) * 100);
        float r2 = r7;
        String r3 = cp5.iX1O1(r2 / 1000.0f, true);
        if (this.userProfile.getUnit() != 1) goto L14;
        r7 = (int) l76.IiI10X(r2);
    L14:
        if (r7 != 0) goto L17;
        ToastUtils.showLong(getString(R.string.no_content_set_key), new Object[0]);
        return;
    L17:
        setResult(-1, new Intent().putExtra(uz0.iXiiiO, new Pair(r3, Integer.valueOf(r7))));
        finish();
    }
}

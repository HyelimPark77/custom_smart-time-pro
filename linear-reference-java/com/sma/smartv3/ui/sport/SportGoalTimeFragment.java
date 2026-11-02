package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportGoalTimeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalTimeFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalTimeFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n151#2,5:93\n156#2,5:99\n99#2,7:104\n106#2,3:112\n79#2,7:115\n109#2:122\n1#3:98\n1#3:111\n*S KotlinDebug\n*F\n+ 1 SportGoalTimeFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalTimeFragment\n*L\n54#1:93,5\n54#1:99,5\n70#1:104,7\n70#1:112,3\n70#1:115,7\n70#1:122\n54#1:98\n70#1:111\n*E\n"})
public final class SportGoalTimeFragment extends BaseSportGoalSetFragment {
    public SportGoalTimeFragment() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int r3, int r4, @tb1 Intent r5) {
        super.onActivityResult(r3, r4, r5);
        if (r4 != (-1)) goto L9;
        if (r5 == null) goto L6;
        Serializable r6 = r5.getSerializableExtra(uz0.iXiiiO);
    L7:
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.Int>");
        Pair r7 = (Pair) r6;
        getNowGoalValue().setText((CharSequence) r7.getFirst());
        getStartExerciseBt().setEnabled(true);
        getGoals()[0] = 0;
        getGoals()[1] = ((Number) r7.getSecond()).intValue();
        getGoals()[2] = 0;
        LogUtils.d(new Object[]{"pair -> " + r7});
        return;
    L6:
        r6 = null;
        goto L7
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void setGoalValueItem() {
        getDistanceItemData().put(0, "15 " + getString(R.string.min));
        getDistanceItemData().put(1, "30 " + getString(R.string.min));
        getDistanceItemData().put(2, "40 " + getString(R.string.min));
        getDistanceItemData().put(3, "50 " + getString(R.string.min));
        getDistanceItemData().put(4, "60 " + getString(R.string.min));
        getDistanceItemData().put(5, "120 " + getString(R.string.min));
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void setInfo() {
        getNowGoalUnit().setText(R.string.h_min);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[], java.io.Serializable] */
    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void startExercise() {
        int r0 = getMArg1();
        ?? r1 = getGoals();
        Bundle r2 = new Bundle();
        r2.putString("mArg0", null);
        r2.putInt("mArg1", r0);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", r1);
        Intent r3 = new Intent(getActivity(), SportOnGoingGpsActivity.class);
        r3.putExtras(r2);
        startActivity(r3);
        FragmentActivity r4 = getActivity();
        if (r4 == null) goto L6;
        r4.finish();
        return;
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void toCustomerGoal() {
        FragmentActivity r1 = getActivity();
        Intrinsics.XXI(r1);
        startActivityForResult(new Intent(r1, CustomSportTimeGoalActivity.class), 123);
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void updateGoalValue(int r10) {
        DINCondBold r0 = getNowGoalValue();
        if (r10 == 0) goto L15;
        if (r10 == 1) goto L14;
        if (r10 == 2) goto L13;
        if (r10 == 3) goto L12;
        if (r10 == 4) goto L11;
        if (r10 == 5) goto L10;
        String r6 = "00:00";
    L16:
        r0.setText(r6);
        Button r1 = getStartExerciseBt();
        if (r10 == 0) goto L24;
        if (r10 == 1) goto L24;
        if (r10 == 2) goto L24;
        if (r10 == 3) goto L24;
        if (r10 == 4) goto L24;
        if (r10 == 5) goto L24;
        boolean r7 = false;
    L25:
        r1.setEnabled(r7);
        int[] r2 = getGoals();
        XO0O10 r8 = XO0O10.OXO1;
        r2[r8.iX()] = 0;
        int[] r3 = getGoals();
        int r9 = r8.IXXOO();
        if (r10 == 0) goto L38;
        if (r10 == 1) goto L37;
        if (r10 == 2) goto L36;
        if (r10 == 3) goto L35;
        if (r10 == 4) goto L34;
        if (r10 == 5) goto L33;
        int r11 = 0;
    L39:
        r3[r9] = r11;
        getGoals()[r8.i010I()] = 0;
        return;
    L33:
        r11 = 7200;
        goto L39
    L34:
        r11 = 3600;
        goto L39
    L35:
        r11 = 3000;
        goto L39
    L36:
        r11 = 2400;
        goto L39
    L37:
        r11 = 1800;
        goto L39
    L38:
        r11 = 900;
    L24:
        r7 = true;
        goto L25
    L10:
        r6 = "02:00";
        goto L16
    L11:
        r6 = "01:00";
        goto L16
    L12:
        r6 = "00:50";
        goto L16
    L13:
        r6 = "00:40";
        goto L16
    L14:
        r6 = "00:30";
        goto L16
    L15:
        r6 = "00:15";
        goto L16
    }
}

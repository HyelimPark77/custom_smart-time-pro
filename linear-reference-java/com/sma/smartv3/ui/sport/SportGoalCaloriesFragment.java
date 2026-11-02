package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportGoalCaloriesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalCaloriesFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalCaloriesFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n151#2,5:94\n156#2,5:100\n99#2,7:105\n106#2,3:113\n79#2,7:116\n109#2:123\n1#3:99\n1#3:112\n*S KotlinDebug\n*F\n+ 1 SportGoalCaloriesFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalCaloriesFragment\n*L\n56#1:94,5\n56#1:100,5\n72#1:105,7\n72#1:113,3\n72#1:116,7\n72#1:123\n56#1:99\n72#1:112\n*E\n"})
public final class SportGoalCaloriesFragment extends BaseSportGoalSetFragment {
    public SportGoalCaloriesFragment() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int r2, int r3, @tb1 Intent r4) {
        super.onActivityResult(r2, r3, r4);
        if (r3 != (-1)) goto L9;
        if (r4 == null) goto L6;
        Serializable r5 = r4.getSerializableExtra(uz0.iXiiiO);
    L7:
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.Int>");
        Pair r6 = (Pair) r5;
        getNowGoalValue().setText((CharSequence) r6.getFirst());
        getStartExerciseBt().setEnabled(true);
        getGoals()[0] = 0;
        getGoals()[1] = 0;
        getGoals()[2] = ((Number) r6.getSecond()).intValue();
        LogUtils.d(new Object[]{"pair -> " + r6});
        return;
    L6:
        r5 = null;
        goto L7
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void setGoalValueItem() {
        getDistanceItemData().put(0, "100 " + getString(R.string.kcal));
        getDistanceItemData().put(1, "300 " + getString(R.string.kcal));
        getDistanceItemData().put(2, "500 " + getString(R.string.kcal));
        getDistanceItemData().put(3, "700 " + getString(R.string.kcal));
        getDistanceItemData().put(4, "1000 " + getString(R.string.kcal));
        getDistanceItemData().put(5, "1500 " + getString(R.string.kcal));
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void setInfo() {
        getNowGoalUnit().setText(R.string.kcal);
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
        startActivityForResult(new Intent(r1, CustomSportCaloriesGoalActivity.class), 123);
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
        String r6 = "0";
    L16:
        r0.setText(r6);
        Button r1 = getStartExerciseBt();
        int r7 = 0;
        if (r10 == 0) goto L24;
        if (r10 == 1) goto L24;
        if (r10 == 2) goto L24;
        if (r10 == 3) goto L24;
        if (r10 == 4) goto L24;
        if (r10 == 5) goto L24;
        boolean r8 = false;
    L25:
        r1.setEnabled(r8);
        int[] r2 = getGoals();
        XO0O10 r9 = XO0O10.OXO1;
        r2[r9.iX()] = 0;
        getGoals()[r9.IXXOO()] = 0;
        int[] r3 = getGoals();
        int r11 = r9.i010I();
        if (r10 == 0) goto L38;
        if (r10 == 1) goto L37;
        if (r10 == 2) goto L36;
        if (r10 == 3) goto L35;
        if (r10 == 4) goto L34;
        if (r10 != 5) goto L39;
        r7 = 1500;
    L39:
        r3[r11] = r7;
        return;
    L34:
        r7 = 1000;
        goto L39
    L35:
        r7 = 700;
        goto L39
    L36:
        r7 = 500;
        goto L39
    L37:
        r7 = 300;
        goto L39
    L38:
        r7 = 100;
    L24:
        r8 = true;
        goto L25
    L10:
        r6 = "1500";
        goto L16
    L11:
        r6 = X10i1i.OXO1;
        goto L16
    L12:
        r6 = "700";
        goto L16
    L13:
        r6 = "500";
        goto L16
    L14:
        r6 = "300";
        goto L16
    L15:
        r6 = StatisticData.ERROR_CODE_NOT_FOUND;
        goto L16
    }
}

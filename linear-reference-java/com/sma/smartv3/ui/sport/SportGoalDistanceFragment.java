package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportGoalDistanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalDistanceFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalDistanceFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n19#2:223\n15#2:224\n151#3,5:225\n156#3,5:231\n99#3,7:236\n106#3,3:244\n79#3,7:247\n109#3:254\n1#4:230\n1#4:243\n*S KotlinDebug\n*F\n+ 1 SportGoalDistanceFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalDistanceFragment\n*L\n28#1:223\n28#1:224\n184#1:225,5\n184#1:231,5\n200#1:236,7\n200#1:244,3\n200#1:247,7\n200#1:254\n184#1:230\n200#1:243\n*E\n"})
public final class SportGoalDistanceFragment extends BaseSportGoalSetFragment {

    @aa1
    private final AppUser userProfile;

    public SportGoalDistanceFragment() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        this.userProfile = (AppUser) r1;
    }

    private final int getHalfGoals() {
        int r0 = getMArg1();
        if (r0 != 10) goto L5;
        return 20000;
    L5:
        if (r0 == 13) goto L8;
        return 21097;
    L8:
        return 15000;
    }

    private final String getHalfHorse() {
        int r0 = getMArg1();
        if (r0 == 10) goto L11;
        if (r0 == 13) goto L9;
        return transformHalfWhole(21.0f);
    L9:
        return cp5.XIi00iiXO(15.0f, false);
    L11:
        return cp5.XIi00iiXO(20.0f, false);
    }

    private final String getMarathonTitle(String r3) {
        int r0 = getMArg1();
        if (r0 != 10) goto L5;
        return "";
    L5:
        if (r0 != 13) goto L7;
        return "";
    L7:
        return r3 + " ";
    }

    private final int getWholeGoals() {
        int r0 = getMArg1();
        if (r0 != 10) goto L5;
        return 40000;
    L5:
        if (r0 == 13) goto L8;
        return 42195;
    L8:
        return 30000;
    }

    private final String getWholeHorse() {
        int r0 = getMArg1();
        if (r0 == 10) goto L11;
        if (r0 == 13) goto L9;
        return transformHalfWhole(42.1f);
    L9:
        return cp5.XIi00iiXO(30.0f, false);
    L11:
        return cp5.XIi00iiXO(40.0f, false);
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
        getGoals()[0] = ((Number) r7.getSecond()).intValue();
        getGoals()[1] = 0;
        getGoals()[2] = 0;
        LogUtils.d(new Object[]{"pair -> " + r7});
        return;
    L6:
        r6 = null;
        goto L7
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void setGoalValueItem() {
        getDistanceItemData().put(0, "3 " + getString(cp5.XX0(this.userProfile.getUnit())));
        getDistanceItemData().put(1, "5 " + getString(cp5.XX0(this.userProfile.getUnit())));
        getDistanceItemData().put(2, "8 " + getString(cp5.XX0(this.userProfile.getUnit())));
        getDistanceItemData().put(3, "10 " + getString(cp5.XX0(this.userProfile.getUnit())));
        HashMap<Integer, String> r0 = getDistanceItemData();
        String r2 = getString(R.string.half_horse);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r0.put(4, getMarathonTitle(r2) + getHalfHorse() + " " + getString(cp5.XX0(this.userProfile.getUnit())));
        HashMap<Integer, String> r1 = getDistanceItemData();
        String r4 = getString(R.string.whole_horse);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        r1.put(5, getMarathonTitle(r4) + getWholeHorse() + " " + getString(cp5.XX0(this.userProfile.getUnit())));
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportGoalSetFragment
    public void setInfo() {
        getNowGoalUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
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
        startActivityForResult(new Intent(r1, CustomSportDistanceGoalActivity.class), 123);
    }

    @aa1
    public final String transformHalfWhole(float r4) {
        if (this.userProfile.getUnit() != 1) goto L7;
        return cp5.XIi00iiXO(l76.XO0O10(r4), false);
    L7:
        return cp5.XIi00iiXO(r4, false);
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
        String r6 = "0.0";
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
        int r9 = r8.iX();
        if (r10 == 0) goto L38;
        if (r10 == 1) goto L37;
        if (r10 == 2) goto L36;
        if (r10 == 3) goto L35;
        if (r10 == 4) goto L34;
        if (r10 == 5) goto L33;
        int r11 = 0;
    L39:
        r2[r9] = r11;
        if (this.userProfile.getUnit() != 1) goto L42;
        getGoals()[r8.iX()] = (int) l76.IiI10X(getGoals()[r8.iX()]);
    L42:
        getGoals()[r8.IXXOO()] = 0;
        getGoals()[r8.i010I()] = 0;
        return;
    L33:
        r11 = getWholeGoals();
        goto L39
    L34:
        r11 = getHalfGoals();
        goto L39
    L35:
        r11 = 10000;
        goto L39
    L36:
        r11 = 8000;
        goto L39
    L37:
        r11 = 5000;
        goto L39
    L38:
        r11 = 3000;
    L24:
        r7 = true;
        goto L25
    L10:
        r6 = getWholeHorse();
        goto L16
    L11:
        r6 = getHalfHorse();
        goto L16
    L12:
        r6 = "10.0";
        goto L16
    L13:
        r6 = "8.0";
        goto L16
    L14:
        r6 = "5.0";
        goto L16
    L15:
        r6 = "3.0";
        goto L16
    }
}

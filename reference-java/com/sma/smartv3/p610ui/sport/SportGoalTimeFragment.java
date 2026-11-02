package com.sma.smartv3.p610ui.sport;

import android.content.Intent;
import android.os.Bundle;
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
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra(uz0.iXiiiO) : null;
            Intrinsics.X1ii(serializableExtra, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.Int>");
            Pair pair = (Pair) serializableExtra;
            getNowGoalValue().setText((CharSequence) pair.getFirst());
            getStartExerciseBt().setEnabled(true);
            getGoals()[0] = 0;
            getGoals()[1] = ((Number) pair.getSecond()).intValue();
            getGoals()[2] = 0;
            LogUtils.m11128d("pair -> " + pair);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void setGoalValueItem() {
        getDistanceItemData().put(0, "15 " + getString(R.string.min));
        getDistanceItemData().put(1, "30 " + getString(R.string.min));
        getDistanceItemData().put(2, "40 " + getString(R.string.min));
        getDistanceItemData().put(3, "50 " + getString(R.string.min));
        getDistanceItemData().put(4, "60 " + getString(R.string.min));
        getDistanceItemData().put(5, "120 " + getString(R.string.min));
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void setInfo() {
        getNowGoalUnit().setText(R.string.h_min);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[], java.io.Serializable] */
    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void startExercise() {
        int mArg1 = getMArg1();
        ?? goals = getGoals();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", goals);
        Intent intent = new Intent(getActivity(), (Class<?>) SportOnGoingGpsActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void toCustomerGoal() {
        FragmentActivity activity = getActivity();
        Intrinsics.XXI(activity);
        startActivityForResult(new Intent(activity, (Class<?>) CustomSportTimeGoalActivity.class), 123);
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void updateGoalValue(int i) {
        String str;
        int i2;
        DINCondBold nowGoalValue = getNowGoalValue();
        if (i == 0) {
            str = "00:15";
        } else if (i == 1) {
            str = "00:30";
        } else if (i == 2) {
            str = "00:40";
        } else if (i == 3) {
            str = "00:50";
        } else if (i != 4) {
            str = i != 5 ? "00:00" : "02:00";
        } else {
            str = "01:00";
        }
        nowGoalValue.setText(str);
        getStartExerciseBt().setEnabled(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5);
        int[] goals = getGoals();
        XO0O10 xo0o10 = XO0O10.OXO1;
        goals[xo0o10.m38660iX()] = 0;
        int[] goals2 = getGoals();
        int iIXXOO = xo0o10.IXXOO();
        if (i == 0) {
            i2 = 900;
        } else if (i == 1) {
            i2 = 1800;
        } else if (i == 2) {
            i2 = 2400;
        } else if (i == 3) {
            i2 = 3000;
        } else if (i != 4) {
            i2 = i != 5 ? 0 : 7200;
        } else {
            i2 = 3600;
        }
        goals2[iIXXOO] = i2;
        getGoals()[xo0o10.i010I()] = 0;
    }
}

package com.sma.smartv3.p610ui.sport;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.bykv.p563vk.openvk.preload.falconx.statistic.StatisticData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportGoalCaloriesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalCaloriesFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalCaloriesFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n151#2,5:94\n156#2,5:100\n99#2,7:105\n106#2,3:113\n79#2,7:116\n109#2:123\n1#3:99\n1#3:112\n*S KotlinDebug\n*F\n+ 1 SportGoalCaloriesFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalCaloriesFragment\n*L\n56#1:94,5\n56#1:100,5\n72#1:105,7\n72#1:113,3\n72#1:116,7\n72#1:123\n56#1:99\n72#1:112\n*E\n"})
public final class SportGoalCaloriesFragment extends BaseSportGoalSetFragment {
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
            getGoals()[1] = 0;
            getGoals()[2] = ((Number) pair.getSecond()).intValue();
            LogUtils.m11128d("pair -> " + pair);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void setGoalValueItem() {
        getDistanceItemData().put(0, "100 " + getString(R.string.kcal));
        getDistanceItemData().put(1, "300 " + getString(R.string.kcal));
        getDistanceItemData().put(2, "500 " + getString(R.string.kcal));
        getDistanceItemData().put(3, "700 " + getString(R.string.kcal));
        getDistanceItemData().put(4, "1000 " + getString(R.string.kcal));
        getDistanceItemData().put(5, "1500 " + getString(R.string.kcal));
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void setInfo() {
        getNowGoalUnit().setText(R.string.kcal);
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
        startActivityForResult(new Intent(activity, (Class<?>) CustomSportCaloriesGoalActivity.class), 123);
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void updateGoalValue(int i) {
        String str;
        DINCondBold nowGoalValue = getNowGoalValue();
        if (i == 0) {
            str = StatisticData.ERROR_CODE_NOT_FOUND;
        } else if (i == 1) {
            str = "300";
        } else if (i == 2) {
            str = "500";
        } else if (i == 3) {
            str = "700";
        } else if (i != 4) {
            str = i != 5 ? "0" : "1500";
        } else {
            str = X10i1i.OXO1;
        }
        nowGoalValue.setText(str);
        int i2 = 0;
        getStartExerciseBt().setEnabled(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5);
        int[] goals = getGoals();
        XO0O10 xo0o10 = XO0O10.OXO1;
        goals[xo0o10.m38660iX()] = 0;
        getGoals()[xo0o10.IXXOO()] = 0;
        int[] goals2 = getGoals();
        int iI010I = xo0o10.i010I();
        if (i == 0) {
            i2 = 100;
        } else if (i == 1) {
            i2 = 300;
        } else if (i == 2) {
            i2 = 500;
        } else if (i == 3) {
            i2 = 700;
        } else if (i == 4) {
            i2 = 1000;
        } else if (i == 5) {
            i2 = 1500;
        }
        goals2[iI010I] = i2;
    }
}

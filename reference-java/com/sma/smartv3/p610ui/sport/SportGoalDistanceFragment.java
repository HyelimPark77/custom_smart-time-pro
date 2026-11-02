package com.sma.smartv3.p610ui.sport;

import android.content.Intent;
import android.os.Bundle;
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
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    private final int getHalfGoals() {
        int mArg1 = getMArg1();
        if (mArg1 != 10) {
            return mArg1 != 13 ? 21097 : 15000;
        }
        return 20000;
    }

    private final String getHalfHorse() {
        int mArg1 = getMArg1();
        if (mArg1 != 10) {
            return mArg1 != 13 ? transformHalfWhole(21.0f) : cp5.XIi00iiXO(15.0f, false);
        }
        return cp5.XIi00iiXO(20.0f, false);
    }

    private final String getMarathonTitle(String str) {
        int mArg1 = getMArg1();
        if (mArg1 == 10 || mArg1 == 13) {
            return "";
        }
        return str + " ";
    }

    private final int getWholeGoals() {
        int mArg1 = getMArg1();
        if (mArg1 != 10) {
            return mArg1 != 13 ? 42195 : 30000;
        }
        return 40000;
    }

    private final String getWholeHorse() {
        int mArg1 = getMArg1();
        if (mArg1 != 10) {
            return mArg1 != 13 ? transformHalfWhole(42.1f) : cp5.XIi00iiXO(30.0f, false);
        }
        return cp5.XIi00iiXO(40.0f, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra(uz0.iXiiiO) : null;
            Intrinsics.X1ii(serializableExtra, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.Int>");
            Pair pair = (Pair) serializableExtra;
            getNowGoalValue().setText((CharSequence) pair.getFirst());
            getStartExerciseBt().setEnabled(true);
            getGoals()[0] = ((Number) pair.getSecond()).intValue();
            getGoals()[1] = 0;
            getGoals()[2] = 0;
            LogUtils.m11128d("pair -> " + pair);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void setGoalValueItem() {
        getDistanceItemData().put(0, "3 " + getString(cp5.XX0(this.userProfile.getUnit())));
        getDistanceItemData().put(1, "5 " + getString(cp5.XX0(this.userProfile.getUnit())));
        getDistanceItemData().put(2, "8 " + getString(cp5.XX0(this.userProfile.getUnit())));
        getDistanceItemData().put(3, "10 " + getString(cp5.XX0(this.userProfile.getUnit())));
        HashMap<Integer, String> distanceItemData = getDistanceItemData();
        String string = getString(R.string.half_horse);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        distanceItemData.put(4, getMarathonTitle(string) + getHalfHorse() + " " + getString(cp5.XX0(this.userProfile.getUnit())));
        HashMap<Integer, String> distanceItemData2 = getDistanceItemData();
        String string2 = getString(R.string.whole_horse);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        distanceItemData2.put(5, getMarathonTitle(string2) + getWholeHorse() + " " + getString(cp5.XX0(this.userProfile.getUnit())));
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void setInfo() {
        getNowGoalUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
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
        startActivityForResult(new Intent(activity, (Class<?>) CustomSportDistanceGoalActivity.class), 123);
    }

    @aa1
    public final String transformHalfWhole(float f) {
        return this.userProfile.getUnit() == 1 ? cp5.XIi00iiXO(l76.XO0O10(f), false) : cp5.XIi00iiXO(f, false);
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportGoalSetFragment
    public void updateGoalValue(int i) {
        String halfHorse;
        int halfGoals;
        DINCondBold nowGoalValue = getNowGoalValue();
        if (i == 0) {
            halfHorse = "3.0";
        } else if (i == 1) {
            halfHorse = "5.0";
        } else if (i == 2) {
            halfHorse = "8.0";
        } else if (i == 3) {
            halfHorse = "10.0";
        } else if (i != 4) {
            halfHorse = i != 5 ? "0.0" : getWholeHorse();
        } else {
            halfHorse = getHalfHorse();
        }
        nowGoalValue.setText(halfHorse);
        getStartExerciseBt().setEnabled(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5);
        int[] goals = getGoals();
        XO0O10 xo0o10 = XO0O10.OXO1;
        int iM38660iX = xo0o10.m38660iX();
        if (i == 0) {
            halfGoals = 3000;
        } else if (i == 1) {
            halfGoals = 5000;
        } else if (i == 2) {
            halfGoals = 8000;
        } else if (i == 3) {
            halfGoals = 10000;
        } else if (i != 4) {
            halfGoals = i != 5 ? 0 : getWholeGoals();
        } else {
            halfGoals = getHalfGoals();
        }
        goals[iM38660iX] = halfGoals;
        if (this.userProfile.getUnit() == 1) {
            getGoals()[xo0o10.m38660iX()] = (int) l76.IiI10X(getGoals()[xo0o10.m38660iX()]);
        }
        getGoals()[xo0o10.IXXOO()] = 0;
        getGoals()[xo0o10.i010I()] = 0;
    }
}

package com.sma.smartv3.p610ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p610ui.sport.CustomSportDistanceGoalActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCustomSportDistanceGoalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSportDistanceGoalActivity.kt\ncom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,80:1\n19#2:81\n15#2:82\n*S KotlinDebug\n*F\n+ 1 CustomSportDistanceGoalActivity.kt\ncom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity\n*L\n27#1:81\n27#1:82\n*E\n"})
public final class CustomSportDistanceGoalActivity extends BaseCustomSportGoalActivity {

    @aa1
    private final Lazy distance1Et$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI1111I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportDistanceGoalActivity.distance1Et_delegate$lambda$0(this.f7817IO);
        }
    });

    @aa1
    private final Lazy distance2Et$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO0iiOX1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportDistanceGoalActivity.distance2Et_delegate$lambda$0(this.f8017IO);
        }
    });

    @aa1
    private final Lazy distance3Et$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO0OI01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportDistanceGoalActivity.distance3Et_delegate$lambda$0(this.f4669IO);
        }
    });

    @aa1
    private final Lazy tvDistanceUtil$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXO1XO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportDistanceGoalActivity.tvDistanceUtil_delegate$lambda$0(this.f5051IO);
        }
    });

    @aa1
    private final AppUser userProfile;

    public CustomSportDistanceGoalActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText distance1Et_delegate$lambda$0(CustomSportDistanceGoalActivity customSportDistanceGoalActivity) {
        return (EditText) customSportDistanceGoalActivity.findViewById(R.id.distance1Et);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText distance2Et_delegate$lambda$0(CustomSportDistanceGoalActivity customSportDistanceGoalActivity) {
        return (EditText) customSportDistanceGoalActivity.findViewById(R.id.distance2Et);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText distance3Et_delegate$lambda$0(CustomSportDistanceGoalActivity customSportDistanceGoalActivity) {
        return (EditText) customSportDistanceGoalActivity.findViewById(R.id.distance3Et);
    }

    private final TextView getTvDistanceUtil() {
        return (TextView) this.tvDistanceUtil$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDistanceUtil_delegate$lambda$0(CustomSportDistanceGoalActivity customSportDistanceGoalActivity) {
        return (TextView) customSportDistanceGoalActivity.findViewById(R.id.distanceUnit);
    }

    public final EditText getDistance1Et() {
        return (EditText) this.distance1Et$delegate.getValue();
    }

    public final EditText getDistance2Et() {
        return (EditText) this.distance2Et$delegate.getValue();
    }

    public final EditText getDistance3Et() {
        return (EditText) this.distance3Et$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseCustomSportGoalActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.custom_distance);
        EditText distance1Et = getDistance1Et();
        EditText distance1Et2 = getDistance1Et();
        Intrinsics.O10IXXX0X(distance1Et2, "<get-distance1Et>(...)");
        EditText distance1Et3 = getDistance1Et();
        Intrinsics.O10IXXX0X(distance1Et3, "<get-distance1Et>(...)");
        EditText distance2Et = getDistance2Et();
        Intrinsics.O10IXXX0X(distance2Et, "<get-distance2Et>(...)");
        distance1Et.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, distance1Et2, distance1Et3, distance2Et, false, 8, null));
        EditText distance2Et2 = getDistance2Et();
        EditText distance1Et4 = getDistance1Et();
        Intrinsics.O10IXXX0X(distance1Et4, "<get-distance1Et>(...)");
        EditText distance2Et3 = getDistance2Et();
        Intrinsics.O10IXXX0X(distance2Et3, "<get-distance2Et>(...)");
        EditText distance3Et = getDistance3Et();
        Intrinsics.O10IXXX0X(distance3Et, "<get-distance3Et>(...)");
        distance2Et2.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, distance1Et4, distance2Et3, distance3Et, false, 8, null));
        EditText distance3Et2 = getDistance3Et();
        EditText distance2Et4 = getDistance2Et();
        Intrinsics.O10IXXX0X(distance2Et4, "<get-distance2Et>(...)");
        EditText distance3Et3 = getDistance3Et();
        Intrinsics.O10IXXX0X(distance3Et3, "<get-distance3Et>(...)");
        EditText distance3Et4 = getDistance3Et();
        Intrinsics.O10IXXX0X(distance3Et4, "<get-distance3Et>(...)");
        distance3Et2.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, distance2Et4, distance3Et3, distance3Et4, false, 8, null));
        getTvDistanceUtil().setText(getString(cp5.XX0(this.userProfile.getUnit())));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_custom_sport_distance_goal;
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseCustomSportGoalActivity
    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        String string = getDistance1Et().getText().toString();
        String string2 = getDistance2Et().getText().toString();
        String string3 = getDistance3Et().getText().toString();
        if (string.length() == 0) {
            string = "0";
        }
        if (string2.length() == 0) {
            string2 = "0";
        }
        if (string3.length() == 0) {
            string3 = "0";
        }
        int iIiI10X = (Integer.parseInt(string) * 10000) + (Integer.parseInt(string2) * 1000) + (Integer.parseInt(string3) * 100);
        float f = iIiI10X;
        String strIX1O1 = cp5.iX1O1(f / 1000.0f, true);
        if (this.userProfile.getUnit() == 1) {
            iIiI10X = (int) l76.IiI10X(f);
        }
        if (iIiI10X == 0) {
            ToastUtils.showLong(getString(R.string.no_content_set_key), new Object[0]);
        } else {
            setResult(-1, new Intent().putExtra(uz0.iXiiiO, new Pair(strIX1O1, Integer.valueOf(iIiI10X))));
            finish();
        }
    }
}

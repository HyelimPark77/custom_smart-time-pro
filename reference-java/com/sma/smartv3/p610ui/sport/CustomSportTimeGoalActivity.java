package com.sma.smartv3.p610ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.p610ui.sport.CustomSportTimeGoalActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomSportTimeGoalActivity extends BaseCustomSportGoalActivity {

    @aa1
    private final Lazy time1Et$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO0XOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportTimeGoalActivity.time1Et_delegate$lambda$0(this.f1736IO);
        }
    });

    @aa1
    private final Lazy time2Et$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi10iOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportTimeGoalActivity.time2Et_delegate$lambda$0(this.f3652IO);
        }
    });

    @aa1
    private final Lazy time3Et$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIX10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportTimeGoalActivity.time3Et_delegate$lambda$0(this.f3032IO);
        }
    });

    @aa1
    private final Lazy time4Et$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOXOXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportTimeGoalActivity.time4Et_delegate$lambda$0(this.f4869IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText time1Et_delegate$lambda$0(CustomSportTimeGoalActivity customSportTimeGoalActivity) {
        return (EditText) customSportTimeGoalActivity.findViewById(R.id.time1Et);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText time2Et_delegate$lambda$0(CustomSportTimeGoalActivity customSportTimeGoalActivity) {
        return (EditText) customSportTimeGoalActivity.findViewById(R.id.time2Et);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText time3Et_delegate$lambda$0(CustomSportTimeGoalActivity customSportTimeGoalActivity) {
        return (EditText) customSportTimeGoalActivity.findViewById(R.id.time3Et);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText time4Et_delegate$lambda$0(CustomSportTimeGoalActivity customSportTimeGoalActivity) {
        return (EditText) customSportTimeGoalActivity.findViewById(R.id.time4Et);
    }

    public final EditText getTime1Et() {
        return (EditText) this.time1Et$delegate.getValue();
    }

    public final EditText getTime2Et() {
        return (EditText) this.time2Et$delegate.getValue();
    }

    public final EditText getTime3Et() {
        return (EditText) this.time3Et$delegate.getValue();
    }

    public final EditText getTime4Et() {
        return (EditText) this.time4Et$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseCustomSportGoalActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.custom_duration);
        EditText time1Et = getTime1Et();
        EditText time1Et2 = getTime1Et();
        Intrinsics.O10IXXX0X(time1Et2, "<get-time1Et>(...)");
        EditText time1Et3 = getTime1Et();
        Intrinsics.O10IXXX0X(time1Et3, "<get-time1Et>(...)");
        EditText time2Et = getTime2Et();
        Intrinsics.O10IXXX0X(time2Et, "<get-time2Et>(...)");
        time1Et.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, time1Et2, time1Et3, time2Et, false, 8, null));
        EditText time2Et2 = getTime2Et();
        EditText time1Et4 = getTime1Et();
        Intrinsics.O10IXXX0X(time1Et4, "<get-time1Et>(...)");
        EditText time2Et3 = getTime2Et();
        Intrinsics.O10IXXX0X(time2Et3, "<get-time2Et>(...)");
        EditText time3Et = getTime3Et();
        Intrinsics.O10IXXX0X(time3Et, "<get-time3Et>(...)");
        time2Et2.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, time1Et4, time2Et3, time3Et, false, 8, null));
        EditText time3Et2 = getTime3Et();
        EditText time2Et4 = getTime2Et();
        Intrinsics.O10IXXX0X(time2Et4, "<get-time2Et>(...)");
        EditText time3Et3 = getTime3Et();
        Intrinsics.O10IXXX0X(time3Et3, "<get-time3Et>(...)");
        EditText time4Et = getTime4Et();
        Intrinsics.O10IXXX0X(time4Et, "<get-time4Et>(...)");
        time3Et2.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, time2Et4, time3Et3, time4Et, false, 8, null));
        EditText time4Et2 = getTime4Et();
        EditText time3Et4 = getTime3Et();
        Intrinsics.O10IXXX0X(time3Et4, "<get-time3Et>(...)");
        EditText time4Et3 = getTime4Et();
        Intrinsics.O10IXXX0X(time4Et3, "<get-time4Et>(...)");
        EditText time4Et4 = getTime4Et();
        Intrinsics.O10IXXX0X(time4Et4, "<get-time4Et>(...)");
        time4Et2.setOnKeyListener(BaseCustomSportGoalActivity.setKeyListener$default(this, time3Et4, time4Et3, time4Et4, false, 8, null));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_custom_sport_time_goal;
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseCustomSportGoalActivity
    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        String string = getTime1Et().getText().toString();
        String string2 = getTime2Et().getText().toString();
        String string3 = getTime3Et().getText().toString();
        String string4 = getTime4Et().getText().toString();
        if (string.length() == 0) {
            string = "0";
        }
        if (string2.length() == 0) {
            string2 = "0";
        }
        if (string3.length() == 0) {
            string3 = "0";
        }
        if (string4.length() == 0) {
            string4 = "0";
        }
        String str = string + string2 + CertificateUtil.DELIMITER + string3 + string4;
        int i = (Integer.parseInt(string) * 36000) + (Integer.parseInt(string2) * 3600) + (Integer.parseInt(string3) * 600) + (Integer.parseInt(string4) * 60);
        if (i == 0) {
            ToastUtils.showLong(getString(R.string.no_content_set_key), new Object[0]);
        } else {
            setResult(-1, new Intent().putExtra(uz0.iXiiiO, new Pair(str, Integer.valueOf(i))));
            finish();
        }
    }
}

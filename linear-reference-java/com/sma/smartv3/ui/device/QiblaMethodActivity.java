package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a92;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesCalculationMethod;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaMethodActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaMethodActivity.kt\ncom/sma/smartv3/ui/device/QiblaMethodActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,58:1\n18#2,2:59\n15#2:61\n*S KotlinDebug\n*F\n+ 1 QiblaMethodActivity.kt\ncom/sma/smartv3/ui/device/QiblaMethodActivity\n*L\n19#1:59,2\n19#1:61\n*E\n"})
public final class QiblaMethodActivity extends BaseListActivity<PrayerTimesCalculationMethod> {

    @aa1
    public static final OXO1 Companion = null;
    public static final int PICKER_REQUEST = 99;

    @aa1
    private final PrayerTimeSettings mSettings;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public QiblaMethodActivity() {
        SPUtils r0 = a01.OXO1.OXO1();
        Object r1 = new Gson().fromJson(r0.getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
        if (r1 != null) goto L5;
        r1 = PrayerTimeSettings.class.newInstance();
    L5:
        this.mSettings = (PrayerTimeSettings) r1;
    }

    public static /* synthetic */ void OIX0iXi(ug6 r0, QiblaMethodActivity r1, PrayerTimesCalculationMethod r2, View r3) {
        initItem$lambda$0(r0, r1, r2, r3);
    }

    private static final void initItem$lambda$0(ug6 r0, QiblaMethodActivity r1, PrayerTimesCalculationMethod r2, View r3) {
        ((AppCompatRadioButton) r0.O00(R.id.rbSelectedState)).setChecked(true);
        r1.setResult(-1, new Intent().putExtra("method", r2));
        r1.finish();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        i1O0OXO1O.OXO1.OXO1("mSettings -> " + this.mSettings);
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (PrayerTimesCalculationMethod) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<PrayerTimesCalculationMethod> initList() {
        return CollectionsKt___CollectionsKt.OO0Oi10(PrayerTimesCalculationMethod.Companion.getMethods());
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.qibla_calculation_method);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.layout_qibla_method_item;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_qibla_method;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void initItem(@aa1 final ug6 r6, @aa1 final PrayerTimesCalculationMethod r7, int r8) {
        Intrinsics.X0O(r6, "holder");
        Intrinsics.X0O(r7, MapController.ITEM_LAYER_TAG);
        ((TextView) r6.O00(R.id.tv_name)).setText(r7.getName());
        ((TextView) r6.O00(R.id.tv_fajr)).setText("Fair:" + r7.getFajrAngle() + "°");
        ((TextView) r6.O00(R.id.tv_isha)).setText("lsha'a: " + r7.getIshaAngle() + "°");
        AppCompatRadioButton r9 = (AppCompatRadioButton) r6.O00(R.id.rbSelectedState);
        if (this.mSettings.getCalculationMethod() != r7.getMethod()) goto L5;
        boolean r0 = true;
    L6:
        r9.setChecked(r0);
        r6.XIi00iiXO().setOnClickListener(new a92(r6, this, r7));
        return;
    L5:
        r0 = false;
        goto L6
    }
}

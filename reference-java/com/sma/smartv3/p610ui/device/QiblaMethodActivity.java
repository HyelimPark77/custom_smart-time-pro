package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.google.gson.Gson;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesCalculationMethod;
import com.sma.smartv3.p610ui.device.QiblaMethodActivity;
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
    public static final OXO1 Companion = new OXO1(null);
    public static final int PICKER_REQUEST = 99;

    @aa1
    private final PrayerTimeSettings mSettings;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public QiblaMethodActivity() {
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
        this.mSettings = (PrayerTimeSettings) (objFromJson == null ? PrayerTimeSettings.class.newInstance() : objFromJson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$0(ug6 ug6Var, QiblaMethodActivity qiblaMethodActivity, PrayerTimesCalculationMethod prayerTimesCalculationMethod, View view) {
        ((AppCompatRadioButton) ug6Var.O00(R.id.rbSelectedState)).setChecked(true);
        qiblaMethodActivity.setResult(-1, new Intent().putExtra("method", prayerTimesCalculationMethod));
        qiblaMethodActivity.finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        i1O0OXO1O.OXO1.OXO1("mSettings -> " + this.mSettings);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<PrayerTimesCalculationMethod> initList() {
        return CollectionsKt___CollectionsKt.OO0Oi10(PrayerTimesCalculationMethod.Companion.getMethods());
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.qibla_calculation_method);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.layout_qibla_method_item;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_qibla_method;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 final ug6 holder, @aa1 final PrayerTimesCalculationMethod item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        ((TextView) holder.O00(R.id.tv_name)).setText(item.getName());
        ((TextView) holder.O00(R.id.tv_fajr)).setText("Fair:" + item.getFajrAngle() + "°");
        ((TextView) holder.O00(R.id.tv_isha)).setText("lsha'a: " + item.getIshaAngle() + "°");
        ((AppCompatRadioButton) holder.O00(R.id.rbSelectedState)).setChecked(this.mSettings.getCalculationMethod() == item.getMethod());
        holder.XIi00iiXO().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.a92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QiblaMethodActivity.initItem$lambda$0(holder, this, item, view);
            }
        });
    }
}

package com.sma.smartv3.ui.me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.O0Oiii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.fj;
import com.android.mltcode.paycertificationapi.gj;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hj;
import com.android.mltcode.paycertificationapi.ij;
import com.android.mltcode.paycertificationapi.jj;
import com.android.mltcode.paycertificationapi.kj;
import com.android.mltcode.paycertificationapi.lj;
import com.android.mltcode.paycertificationapi.mj;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.LanguageRepairRActivity;
import com.sma.smartv3.ui.device.LanguageRepairSmaActivity;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.Languages;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLanguageListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageListActivity.kt\ncom/sma/smartv3/ui/me/LanguageListActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n11#2,2:125\n87#3,7:127\n94#3,3:135\n70#3,7:138\n97#3:145\n87#3,7:146\n94#3,3:154\n70#3,7:157\n97#3:164\n1#4:134\n1#4:153\n*S KotlinDebug\n*F\n+ 1 LanguageListActivity.kt\ncom/sma/smartv3/ui/me/LanguageListActivity\n*L\n85#1:125,2\n91#1:127,7\n91#1:135,3\n91#1:138,7\n91#1:145\n95#1:146,7\n95#1:154,3\n95#1:157,7\n95#1:164\n91#1:134\n95#1:153\n*E\n"})
public final class LanguageListActivity extends BaseDSLRecyclerActivity {
    private final String defaultLanguage;

    @tb1
    private go0 mRepairPopup;

    @aa1
    private final Lazy rootView$delegate;

    public static final class OXO1 implements O0Oiii<ExtraPackageData[]> {
        public final /* synthetic */ LanguageListActivity OXO1;

        public OXO1(LanguageListActivity r1) {
            this.OXO1 = r1;
        }

        public void OXO1(ExtraPackageData[] r2) {
            if (r2 != null) goto L4;
            return;
        L4:
            if (r2.length != 0) goto L6;
            boolean r0 = true;
        L7:
            if (r0 == true) goto L11;
            LanguageListActivity.access$showData(this.OXO1, r2);
            return;
        L11:
            return;
        L6:
            r0 = false;
            goto L7
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r2) {
            Intrinsics.X0O(r2, "error");
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(ExtraPackageData[] r1) {
            OXO1(r1);
        }
    }

    public LanguageListActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new fj(this));
        this.defaultLanguage = Locale.getDefault().getLanguage();
    }

    public static /* synthetic */ Unit I0iXXO(ExtraPackageData[] r0, LanguageListActivity r1, DslAdapter r2) {
        return showData$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean I1XOi1(LanguageListActivity r0, View r1) {
        return showData$lambda$0$0$0$0$1$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(LanguageListActivity r0, ExtraPackageData r1, DslAdapterItem r2) {
        return showData$lambda$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit O10IXXX0X(LanguageListActivity r0, ExtraPackageData[] r1) {
        return showData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ LinearLayout X0O(LanguageListActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(ExtraPackageData r0, LanguageListActivity r1, View r2) {
        return showData$lambda$0$0$0$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit XXI(LanguageListActivity r0, ExtraPackageData r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showData$lambda$0$0$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit XiOIO(LanguageListActivity r0, ExtraPackageData[] r1, DslAdapter r2) {
        return showData$lambda$0(r0, r1, r2);
    }

    public static final /* synthetic */ void access$showData(LanguageListActivity r0, ExtraPackageData[] r1) {
        r0.showData(r1);
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) getValue();
    }

    private static final LinearLayout rootView_delegate$lambda$0(LanguageListActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.root_view);
    }

    private final void showData(final ExtraPackageData[] r2) {
        renderAdapter(new ij(this, r2));
    }

    private static final Unit showData$lambda$0(final LanguageListActivity r1, final ExtraPackageData[] r2, DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r1.getDslViewHolder().post(new lj(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(final LanguageListActivity r1, final ExtraPackageData[] r2) {
        r1.renderAdapter(new gj(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0(ExtraPackageData[] r5, final LanguageListActivity r6, DslAdapter r7) {
        Intrinsics.X0O(r7, "$this$renderAdapter");
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        final ExtraPackageData r2 = r5[r1];
        if (r2.getType() == 3) goto L7;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_language_select, new mj(r6, r2));
    L7:
        r1 = r1 + 1;
        goto L3
    L9:
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0(final LanguageListActivity r1, final ExtraPackageData r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new jj(r1, r2));
        r3.setItemClick(new kj(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0$0(LanguageListActivity r1, ExtraPackageData r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "<unused var>");
        Intrinsics.X0O(r6, "<unused var>");
        r1.getResources().getConfiguration().setLocale(Languages.codeToLanguage$default(Languages.INSTANCE, r2.getType(), null, 2, null));
        TextView r7 = r3.tv(R.id.languageName);
        if (r7 == null) goto L5;
        r7.setText(r1.getResources().getConfiguration().locale.getDisplayName());
    L5:
        r1.getResources().getConfiguration().setLocale(new Locale(r1.defaultLanguage));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0$1(ExtraPackageData r4, final LanguageListActivity r5, final View r6) {
        Intrinsics.X0O(r6, "it");
        a01.OXO1.XO0O10().put(ExtraPackageData.class.getName(), new Gson().toJson(r4));
        go0 r7 = new go0(r5.getMContext(), 0, 2, null);
        r7.O1O(R.string.language_repair_remind);
        go0.X11iII1O1(r7, Integer.valueOf(R.string.cancel), null, 2, null);
        r7.X1IX(R.string.confirm, new hj(r5, r6));
        r5.mRepairPopup = r7;
        LinearLayout r8 = r5.getRootView();
        Intrinsics.O10IXXX0X(r8, "<get-rootView>(...)");
        r7.I1XOi1(r8);
        return Unit.OXO1;
    }

    private static final boolean showData$lambda$0$0$0$0$1$0$0(LanguageListActivity r8, View r9) {
        int r0 = q62.OXO1.Xi1i0XOX0();
        if (r0 == 0) goto L7;
        if (r0 == 1) goto L6;
        ToastUtils.showLong(R.string.stay_tuned);
    L8:
        return true;
    L6:
        String r10 = ((PFMedium) r9.findViewById(R.id.languageName)).getText().toString();
        int r1 = r8.getMArg1();
        Bundle r5 = new Bundle();
        r5.putString("mArg0", r10);
        r5.putInt("mArg1", r1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r11 = new Intent(r8, LanguageRepairSmaActivity.class);
        r11.putExtras(r5);
        r8.startActivity(r11);
        goto L8
    L7:
        String r12 = ((PFMedium) r9.findViewById(R.id.languageName)).getText().toString();
        int r2 = r8.getMArg1();
        Bundle r6 = new Bundle();
        r6.putString("mArg0", r12);
        r6.putInt("mArg1", r2);
        r6.putParcelable("mArg2", null);
        r6.putSerializable("mArg3", null);
        Intent r13 = new Intent(r8, LanguageRepairRActivity.class);
        r13.putExtras(r6);
        r8.startActivity(r13);
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(getMArg1());
        DeviceInfoChecker.XiOIii1(DeviceInfoChecker.OXO1, new OXO1(this), null, 2, null);
        getRecyclerView().setHasFixedSize(false);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_language_list;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(1, 1));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}

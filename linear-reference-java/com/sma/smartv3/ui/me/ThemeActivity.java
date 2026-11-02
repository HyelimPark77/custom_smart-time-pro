package com.sma.smartv3.ui.me;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aq5;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bq5;
import com.android.mltcode.paycertificationapi.cq5;
import com.android.mltcode.paycertificationapi.dq5;
import com.android.mltcode.paycertificationapi.ek4;
import com.android.mltcode.paycertificationapi.eq5;
import com.android.mltcode.paycertificationapi.fq5;
import com.android.mltcode.paycertificationapi.gq5;
import com.android.mltcode.paycertificationapi.hq5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iq5;
import com.android.mltcode.paycertificationapi.jq5;
import com.android.mltcode.paycertificationapi.kq5;
import com.android.mltcode.paycertificationapi.lq5;
import com.android.mltcode.paycertificationapi.mq5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yp5;
import com.android.mltcode.paycertificationapi.zp5;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.ad.ADPAdError;
import com.sma.smartv3.biz.ad.ADPAdListener;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ad.ADPAdContainerView;
import com.sma.smartv3.view.ad.ADPCAdContainerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class ThemeActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG;
    private long adapterPostDelay;
    private final int nowTheme;

    public static final class OXO1 extends ADPCAdListener {
        public final /* synthetic */ ThemeActivity OXO1;

        public OXO1(ThemeActivity r1) {
            this.OXO1 = r1;
        }

        public void onADError(ADPCAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
        }

        public void onADPresent(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Exposure");
        }

        public void onADReceive(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
        }
    }

    public static final class XIi00iiXO extends ADPAdListener {
        public final /* synthetic */ ThemeActivity OXO1;

        public XIi00iiXO(ThemeActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdFailed(ADPAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdLoaded(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdOpen(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Exposure");
        }
    }

    public ThemeActivity() {
        this.TAG = "Theme";
        this.nowTheme = a01.OXO1.OXO1().getInt(b01.X0O, 0);
        if (i72.OXO1.IX0iIX() == false) goto L5;
        long r0 = 200;
    L6:
        this.adapterPostDelay = r0;
        return;
    L5:
        r0 = 50;
        goto L6
    }

    public static /* synthetic */ Unit I0iXXO(DslAdapterItem r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$1$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit I1(ThemeActivity r0) {
        return onInitBaseLayoutAfter$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(ThemeActivity r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(ThemeActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(DslAdapterItem r0, ThemeActivity r1, View r2) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit OII(DslAdapterItem r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit OX(DslAdapterItem r0, ThemeActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return onInitBaseLayoutAfter$lambda$0$0$0$3$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit OiIIX101O(ThemeActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$1(r0, r1);
    }

    public static /* synthetic */ Unit X0O(DslAdapterItem r0, ThemeActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return onInitBaseLayoutAfter$lambda$0$0$0$2$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit X1ii(DslAdapterItem r0, ThemeActivity r1, View r2) {
        return onInitBaseLayoutAfter$lambda$0$0$0$1$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit XX0(DslAdapterItem r0, ThemeActivity r1, View r2) {
        return onInitBaseLayoutAfter$lambda$0$0$0$2$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit XXI(ThemeActivity r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIO(ThemeActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$2(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(DslAdapterItem r0, ThemeActivity r1, View r2) {
        return onInitBaseLayoutAfter$lambda$0$0$0$3$1(r0, r1, r2);
    }

    public static final /* synthetic */ String access$getTAG$p(ThemeActivity r0) {
        return r0.TAG;
    }

    public static /* synthetic */ Unit iIiiO(ThemeActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$3(r0, r1);
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0(final ThemeActivity r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        r4.getItemSelectorHelper().X11iII1O1(1);
        DslAdapter.setAdapterStatus$default(r4, 2, null, 2, null);
        r3.getDslViewHolder().postDelay(r3.adapterPostDelay, new dq5(r3));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0(final ThemeActivity r1) {
        r1.renderAdapter(new yp5(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0(final ThemeActivity r2, DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        DslAdapterExKt.O10IXXX0X(r3, R.layout.item_theme, new jq5(r2));
        DslAdapterExKt.O10IXXX0X(r3, R.layout.item_theme, new kq5(r2));
        DslAdapterExKt.O10IXXX0X(r3, R.layout.item_theme, new lq5(r2));
        DslAdapterExKt.O10IXXX0X(r3, R.layout.item_theme, new mq5(r2));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0(final ThemeActivity r1, final DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemIsSelected(r1.isThemeSelect(0));
        r2.setItemBindOverride(new hq5(r2));
        r2.setItemClick(new iq5(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$0(DslAdapterItem r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        ImageView r5 = r1.img(R.id.isSelectIv);
        if (r5 != null) goto L5;
    L9:
        TextView r6 = r1.tv(R.id.themeTv);
        if (r6 == null) goto L12;
        r6.setText(r6.getContext().getString(R.string.follow_theme));
        r6.setTextColor(r6.getResources().getColor(R.color.line_color));
    L12:
        View r7 = r1.view(R.id.themeRl);
        if (r7 == null) goto L16;
        r7.setBackgroundResource(R.drawable.pic_theme_system);
    L16:
        return Unit.OXO1;
    L5:
        if (r0.getItemIsSelected() == false) goto L7;
        int r8 = 0;
    L8:
        r5.setVisibility(r8);
        goto L9
    L7:
        r8 = 8;
        goto L8
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$1(DslAdapterItem r3, ThemeActivity r4, View r5) {
        Intrinsics.X0O(r5, "it");
        if (r3.getItemIsSelected() == true) goto L6;
        DslAdapterItem.updateItemSelector$default(r3, !r3.getItemIsSelected(), false, 2, null);
        r4.updateTheme(0);
    L6:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1(final ThemeActivity r1, final DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemIsSelected(r1.isThemeSelect(1));
        r2.setItemBindOverride(new eq5(r2));
        r2.setItemClick(new fq5(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1$0(DslAdapterItem r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        ImageView r5 = r1.img(R.id.isSelectIv);
        if (r5 != null) goto L5;
    L9:
        TextView r6 = r1.tv(R.id.themeTv);
        if (r6 == null) goto L12;
        r6.setText(r6.getContext().getString(R.string.dark_theme));
        r6.setTextColor(r6.getResources().getColor(R.color.line_color));
    L12:
        View r7 = r1.view(R.id.themeRl);
        if (r7 == null) goto L16;
        r7.setBackgroundResource(R.drawable.pic_theme_dark);
    L16:
        return Unit.OXO1;
    L5:
        if (r0.getItemIsSelected() == false) goto L7;
        int r8 = 0;
    L8:
        r5.setVisibility(r8);
        goto L9
    L7:
        r8 = 8;
        goto L8
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1$1(DslAdapterItem r4, ThemeActivity r5, View r6) {
        Intrinsics.X0O(r6, "it");
        if (r4.getItemIsSelected() == true) goto L6;
        DslAdapterItem.updateItemSelector$default(r4, !r4.getItemIsSelected(), false, 2, null);
        r5.updateTheme(1);
    L6:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2(final ThemeActivity r1, final DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new bq5(r2, r1));
        r2.setItemClick(new cq5(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2$0(DslAdapterItem r0, ThemeActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        r0.setItemIsSelected(r1.isThemeSelect(2));
        ImageView r6 = r2.img(R.id.isSelectIv);
        if (r6 != null) goto L5;
    L9:
        TextView r7 = r2.tv(R.id.themeTv);
        if (r7 == null) goto L12;
        r7.setText(r7.getContext().getString(R.string.light_theme));
        r7.setTextColor(r7.getResources().getColor(R.color.line_color));
    L12:
        View r8 = r2.view(R.id.themeRl);
        if (r8 == null) goto L16;
        r8.setBackgroundResource(R.drawable.pic_theme_light);
    L16:
        return Unit.OXO1;
    L5:
        if (r0.getItemIsSelected() == false) goto L7;
        int r9 = 0;
    L8:
        r6.setVisibility(r9);
        goto L9
    L7:
        r9 = 8;
        goto L8
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2$1(DslAdapterItem r3, ThemeActivity r4, View r5) {
        Intrinsics.X0O(r5, "it");
        if (r3.getItemIsSelected() == true) goto L6;
        DslAdapterItem.updateItemSelector$default(r3, !r3.getItemIsSelected(), false, 2, null);
        r4.updateTheme(2);
    L6:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3(final ThemeActivity r1, final DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new zp5(r2, r1));
        r2.setItemClick(new aq5(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3$0(DslAdapterItem r0, ThemeActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        r0.setItemIsSelected(r1.isThemeSelect(3));
        ImageView r6 = r2.img(R.id.isSelectIv);
        if (r6 != null) goto L5;
    L9:
        TextView r7 = r2.tv(R.id.themeTv);
        if (r7 == null) goto L12;
        r7.setText(r7.getContext().getString(R.string.brown_black_theme));
        r7.setTextColor(r7.getResources().getColor(R.color.line_color));
    L12:
        View r8 = r2.view(R.id.themeRl);
        if (r8 == null) goto L16;
        r8.setBackgroundResource(R.drawable.pic_theme_brown_black);
    L16:
        return Unit.OXO1;
    L5:
        if (r0.getItemIsSelected() == false) goto L7;
        int r9 = 0;
    L8:
        r6.setVisibility(r9);
        goto L9
    L7:
        r9 = 8;
        goto L8
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3$1(DslAdapterItem r3, ThemeActivity r4, View r5) {
        Intrinsics.X0O(r5, "it");
        if (r3.getItemIsSelected() == true) goto L6;
        DslAdapterItem.updateItemSelector$default(r3, !r3.getItemIsSelected(), false, 2, null);
        r4.updateTheme(3);
    L6:
        return Unit.OXO1;
    }

    public final long getAdapterPostDelay() {
        return this.adapterPostDelay;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.switch_theme);
        i72 r0 = i72.OXO1;
        if (r0.IX0iIX() == false) goto L9;
        ADPCAdContainerView r3 = (ADPCAdContainerView) findViewById(R.id.adpcAdContainerView);
        if (r3 == null) goto L14;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + r3.getAdUnitId());
        r3.setAdListener(new OXO1(this));
        ADPCAdContainerView.loadAdView$default(r3, null, 0, false, null, 15, null);
        return;
    L14:
        return;
    L9:
        if (r0.IOi1O0() == false) goto L15;
        ADPAdContainerView r4 = (ADPAdContainerView) findViewById(R.id.adpAdContainerView);
        if (r4 == null) goto L16;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + r4.getAdUnitId());
        r4.setAdListener(new XIi00iiXO(this));
        ADPAdContainerView.loadAdView$default(r4, null, 0, false, null, 15, null);
        return;
    L16:
        return;
    }

    public boolean isThemeSelect(int r4) {
        if (r4 != a01.OXO1.OXO1().getInt(b01.X0O, 0)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_theme;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        super.onHandleBackPressed();
        onTitleLeftClick(getRecyclerView());
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        renderAdapter(new gq5(this));
    }

    public final void onTitleLeftClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (a01.OXO1.OXO1().getInt(b01.X0O, 0) == this.nowTheme) goto L5;
        ToastUtils.showLong(R.string.reboot_app_show_new_view);
        I01XX0.XIi00iiXO(I01XX0.XXiIiX10, null, 2, null);
    L5:
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

    public final void setAdapterPostDelay(long r1) {
        this.adapterPostDelay = r1;
    }

    public final void updateTheme(int r4) {
        a01.OXO1.OXO1().put(b01.X0O, r4);
        if (r4 != 0) goto L5;
        setTheme();
        if (Build.VERSION.SDK_INT >= 29) goto L21;
        ToastUtils.showLong(R.string.system_no_support_switch);
        return;
    L21:
        return;
    L5:
        if (r4 != 1) goto L7;
        ek4.IIX1OXO().O1O();
        return;
    L7:
        if (r4 != 2) goto L9;
        ek4.IIX1OXO().iOO1ii1("light", null, 1);
        return;
    L9:
        if (r4 != 3) goto L22;
        ek4.IIX1OXO().iOO1ii1("brown_black", null, 1);
        return;
    }
}

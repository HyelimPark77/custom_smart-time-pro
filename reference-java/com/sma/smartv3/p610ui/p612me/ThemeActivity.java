package com.sma.smartv3.p610ui.p612me;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ek4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.biz.p242ad.ADPAdError;
import com.sma.smartv3.biz.p242ad.ADPAdListener;
import com.sma.smartv3.p610ui.p612me.ThemeActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class ThemeActivity extends BaseDSLRecyclerActivity {
    private long adapterPostDelay;

    @aa1
    private final String TAG = "Theme";
    private final int nowTheme = a01.OXO1.OXO1().getInt(b01.X0O, 0);

    public static final class OXO1 extends ADPCAdListener {
        public OXO1() {
        }

        public void onADError(ADPCAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
        }

        public void onADPresent(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.this.TAG + " -> Ad State : Exposure");
        }

        public void onADReceive(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.this.TAG + " -> Ad State : Loaded");
        }
    }

    public static final class XIi00iiXO extends ADPAdListener {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdFailed(ADPAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdLoaded(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.this.TAG + " -> Ad State : Loaded");
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdOpen(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(ThemeActivity.this.TAG + " -> Ad State : Exposure");
        }
    }

    public ThemeActivity() {
        this.adapterPostDelay = i72.OXO1.IX0iIX() ? 200L : 50L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0(final ThemeActivity themeActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.getItemSelectorHelper().X11iII1O1(1);
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        themeActivity.getDslViewHolder().postDelay(themeActivity.adapterPostDelay, new Function0() { // from class: com.android.mltcode.paycertificationapi.dq5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0(this.f6249IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0(final ThemeActivity themeActivity) {
        themeActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.yp5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0(this.f12424IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0(final ThemeActivity themeActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_theme, new Function1() { // from class: com.android.mltcode.paycertificationapi.jq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$0(this.f9025IO, (DslAdapterItem) obj);
            }
        });
        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_theme, new Function1() { // from class: com.android.mltcode.paycertificationapi.kq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$1(this.f9259IO, (DslAdapterItem) obj);
            }
        });
        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_theme, new Function1() { // from class: com.android.mltcode.paycertificationapi.lq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$2(this.f9497IO, (DslAdapterItem) obj);
            }
        });
        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_theme, new Function1() { // from class: com.android.mltcode.paycertificationapi.mq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$3(this.f9767IO, (DslAdapterItem) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0(final ThemeActivity themeActivity, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsSelected(themeActivity.isThemeSelect(0));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.hq5
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$0$0(dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$0$1(dslItem, themeActivity, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$0(DslAdapterItem dslAdapterItem, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        ImageView imageViewImg = itemHolder.img(R.id.isSelectIv);
        if (imageViewImg != null) {
            imageViewImg.setVisibility(dslAdapterItem.getItemIsSelected() ? 0 : 8);
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.themeTv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(textViewM3482tv.getContext().getString(R.string.follow_theme));
            textViewM3482tv.setTextColor(textViewM3482tv.getResources().getColor(R.color.line_color));
        }
        View view = itemHolder.view(R.id.themeRl);
        if (view != null) {
            view.setBackgroundResource(R.drawable.pic_theme_system);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$1(DslAdapterItem dslAdapterItem, ThemeActivity themeActivity, View it) {
        Intrinsics.X0O(it, "it");
        if (!dslAdapterItem.getItemIsSelected()) {
            DslAdapterItem.updateItemSelector$default(dslAdapterItem, !dslAdapterItem.getItemIsSelected(), false, 2, null);
            themeActivity.updateTheme(0);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1(final ThemeActivity themeActivity, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsSelected(themeActivity.isThemeSelect(1));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.eq5
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$1$0(dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.fq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$1$1(dslItem, themeActivity, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1$0(DslAdapterItem dslAdapterItem, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        ImageView imageViewImg = itemHolder.img(R.id.isSelectIv);
        if (imageViewImg != null) {
            imageViewImg.setVisibility(dslAdapterItem.getItemIsSelected() ? 0 : 8);
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.themeTv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(textViewM3482tv.getContext().getString(R.string.dark_theme));
            textViewM3482tv.setTextColor(textViewM3482tv.getResources().getColor(R.color.line_color));
        }
        View view = itemHolder.view(R.id.themeRl);
        if (view != null) {
            view.setBackgroundResource(R.drawable.pic_theme_dark);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1$1(DslAdapterItem dslAdapterItem, ThemeActivity themeActivity, View it) {
        Intrinsics.X0O(it, "it");
        if (!dslAdapterItem.getItemIsSelected()) {
            DslAdapterItem.updateItemSelector$default(dslAdapterItem, !dslAdapterItem.getItemIsSelected(), false, 2, null);
            themeActivity.updateTheme(1);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2(final ThemeActivity themeActivity, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.bq5
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$2$0(dslItem, themeActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.cq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$2$1(dslItem, themeActivity, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2$0(DslAdapterItem dslAdapterItem, ThemeActivity themeActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        dslAdapterItem.setItemIsSelected(themeActivity.isThemeSelect(2));
        ImageView imageViewImg = itemHolder.img(R.id.isSelectIv);
        if (imageViewImg != null) {
            imageViewImg.setVisibility(dslAdapterItem.getItemIsSelected() ? 0 : 8);
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.themeTv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(textViewM3482tv.getContext().getString(R.string.light_theme));
            textViewM3482tv.setTextColor(textViewM3482tv.getResources().getColor(R.color.line_color));
        }
        View view = itemHolder.view(R.id.themeRl);
        if (view != null) {
            view.setBackgroundResource(R.drawable.pic_theme_light);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2$1(DslAdapterItem dslAdapterItem, ThemeActivity themeActivity, View it) {
        Intrinsics.X0O(it, "it");
        if (!dslAdapterItem.getItemIsSelected()) {
            DslAdapterItem.updateItemSelector$default(dslAdapterItem, !dslAdapterItem.getItemIsSelected(), false, 2, null);
            themeActivity.updateTheme(2);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3(final ThemeActivity themeActivity, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.zp5
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$3$0(dslItem, themeActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.aq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0$0$0$3$1(dslItem, themeActivity, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3$0(DslAdapterItem dslAdapterItem, ThemeActivity themeActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        dslAdapterItem.setItemIsSelected(themeActivity.isThemeSelect(3));
        ImageView imageViewImg = itemHolder.img(R.id.isSelectIv);
        if (imageViewImg != null) {
            imageViewImg.setVisibility(dslAdapterItem.getItemIsSelected() ? 0 : 8);
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.themeTv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(textViewM3482tv.getContext().getString(R.string.brown_black_theme));
            textViewM3482tv.setTextColor(textViewM3482tv.getResources().getColor(R.color.line_color));
        }
        View view = itemHolder.view(R.id.themeRl);
        if (view != null) {
            view.setBackgroundResource(R.drawable.pic_theme_brown_black);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3$1(DslAdapterItem dslAdapterItem, ThemeActivity themeActivity, View it) {
        Intrinsics.X0O(it, "it");
        if (!dslAdapterItem.getItemIsSelected()) {
            DslAdapterItem.updateItemSelector$default(dslAdapterItem, !dslAdapterItem.getItemIsSelected(), false, 2, null);
            themeActivity.updateTheme(3);
        }
        return Unit.OXO1;
    }

    public final long getAdapterPostDelay() {
        return this.adapterPostDelay;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ADPAdContainerView aDPAdContainerView;
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.switch_theme);
        i72 i72Var = i72.OXO1;
        if (i72Var.IX0iIX()) {
            ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) findViewById(R.id.adpcAdContainerView);
            if (aDPCAdContainerView != null) {
                i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + aDPCAdContainerView.getAdUnitId());
                aDPCAdContainerView.setAdListener(new OXO1());
                ADPCAdContainerView.loadAdView$default(aDPCAdContainerView, null, 0, false, null, 15, null);
                return;
            }
            return;
        }
        if (!i72Var.IOi1O0() || (aDPAdContainerView = (ADPAdContainerView) findViewById(R.id.adpAdContainerView)) == null) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + aDPAdContainerView.getAdUnitId());
        aDPAdContainerView.setAdListener(new XIi00iiXO());
        ADPAdContainerView.loadAdView$default(aDPAdContainerView, null, 0, false, null, 15, null);
    }

    public boolean isThemeSelect(int i) {
        return i == a01.OXO1.OXO1().getInt(b01.X0O, 0);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.gq5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThemeActivity.onInitBaseLayoutAfter$lambda$0(this.f6939IO, (DslAdapter) obj);
            }
        });
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (a01.OXO1.OXO1().getInt(b01.X0O, 0) != this.nowTheme) {
            ToastUtils.showLong(R.string.reboot_app_show_new_view);
            I01XX0.XIi00iiXO(I01XX0.XXiIiX10, null, 2, null);
        }
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setAdapterPostDelay(long j) {
        this.adapterPostDelay = j;
    }

    public final void updateTheme(int i) {
        a01.OXO1.OXO1().put(b01.X0O, i);
        if (i == 0) {
            setTheme();
            if (Build.VERSION.SDK_INT < 29) {
                ToastUtils.showLong(R.string.system_no_support_switch);
                return;
            }
            return;
        }
        if (i == 1) {
            ek4.IIX1OXO().O1O();
        } else if (i == 2) {
            ek4.IIX1OXO().iOO1ii1("light", null, 1);
        } else {
            if (i != 3) {
                return;
            }
            ek4.IIX1OXO().iOO1ii1("brown_black", null, 1);
        }
    }
}

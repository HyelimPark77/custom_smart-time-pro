package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.O0Oiii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
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
import com.sma.smartv3.p610ui.device.LanguageRepairRActivity;
import com.sma.smartv3.p610ui.device.LanguageRepairSmaActivity;
import com.sma.smartv3.p610ui.p612me.LanguageListActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.Languages;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLanguageListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageListActivity.kt\ncom/sma/smartv3/ui/me/LanguageListActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n11#2,2:125\n87#3,7:127\n94#3,3:135\n70#3,7:138\n97#3:145\n87#3,7:146\n94#3,3:154\n70#3,7:157\n97#3:164\n1#4:134\n1#4:153\n*S KotlinDebug\n*F\n+ 1 LanguageListActivity.kt\ncom/sma/smartv3/ui/me/LanguageListActivity\n*L\n85#1:125,2\n91#1:127,7\n91#1:135,3\n91#1:138,7\n91#1:145\n95#1:146,7\n95#1:154,3\n95#1:157,7\n95#1:164\n91#1:134\n95#1:153\n*E\n"})
public final class LanguageListActivity extends BaseDSLRecyclerActivity {

    @tb1
    private go0 mRepairPopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fj
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageListActivity.rootView_delegate$lambda$0(this.f6651IO);
        }
    });
    private final String defaultLanguage = Locale.getDefault().getLanguage();

    public static final class OXO1 implements O0Oiii<ExtraPackageData[]> {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ExtraPackageData[] extraPackageDataArr) {
            if (extraPackageDataArr != null) {
                if (extraPackageDataArr.length == 0) {
                    return;
                }
                LanguageListActivity.this.showData(extraPackageDataArr);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
        }
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootView_delegate$lambda$0(LanguageListActivity languageListActivity) {
        return (LinearLayout) languageListActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showData(final ExtraPackageData[] extraPackageDataArr) {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.ij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageListActivity.showData$lambda$0(this.f8700IO, extraPackageDataArr, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final LanguageListActivity languageListActivity, final ExtraPackageData[] extraPackageDataArr, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        languageListActivity.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.lj
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return LanguageListActivity.showData$lambda$0$0(this.f9444IO, extraPackageDataArr);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(final LanguageListActivity languageListActivity, final ExtraPackageData[] extraPackageDataArr) {
        languageListActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.gj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageListActivity.showData$lambda$0$0$0(extraPackageDataArr, languageListActivity, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0(ExtraPackageData[] extraPackageDataArr, final LanguageListActivity languageListActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        for (final ExtraPackageData extraPackageData : extraPackageDataArr) {
            if (extraPackageData.getType() != 3) {
                DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_language_select, new Function1() { // from class: com.android.mltcode.paycertificationapi.mj
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return LanguageListActivity.showData$lambda$0$0$0$0(this.f9713IO, extraPackageData, (DslAdapterItem) obj);
                    }
                });
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0$0(final LanguageListActivity languageListActivity, final ExtraPackageData extraPackageData, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.jj
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return LanguageListActivity.showData$lambda$0$0$0$0$0(this.f8980IO, extraPackageData, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.kj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageListActivity.showData$lambda$0$0$0$0$1(extraPackageData, languageListActivity, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0$0$0(LanguageListActivity languageListActivity, ExtraPackageData extraPackageData, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        languageListActivity.getResources().getConfiguration().setLocale(Languages.codeToLanguage$default(Languages.INSTANCE, extraPackageData.getType(), null, 2, null));
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.languageName);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(languageListActivity.getResources().getConfiguration().locale.getDisplayName());
        }
        languageListActivity.getResources().getConfiguration().setLocale(new Locale(languageListActivity.defaultLanguage));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0$0$1(ExtraPackageData extraPackageData, final LanguageListActivity languageListActivity, final View it) {
        Intrinsics.X0O(it, "it");
        a01.OXO1.XO0O10().put(ExtraPackageData.class.getName(), new Gson().toJson(extraPackageData));
        go0 go0Var = new go0(languageListActivity.getMContext(), 0, 2, null);
        go0Var.O1O(R.string.language_repair_remind);
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.hj
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(LanguageListActivity.showData$lambda$0$0$0$0$1$0$0(this.f7137IO, it));
            }
        });
        languageListActivity.mRepairPopup = go0Var;
        LinearLayout rootView = languageListActivity.getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        go0Var.I1XOi1(rootView);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showData$lambda$0$0$0$0$1$0$0(LanguageListActivity languageListActivity, View view) {
        int iXi1i0XOX0 = q62.OXO1.Xi1i0XOX0();
        if (iXi1i0XOX0 == 0) {
            String string = ((PFMedium) view.findViewById(R.id.languageName)).getText().toString();
            int mArg1 = languageListActivity.getMArg1();
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", string);
            bundle.putInt("mArg1", mArg1);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(languageListActivity, (Class<?>) LanguageRepairRActivity.class);
            intent.putExtras(bundle);
            languageListActivity.startActivity(intent);
        } else if (iXi1i0XOX0 != 1) {
            ToastUtils.showLong(R.string.stay_tuned);
        } else {
            String string2 = ((PFMedium) view.findViewById(R.id.languageName)).getText().toString();
            int mArg2 = languageListActivity.getMArg1();
            Bundle bundle2 = new Bundle();
            bundle2.putString("mArg0", string2);
            bundle2.putInt("mArg1", mArg2);
            bundle2.putParcelable("mArg2", null);
            bundle2.putSerializable("mArg3", null);
            Intent intent2 = new Intent(languageListActivity, (Class<?>) LanguageRepairSmaActivity.class);
            intent2.putExtras(bundle2);
            languageListActivity.startActivity(intent2);
        }
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(getMArg1());
        DeviceInfoChecker.XiOIii1(DeviceInfoChecker.OXO1, new OXO1(), null, 2, null);
        getRecyclerView().setHasFixedSize(false);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_language_list;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(1, 1));
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
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
}

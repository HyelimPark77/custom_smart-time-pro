package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2845qk;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.iX1IIXX11;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.y44;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.p610ui.device.LanguageUpdateActivity2;
import com.sma.smartv3.p610ui.device.model.LanguageUiType;
import com.sma.smartv3.p610ui.device.model.LanguageUpdateViewModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.BleDeviceLanguagesItem;
import com.szabh.smable3.entity.Languages;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nLanguageUpdateActivity2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateActivity2.kt\ncom/sma/smartv3/ui/device/LanguageUpdateActivity2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n1788#2,4:365\n1878#2,3:369\n1878#2,3:372\n1788#2,4:375\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateActivity2.kt\ncom/sma/smartv3/ui/device/LanguageUpdateActivity2\n*L\n131#1:365,4\n154#1:369,3\n251#1:372,3\n317#1:375,4\n*E\n"})
public final class LanguageUpdateActivity2 extends BaseDSLRecyclerActivity {
    private boolean mStarted;

    @aa1
    private final String TAG = "LanguageUpdateActivity2";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wj
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageUpdateActivity2.rootView_delegate$lambda$0(this.f11956IO);
        }
    });

    @aa1
    private final Lazy mTvTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xj
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageUpdateActivity2.mTvTip_delegate$lambda$0(this.f12179IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yj
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageUpdateActivity2.abhTitleCenter_delegate$lambda$0(this.f12379IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zj
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageUpdateActivity2.abhTitleRight_delegate$lambda$0(this.f12625IO);
        }
    });

    @aa1
    private final Lazy btnBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ak
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageUpdateActivity2.btnBottom_delegate$lambda$0(this.f5512IO);
        }
    });

    @aa1
    private final Lazy mLanguageUpdateProgressPopup$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ck
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageUpdateActivity2.mLanguageUpdateProgressPopup_delegate$lambda$0(this.f5990IO);
        }
    });

    @aa1
    private final Lazy viewModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dk
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LanguageUpdateActivity2.viewModel_delegate$lambda$0(this.f6206IO);
        }
    });

    public static final class OXO1 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function1 f54488IO;

        public OXO1(Function1 function) {
            Intrinsics.X0O(function, "function");
            this.f54488IO = function;
        }

        public final boolean equals(@tb1 Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.f54488IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54488IO.invoke2(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(LanguageUpdateActivity2 languageUpdateActivity2) {
        return (TextView) languageUpdateActivity2.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(LanguageUpdateActivity2 languageUpdateActivity2) {
        return (ImageView) languageUpdateActivity2.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnBottom_delegate$lambda$0(LanguageUpdateActivity2 languageUpdateActivity2) {
        return (Button) languageUpdateActivity2.findViewById(R.id.btn_bottom);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final Button getBtnBottom() {
        return (Button) this.btnBottom$delegate.getValue();
    }

    private final C2845qk getMLanguageUpdateProgressPopup() {
        return (C2845qk) this.mLanguageUpdateProgressPopup$delegate.getValue();
    }

    private final PFMedium getMTvTip() {
        return (PFMedium) this.mTvTip$delegate.getValue();
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) this.rootView$delegate.getValue();
    }

    private final LanguageUpdateViewModel getViewModel() {
        return (LanguageUpdateViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1(LanguageUpdateActivity2 languageUpdateActivity2, LanguageUiType languageUiType) {
        languageUpdateActivity2.refreshPage();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2(LanguageUpdateActivity2 languageUpdateActivity2, C2845qk.OXO1 oxo1) {
        Log.d(languageUpdateActivity2.TAG, "initView: popup = " + oxo1);
        if (oxo1.X1ii()) {
            if (!languageUpdateActivity2.getMLanguageUpdateProgressPopup().isShowing()) {
                C2845qk mLanguageUpdateProgressPopup = languageUpdateActivity2.getMLanguageUpdateProgressPopup();
                LinearLayout rootView = languageUpdateActivity2.getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                mLanguageUpdateProgressPopup.XiOIO(rootView);
            }
            languageUpdateActivity2.setMStarted(true);
        } else {
            languageUpdateActivity2.getMLanguageUpdateProgressPopup().dismiss();
            languageUpdateActivity2.setMStarted(false);
        }
        languageUpdateActivity2.getMLanguageUpdateProgressPopup().XXIIO1i11(oxo1.OIi0());
        languageUpdateActivity2.getMLanguageUpdateProgressPopup().m2907iI(oxo1.m2909IO());
        languageUpdateActivity2.getMLanguageUpdateProgressPopup().X11iII1O1(oxo1.I0iXXO());
        languageUpdateActivity2.getMLanguageUpdateProgressPopup().XXX11i(oxo1.XXI());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2845qk mLanguageUpdateProgressPopup_delegate$lambda$0(LanguageUpdateActivity2 languageUpdateActivity2) {
        return new C2845qk(languageUpdateActivity2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mTvTip_delegate$lambda$0(LanguageUpdateActivity2 languageUpdateActivity2) {
        return (PFMedium) languageUpdateActivity2.findViewById(R.id.tv_tip);
    }

    private final void refreshPage() {
        int i;
        Button btnBottom = getBtnBottom();
        if (btnBottom != null) {
            btnBottom.setVisibility(8);
        }
        TextView abhTitleCenter = getAbhTitleCenter();
        if (abhTitleCenter != null) {
            abhTitleCenter.setText(getViewModel().getUiType().getValue() == LanguageUiType.NORMAL ? R.string.language_update2__language_setting : R.string.language_update2__language_add);
        }
        ImageView abhTitleRight = getAbhTitleRight();
        if (abhTitleRight != null) {
            abhTitleRight.setVisibility((getViewModel().getUiType().getValue() != LanguageUiType.NORMAL || getViewModel().getMDevLanguageData().size() >= getViewModel().getMLanguagesMaxCount()) ? 4 : 0);
            abhTitleRight.setImageTintList(gk4.O00(abhTitleRight.getContext(), R.color.text_color));
            abhTitleRight.setImageResource(R.drawable.icon_language_update_add);
            abhTitleRight.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.sj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageUpdateActivity2.refreshPage$lambda$2$0(this.f11058IO, view);
                }
            });
        }
        PFMedium mTvTip = getMTvTip();
        if (mTvTip != null) {
            mTvTip.setText(getViewModel().getUiType().getValue() == LanguageUiType.NORMAL ? R.string.language_update2__tip_left_slide_delete : R.string.language_update2__tip_language_add);
        }
        LanguageUiType value = getViewModel().getUiType().getValue();
        LanguageUiType languageUiType = LanguageUiType.NORMAL;
        if (value == languageUiType) {
            showNormalUI();
        } else {
            showAddUI();
        }
        Button btnBottom2 = getBtnBottom();
        if (getViewModel().getUiType().getValue() == languageUiType) {
            List<iX1IIXX11> mDevLanguageData = getViewModel().getMDevLanguageData();
            if ((mDevLanguageData instanceof Collection) && mDevLanguageData.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = mDevLanguageData.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((iX1IIXX11) it.next()).IIX1OXO() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.m39400OO();
                    }
                }
            }
            btnBottom2.setVisibility(i > 1 ? 0 : 8);
            btnBottom2.setText(R.string.language_update2__btn_all_update);
        } else {
            btnBottom2.setVisibility(0);
            btnBottom2.setText(getString(R.string.language_update2__btn_downloading_update, ""));
        }
        if (getMArg1() == 1) {
            setMArg1(-1);
            getViewModel().bottomClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshPage$lambda$2$0(LanguageUpdateActivity2 languageUpdateActivity2, View view) {
        languageUpdateActivity2.getViewModel().getUiType().setValue(LanguageUiType.ADD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootView_delegate$lambda$0(LanguageUpdateActivity2 languageUpdateActivity2) {
        return (LinearLayout) languageUpdateActivity2.findViewById(R.id.root_view);
    }

    private final void showAddUI() {
        getDslAdapter().clearItems();
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.nk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageUpdateActivity2.showAddUI$lambda$0(this.f9951IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAddUI$lambda$0(final LanguageUpdateActivity2 languageUpdateActivity2, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        languageUpdateActivity2.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.uj
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return LanguageUpdateActivity2.showAddUI$lambda$0$0(this.f11500IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAddUI$lambda$0$0(final LanguageUpdateActivity2 languageUpdateActivity2) {
        languageUpdateActivity2.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.vj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageUpdateActivity2.showAddUI$lambda$0$0$0(this.f11727IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAddUI$lambda$0$0$0(final LanguageUpdateActivity2 languageUpdateActivity2, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        int i = 0;
        for (Object obj : languageUpdateActivity2.getViewModel().getMServiceLanguageData()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            final y44 y44Var = (y44) obj;
            Log.d(languageUpdateActivity2.TAG, "showAddUI: index=" + i + ",value=" + y44Var);
            y44Var.OiIIX101O((!y44Var.iIiiO() || y44Var.XX0()) ? 0 : 2);
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_language_update, new Function1() { // from class: com.android.mltcode.paycertificationapi.tj
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return LanguageUpdateActivity2.showAddUI$lambda$0$0$0$0$0(y44Var, languageUpdateActivity2, renderAdapter, (DslAdapterItem) obj2);
                }
            });
            i = i2;
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAddUI$lambda$0$0$0$0$0(final y44 y44Var, final LanguageUpdateActivity2 languageUpdateActivity2, final DslAdapter dslAdapter, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemSwipeMenuType(2);
        dslItem.setItemSwipeMenuEnable(false);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.kk
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return LanguageUpdateActivity2.showAddUI$lambda$0$0$0$0$0$0(y44Var, languageUpdateActivity2, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.lk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageUpdateActivity2.showAddUI$lambda$0$0$0$0$0$1(y44Var, dslAdapter, dslItem, languageUpdateActivity2, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAddUI$lambda$0$0$0$0$0$0(y44 y44Var, LanguageUpdateActivity2 languageUpdateActivity2, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        int i2;
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        Languages languages = Languages.INSTANCE;
        ExtraPackageData extraPackageDataXIi00iiXO = y44Var.XIi00iiXO();
        Intrinsics.XXI(extraPackageDataXIi00iiXO);
        Locale localeCodeToLanguage$default = Languages.codeToLanguage$default(languages, extraPackageDataXIi00iiXO.getType(), null, 2, null);
        languageUpdateActivity2.getResources().getConfiguration().setLocale(localeCodeToLanguage$default);
        y44Var.I0IIOi(UtilsKt.OIX0iXi(languageUpdateActivity2.getResources().getConfiguration().locale.getDisplayName(localeCodeToLanguage$default)));
        String displayName = languageUpdateActivity2.getResources().getConfiguration().locale.getDisplayName();
        Intrinsics.O10IXXX0X(displayName, "getDisplayName(...)");
        y44Var.OIi0(displayName);
        languageUpdateActivity2.getResources().getConfiguration().setLocale(Locale.getDefault());
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title1);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(y44Var.mo2177iO());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_title2);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(y44Var.XO0O10());
        }
        PFMedium pFMedium = (PFMedium) itemHolder.m3483v(R.id.tv_state1);
        if (pFMedium != null) {
            pFMedium.setVisibility((y44Var.iIiiO() || y44Var.XX0()) ? 0 : 8);
            if (y44Var.iIiiO()) {
                pFMedium.setText(R.string.language_update2__state_exist);
            }
            if (y44Var.XX0()) {
                pFMedium.setText(R.string.language_update2__state_updated);
            }
        }
        PFMedium pFMedium2 = (PFMedium) itemHolder.m3483v(R.id.tv_state2);
        if (pFMedium2 != null) {
            pFMedium2.setVisibility(8);
        }
        ImageButton imageButton = (ImageButton) itemHolder.m3483v(R.id.bt_delete_language);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        PFMedium pFMedium3 = (PFMedium) itemHolder.m3483v(R.id.tv_btn);
        if (pFMedium3 != null) {
            pFMedium3.setVisibility(8);
        }
        ImageView imageView = (ImageView) itemHolder.m3483v(R.id.checkBox);
        if (imageView != null) {
            imageView.setVisibility(0);
            int iXiOIO = y44Var.XiOIO();
            if (iXiOIO != 0) {
                i2 = iXiOIO != 1 ? R.drawable.ic_charge_check_square_disable : R.drawable.file_check_icon;
            } else {
                i2 = R.drawable.ic_charge_check_square_false;
            }
            imageView.setImageResource(i2);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAddUI$lambda$0$0$0$0$0$1(y44 y44Var, DslAdapter dslAdapter, DslAdapterItem dslAdapterItem, LanguageUpdateActivity2 languageUpdateActivity2, View it) {
        int i;
        String str;
        Intrinsics.X0O(it, "it");
        int iXiOIO = y44Var.XiOIO();
        int i2 = 0;
        if (iXiOIO == 0) {
            i = 1;
        } else {
            if (iXiOIO != 1) {
                ToastUtils.showLong(R.string.language_update2__tip_select_exist);
                return Unit.OXO1;
            }
            i = 0;
        }
        y44Var.OiIIX101O(i);
        DslAdapter.notifyItemChanged$default(dslAdapter, dslAdapterItem, null, false, 6, null);
        Button btnBottom = languageUpdateActivity2.getBtnBottom();
        List<y44> mServiceLanguageData = languageUpdateActivity2.getViewModel().getMServiceLanguageData();
        if (!(mServiceLanguageData instanceof Collection) || !mServiceLanguageData.isEmpty()) {
            Iterator<T> it2 = mServiceLanguageData.iterator();
            while (it2.hasNext()) {
                if (((y44) it2.next()).XiOIO() == 1 && (i2 = i2 + 1) < 0) {
                    CollectionsKt__CollectionsKt.m39400OO();
                }
            }
        }
        if (i2 == 0) {
            str = "";
        } else {
            str = I000IiI1O.C2156iO.XIi00iiXO + i2 + I000IiI1O.C2156iO.f1007iO;
        }
        btnBottom.setText(languageUpdateActivity2.getString(R.string.language_update2__btn_downloading_update, str));
        return Unit.OXO1;
    }

    private final void showNormalUI() {
        getDslAdapter().clearItems();
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.mk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageUpdateActivity2.showNormalUI$lambda$0(this.f9718IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNormalUI$lambda$0(final LanguageUpdateActivity2 languageUpdateActivity2, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        languageUpdateActivity2.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.jk
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return LanguageUpdateActivity2.showNormalUI$lambda$0$0(this.f8994IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNormalUI$lambda$0$0(final LanguageUpdateActivity2 languageUpdateActivity2) {
        languageUpdateActivity2.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.hk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageUpdateActivity2.showNormalUI$lambda$0$0$0(this.f7142IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNormalUI$lambda$0$0$0(final LanguageUpdateActivity2 languageUpdateActivity2, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        int i = 0;
        for (Object obj : languageUpdateActivity2.getViewModel().getMDevLanguageData()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            final iX1IIXX11 ix1iixx11 = (iX1IIXX11) obj;
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_language_update, new Function1() { // from class: com.android.mltcode.paycertificationapi.gk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return LanguageUpdateActivity2.showNormalUI$lambda$0$0$0$0$0(ix1iixx11, languageUpdateActivity2, (DslAdapterItem) obj2);
                }
            });
            i = i2;
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNormalUI$lambda$0$0$0$0$0(final iX1IIXX11 ix1iixx11, final LanguageUpdateActivity2 languageUpdateActivity2, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemSwipeMenuType(2);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.ik
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return LanguageUpdateActivity2.showNormalUI$lambda$0$0$0$0$0$0(ix1iixx11, languageUpdateActivity2, dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNormalUI$lambda$0$0$0$0$0$0(final iX1IIXX11 ix1iixx11, LanguageUpdateActivity2 languageUpdateActivity2, final DslAdapterItem dslAdapterItem, DslViewHolder itemHolder, final int i, DslAdapterItem dslAdapterItem2, List list) {
        final LanguageUpdateActivity2 languageUpdateActivity3;
        final DslViewHolder dslViewHolder;
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        Languages languages = Languages.INSTANCE;
        BleDeviceLanguagesItem bleDeviceLanguagesItemOXO1 = ix1iixx11.OXO1();
        Intrinsics.XXI(bleDeviceLanguagesItemOXO1);
        Locale localeCodeToLanguage$default = Languages.codeToLanguage$default(languages, bleDeviceLanguagesItemOXO1.getMCode(), null, 2, null);
        languageUpdateActivity2.getResources().getConfiguration().setLocale(localeCodeToLanguage$default);
        ix1iixx11.I0IIOi(UtilsKt.OIX0iXi(languageUpdateActivity2.getResources().getConfiguration().locale.getDisplayName(localeCodeToLanguage$default)));
        String displayName = languageUpdateActivity2.getResources().getConfiguration().locale.getDisplayName();
        Intrinsics.O10IXXX0X(displayName, "getDisplayName(...)");
        ix1iixx11.OIi0(displayName);
        languageUpdateActivity2.getResources().getConfiguration().setLocale(Locale.getDefault());
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title1);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(ix1iixx11.mo2177iO());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_title2);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(ix1iixx11.XO0O10());
        }
        PFMedium pFMedium = (PFMedium) itemHolder.m3483v(R.id.tv_state1);
        if (pFMedium != null) {
            pFMedium.setVisibility(i == 0 ? 0 : 8);
            pFMedium.setText(R.string.language_update2__state_now_enable);
        }
        PFMedium pFMedium2 = (PFMedium) itemHolder.m3483v(R.id.tv_state2);
        if (pFMedium2 != null) {
            pFMedium2.setVisibility(8);
        }
        final ImageButton imageButton = (ImageButton) itemHolder.m3483v(R.id.bt_delete_language);
        if (imageButton != null) {
            imageButton.setVisibility(0);
            if (i == 0) {
                imageButton.setBackgroundResource(R.color.line_color);
            } else {
                imageButton.setBackgroundResource(R.color.delete_bg_color);
            }
            languageUpdateActivity3 = languageUpdateActivity2;
            dslViewHolder = itemHolder;
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ek
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageUpdateActivity2.showNormalUI$lambda$0$0$0$0$0$0$2$0(dslAdapterItem, dslViewHolder, i, languageUpdateActivity3, imageButton, view);
                }
            });
        } else {
            languageUpdateActivity3 = languageUpdateActivity2;
            dslViewHolder = itemHolder;
        }
        PFMedium pFMedium3 = (PFMedium) dslViewHolder.m3483v(R.id.tv_btn);
        if (pFMedium3 != null) {
            pFMedium3.setVisibility(0);
            pFMedium3.setEnabled(ix1iixx11.IIX1OXO());
            pFMedium3.setText(pFMedium3.isEnabled() ? R.string.language_update2__btn_update : R.string.language_update2__btn_installed);
            pFMedium3.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.fk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageUpdateActivity2.showNormalUI$lambda$0$0$0$0$0$0$3$0(this.f6656IO, ix1iixx11, view);
                }
            });
        }
        ImageView imageView = (ImageView) dslViewHolder.m3483v(R.id.checkBox);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNormalUI$lambda$0$0$0$0$0$0$2$0(final DslAdapterItem dslAdapterItem, DslViewHolder dslViewHolder, final int i, final LanguageUpdateActivity2 languageUpdateActivity2, ImageButton imageButton, View view) {
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            swipeMenuHelper.closeSwipeMenu(dslViewHolder);
        }
        if (i == 0) {
            ToastUtils.showLong(R.string.language_update2__tip_delete_device_enable);
            return;
        }
        go0 go0Var = new go0(languageUpdateActivity2, 0, 2, null);
        go0Var.O1O(R.string.language_update2__pop_delete_title);
        go0Var.m1865iX(Integer.valueOf(R.string.language_update2__pop_delete_tip));
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.ok
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(LanguageUpdateActivity2.showNormalUI$lambda$0$0$0$0$0$0$2$0$0$0());
            }
        });
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.rj
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(LanguageUpdateActivity2.showNormalUI$lambda$0$0$0$0$0$0$2$0$0$1(dslAdapterItem, languageUpdateActivity2, i));
            }
        });
        View rootView = imageButton.getRootView();
        Intrinsics.O10IXXX0X(rootView, "getRootView(...)");
        go0Var.I1XOi1(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showNormalUI$lambda$0$0$0$0$0$0$2$0$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showNormalUI$lambda$0$0$0$0$0$0$2$0$0$1(DslAdapterItem dslAdapterItem, LanguageUpdateActivity2 languageUpdateActivity2, int i) {
        DslAdapter itemDslAdapter = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter != null) {
            DslAdapter.removeItem$default(itemDslAdapter, dslAdapterItem, false, 2, null);
        }
        languageUpdateActivity2.getViewModel().removeDeviceLanguagesByIndex(i);
        DslAdapter itemDslAdapter2 = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter2 != null) {
            DslAdapter.updateItemDepend$default(itemDslAdapter2, null, 1, null);
        }
        ImageView abhTitleRight = languageUpdateActivity2.getAbhTitleRight();
        if (abhTitleRight != null) {
            abhTitleRight.setVisibility((languageUpdateActivity2.getViewModel().getUiType().getValue() != LanguageUiType.NORMAL || languageUpdateActivity2.getViewModel().getMDevLanguageData().size() >= languageUpdateActivity2.getViewModel().getMLanguagesMaxCount()) ? 4 : 0);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNormalUI$lambda$0$0$0$0$0$0$3$0(LanguageUpdateActivity2 languageUpdateActivity2, iX1IIXX11 ix1iixx11, View view) {
        languageUpdateActivity2.getViewModel().updateLanguage(X0iO1XX.I0iXXO(ix1iixx11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LanguageUpdateViewModel viewModel_delegate$lambda$0(LanguageUpdateActivity2 languageUpdateActivity2) {
        return (LanguageUpdateViewModel) new ViewModelProvider(languageUpdateActivity2).get(LanguageUpdateViewModel.class);
    }

    public final boolean getMStarted() {
        return this.mStarted;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        TextView abhTitleCenter = getAbhTitleCenter();
        if (abhTitleCenter != null) {
            abhTitleCenter.setText(R.string.language_update2__language_setting);
        }
        getRecyclerView().setHasFixedSize(false);
        LanguageUpdateViewModel.refreshData$default(getViewModel(), null, 1, null);
        getViewModel().getUiType().observe(this, new OXO1(new Function1() { // from class: com.android.mltcode.paycertificationapi.qj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageUpdateActivity2.initView$lambda$1(this.f10610IO, (LanguageUiType) obj);
            }
        }));
        getViewModel().getPopup().observe(this, new OXO1(new Function1() { // from class: com.android.mltcode.paycertificationapi.bk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LanguageUpdateActivity2.initView$lambda$2(this.f5748IO, (C2845qk.OXO1) obj);
            }
        }));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_language_update_2;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getViewModel().bottomClick();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMLanguageUpdateProgressPopup().isShowing()) {
            return;
        }
        if (getViewModel().getUiType().getValue() == LanguageUiType.ADD) {
            getViewModel().getUiType().setValue(LanguageUiType.NORMAL);
        } else {
            super.onHandleBackPressed();
        }
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onHandleBackPressed();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMStarted(boolean z) {
        this.mStarted = z;
        if (z) {
            disableOrientation();
        }
    }
}

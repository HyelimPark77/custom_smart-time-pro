package com.sma.smartv3.ui.device;

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
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ak;
import com.android.mltcode.paycertificationapi.bk;
import com.android.mltcode.paycertificationapi.ck;
import com.android.mltcode.paycertificationapi.dk;
import com.android.mltcode.paycertificationapi.ek;
import com.android.mltcode.paycertificationapi.fk;
import com.android.mltcode.paycertificationapi.gk;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hk;
import com.android.mltcode.paycertificationapi.iX1IIXX11;
import com.android.mltcode.paycertificationapi.ik;
import com.android.mltcode.paycertificationapi.jk;
import com.android.mltcode.paycertificationapi.kk;
import com.android.mltcode.paycertificationapi.lk;
import com.android.mltcode.paycertificationapi.mk;
import com.android.mltcode.paycertificationapi.nk;
import com.android.mltcode.paycertificationapi.ok;
import com.android.mltcode.paycertificationapi.qj;
import com.android.mltcode.paycertificationapi.qk;
import com.android.mltcode.paycertificationapi.rj;
import com.android.mltcode.paycertificationapi.sj;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tj;
import com.android.mltcode.paycertificationapi.uj;
import com.android.mltcode.paycertificationapi.vj;
import com.android.mltcode.paycertificationapi.wj;
import com.android.mltcode.paycertificationapi.xj;
import com.android.mltcode.paycertificationapi.y44;
import com.android.mltcode.paycertificationapi.yj;
import com.android.mltcode.paycertificationapi.zj;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.model.LanguageUiType;
import com.sma.smartv3.ui.device.model.LanguageUpdateViewModel;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nLanguageUpdateActivity2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateActivity2.kt\ncom/sma/smartv3/ui/device/LanguageUpdateActivity2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n1788#2,4:365\n1878#2,3:369\n1878#2,3:372\n1788#2,4:375\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateActivity2.kt\ncom/sma/smartv3/ui/device/LanguageUpdateActivity2\n*L\n131#1:365,4\n154#1:369,3\n251#1:372,3\n317#1:375,4\n*E\n"})
public final class LanguageUpdateActivity2 extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy btnBottom$delegate;

    @aa1
    private final Lazy mLanguageUpdateProgressPopup$delegate;
    private boolean mStarted;

    @aa1
    private final Lazy mTvTip$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy viewModel$delegate;

    public static final class OXO1 implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 IO;

        public OXO1(Function1 r2) {
            Intrinsics.X0O(r2, "function");
            this.IO = r2;
        }

        public final boolean equals(@tb1 Object r3) {
            if ((r3 instanceof Observer) == true) goto L5;
        L8:
            return false;
        L5:
            if ((r3 instanceof FunctionAdapter) == false) goto L8;
            return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) r3).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object r2) {
            invoke(r2);
        }
    }

    public LanguageUpdateActivity2() {
        this.TAG = "LanguageUpdateActivity2";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new wj(this));
        this.mTvTip$delegate = LazyKt__LazyJVMKt.iO(new xj(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new yj(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new zj(this));
        this.btnBottom$delegate = LazyKt__LazyJVMKt.iO(new ak(this));
        this.mLanguageUpdateProgressPopup$delegate = LazyKt__LazyJVMKt.iO(new ck(this));
        this.viewModel$delegate = LazyKt__LazyJVMKt.iO(new dk(this));
    }

    public static /* synthetic */ Button I0iXXO(LanguageUpdateActivity2 r0) {
        return btnBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ qk I1(LanguageUpdateActivity2 r0) {
        return mLanguageUpdateProgressPopup_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(iX1IIXX11 r0, LanguageUpdateActivity2 r1, DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        return showNormalUI$lambda$0$0$0$0$0$0(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ Unit II1Xi0(y44 r0, LanguageUpdateActivity2 r1, DslAdapter r2, DslAdapterItem r3) {
        return showAddUI$lambda$0$0$0$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit IIX1OXO(LanguageUpdateActivity2 r0, DslAdapter r1) {
        return showAddUI$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit IXXOO(LanguageUpdateActivity2 r0) {
        return showNormalUI$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(LanguageUpdateActivity2 r0, DslAdapter r1) {
        return showNormalUI$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView O1O(LanguageUpdateActivity2 r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OII(LanguageUpdateActivity2 r0) {
        return mTvTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OX(LanguageUpdateActivity2 r0, qk.OXO1 r1) {
        return initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void OiIIX101O(LanguageUpdateActivity2 r0, View r1) {
        refreshPage$lambda$2$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(iX1IIXX11 r0, LanguageUpdateActivity2 r1, DslAdapterItem r2) {
        return showNormalUI$lambda$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X0O(y44 r0, DslAdapter r1, DslAdapterItem r2, LanguageUpdateActivity2 r3, View r4) {
        return showAddUI$lambda$0$0$0$0$0$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ LinearLayout X1ii(LanguageUpdateActivity2 r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(LanguageUpdateActivity2 r0, DslAdapter r1) {
        return showAddUI$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView XXI(LanguageUpdateActivity2 r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXIIO1i11(LanguageUpdateActivity2 r0) {
        return showAddUI$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(LanguageUpdateActivity2 r0, DslAdapter r1) {
        return showNormalUI$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ void XiOIii1(DslAdapterItem r0, DslViewHolder r1, int r2, LanguageUpdateActivity2 r3, ImageButton r4, View r5) {
        showNormalUI$lambda$0$0$0$0$0$0$2$0(r0, r1, r2, r3, r4, r5);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(LanguageUpdateActivity2 r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(LanguageUpdateActivity2 r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private static final Button btnBottom_delegate$lambda$0(LanguageUpdateActivity2 r1) {
        return (Button) r1.findViewById(R.id.btn_bottom);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final Button getBtnBottom() {
        return (Button) getValue();
    }

    private final qk getMLanguageUpdateProgressPopup() {
        return (qk) getValue();
    }

    private final PFMedium getMTvTip() {
        return (PFMedium) getValue();
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) getValue();
    }

    private final LanguageUpdateViewModel getViewModel() {
        return (LanguageUpdateViewModel) getValue();
    }

    public static /* synthetic */ LanguageUpdateViewModel i010I(LanguageUpdateActivity2 r0) {
        return viewModel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iI(LanguageUpdateActivity2 r0, iX1IIXX11 r1, View r2) {
        showNormalUI$lambda$0$0$0$0$0$0$3$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean iIiiO(DslAdapterItem r0, LanguageUpdateActivity2 r1, int r2) {
        return showNormalUI$lambda$0$0$0$0$0$0$2$0$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit iOO1ii1(LanguageUpdateActivity2 r0, LanguageUiType r1) {
        return initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(y44 r0, LanguageUpdateActivity2 r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showAddUI$lambda$0$0$0$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ boolean iX() {
        return showNormalUI$lambda$0$0$0$0$0$0$2$0$0$0();
    }

    private static final Unit initView$lambda$1(LanguageUpdateActivity2 r0, LanguageUiType r1) {
        r0.refreshPage();
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$2(LanguageUpdateActivity2 r3, qk.OXO1 r4) {
        Log.d(r3.TAG, "initView: popup = " + r4);
        if (r4.X1ii() == true) goto L5;
        r3.getMLanguageUpdateProgressPopup().dismiss();
        r3.setMStarted(false);
    L9:
        r3.getMLanguageUpdateProgressPopup().XXIIO1i11(r4.OIi0());
        r3.getMLanguageUpdateProgressPopup().iI(r4.IO());
        r3.getMLanguageUpdateProgressPopup().X11iII1O1(r4.I0iXXO());
        r3.getMLanguageUpdateProgressPopup().XXX11i(r4.XXI());
        return Unit.OXO1;
    L5:
        if (r3.getMLanguageUpdateProgressPopup().isShowing() == true) goto L7;
        qk r0 = r3.getMLanguageUpdateProgressPopup();
        LinearLayout r1 = r3.getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r0.XiOIO(r1);
    L7:
        r3.setMStarted(true);
        goto L9
    }

    private static final qk mLanguageUpdateProgressPopup_delegate$lambda$0(LanguageUpdateActivity2 r1) {
        return new qk(r1);
    }

    private static final PFMedium mTvTip_delegate$lambda$0(LanguageUpdateActivity2 r1) {
        return (PFMedium) r1.findViewById(R.id.tv_tip);
    }

    private final void refreshPage() {
        Button r0 = getBtnBottom();
        int r1 = 8;
        if (r0 == null) goto L5;
        r0.setVisibility(8);
    L5:
        TextView r2 = getAbhTitleCenter();
        if (r2 != null) goto L8;
    L12:
        ImageView r3 = getAbhTitleRight();
        if (r3 != null) goto L15;
    L21:
        PFMedium r4 = getMTvTip();
        if (r4 != null) goto L24;
    L28:
        LanguageUiType r5 = getViewModel().getUiType().getValue();
        LanguageUiType r6 = LanguageUiType.NORMAL;
        if (r5 != r6) goto L31;
        showNormalUI();
    L32:
        Button r7 = getBtnBottom();
        if (getViewModel().getUiType().getValue() != r6) goto L53;
        List<iX1IIXX11> r8 = getViewModel().getMDevLanguageData();
        if ((r8 instanceof Collection) == true) goto L37;
    L39:
        Iterator<T> r9 = r8.iterator();
        int r10 = 0;
    L41:
        if (r9.hasNext() == false) goto L47;
        if (((iX1IIXX11) r9.next()).IIX1OXO() == false) goto L41;
        r10 = r10 + 1;
        if (r10 >= 0) goto L41;
        CollectionsKt__CollectionsKt.OO();
    L47:
        if (r10 <= 1) goto L49;
        boolean r11 = true;
    L50:
        if (r11 == false) goto L52;
        r1 = 0;
    L52:
        r7.setVisibility(r1);
        r7.setText(R.string.language_update2__btn_all_update);
    L55:
        if (getMArg1() != 1) goto L65;
        setMArg1(-1);
        getViewModel().bottomClick();
        return;
    L65:
        return;
    L49:
        r11 = false;
        goto L50
    L37:
        if (r8.isEmpty() == false) goto L39;
        r10 = 0;
        goto L47
    L53:
        r7.setVisibility(0);
        r7.setText(getString(R.string.language_update2__btn_downloading_update, new Object[]{""}));
        goto L55
    L31:
        showAddUI();
        goto L32
    L24:
        if (getViewModel().getUiType().getValue() != LanguageUiType.NORMAL) goto L26;
        int r12 = R.string.language_update2__tip_left_slide_delete;
    L27:
        r4.setText(r12);
        goto L28
    L26:
        r12 = R.string.language_update2__tip_language_add;
        goto L27
    L15:
        if (getViewModel().getUiType().getValue() == LanguageUiType.NORMAL) goto L17;
    L19:
        int r13 = 4;
    L20:
        r3.setVisibility(r13);
        r3.setImageTintList(gk4.O00(r3.getContext(), R.color.text_color));
        r3.setImageResource(R.drawable.icon_language_update_add);
        r3.setOnClickListener(new sj(this));
        goto L21
    L17:
        if (getViewModel().getMDevLanguageData().size() >= getViewModel().getMLanguagesMaxCount()) goto L19;
        r13 = 0;
        goto L20
    L8:
        if (getViewModel().getUiType().getValue() != LanguageUiType.NORMAL) goto L10;
        int r14 = R.string.language_update2__language_setting;
    L11:
        r2.setText(r14);
        goto L12
    L10:
        r14 = R.string.language_update2__language_add;
        goto L11
    }

    private static final void refreshPage$lambda$2$0(LanguageUpdateActivity2 r0, View r1) {
        r0.getViewModel().getUiType().setValue(LanguageUiType.ADD);
    }

    private static final LinearLayout rootView_delegate$lambda$0(LanguageUpdateActivity2 r1) {
        return (LinearLayout) r1.findViewById(R.id.root_view);
    }

    private final void showAddUI() {
        getDslAdapter().clearItems();
        renderAdapter(new nk(this));
    }

    private static final Unit showAddUI$lambda$0(final LanguageUpdateActivity2 r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        r1.getDslViewHolder().post(new uj(r1));
        return Unit.OXO1;
    }

    private static final Unit showAddUI$lambda$0$0(final LanguageUpdateActivity2 r1) {
        r1.renderAdapter(new vj(r1));
        return Unit.OXO1;
    }

    private static final Unit showAddUI$lambda$0$0$0(final LanguageUpdateActivity2 r8, final DslAdapter r9) {
        Intrinsics.X0O(r9, "$this$renderAdapter");
        Iterator<T> r0 = r8.getViewModel().getMServiceLanguageData().iterator();
        int r2 = 0;
    L4:
        if (r0.hasNext() == false) goto L16;
        Object r3 = r0.next();
        int r4 = r2 + 1;
        if (r2 >= 0) goto L8;
        CollectionsKt__CollectionsKt.XOX0O0();
    L8:
        final y44 r5 = (y44) r3;
        Log.d(r8.TAG, "showAddUI: index=" + r2 + ",value=" + r5);
        if (r5.iIiiO() == true) goto L11;
    L13:
        int r6 = 0;
    L14:
        r5.OiIIX101O(r6);
        DslAdapterExKt.O10IXXX0X(r9, R.layout.item_language_update, new tj(r5, r8, r9));
        r2 = r4;
        goto L4
    L11:
        if (r5.XX0() == true) goto L13;
        r6 = 2;
        goto L14
    L16:
        return Unit.OXO1;
    }

    private static final Unit showAddUI$lambda$0$0$0$0$0(final y44 r1, final LanguageUpdateActivity2 r2, final DslAdapter r3, final DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemSwipeMenuFlag(4);
        r4.setItemSwipeMenuType(2);
        r4.setItemSwipeMenuEnable(false);
        r4.setItemBindOverride(new kk(r1, r2));
        r4.setItemClick(new lk(r1, r3, r4, r2));
        return Unit.OXO1;
    }

    private static final Unit showAddUI$lambda$0$0$0$0$0$0(y44 r1, LanguageUpdateActivity2 r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "<unused var>");
        Intrinsics.X0O(r6, "<unused var>");
        Languages r7 = Languages.INSTANCE;
        ExtraPackageData r8 = r1.XIi00iiXO();
        Intrinsics.XXI(r8);
        Locale r9 = Languages.codeToLanguage$default(r7, r8.getType(), null, 2, null);
        r2.getResources().getConfiguration().setLocale(r9);
        r1.I0IIOi(UtilsKt.OIX0iXi(r2.getResources().getConfiguration().locale.getDisplayName(r9)));
        String r10 = r2.getResources().getConfiguration().locale.getDisplayName();
        Intrinsics.O10IXXX0X(r10, "getDisplayName(...)");
        r1.OIi0(r10);
        r2.getResources().getConfiguration().setLocale(Locale.getDefault());
        TextView r11 = r3.tv(R.id.tv_title1);
        if (r11 == null) goto L5;
        r11.setText(r1.iO());
    L5:
        TextView r12 = r3.tv(R.id.tv_title2);
        if (r12 == null) goto L8;
        r12.setText(r1.XO0O10());
    L8:
        PFMedium r13 = (PFMedium) r3.v(R.id.tv_state1);
        if (r13 != null) goto L11;
    L23:
        PFMedium r14 = (PFMedium) r3.v(R.id.tv_state2);
        if (r14 == null) goto L26;
        r14.setVisibility(8);
    L26:
        ImageButton r15 = (ImageButton) r3.v(R.id.bt_delete_language);
        if (r15 == null) goto L29;
        r15.setVisibility(8);
    L29:
        PFMedium r16 = (PFMedium) r3.v(R.id.tv_btn);
        if (r16 == null) goto L32;
        r16.setVisibility(8);
    L32:
        ImageView r17 = (ImageView) r3.v(R.id.checkBox);
        if (r17 == null) goto L43;
        r17.setVisibility(0);
        int r18 = r1.XiOIO();
        if (r18 != 0) goto L37;
        int r19 = R.drawable.ic_charge_check_square_false;
    L41:
        r17.setImageResource(r19);
        goto L43
    L37:
        if (r18 == 1) goto L39;
        r19 = R.drawable.ic_charge_check_square_disable;
        goto L41
    L39:
        r19 = R.drawable.file_check_icon;
    L43:
        return Unit.OXO1;
    L11:
        if (r1.iIiiO() == false) goto L13;
    L16:
        int r20 = 0;
    L17:
        r13.setVisibility(r20);
        if (r1.iIiiO() == false) goto L21;
        r13.setText(R.string.language_update2__state_exist);
    L21:
        if (r1.XX0() == false) goto L23;
        r13.setText(R.string.language_update2__state_updated);
        goto L23
    L13:
        if (r1.XX0() == true) goto L16;
        r20 = 8;
        goto L17
    }

    private static final Unit showAddUI$lambda$0$0$0$0$0$1(y44 r8, DslAdapter r9, DslAdapterItem r10, LanguageUpdateActivity2 r11, View r12) {
        Intrinsics.X0O(r12, "it");
        int r13 = r8.XiOIO();
        int r0 = 0;
        if (r13 == 0) goto L8;
        if (r13 == 1) goto L7;
        ToastUtils.showLong(R.string.language_update2__tip_select_exist);
        return Unit.OXO1;
    L7:
        int r14 = 0;
    L9:
        r8.OiIIX101O(r14);
        DslAdapter.notifyItemChanged$default(r9, r10, null, false, 6, null);
        Button r15 = r11.getBtnBottom();
        List<y44> r16 = r11.getViewModel().getMServiceLanguageData();
        if ((r16 instanceof Collection) == true) goto L12;
    L14:
        Iterator<T> r17 = r16.iterator();
    L16:
        if (r17.hasNext() == false) goto L22;
        if (((y44) r17.next()).XiOIO() != 1) goto L16;
        r0 = r0 + 1;
        if (r0 >= 0) goto L16;
        CollectionsKt__CollectionsKt.OO();
    L22:
        if (r0 != 0) goto L24;
        String r18 = "";
    L25:
        r15.setText(r11.getString(R.string.language_update2__btn_downloading_update, new Object[]{r18}));
        return Unit.OXO1;
    L24:
        r18 = I000IiI1O.iO.XIi00iiXO + r0 + I000IiI1O.iO.iO;
        goto L25
    L12:
        if (r16.isEmpty() == false) goto L14;
    L8:
        r14 = 1;
        goto L9
    }

    private final void showNormalUI() {
        getDslAdapter().clearItems();
        renderAdapter(new mk(this));
    }

    private static final Unit showNormalUI$lambda$0(final LanguageUpdateActivity2 r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        r1.getDslViewHolder().post(new jk(r1));
        return Unit.OXO1;
    }

    private static final Unit showNormalUI$lambda$0$0(final LanguageUpdateActivity2 r1) {
        r1.renderAdapter(new hk(r1));
        return Unit.OXO1;
    }

    private static final Unit showNormalUI$lambda$0$0$0(final LanguageUpdateActivity2 r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        Iterator<T> r0 = r4.getViewModel().getMDevLanguageData().iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L10;
        Object r2 = r0.next();
        int r3 = r1 + 1;
        if (r1 >= 0) goto L8;
        CollectionsKt__CollectionsKt.XOX0O0();
    L8:
        final iX1IIXX11 r6 = (iX1IIXX11) r2;
        DslAdapterExKt.O10IXXX0X(r5, R.layout.item_language_update, new gk(r6, r4));
        r1 = r3;
        goto L4
    L10:
        return Unit.OXO1;
    }

    private static final Unit showNormalUI$lambda$0$0$0$0$0(final iX1IIXX11 r1, final LanguageUpdateActivity2 r2, final DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemSwipeMenuFlag(4);
        r3.setItemSwipeMenuType(2);
        r3.setItemBindOverride(new ik(r1, r2, r3));
        return Unit.OXO1;
    }

    private static final Unit showNormalUI$lambda$0$0$0$0$0$0(final iX1IIXX11 r7, LanguageUpdateActivity2 r8, final DslAdapterItem r9, DslViewHolder r10, final int r11, DslAdapterItem r12, List r13) {
        Intrinsics.X0O(r10, "itemHolder");
        Intrinsics.X0O(r12, "<unused var>");
        Intrinsics.X0O(r13, "<unused var>");
        Languages r14 = Languages.INSTANCE;
        BleDeviceLanguagesItem r15 = r7.OXO1();
        Intrinsics.XXI(r15);
        Locale r16 = Languages.codeToLanguage$default(r14, r15.getMCode(), null, 2, null);
        r8.getResources().getConfiguration().setLocale(r16);
        r7.I0IIOi(UtilsKt.OIX0iXi(r8.getResources().getConfiguration().locale.getDisplayName(r16)));
        String r17 = r8.getResources().getConfiguration().locale.getDisplayName();
        Intrinsics.O10IXXX0X(r17, "getDisplayName(...)");
        r7.OIi0(r17);
        r8.getResources().getConfiguration().setLocale(Locale.getDefault());
        TextView r18 = r10.tv(R.id.tv_title1);
        if (r18 == null) goto L5;
        r18.setText(r7.iO());
    L5:
        TextView r19 = r10.tv(R.id.tv_title2);
        if (r19 == null) goto L8;
        r19.setText(r7.XO0O10());
    L8:
        PFMedium r110 = (PFMedium) r10.v(R.id.tv_state1);
        if (r110 == null) goto L14;
        if (r11 != 0) goto L12;
        int r1 = 0;
    L13:
        r110.setVisibility(r1);
        r110.setText(R.string.language_update2__state_now_enable);
        goto L14
    L12:
        r1 = 8;
    L14:
        PFMedium r111 = (PFMedium) r10.v(R.id.tv_state2);
        if (r111 == null) goto L17;
        r111.setVisibility(8);
    L17:
        final ImageButton r6 = (ImageButton) r10.v(R.id.bt_delete_language);
        if (r6 == null) goto L24;
        r6.setVisibility(0);
        if (r11 != 0) goto L22;
        r6.setBackgroundResource(R.color.line_color);
    L23:
        final LanguageUpdateActivity2 r5 = r8;
        final DslViewHolder r3 = r10;
        r6.setOnClickListener(new ek(r9, r3, r11, r5, r6));
    L25:
        PFMedium r20 = (PFMedium) r3.v(R.id.tv_btn);
        if (r20 == null) goto L32;
        r20.setVisibility(0);
        r20.setEnabled(r7.IIX1OXO());
        if (r20.isEnabled() == false) goto L30;
        int r21 = R.string.language_update2__btn_update;
    L31:
        r20.setText(r21);
        r20.setOnClickListener(new fk(r5, r7));
        goto L32
    L30:
        r21 = R.string.language_update2__btn_installed;
    L32:
        ImageView r22 = (ImageView) r3.v(R.id.checkBox);
        if (r22 == null) goto L36;
        r22.setVisibility(8);
    L36:
        return Unit.OXO1;
    L22:
        r6.setBackgroundResource(R.color.delete_bg_color);
        goto L23
    L24:
        r5 = r8;
        r3 = r10;
        goto L25
    }

    private static final void showNormalUI$lambda$0$0$0$0$0$0$2$0(final DslAdapterItem r2, DslViewHolder r3, final int r4, final LanguageUpdateActivity2 r5, ImageButton r6, View r7) {
        SwipeMenuHelper r8 = r2.get_itemSwipeMenuHelper();
        if (r8 == null) goto L5;
        r8.closeSwipeMenu(r3);
    L5:
        if (r4 != 0) goto L8;
        ToastUtils.showLong(R.string.language_update2__tip_delete_device_enable);
        return;
    L8:
        int r1 = 0;
        go0 r9 = new go0(r5, r1, 2, null);
        r9.O1O(R.string.language_update2__pop_delete_title);
        r9.iX(Integer.valueOf(R.string.language_update2__pop_delete_tip));
        r9.iX1O1(Integer.valueOf(R.string.cancel), new ok());
        r9.X1IX(R.string.confirm, new rj(r2, r5, r4));
        View r10 = r6.getRootView();
        Intrinsics.O10IXXX0X(r10, "getRootView(...)");
        r9.I1XOi1(r10);
    }

    private static final boolean showNormalUI$lambda$0$0$0$0$0$0$2$0$0$0() {
        return true;
    }

    private static final boolean showNormalUI$lambda$0$0$0$0$0$0$2$0$0$1(DslAdapterItem r4, LanguageUpdateActivity2 r5, int r6) {
        DslAdapter r0 = r4.getItemDslAdapter();
        int r1 = 0;
        if (r0 == null) goto L5;
        DslAdapter.removeItem$default(r0, r4, false, 2, null);
    L5:
        r5.getViewModel().removeDeviceLanguagesByIndex(r6);
        DslAdapter r7 = r4.getItemDslAdapter();
        if (r7 == null) goto L8;
        DslAdapter.updateItemDepend$default(r7, null, 1, null);
    L8:
        ImageView r8 = r5.getAbhTitleRight();
        if (r8 != null) goto L11;
    L17:
        return true;
    L11:
        if (r5.getViewModel().getUiType().getValue() == LanguageUiType.NORMAL) goto L13;
    L15:
        r1 = 4;
    L16:
        r8.setVisibility(r1);
        goto L17
    L13:
        if (r5.getViewModel().getMDevLanguageData().size() >= r5.getViewModel().getMLanguagesMaxCount()) goto L15;
        goto L15
    }

    private static final void showNormalUI$lambda$0$0$0$0$0$0$3$0(LanguageUpdateActivity2 r0, iX1IIXX11 r1, View r2) {
        r0.getViewModel().updateLanguage(X0iO1XX.I0iXXO(r1));
    }

    private static final LanguageUpdateViewModel viewModel_delegate$lambda$0(LanguageUpdateActivity2 r1) {
        return (LanguageUpdateViewModel) new ViewModelProvider(r1).get(LanguageUpdateViewModel.class);
    }

    public final boolean getMStarted() {
        return this.mStarted;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        TextView r0 = getAbhTitleCenter();
        if (r0 == null) goto L5;
        r0.setText(R.string.language_update2__language_setting);
    L5:
        getRecyclerView().setHasFixedSize(false);
        LanguageUpdateViewModel.refreshData$default(getViewModel(), null, 1, null);
        getViewModel().getUiType().observe(this, new OXO1(new qj(this)));
        getViewModel().getPopup().observe(this, new OXO1(new bk(this)));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_language_update_2;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        getViewModel().bottomClick();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMLanguageUpdateProgressPopup().isShowing() == false) goto L6;
        return;
    L6:
        if (getViewModel().getUiType().getValue() != LanguageUiType.ADD) goto L9;
        getViewModel().getUiType().setValue(LanguageUiType.NORMAL);
        return;
    L9:
        super.onHandleBackPressed();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMStarted(boolean r1) {
        this.mStarted = r1;
        if (r1 == false) goto L6;
        disableOrientation();
        return;
    }
}

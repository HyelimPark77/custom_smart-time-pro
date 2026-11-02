package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.X1Oi0i;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ab1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bb1;
import com.android.mltcode.paycertificationapi.cb1;
import com.android.mltcode.paycertificationapi.db1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.eb1;
import com.android.mltcode.paycertificationapi.fb1;
import com.android.mltcode.paycertificationapi.gb1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.la1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qa1;
import com.android.mltcode.paycertificationapi.ra1;
import com.android.mltcode.paycertificationapi.sa1;
import com.android.mltcode.paycertificationapi.ta1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ua1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.va1;
import com.android.mltcode.paycertificationapi.vg6;
import com.android.mltcode.paycertificationapi.wa1;
import com.android.mltcode.paycertificationapi.xa1;
import com.android.mltcode.paycertificationapi.ya1;
import com.android.mltcode.paycertificationapi.za1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nNotificationSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n55#2,12:354\n84#2,3:366\n1563#3:369\n1634#3,3:370\n1563#3:373\n1634#3,3:374\n774#3:377\n865#3,2:378\n774#3:380\n865#3,2:381\n13805#4,2:383\n1#5:385\n*S KotlinDebug\n*F\n+ 1 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n*L\n118#1:354,12\n118#1:366,3\n127#1:369\n127#1:370,3\n132#1:373\n132#1:374,3\n155#1:377\n155#1:378,2\n162#1:380\n162#1:381,2\n177#1:383,2\n*E\n"})
public final class NotificationSettingsActivity extends BaseListFunctionActivity<X1Oi0i> implements CompoundButton.OnCheckedChangeListener {

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy checkCall$delegate;

    @aa1
    private final Lazy checkMirrorPhone$delegate;

    @aa1
    private final Lazy checkSms$delegate;

    @aa1
    private final Lazy defautListView$delegate;

    @aa1
    private final Lazy ll$delegate;

    @aa1
    private List<X1Oi0i> mCacheDefaultList;

    @aa1
    private List<X1Oi0i> mCacheList;
    public XII0Oi10O<X1Oi0i> mCommonAdapter;

    @aa1
    private final List<X1Oi0i> mDefaultList;

    @tb1
    private uq mLoadingPopup;

    @aa1
    private final Lazy otherPanel$delegate;

    @aa1
    private final Lazy searchEditText$delegate;

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n121#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ NotificationSettingsActivity IO;

        public OXO1(NotificationSettingsActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            NotificationSettingsActivity.access$textChanged(this.IO, r2);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class XIi00iiXO extends XII0Oi10O<X1Oi0i> {
        public final /* synthetic */ NotificationSettingsActivity X11iII1O1;

        public XIi00iiXO(NotificationSettingsActivity r1, Activity r2, List<X1Oi0i> r3) {
            this.X11iII1O1 = r1;
            super(r2, R.layout.item_notification, r3);
        }

        public static /* synthetic */ void O00(NotificationSettingsActivity r0, int r1, View r2) {
            XOO0ii0(r0, r1, r2);
        }

        public static final void XOO0ii0(NotificationSettingsActivity r3, int r4, View r5) {
            r3.getMDefaultList().get(r4).O00(!r3.getMDefaultList().get(r4).XO0O10());
            a01.OXO1.iO().put(b01.OXO1 + r3.getMDefaultList().get(r4).iO(), r3.getMDefaultList().get(r4).XO0O10());
            LogUtils.d(new Object[]{r3.getMDefaultList().get(r4).toString()});
        }

        public void IiI10X(ug6 r6, X1Oi0i r7, final int r8) {
            Intrinsics.X0O(r6, "holder");
            Intrinsics.X0O(r7, MapController.ITEM_LAYER_TAG);
            final NotificationSettingsActivity r9 = this.X11iII1O1;
            r6.I0iXXO(R.id.iv_icon, r9.getMDefaultList().get(r8).OXO1());
            r6.OII(R.id.tv_name, r9.getMDefaultList().get(r8).XIi00iiXO());
            r9.getMDefaultList().get(r8).O00(a01.OXO1.iO().getBoolean(b01.OXO1 + r9.getMDefaultList().get(r8).iO(), false));
            r6.IO(R.id.check_enabled, r9.getMDefaultList().get(r8).XO0O10());
            vg6.OXO1(r6, R.id.check_enabled, new fb1(r9, r8));
        }

        @Override // com.android.mltcode.paycertificationapi.XII0Oi10O, com.android.mltcode.paycertificationapi.sv0
        public /* bridge */ /* synthetic */ void XIi00iiXO(ug6 r1, Object r2, int r3) {
            IiI10X(r1, (X1Oi0i) r2, r3);
        }

        @Override // com.android.mltcode.paycertificationapi.sv0, android.widget.Adapter
        public int getCount() {
            return this.X11iII1O1.getMDefaultList().size();
        }
    }

    public NotificationSettingsActivity() {
        this.ll$delegate = LazyKt__LazyJVMKt.iO(new ab1(this));
        this.checkCall$delegate = LazyKt__LazyJVMKt.iO(new bb1(this));
        this.checkSms$delegate = LazyKt__LazyJVMKt.iO(new cb1(this));
        this.checkMirrorPhone$delegate = LazyKt__LazyJVMKt.iO(new db1(this));
        this.otherPanel$delegate = LazyKt__LazyJVMKt.iO(new eb1(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new ra1(this));
        this.defautListView$delegate = LazyKt__LazyJVMKt.iO(new sa1(this));
        this.searchEditText$delegate = LazyKt__LazyJVMKt.iO(new ta1(this));
        this.mDefaultList = new ArrayList();
        this.mCacheDefaultList = new ArrayList();
        this.mCacheList = new ArrayList();
    }

    public static /* synthetic */ CheckBox I1(NotificationSettingsActivity r0) {
        return checkCall_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(boolean r0, NotificationSettingsActivity r1, CompoundButton r2, PermissionStatus r3) {
        return onCheckedChanged$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ EditText IIX1OXO(NotificationSettingsActivity r0) {
        return searchEditText_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox O10IXXX0X(NotificationSettingsActivity r0) {
        return checkSms_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OII(NotificationSettingsActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ListView OX(NotificationSettingsActivity r0) {
        return defautListView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(NotificationSettingsActivity r0) {
        textChanged$lambda$2(r0);
    }

    public static /* synthetic */ Unit X01IiOiIi(boolean r0, NotificationSettingsActivity r1, CompoundButton r2, PermissionStatus r3) {
        return onCheckedChanged$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ void X0O(NotificationSettingsActivity r0) {
        showOthersList$lambda$0$0(r0);
    }

    public static /* synthetic */ void X1ii(NotificationSettingsActivity r0, int r1, View r2) {
        initItem$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ View XX0(NotificationSettingsActivity r0) {
        return otherPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(NotificationSettingsActivity r0, boolean r1) {
        updateOthers$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(NotificationSettingsActivity r0) {
        return showOthersList$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(NotificationSettingsActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$textChanged(NotificationSettingsActivity r0, Editable r1) {
        r0.textChanged(r1);
    }

    private static final CheckBox checkCall_delegate$lambda$0(NotificationSettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_call);
    }

    private static final CheckBox checkMirrorPhone_delegate$lambda$0(NotificationSettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_mirror_phone);
    }

    private static final CheckBox checkSms_delegate$lambda$0(NotificationSettingsActivity r1) {
        return (CheckBox) r1.findViewById(R.id.check_sms);
    }

    private static final ListView defautListView_delegate$lambda$0(NotificationSettingsActivity r1) {
        return (ListView) r1.findViewById(R.id.default_list_view);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final CheckBox getCheckCall() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckMirrorPhone() {
        return (CheckBox) getValue();
    }

    private final CheckBox getCheckSms() {
        return (CheckBox) getValue();
    }

    private final ListView getDefautListView() {
        return (ListView) getValue();
    }

    private final View getLl() {
        return (View) getValue();
    }

    private final View getOtherPanel() {
        return (View) getValue();
    }

    private final EditText getSearchEditText() {
        return (EditText) getValue();
    }

    public static /* synthetic */ CheckBox iIiiO(NotificationSettingsActivity r0) {
        return checkMirrorPhone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iOOX010X(NotificationSettingsActivity r0) {
        return ll_delegate$lambda$0(r0);
    }

    private static final void initItem$lambda$0$0(NotificationSettingsActivity r3, int r4, View r5) {
        r3.getMList().get(r4).O00(!r3.getMList().get(r4).XO0O10());
        a01.OXO1.iO().put(b01.OXO1 + r3.getMList().get(r4).iO(), r3.getMList().get(r4).XO0O10());
        LogUtils.d(new Object[]{r3.getMList().get(r4).toString()});
    }

    private static final View ll_delegate$lambda$0(NotificationSettingsActivity r1) {
        return r1.findViewById(R.id.ll);
    }

    private static final Unit onCheckedChanged$lambda$0(boolean r1, NotificationSettingsActivity r2, CompoundButton r3, PermissionStatus r4) {
        Intrinsics.X0O(r4, "it");
        if (r4 != PermissionStatus.GRANTED) goto L5;
        a01.OXO1.iO().put(b01.XIi00iiXO, r1);
        BleInitializer r5 = BleInitializer.IO;
        r5.IOI();
        r5.IIX(r2.getMContext());
    L7:
        return Unit.OXO1;
    L5:
        r2.permissionRemind();
        r3.setChecked(!r1);
        goto L7
    }

    private static final Unit onCheckedChanged$lambda$1(boolean r1, NotificationSettingsActivity r2, CompoundButton r3, PermissionStatus r4) {
        Intrinsics.X0O(r4, "it");
        if (r4 != PermissionStatus.GRANTED) goto L5;
        a01.OXO1.iO().put(b01.iO, r1);
        BleInitializer.IO.O0i();
    L7:
        return Unit.OXO1;
    L5:
        r2.permissionRemind();
        r3.setChecked(!r1);
        goto L7
    }

    private static final View otherPanel_delegate$lambda$0(NotificationSettingsActivity r1) {
        return r1.findViewById(R.id.other_panel);
    }

    private static final EditText searchEditText_delegate$lambda$0(NotificationSettingsActivity r1) {
        return (EditText) r1.findViewById(R.id.notification_search);
    }

    private final void showDefaultList() {
        String[] r0 = i72.OXO1.I1();
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L16;
        String r4 = r0[r3];
        ApplicationInfo r5 = getPackageManager().getApplicationInfo(r4, 0);     // Catch: Exception -> L7
    L8:
        if (r5 == null) goto L11;
        X1Oi0i r6 = new X1Oi0i();
        r6.IiI10X(r5.loadIcon(getPackageManager()));
        r6.XOO0ii0(r5.loadLabel(getPackageManager()).toString());
        r6.I0IIOi(r5.packageName);
        this.mDefaultList.add(r6);
    L15:
        r3 = r3 + 1;
        goto L3
    L11:
        if (i72.OXO1.O0Ii() == false) goto L15;
        Pair<Integer, String> r7 = la1.OXO1.OXO1(r4);
        int r8 = r7.component1().intValue();
        String r9 = r7.component2();
        if (r9.length() <= 0) goto L15;
        X1Oi0i r10 = new X1Oi0i();
        r10.IiI10X(getDrawable(r8));
        r10.XOO0ii0(r9);
        r10.I0IIOi(r4);
        this.mDefaultList.add(r10);
    L7:
        r5 = null;
        goto L8
    L16:
        XIi00iiXO r2 = new XIi00iiXO(this, getMContext(), this.mDefaultList);
        getDefautListView().setAdapter(r2);
        setMCommonAdapter(r2);
    }

    private final void showOthersList() {
        ThreadsKt.iO(false, false, null, null, 0, new wa1(this), 31, null);
    }

    private static final Unit showOthersList$lambda$0(final NotificationSettingsActivity r5) {
        List<ApplicationInfo> r0 = r5.getPackageManager().getInstalledApplications(8192);
        Intrinsics.O10IXXX0X(r0, "getInstalledApplications(...)");
        Iterator<ApplicationInfo> r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L17;
        ApplicationInfo r2 = r1.next();
        i72 r3 = i72.OXO1;
        if (r3.XX00XX() == true) goto L13;
        int r4 = r2.flags;
        if ((r4 & 128) != 0) goto L4;
        if ((r4 & 1) != 0) goto L4;
    L13:
        if (ArraysKt___ArraysKt.XOOOI0X(r3.I1(), r2.packageName) == true) goto L4;
        if (TextUtils.equals(r5.getPackageName(), r2.packageName) == true) goto L4;
        X1Oi0i r6 = new X1Oi0i();
        r6.IiI10X(r2.loadIcon(r5.getPackageManager()));
        r6.XOO0ii0(r2.loadLabel(r5.getPackageManager()).toString());
        r6.I0IIOi(r2.packageName);
        r5.getMList().add(r6);
        goto L4
    L17:
        r5.runOnUiThread(new va1(r5));
        return Unit.OXO1;
    }

    private static final void showOthersList$lambda$0$0(NotificationSettingsActivity r0) {
        r0.getMListAdapter().notifyDataSetChanged();
    }

    private final void textChanged(Editable r10) {
        if (this.mCacheDefaultList.size() != 0) goto L11;
        if (this.mDefaultList.isEmpty() == true) goto L11;
        List<X1Oi0i> r0 = this.mDefaultList;
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r1 = r0.iterator();
    L8:
        if (r1.hasNext() == false) goto L11;
        X1Oi0i r3 = (X1Oi0i) r1.next();
        r2.add(Boolean.valueOf(this.mCacheDefaultList.add(r3)));
    L11:
        if (this.mCacheList.size() == 0) goto L13;
    L18:
        if (r10 == null) goto L24;
        if (r10.length() != 0) goto L24;
        showLoadingPopup();
        ArrayList r11 = (ArrayList) CollectionsKt___CollectionsKt.XiOOOi0(this.mCacheDefaultList, new ArrayList());
        this.mDefaultList.clear();
        this.mDefaultList.addAll(r11);
        getMCommonAdapter().notifyDataSetChanged();
        ArrayList r12 = (ArrayList) CollectionsKt___CollectionsKt.XiOOOi0(this.mCacheList, new ArrayList());
        getMList().clear();
        getMList().addAll(r12);
        getMListAdapter().notifyDataSetChanged();
        getMListView().postDelayed(new za1(this), 1000);
        return;
    L24:
        if (this.mDefaultList.isEmpty() == true) goto L35;
        List<X1Oi0i> r4 = this.mDefaultList;
        ArrayList r5 = new ArrayList();
        Iterator<T> r6 = r4.iterator();
    L27:
        if (r6.hasNext() == false) goto L33;
        Object r7 = r6.next();
        String r8 = ((X1Oi0i) r7).XIi00iiXO();
        if (r8 == null) goto L27;
        if (StringsKt__StringsKt.iIi011O(r8, String.valueOf(r10), false, 2, null) != true) goto L27;
        r5.add(r7);
        goto L27
    L33:
        this.mDefaultList.clear();
        this.mDefaultList.addAll(r5);
        getMCommonAdapter().notifyDataSetChanged();
    L35:
        if (getMList().isEmpty() == true) goto L62;
        List<X1Oi0i> r9 = getMList();
        ArrayList r13 = new ArrayList();
        Iterator<T> r14 = r9.iterator();
    L38:
        if (r14.hasNext() == false) goto L44;
        Object r15 = r14.next();
        String r16 = ((X1Oi0i) r15).XIi00iiXO();
        if (r16 == null) goto L38;
        if (StringsKt__StringsKt.iIi011O(r16, String.valueOf(r10), false, 2, null) != true) goto L38;
        r13.add(r15);
        goto L38
    L44:
        getMList().clear();
        getMList().addAll(r13);
        getMListAdapter().notifyDataSetChanged();
        return;
    L62:
        return;
    L13:
        if (getMList().isEmpty() == true) goto L18;
        List<X1Oi0i> r17 = getMList();
        ArrayList r18 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r17, 10));
        Iterator<T> r19 = r17.iterator();
    L16:
        if (r19.hasNext() == false) goto L18;
        X1Oi0i r20 = (X1Oi0i) r19.next();
        r18.add(Boolean.valueOf(this.mCacheList.add(r20)));
        goto L16
    }

    private static final void textChanged$lambda$2(NotificationSettingsActivity r0) {
        r0.disLoadingPopup();
    }

    private final void updateOthers(final boolean r3) {
        new Handler().post(new ua1(this, r3));
    }

    private static final void updateOthers$lambda$0(NotificationSettingsActivity r0, boolean r1) {
        View r2 = r0.getOtherPanel();
        if (r1 == false) goto L5;
        int r3 = 8;
    L6:
        r2.setVisibility(r3);
        return;
    L5:
        r3 = 0;
        goto L6
    }

    public final void disLoadingPopup() {
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    @aa1
    public final List<X1Oi0i> getMCacheDefaultList() {
        return this.mCacheDefaultList;
    }

    @aa1
    public final List<X1Oi0i> getMCacheList() {
        return this.mCacheList;
    }

    @aa1
    public final XII0Oi10O<X1Oi0i> getMCommonAdapter() {
        XII0Oi10O<X1Oi0i> r0 = this.mCommonAdapter;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mCommonAdapter");
        return null;
    }

    @aa1
    public final List<X1Oi0i> getMDefaultList() {
        return this.mDefaultList;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (X1Oi0i) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<X1Oi0i> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.message_push);
        getAbhTitleRight().setImageResource(R.drawable.pic_about_white);
        getAbhTitleRight().setVisibility(0);
        boolean r2 = true;
        if (q62.OXO1.OI() == false) goto L11;
        getLl().setVisibility(0);
        boolean r0 = a01.OXO1.iO().getBoolean(b01.XIi00iiXO, false);
        CheckBox r3 = getCheckCall();
        if (r0 == false) goto L9;
        String[] r1 = gb1.OXO1();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r1, r1.length)) == false) goto L9;
        boolean r4 = true;
    L10:
        r3.setChecked(r4);
    L12:
        i72 r5 = i72.OXO1;
        if (r5.Xi1i0XOX0() == false) goto L15;
        getLl().setVisibility(8);
    L15:
        a01 r6 = a01.OXO1;
        boolean r7 = r6.iO().getBoolean(b01.iO, false);
        CheckBox r8 = getCheckSms();
        if (r7 == false) goto L20;
        String[] r9 = gb1.XIi00iiXO();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r9, r9.length)) == false) goto L20;
    L21:
        r8.setChecked(r2);
        boolean r10 = r6.iO().getBoolean(b01.XO0O10, false);
        getCheckMirrorPhone().setChecked(r10);
        updateOthers(r10);
        getCheckCall().setOnCheckedChangeListener(this);
        getCheckSms().setOnCheckedChangeListener(this);
        getCheckMirrorPhone().setOnCheckedChangeListener(this);
        getMListView().setEmptyView(findViewById(R.id.empty));
        showDefaultList();
        showOthersList();
        EditText r11 = getSearchEditText();
        if (r11 == null) goto L25;
        r11.setBackgroundTintList(ColorStateList.valueOf(gk4.iO(getMContext(), R.color.view_page_secondary_bg)));
    L25:
        if (r5.XOOI0O() == false) goto L27;
        getSearchEditText().setVisibility(8);
    L27:
        EditText r12 = getSearchEditText();
        Intrinsics.O10IXXX0X(r12, "<get-searchEditText>(...)");
        r12.addTextChangedListener(new OXO1(this));
        return;
    L20:
        r2 = false;
    L9:
        r4 = false;
        goto L10
    L11:
        getLl().setVisibility(8);
        a01.OXO1.iO().put(b01.XIi00iiXO, false);
        BleInitializer.IO.IOI();
        goto L12
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_notification_others;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_notification_settings;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@aa1 final CompoundButton r10, final boolean r11) {
        Intrinsics.X0O(r10, "buttonView");
        int r0 = r10.getId();
        if (r0 != R.id.check_call) goto L5;
        if (r11 == false) goto L19;
        PermissionUtils r3 = PermissionUtils.permission(new String[]{"PHONE", PermissionConstants.CONTACTS});
        Intrinsics.O10IXXX0X(r3, "permission(...)");
        ds1.iO(r3, null, null, new xa1(r11, this, r10), 3, null);
        return;
    L19:
        a01.OXO1.iO().put(b01.XIi00iiXO, r11);
        BleInitializer.IO.IOI();
        return;
    L5:
        if (r0 != R.id.check_mirror_phone) goto L7;
        a01.OXO1.iO().put(b01.XO0O10, r11);
        updateOthers(r11);
        return;
    L7:
        if (r0 == R.id.check_sms) goto L9;
        return;
    L9:
        if (r11 == false) goto L12;
        PermissionUtils r4 = PermissionUtils.permission(new String[]{PermissionConstants.SMS});
        Intrinsics.O10IXXX0X(r4, "permission(...)");
        ds1.iO(r4, null, null, new ya1(r11, this, r10), 3, null);
        return;
    L12:
        a01.OXO1.iO().put(b01.iO, r11);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        disLoadingPopup();
        super.onDestroy();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i72.OXO1.IOIX1OI0(getMContext());
    }

    public final void setMCacheDefaultList(@aa1 List<X1Oi0i> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCacheDefaultList = r2;
    }

    public final void setMCacheList(@aa1 List<X1Oi0i> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCacheList = r2;
    }

    public final void setMCommonAdapter(@aa1 XII0Oi10O<X1Oi0i> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCommonAdapter = r2;
    }

    public final void showLoadingPopup() {
        if (this.mLoadingPopup != null) goto L5;
        this.mLoadingPopup = new uq(this);
    L5:
        uq r0 = this.mLoadingPopup;
        if (r0 != null) goto L8;
    L10:
        uq r1 = this.mLoadingPopup;
        if (r1 == null) goto L14;
        r1.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r0.isShowing() != true) goto L10;
    }

    public void initItem(@aa1 ug6 r5, @aa1 X1Oi0i r6, final int r7) {
        Intrinsics.X0O(r5, "holder");
        Intrinsics.X0O(r6, MapController.ITEM_LAYER_TAG);
        r5.I0iXXO(R.id.iv_icon, getMList().get(r7).OXO1());
        r5.OII(R.id.tv_name, getMList().get(r7).XIi00iiXO());
        getMList().get(r7).O00(a01.OXO1.iO().getBoolean(b01.OXO1 + getMList().get(r7).iO(), false));
        r5.IO(R.id.check_enabled, getMList().get(r7).XO0O10());
        vg6.OXO1(r5, R.id.check_enabled, new qa1(this, r7));
    }
}

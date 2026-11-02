package com.sma.smartv3.p610ui.device;

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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.X1Oi0i;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gb1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.la1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.vg6;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.p610ui.device.NotificationSettingsActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nNotificationSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n55#2,12:354\n84#2,3:366\n1563#3:369\n1634#3,3:370\n1563#3:373\n1634#3,3:374\n774#3:377\n865#3,2:378\n774#3:380\n865#3,2:381\n13805#4,2:383\n1#5:385\n*S KotlinDebug\n*F\n+ 1 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n*L\n118#1:354,12\n118#1:366,3\n127#1:369\n127#1:370,3\n132#1:373\n132#1:374,3\n155#1:377\n155#1:378,2\n162#1:380\n162#1:381,2\n177#1:383,2\n*E\n"})
public final class NotificationSettingsActivity extends BaseListFunctionActivity<X1Oi0i> implements CompoundButton.OnCheckedChangeListener {
    public XII0Oi10O<X1Oi0i> mCommonAdapter;

    @tb1
    private C3006uq mLoadingPopup;

    @aa1
    private final Lazy ll$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ab1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NotificationSettingsActivity.ll_delegate$lambda$0(this.f5455IO);
        }
    });

    @aa1
    private final Lazy checkCall$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bb1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NotificationSettingsActivity.checkCall_delegate$lambda$0(this.f5698IO);
        }
    });

    @aa1
    private final Lazy checkSms$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cb1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NotificationSettingsActivity.checkSms_delegate$lambda$0(this.f5941IO);
        }
    });

    @aa1
    private final Lazy checkMirrorPhone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.db1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NotificationSettingsActivity.checkMirrorPhone_delegate$lambda$0(this.f6159IO);
        }
    });

    @aa1
    private final Lazy otherPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eb1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NotificationSettingsActivity.otherPanel_delegate$lambda$0(this.f6375IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ra1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NotificationSettingsActivity.abhTitleRight_delegate$lambda$0(this.f10776IO);
        }
    });

    @aa1
    private final Lazy defautListView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sa1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NotificationSettingsActivity.defautListView_delegate$lambda$0(this.f10992IO);
        }
    });

    @aa1
    private final Lazy searchEditText$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ta1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NotificationSettingsActivity.searchEditText_delegate$lambda$0(this.f11220IO);
        }
    });

    @aa1
    private final List<X1Oi0i> mDefaultList = new ArrayList();

    @aa1
    private List<X1Oi0i> mCacheDefaultList = new ArrayList();

    @aa1
    private List<X1Oi0i> mCacheList = new ArrayList();

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 NotificationSettingsActivity.kt\ncom/sma/smartv3/ui/device/NotificationSettingsActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n121#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            NotificationSettingsActivity.this.textChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class XIi00iiXO extends XII0Oi10O<X1Oi0i> {
        public XIi00iiXO(Activity activity, List<X1Oi0i> list) {
            super(activity, R.layout.item_notification, list);
        }

        public static final void XOO0ii0(NotificationSettingsActivity notificationSettingsActivity, int i, View view) {
            notificationSettingsActivity.getMDefaultList().get(i).O00(!notificationSettingsActivity.getMDefaultList().get(i).XO0O10());
            a01.OXO1.m1440iO().put(b01.OXO1 + notificationSettingsActivity.getMDefaultList().get(i).m1164iO(), notificationSettingsActivity.getMDefaultList().get(i).XO0O10());
            LogUtils.m11128d(notificationSettingsActivity.getMDefaultList().get(i).toString());
        }

        @Override // com.android.mltcode.paycertificationapi.XII0Oi10O, com.android.mltcode.paycertificationapi.sv0
        /* JADX INFO: renamed from: IiI10X, reason: merged with bridge method [inline-methods] */
        public void XIi00iiXO(ug6 holder, X1Oi0i item, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(item, "item");
            final NotificationSettingsActivity notificationSettingsActivity = NotificationSettingsActivity.this;
            holder.I0iXXO(R.id.iv_icon, notificationSettingsActivity.getMDefaultList().get(i).OXO1());
            holder.OII(R.id.tv_name, notificationSettingsActivity.getMDefaultList().get(i).XIi00iiXO());
            notificationSettingsActivity.getMDefaultList().get(i).O00(a01.OXO1.m1440iO().getBoolean(b01.OXO1 + notificationSettingsActivity.getMDefaultList().get(i).m1164iO(), false));
            holder.m3168IO(R.id.check_enabled, notificationSettingsActivity.getMDefaultList().get(i).XO0O10());
            vg6.OXO1(holder, R.id.check_enabled, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.fb1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NotificationSettingsActivity.XIi00iiXO.XOO0ii0(notificationSettingsActivity, i, view);
                }
            });
        }

        @Override // com.android.mltcode.paycertificationapi.sv0, android.widget.Adapter
        public int getCount() {
            return NotificationSettingsActivity.this.getMDefaultList().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(NotificationSettingsActivity notificationSettingsActivity) {
        return (ImageView) notificationSettingsActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkCall_delegate$lambda$0(NotificationSettingsActivity notificationSettingsActivity) {
        return (CheckBox) notificationSettingsActivity.findViewById(R.id.check_call);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkMirrorPhone_delegate$lambda$0(NotificationSettingsActivity notificationSettingsActivity) {
        return (CheckBox) notificationSettingsActivity.findViewById(R.id.check_mirror_phone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox checkSms_delegate$lambda$0(NotificationSettingsActivity notificationSettingsActivity) {
        return (CheckBox) notificationSettingsActivity.findViewById(R.id.check_sms);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListView defautListView_delegate$lambda$0(NotificationSettingsActivity notificationSettingsActivity) {
        return (ListView) notificationSettingsActivity.findViewById(R.id.default_list_view);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final CheckBox getCheckCall() {
        return (CheckBox) this.checkCall$delegate.getValue();
    }

    private final CheckBox getCheckMirrorPhone() {
        return (CheckBox) this.checkMirrorPhone$delegate.getValue();
    }

    private final CheckBox getCheckSms() {
        return (CheckBox) this.checkSms$delegate.getValue();
    }

    private final ListView getDefautListView() {
        return (ListView) this.defautListView$delegate.getValue();
    }

    private final View getLl() {
        return (View) this.ll$delegate.getValue();
    }

    private final View getOtherPanel() {
        return (View) this.otherPanel$delegate.getValue();
    }

    private final EditText getSearchEditText() {
        return (EditText) this.searchEditText$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$0$0(NotificationSettingsActivity notificationSettingsActivity, int i, View view) {
        notificationSettingsActivity.getMList().get(i).O00(!notificationSettingsActivity.getMList().get(i).XO0O10());
        a01.OXO1.m1440iO().put(b01.OXO1 + notificationSettingsActivity.getMList().get(i).m1164iO(), notificationSettingsActivity.getMList().get(i).XO0O10());
        LogUtils.m11128d(notificationSettingsActivity.getMList().get(i).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View ll_delegate$lambda$0(NotificationSettingsActivity notificationSettingsActivity) {
        return notificationSettingsActivity.findViewById(R.id.f51418ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCheckedChanged$lambda$0(boolean z, NotificationSettingsActivity notificationSettingsActivity, CompoundButton compoundButton, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            a01.OXO1.m1440iO().put(b01.XIi00iiXO, z);
            BleInitializer bleInitializer = BleInitializer.f51208IO;
            bleInitializer.IOI();
            bleInitializer.IIX(notificationSettingsActivity.getMContext());
        } else {
            notificationSettingsActivity.permissionRemind();
            compoundButton.setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCheckedChanged$lambda$1(boolean z, NotificationSettingsActivity notificationSettingsActivity, CompoundButton compoundButton, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            a01.OXO1.m1440iO().put(b01.f5637iO, z);
            BleInitializer.f51208IO.O0i();
        } else {
            notificationSettingsActivity.permissionRemind();
            compoundButton.setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View otherPanel_delegate$lambda$0(NotificationSettingsActivity notificationSettingsActivity) {
        return notificationSettingsActivity.findViewById(R.id.other_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText searchEditText_delegate$lambda$0(NotificationSettingsActivity notificationSettingsActivity) {
        return (EditText) notificationSettingsActivity.findViewById(R.id.notification_search);
    }

    private final void showDefaultList() {
        ApplicationInfo applicationInfo;
        for (String str : i72.OXO1.m2040I1()) {
            try {
                applicationInfo = getPackageManager().getApplicationInfo(str, 0);
            } catch (Exception unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                X1Oi0i x1Oi0i = new X1Oi0i();
                x1Oi0i.IiI10X(applicationInfo.loadIcon(getPackageManager()));
                x1Oi0i.XOO0ii0(applicationInfo.loadLabel(getPackageManager()).toString());
                x1Oi0i.I0IIOi(applicationInfo.packageName);
                this.mDefaultList.add(x1Oi0i);
            } else if (i72.OXO1.O0Ii()) {
                Pair<Integer, String> pairOXO1 = la1.OXO1.OXO1(str);
                int iIntValue = pairOXO1.component1().intValue();
                String strComponent2 = pairOXO1.component2();
                if (strComponent2.length() > 0) {
                    X1Oi0i x1Oi0i2 = new X1Oi0i();
                    x1Oi0i2.IiI10X(getDrawable(iIntValue));
                    x1Oi0i2.XOO0ii0(strComponent2);
                    x1Oi0i2.I0IIOi(str);
                    this.mDefaultList.add(x1Oi0i2);
                }
            }
        }
        XIi00iiXO xIi00iiXO = new XIi00iiXO(getMContext(), this.mDefaultList);
        getDefautListView().setAdapter((ListAdapter) xIi00iiXO);
        setMCommonAdapter(xIi00iiXO);
    }

    private final void showOthersList() {
        ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.wa1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return NotificationSettingsActivity.showOthersList$lambda$0(this.f11911IO);
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOthersList$lambda$0(final NotificationSettingsActivity notificationSettingsActivity) {
        List<ApplicationInfo> installedApplications = notificationSettingsActivity.getPackageManager().getInstalledApplications(8192);
        Intrinsics.O10IXXX0X(installedApplications, "getInstalledApplications(...)");
        for (ApplicationInfo applicationInfo : installedApplications) {
            i72 i72Var = i72.OXO1;
            if (!i72Var.XX00XX()) {
                int i = applicationInfo.flags;
                if ((i & 128) != 0 || (i & 1) != 0) {
                }
            }
            if (!ArraysKt___ArraysKt.XOOOI0X(i72Var.m2040I1(), applicationInfo.packageName) && !TextUtils.equals(notificationSettingsActivity.getPackageName(), applicationInfo.packageName)) {
                X1Oi0i x1Oi0i = new X1Oi0i();
                x1Oi0i.IiI10X(applicationInfo.loadIcon(notificationSettingsActivity.getPackageManager()));
                x1Oi0i.XOO0ii0(applicationInfo.loadLabel(notificationSettingsActivity.getPackageManager()).toString());
                x1Oi0i.I0IIOi(applicationInfo.packageName);
                notificationSettingsActivity.getMList().add(x1Oi0i);
            }
        }
        notificationSettingsActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.va1
            @Override // java.lang.Runnable
            public final void run() {
                NotificationSettingsActivity.showOthersList$lambda$0$0(this.f11685IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOthersList$lambda$0$0(NotificationSettingsActivity notificationSettingsActivity) {
        notificationSettingsActivity.getMListAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void textChanged(Editable editable) {
        if (this.mCacheDefaultList.size() == 0 && !this.mDefaultList.isEmpty()) {
            List<X1Oi0i> list = this.mDefaultList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(this.mCacheDefaultList.add((X1Oi0i) it.next())));
            }
        }
        if (this.mCacheList.size() == 0 && !getMList().isEmpty()) {
            List<X1Oi0i> mList = getMList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(mList, 10));
            Iterator<T> it2 = mList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boolean.valueOf(this.mCacheList.add((X1Oi0i) it2.next())));
            }
        }
        if (editable != null && editable.length() == 0) {
            showLoadingPopup();
            ArrayList arrayList3 = (ArrayList) CollectionsKt___CollectionsKt.XiOOOi0(this.mCacheDefaultList, new ArrayList());
            this.mDefaultList.clear();
            this.mDefaultList.addAll(arrayList3);
            getMCommonAdapter().notifyDataSetChanged();
            ArrayList arrayList4 = (ArrayList) CollectionsKt___CollectionsKt.XiOOOi0(this.mCacheList, new ArrayList());
            getMList().clear();
            getMList().addAll(arrayList4);
            getMListAdapter().notifyDataSetChanged();
            getMListView().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.za1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12573IO.disLoadingPopup();
                }
            }, 1000L);
            return;
        }
        if (!this.mDefaultList.isEmpty()) {
            List<X1Oi0i> list2 = this.mDefaultList;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : list2) {
                String strXIi00iiXO = ((X1Oi0i) obj).XIi00iiXO();
                if (strXIi00iiXO != null && StringsKt__StringsKt.iIi011O(strXIi00iiXO, String.valueOf(editable), false, 2, null)) {
                    arrayList5.add(obj);
                }
            }
            this.mDefaultList.clear();
            this.mDefaultList.addAll(arrayList5);
            getMCommonAdapter().notifyDataSetChanged();
        }
        if (getMList().isEmpty()) {
            return;
        }
        List<X1Oi0i> mList2 = getMList();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : mList2) {
            String strXIi00iiXO2 = ((X1Oi0i) obj2).XIi00iiXO();
            if (strXIi00iiXO2 != null && StringsKt__StringsKt.iIi011O(strXIi00iiXO2, String.valueOf(editable), false, 2, null)) {
                arrayList6.add(obj2);
            }
        }
        getMList().clear();
        getMList().addAll(arrayList6);
        getMListAdapter().notifyDataSetChanged();
    }

    private final void updateOthers(final boolean z) {
        new Handler().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ua1
            @Override // java.lang.Runnable
            public final void run() {
                NotificationSettingsActivity.updateOthers$lambda$0(this.f11452IO, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateOthers$lambda$0(NotificationSettingsActivity notificationSettingsActivity, boolean z) {
        notificationSettingsActivity.getOtherPanel().setVisibility(z ? 8 : 0);
    }

    public final void disLoadingPopup() {
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
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
        XII0Oi10O<X1Oi0i> xII0Oi10O = this.mCommonAdapter;
        if (xII0Oi10O != null) {
            return xII0Oi10O;
        }
        Intrinsics.XXO("mCommonAdapter");
        return null;
    }

    @aa1
    public final List<X1Oi0i> getMDefaultList() {
        return this.mDefaultList;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<X1Oi0i> initList() {
        return new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        boolean z;
        boolean z2;
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.message_push);
        getAbhTitleRight().setImageResource(R.drawable.pic_about_white);
        getAbhTitleRight().setVisibility(0);
        if (q62.OXO1.m2882OI()) {
            getLl().setVisibility(0);
            boolean z3 = a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO, false);
            CheckBox checkCall = getCheckCall();
            if (z3) {
                String[] strArrOXO1 = gb1.OXO1();
                if (PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrOXO1, strArrOXO1.length))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            checkCall.setChecked(z2);
        } else {
            getLl().setVisibility(8);
            a01.OXO1.m1440iO().put(b01.XIi00iiXO, false);
            BleInitializer.f51208IO.IOI();
        }
        i72 i72Var = i72.OXO1;
        if (i72Var.Xi1i0XOX0()) {
            getLl().setVisibility(8);
        }
        a01 a01Var = a01.OXO1;
        boolean z4 = a01Var.m1440iO().getBoolean(b01.f5637iO, false);
        CheckBox checkSms = getCheckSms();
        if (z4) {
            String[] strArrXIi00iiXO = gb1.XIi00iiXO();
            z = PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrXIi00iiXO, strArrXIi00iiXO.length));
        }
        checkSms.setChecked(z);
        boolean z5 = a01Var.m1440iO().getBoolean(b01.XO0O10, false);
        getCheckMirrorPhone().setChecked(z5);
        updateOthers(z5);
        getCheckCall().setOnCheckedChangeListener(this);
        getCheckSms().setOnCheckedChangeListener(this);
        getCheckMirrorPhone().setOnCheckedChangeListener(this);
        getMListView().setEmptyView(findViewById(R.id.empty));
        showDefaultList();
        showOthersList();
        EditText searchEditText = getSearchEditText();
        if (searchEditText != null) {
            searchEditText.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(getMContext(), R.color.view_page_secondary_bg)));
        }
        if (i72Var.XOOI0O()) {
            getSearchEditText().setVisibility(8);
        }
        EditText searchEditText2 = getSearchEditText();
        Intrinsics.O10IXXX0X(searchEditText2, "<get-searchEditText>(...)");
        searchEditText2.addTextChangedListener(new OXO1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_notification_others;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_notification_settings;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@aa1 final CompoundButton buttonView, final boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        int id = buttonView.getId();
        if (id == R.id.check_call) {
            if (!z) {
                a01.OXO1.m1440iO().put(b01.XIi00iiXO, z);
                BleInitializer.f51208IO.IOI();
                return;
            } else {
                PermissionUtils permissionUtilsPermission = PermissionUtils.permission("PHONE", PermissionConstants.CONTACTS);
                Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
                ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.xa1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return NotificationSettingsActivity.onCheckedChanged$lambda$0(z, this, buttonView, (PermissionStatus) obj);
                    }
                }, 3, null);
                return;
            }
        }
        if (id == R.id.check_mirror_phone) {
            a01.OXO1.m1440iO().put(b01.XO0O10, z);
            updateOthers(z);
        } else {
            if (id != R.id.check_sms) {
                return;
            }
            if (!z) {
                a01.OXO1.m1440iO().put(b01.f5637iO, z);
                return;
            }
            PermissionUtils permissionUtilsPermission2 = PermissionUtils.permission(PermissionConstants.SMS);
            Intrinsics.O10IXXX0X(permissionUtilsPermission2, "permission(...)");
            ds1.m1690iO(permissionUtilsPermission2, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.ya1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotificationSettingsActivity.onCheckedChanged$lambda$1(z, this, buttonView, (PermissionStatus) obj);
                }
            }, 3, null);
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        disLoadingPopup();
        super.onDestroy();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i72.OXO1.IOIX1OI0(getMContext());
    }

    public final void setMCacheDefaultList(@aa1 List<X1Oi0i> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCacheDefaultList = list;
    }

    public final void setMCacheList(@aa1 List<X1Oi0i> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCacheList = list;
    }

    public final void setMCommonAdapter(@aa1 XII0Oi10O<X1Oi0i> xII0Oi10O) {
        Intrinsics.X0O(xII0Oi10O, "<set-?>");
        this.mCommonAdapter = xII0Oi10O;
    }

    public final void showLoadingPopup() {
        C3006uq c3006uq;
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(this);
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if ((c3006uq2 == null || !c3006uq2.isShowing()) && (c3006uq = this.mLoadingPopup) != null) {
            c3006uq.IIX1OXO();
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 X1Oi0i item, final int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.I0iXXO(R.id.iv_icon, getMList().get(i).OXO1());
        holder.OII(R.id.tv_name, getMList().get(i).XIi00iiXO());
        getMList().get(i).O00(a01.OXO1.m1440iO().getBoolean(b01.OXO1 + getMList().get(i).m1164iO(), false));
        holder.m3168IO(R.id.check_enabled, getMList().get(i).XO0O10());
        vg6.OXO1(holder, R.id.check_enabled, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.qa1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationSettingsActivity.initItem$lambda$0$0(this.f10564IO, i, view);
            }
        });
    }
}

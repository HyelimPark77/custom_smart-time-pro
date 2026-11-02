package com.sma.smartv3.biz.fitness_site.hyky;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.II1O1i;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i0iOOOX0i;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiXXOi;
import com.android.mltcode.paycertificationapi.ng5;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.szabh.smable3.component.BleConnector;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n18#2,2:392\n15#2:394\n18#2,2:395\n15#2:397\n18#2,2:398\n15#2:400\n18#2,2:401\n15#2:403\n18#2,2:404\n15#2:406\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager\n*L\n57#1:392,2\n57#1:394\n71#1:395,2\n71#1:397\n72#1:398,2\n72#1:400\n95#1:401,2\n95#1:403\n178#1:404,2\n178#1:406\n*E\n"})
public final class HykyManager {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private static final Lazy<HykyManager> instance$delegate = null;

    @aa1
    private final String TAG;

    @aa1
    private AppUser mAppUser;

    @aa1
    private final HykyManager$mBleHandleCallback$1 mBleHandleCallback;

    @tb1
    private GetSNCodeHYKY.Response mDeviceCode;

    @aa1
    private final Lazy mHykyModel$delegate;

    @aa1
    private final Lazy mHykyUpload$delegate;

    @aa1
    private final i00OIXiO scope;

    @aa1
    private GetTokenHYKY.HykyTokenData token;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @aa1
        public final HykyManager getInstance() {
            return (HykyManager) HykyManager.access$getInstance$delegate$cp().getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyManager$bindDevice$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$bindDevice$1", f = "HykyManager.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isBind;
        int label;
        final /* synthetic */ HykyManager this$0;

        public AnonymousClass1(HykyManager r1, boolean r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r1;
            this.$isBind = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.this$0, this.$isBind, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r11);
            AnonymousClass1 r9 = this;
        L23:
            boolean r12 = ((Boolean) r11).booleanValue();
            i1O0OXO1O.OXO1.OXO1(HykyManager.access$getTAG$p(r9.this$0) + " bindDevice : " + r9.$isBind + " " + r12);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r11);
            HykyModel r3 = HykyManager.access$getMHykyModel(this.this$0);
            boolean r4 = this.$isBind;
            String r5 = this.this$0.getMAppUser().noAreaCodePhone();
            HykyUtils r13 = HykyUtils.INSTANCE;
            String r6 = r13.getDeviceMac(false);
            GetSNCodeHYKY.Response r2 = r13.getDeviceCode();
            if (r2 == null) goto L12;
            String r7 = r2.getSn();
            if (r7 == null) goto L12;
        L13:
            GetSNCodeHYKY.Response r14 = r13.getDeviceCode();
            if (r14 == null) goto L19;
            String r15 = r14.getCmei();
            if (r15 == null) goto L19;
            String r8 = r15;
        L20:
            this.label = 1;
            r9 = this;
            r11 = r3.bindDeviceToHyky(r4, r5, r6, r7, r8, r9);
            if (r11 != r0) goto L23;
            return r0;
        L19:
            r8 = "";
        L12:
            r7 = "";
            goto L13
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyManager$checkAuthStatus$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$checkAuthStatus$1", f = "HykyManager.kt", i = {1, 2}, l = {108, 115, 125}, m = "invokeSuspend", n = {"isAuth", "isAuth"}, s = {"Z$0", "Z$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1\n*L\n118#1:392,2\n*E\n"})
    public static final class C33891 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppUser $appUser;
        final /* synthetic */ String $deviceMAC;
        boolean Z$0;
        int label;
        final /* synthetic */ HykyManager this$0;

        public C33891(HykyManager r1, AppUser r2, String r3, Continuation<? super C33891> r4) {
            this.this$0 = r1;
            this.$appUser = r2;
            this.$deviceMAC = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new C33891(this.this$0, this.$appUser, this.$deviceMAC, r5);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33891) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L12;
            if (r1 == 1) goto L11;
            if (r1 == 2) goto L10;
            if (r1 != 3) goto L9;
            ResultKt.X1ii(r11);
            C33891 r9 = this;
        L42:
            boolean r12 = ((Boolean) r11).booleanValue();
            BleConnector.INSTANCE.addHandleCallback(HykyManager.access$getMBleHandleCallback$p(r9.this$0));
            i1O0OXO1O.OXO1.OXO1(HykyManager.access$getTAG$p(r9.this$0) + " checkAuthStatus scope.launch :bindSuccess = " + r12);
            return Unit.OXO1;
        L9:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L10:
            boolean r2 = this.Z$0;
            ResultKt.X1ii(r11);
        L22:
            GetSNCodeHYKY.Response r13 = (GetSNCodeHYKY.Response) r11;
            if (r13 == null) goto L27;
            HykyManager r3 = this.this$0;
            if (r13.deviceInfoExists() == false) goto L27;
            r3.setMDeviceCode(r13);
            a01.OXO1.iO().put(GetSNCodeHYKY.Response.class.getName(), new Gson().toJson(r13));
        L27:
            i1O0OXO1O.OXO1.OXO1(HykyManager.access$getTAG$p(this.this$0) + " checkAuthStatus scope.launch :mDeviceCode = " + this.this$0.getMDeviceCode());
            HykyModel r4 = HykyManager.access$getMHykyModel(this.this$0);
            String r5 = this.$appUser.noAreaCodePhone();
            String r6 = this.$deviceMAC;
            HykyUtils r14 = HykyUtils.INSTANCE;
            GetSNCodeHYKY.Response r7 = r14.getDeviceCode();
            if (r7 == null) goto L31;
            String r8 = r7.getSn();
            if (r8 == null) goto L31;
        L32:
            GetSNCodeHYKY.Response r15 = r14.getDeviceCode();
            if (r15 == null) goto L38;
            String r16 = r15.getCmei();
            if (r16 == null) goto L38;
            String r10 = r16;
        L39:
            this.Z$0 = r2;
            this.label = 3;
            r9 = this;
            r11 = r4.bindDeviceToHyky(true, r5, r6, r8, r10, r9);
            if (r11 != r0) goto L42;
        L41:
            return r0;
        L38:
            r10 = "";
        L31:
            r8 = "";
            goto L32
        L11:
            ResultKt.X1ii(r11);
        L15:
            r2 = ((Boolean) r11).booleanValue();
            i1O0OXO1O.OXO1.OXO1(HykyManager.access$getTAG$p(this.this$0) + " checkAuthStatus scope.launch :isAuth = " + r2);
            if (r2 == false) goto L18;
            HykyModel r17 = HykyManager.access$getMHykyModel(this.this$0);
            String r18 = this.$deviceMAC;
            this.Z$0 = r2;
            this.label = 2;
            r11 = r17.getSnInfo(r18, this);
            if (r11 != r0) goto L22;
        L18:
            return Unit.OXO1;
        L12:
            ResultKt.X1ii(r11);
            HykyModel r19 = HykyManager.access$getMHykyModel(this.this$0);
            String r20 = this.$appUser.getPhone();
            this.label = 1;
            r11 = r19.checkAuthStatus(r20, this);
            if (r11 != r0) goto L15;
            goto L15
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyManager$uploadDataWeight$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$uploadDataWeight$1", f = "HykyManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C33901 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Weight $it;
        int label;
        final /* synthetic */ HykyManager this$0;

        public C33901(Weight r1, HykyManager r2, Continuation<? super C33901> r3) {
            this.$it = r1;
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C33901(this.$it, this.this$0, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33901) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r2) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r2);
            ArrayList r3 = new ArrayList();
            r3.add(this.$it);
            this.this$0.uploadData(r3);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyManager$uploadDeviceInfo$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$uploadDeviceInfo$1", f = "HykyManager.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$uploadDeviceInfo$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$uploadDeviceInfo$1\n*L\n212#1:392,2\n*E\n"})
    public static final class C33911 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ HykyManager this$0;

        public C33911(HykyManager r1, Continuation<? super C33911> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C33911(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33911) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r6) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            HykyManager r2 = (HykyManager) this.L$0;
            ResultKt.X1ii(r6);
        L12:
            r2.setMDeviceCode((GetSNCodeHYKY.Response) r6);
            SPUtils r7 = a01.OXO1.iO();
            GetSNCodeHYKY.Response r3 = this.this$0.getMDeviceCode();
            r7.put(GetSNCodeHYKY.Response.class.getName(), new Gson().toJson(r3));
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r6);
            HykyManager r8 = this.this$0;
            HykyModel r4 = HykyManager.access$getMHykyModel(r8);
            String r5 = HykyUtils.INSTANCE.getDeviceMac(false);
            this.L$0 = r8;
            this.label = 1;
            Object r9 = r4.uploadDeviceInfoToHyky(r5, this);
            if (r9 != r0) goto L11;
            return r0;
        L11:
            r2 = r8;
            r6 = r9;
            goto L12
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        Companion = new Companion(null);
        instance$delegate = LazyKt__LazyJVMKt.iO(new II1O1i());
    }

    private HykyManager() {
        this.TAG = "HykyManager";
        this.scope = I0IIOi.OXO1(IXOX0Xiii.iO().plus(ng5.iO(null, 1, null)));
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.IiI10X();
        Object r2 = new Gson().fromJson(r1.getString(GetTokenHYKY.HykyTokenData.class.getName()), GetTokenHYKY.HykyTokenData.class);
        if (r2 != null) goto L5;
        r2 = GetTokenHYKY.HykyTokenData.class.newInstance();
    L5:
        this.token = (GetTokenHYKY.HykyTokenData) r2;
        this.mHykyUpload$delegate = LazyKt__LazyJVMKt.iO(new iX0XiXXOi());
        this.mHykyModel$delegate = LazyKt__LazyJVMKt.iO(new i0iOOOX0i());
        SPUtils r3 = r0.IiI10X();
        Object r4 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r4 != null) goto L8;
        r4 = AppUser.class.newInstance();
    L8:
        this.mAppUser = (AppUser) r4;
        SPUtils r5 = r0.iO();
        Object r6 = new Gson().fromJson(r5.getString(GetSNCodeHYKY.Response.class.getName()), GetSNCodeHYKY.Response.class);
        if (r6 != null) goto L11;
        r6 = GetSNCodeHYKY.Response.class.newInstance();
    L11:
        this.mDeviceCode = (GetSNCodeHYKY.Response) r6;
        this.mBleHandleCallback = new HykyManager$mBleHandleCallback$1(this);
    }

    public static /* synthetic */ HykyManager OXO1() {
        return instance_delegate$lambda$0();
    }

    public static /* synthetic */ HykyUpload XIi00iiXO() {
        return mHykyUpload_delegate$lambda$0();
    }

    public static final /* synthetic */ Lazy access$getInstance$delegate$cp() {
        return instance$delegate;
    }

    public static final /* synthetic */ HykyManager$mBleHandleCallback$1 access$getMBleHandleCallback$p(HykyManager r0) {
        return r0.mBleHandleCallback;
    }

    public static final /* synthetic */ HykyModel access$getMHykyModel(HykyManager r0) {
        return r0.getMHykyModel();
    }

    public static final /* synthetic */ String access$getTAG$p(HykyManager r0) {
        return r0.TAG;
    }

    @aa1
    public static final HykyManager getInstance() {
        return Companion.getInstance();
    }

    private final HykyModel getMHykyModel() {
        return (HykyModel) getValue();
    }

    private final HykyUpload getMHykyUpload() {
        return (HykyUpload) getValue();
    }

    public static /* synthetic */ HykyModel iO() {
        return mHykyModel_delegate$lambda$0();
    }

    private static final HykyManager instance_delegate$lambda$0() {
        return new HykyManager();
    }

    private final boolean isEnable() {
        a01 r0 = a01.OXO1;
        Object r1 = new Gson().fromJson(r0.IiI10X().getString(AppUser.class.getName()), AppUser.class);
        if (r1 != null) goto L5;
        r1 = AppUser.class.newInstance();
    L5:
        AppUser r2 = (AppUser) r1;
        boolean r3 = false;
        boolean r4 = r0.IiI10X().getBoolean(b01.OiO0IOX, false);
        GetSNCodeHYKY.Response r5 = this.mDeviceCode;
        if (r5 == null) goto L10;
        Intrinsics.XXI(r5);
        if (r5.deviceInfoExists() == false) goto L10;
        boolean r6 = true;
    L12:
        if (q62.OXO1.iIIX0XI() == true) goto L14;
    L18:
        if (r3 == false) goto L20;
        this.mAppUser = r2;
    L20:
        return r3;
    L14:
        if (r2.noAreaCodePhone().length() <= 0) goto L18;
        if (r6 == false) goto L18;
        if (r4 == false) goto L18;
        r3 = true;
    L10:
        r6 = false;
        goto L12
    }

    private static final HykyModel mHykyModel_delegate$lambda$0() {
        return new HykyModel();
    }

    private static final HykyUpload mHykyUpload_delegate$lambda$0() {
        return new HykyUpload();
    }

    public final void bindDevice(boolean r9) {
        if (r9 == true) goto L4;
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
    L4:
        I100X1.O00(this.scope, null, null, new AnonymousClass1(this, r9, null), 3, null);
    }

    public final void checkAuthStatus(@tb1 Activity r10) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        String r1 = this.TAG;
        q62 r2 = q62.OXO1;
        r0.OXO1(r1 + " checkAuthStatus: start " + r2.iIIX0XI());
        if (r2.iIIX0XI() == false) goto L22;
        if (r10 == null) goto L24;
        a01 r11 = a01.OXO1;
        if (r11.IiI10X().contains(b01.i1iII1i1) == true) goto L9;
        String r3 = O0X11OiO.I0IIOi().format(new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1))) + " 00:00:00";
        r0.OXO1(this.TAG + " checkAuthStatus: firstUploadDate = " + r3);
        r11.IiI10X().put(b01.i1iII1i1, r3);
    L9:
        Object r12 = new Gson().fromJson(r11.IiI10X().getString(AppUser.class.getName()), AppUser.class);
        if (r12 != null) goto L12;
        r12 = AppUser.class.newInstance();
    L12:
        AppUser r13 = (AppUser) r12;
        String r4 = HykyUtils.INSTANCE.getDeviceMac(false);
        r0.OXO1(this.TAG + " checkAuthStatus:  isLogin = " + r13.isLogin() + " , phone = " + r13.getPhone() + " , deviceMAC = " + r4);
        if (r13.isLogin() == true) goto L15;
        return;
    L15:
        if (r13.noAreaCodePhone().length() != 0) goto L18;
        return;
    L18:
        if (r4.length() != 0) goto L20;
        return;
    L20:
        this.mAppUser = r13;
        I100X1.O00(this.scope, null, null, new C33891(this, r13, r4, null), 3, null);
        return;
    L24:
        return;
    }

    @aa1
    public final AppUser getMAppUser() {
        return this.mAppUser;
    }

    @tb1
    public final GetSNCodeHYKY.Response getMDeviceCode() {
        return this.mDeviceCode;
    }

    @aa1
    public final i00OIXiO getScope() {
        return this.scope;
    }

    @aa1
    public final GetTokenHYKY.HykyTokenData getToken() {
        return this.token;
    }

    @aa1
    public final String getUploadSleepLastDate() {
        String r0 = a01.OXO1.IiI10X().getString(b01.i1iII1i1, O0X11OiO.I0IIOi().format(new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1))) + " 00:00:00");
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }

    @tb1
    public final Object refreshToken(@aa1 Continuation<? super Boolean> r2) {
        return getMHykyModel().refreshToken(r2);
    }

    public final void setMAppUser(@aa1 AppUser r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAppUser = r2;
    }

    public final void setMDeviceCode(@tb1 GetSNCodeHYKY.Response r1) {
        this.mDeviceCode = r1;
    }

    public final void setToken(@aa1 GetTokenHYKY.HykyTokenData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.token = r2;
    }

    public final void uploadData(@aa1 List<? extends Object> r2) {
        Intrinsics.X0O(r2, "dataList");
        if (isEnable() == true) goto L5;
        return;
    L5:
        getMHykyUpload().putData(r2);
    }

    public final void uploadDataWeight(@aa1 Weight r8) {
        Intrinsics.X0O(r8, "it");
        I100X1.O00(this.scope, null, null, new C33901(r8, this, null), 3, null);
    }

    public final void uploadDeviceInfo() {
        if (q62.OXO1.iIIX0XI() == true) goto L5;
        return;
    L5:
        I100X1.O00(this.scope, null, null, new C33911(this, null), 3, null);
    }
}

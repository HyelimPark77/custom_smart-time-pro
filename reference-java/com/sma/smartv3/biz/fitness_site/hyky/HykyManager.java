package com.sma.smartv3.biz.fitness_site.hyky;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ng5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.gson.Gson;
import com.sma.smartv3.biz.fitness_site.hyky.HykyManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.p608db.entity.Weight;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n18#2,2:392\n15#2:394\n18#2,2:395\n15#2:397\n18#2,2:398\n15#2:400\n18#2,2:401\n15#2:403\n18#2,2:404\n15#2:406\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager\n*L\n57#1:392,2\n57#1:394\n71#1:395,2\n71#1:397\n72#1:398,2\n72#1:400\n95#1:401,2\n95#1:403\n178#1:404,2\n178#1:406\n*E\n"})
public final class HykyManager {

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    private static final Lazy<HykyManager> instance$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.II1O1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HykyManager.instance_delegate$lambda$0();
        }
    });

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
    private GetTokenHYKY.HykyTokenData token;

    @aa1
    private final String TAG = "HykyManager";

    @aa1
    private final i00OIXiO scope = I0IIOi.OXO1(IXOX0Xiii.m712iO().plus(ng5.m2716iO(null, 1, null)));

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @aa1
        public final HykyManager getInstance() {
            return (HykyManager) HykyManager.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyManager$bindDevice$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$bindDevice$1", m39466f = "HykyManager.kt", m39467i = {}, m39468l = {165}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C154701 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isBind;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154701(boolean z, Continuation<? super C154701> continuation) {
            super(2, continuation);
            this.$isBind = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HykyManager.this.new C154701(this.$isBind, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C154701) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String sn;
            C154701 c154701;
            String cmei;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                HykyModel mHykyModel = HykyManager.this.getMHykyModel();
                boolean z = this.$isBind;
                String strNoAreaCodePhone = HykyManager.this.getMAppUser().noAreaCodePhone();
                HykyUtils hykyUtils = HykyUtils.INSTANCE;
                String deviceMac = hykyUtils.getDeviceMac(false);
                GetSNCodeHYKY.Response deviceCode = hykyUtils.getDeviceCode();
                if (deviceCode == null || (sn = deviceCode.getSn()) == null) {
                    sn = "";
                }
                GetSNCodeHYKY.Response deviceCode2 = hykyUtils.getDeviceCode();
                String str = (deviceCode2 == null || (cmei = deviceCode2.getCmei()) == null) ? "" : cmei;
                this.label = 1;
                c154701 = this;
                obj = mHykyModel.bindDeviceToHyky(z, strNoAreaCodePhone, deviceMac, sn, str, c154701);
                if (obj == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
                c154701 = this;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            i1O0OXO1O.OXO1.OXO1(HykyManager.this.TAG + " bindDevice : " + c154701.$isBind + " " + zBooleanValue);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyManager$checkAuthStatus$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$checkAuthStatus$1", m39466f = "HykyManager.kt", m39467i = {1, 2}, m39468l = {108, 115, 125}, m39469m = "invokeSuspend", m39470n = {"isAuth", "isAuth"}, m39472s = {"Z$0", "Z$0"}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1\n*L\n118#1:392,2\n*E\n"})
    public static final class C289221 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppUser $appUser;
        final /* synthetic */ String $deviceMAC;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C289221(AppUser appUser, String str, Continuation<? super C289221> continuation) {
            super(2, continuation);
            this.$appUser = appUser;
            this.$deviceMAC = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HykyManager.this.new C289221(this.$appUser, this.$deviceMAC, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289221) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0084  */
        /* JADX WARN: Code duplicated, block: B:26:0x008c  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
        
            if (r11 == r0) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            GetSNCodeHYKY.Response response;
            GetSNCodeHYKY.Response deviceCode;
            String sn;
            GetSNCodeHYKY.Response deviceCode2;
            String str;
            C289221 c289221;
            String cmei;
            HykyManager hykyManager;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                HykyModel mHykyModel = HykyManager.this.getMHykyModel();
                String phone = this.$appUser.getPhone();
                this.label = 1;
                obj = mHykyModel.checkAuthStatus(phone, this);
                if (obj != objI0iXXO) {
                }
                return objI0iXXO;
            }
            if (i == 1) {
                ResultKt.X1ii(obj);
            } else if (i == 2) {
                zBooleanValue = this.Z$0;
                ResultKt.X1ii(obj);
                response = (GetSNCodeHYKY.Response) obj;
                if (response != null) {
                    hykyManager = HykyManager.this;
                    if (response.deviceInfoExists()) {
                        hykyManager.setMDeviceCode(response);
                        a01.OXO1.m1440iO().put(GetSNCodeHYKY.Response.class.getName(), new Gson().toJson(response));
                    }
                }
                i1O0OXO1O.OXO1.OXO1(HykyManager.this.TAG + " checkAuthStatus scope.launch :mDeviceCode = " + HykyManager.this.getMDeviceCode());
                HykyModel mHykyModel2 = HykyManager.this.getMHykyModel();
                String strNoAreaCodePhone = this.$appUser.noAreaCodePhone();
                String str2 = this.$deviceMAC;
                HykyUtils hykyUtils = HykyUtils.INSTANCE;
                deviceCode = hykyUtils.getDeviceCode();
                if (deviceCode != null || (sn = deviceCode.getSn()) == null) {
                    sn = "";
                }
                deviceCode2 = hykyUtils.getDeviceCode();
                if (deviceCode2 != null || (cmei = deviceCode2.getCmei()) == null) {
                    str = "";
                } else {
                    str = cmei;
                }
                this.Z$0 = zBooleanValue;
                this.label = 3;
                c289221 = this;
                obj = mHykyModel2.bindDeviceToHyky(true, strNoAreaCodePhone, str2, sn, str, c289221);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
                c289221 = this;
            }
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            BleConnector.INSTANCE.addHandleCallback(HykyManager.this.mBleHandleCallback);
            i1O0OXO1O.OXO1.OXO1(HykyManager.this.TAG + " checkAuthStatus scope.launch :bindSuccess = " + zBooleanValue2);
            return Unit.OXO1;
            zBooleanValue = ((Boolean) obj).booleanValue();
            i1O0OXO1O.OXO1.OXO1(HykyManager.this.TAG + " checkAuthStatus scope.launch :isAuth = " + zBooleanValue);
            if (!zBooleanValue) {
                return Unit.OXO1;
            }
            HykyModel mHykyModel3 = HykyManager.this.getMHykyModel();
            String str3 = this.$deviceMAC;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            obj = mHykyModel3.getSnInfo(str3, this);
            if (obj != objI0iXXO) {
                response = (GetSNCodeHYKY.Response) obj;
                if (response != null) {
                    hykyManager = HykyManager.this;
                    if (response.deviceInfoExists()) {
                        hykyManager.setMDeviceCode(response);
                        a01.OXO1.m1440iO().put(GetSNCodeHYKY.Response.class.getName(), new Gson().toJson(response));
                    }
                }
                i1O0OXO1O.OXO1.OXO1(HykyManager.this.TAG + " checkAuthStatus scope.launch :mDeviceCode = " + HykyManager.this.getMDeviceCode());
                HykyModel mHykyModel4 = HykyManager.this.getMHykyModel();
                String strNoAreaCodePhone2 = this.$appUser.noAreaCodePhone();
                String str4 = this.$deviceMAC;
                HykyUtils hykyUtils2 = HykyUtils.INSTANCE;
                deviceCode = hykyUtils2.getDeviceCode();
                if (deviceCode != null) {
                    sn = "";
                } else {
                    sn = "";
                }
                deviceCode2 = hykyUtils2.getDeviceCode();
                if (deviceCode2 != null) {
                    str = "";
                } else {
                    str = "";
                }
                this.Z$0 = zBooleanValue;
                this.label = 3;
                c289221 = this;
                obj = mHykyModel4.bindDeviceToHyky(true, strNoAreaCodePhone2, str4, sn, str, c289221);
            }
            return objI0iXXO;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyManager$uploadDataWeight$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$uploadDataWeight$1", m39466f = "HykyManager.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C289231 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Weight $it;
        int label;
        final /* synthetic */ HykyManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C289231(Weight weight, HykyManager hykyManager, Continuation<? super C289231> continuation) {
            super(2, continuation);
            this.$it = weight;
            this.this$0 = hykyManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C289231(this.$it, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289231) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.$it);
            this.this$0.uploadData(arrayList);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyManager$uploadDeviceInfo$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$uploadDeviceInfo$1", m39466f = "HykyManager.kt", m39467i = {}, m39468l = {211}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$uploadDeviceInfo$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$uploadDeviceInfo$1\n*L\n212#1:392,2\n*E\n"})
    public static final class C289241 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C289241(Continuation<? super C289241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HykyManager.this.new C289241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289241) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HykyManager hykyManager;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                HykyManager hykyManager2 = HykyManager.this;
                HykyModel mHykyModel = hykyManager2.getMHykyModel();
                String deviceMac = HykyUtils.INSTANCE.getDeviceMac(false);
                this.L$0 = hykyManager2;
                this.label = 1;
                Object objUploadDeviceInfoToHyky = mHykyModel.uploadDeviceInfoToHyky(deviceMac, this);
                if (objUploadDeviceInfoToHyky == objI0iXXO) {
                    return objI0iXXO;
                }
                hykyManager = hykyManager2;
                obj = objUploadDeviceInfoToHyky;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hykyManager = (HykyManager) this.L$0;
                ResultKt.X1ii(obj);
            }
            hykyManager.setMDeviceCode((GetSNCodeHYKY.Response) obj);
            a01.OXO1.m1440iO().put(GetSNCodeHYKY.Response.class.getName(), new Gson().toJson(HykyManager.this.getMDeviceCode()));
            return Unit.OXO1;
        }
    }

    private HykyManager() {
        a01 a01Var = a01.OXO1;
        Object objFromJson = new Gson().fromJson(a01Var.IiI10X().getString(GetTokenHYKY.HykyTokenData.class.getName()), (Class<Object>) GetTokenHYKY.HykyTokenData.class);
        this.token = (GetTokenHYKY.HykyTokenData) (objFromJson == null ? GetTokenHYKY.HykyTokenData.class.newInstance() : objFromJson);
        this.mHykyUpload$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX0XiXXOi
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return HykyManager.mHykyUpload_delegate$lambda$0();
            }
        });
        this.mHykyModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0iOOOX0i
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return HykyManager.mHykyModel_delegate$lambda$0();
            }
        });
        Object objFromJson2 = new Gson().fromJson(a01Var.IiI10X().getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson2 == null ? AppUser.class.newInstance() : objFromJson2);
        Object objFromJson3 = new Gson().fromJson(a01Var.m1440iO().getString(GetSNCodeHYKY.Response.class.getName()), (Class<Object>) GetSNCodeHYKY.Response.class);
        this.mDeviceCode = (GetSNCodeHYKY.Response) (objFromJson3 == null ? GetSNCodeHYKY.Response.class.newInstance() : objFromJson3);
        this.mBleHandleCallback = new HykyManager$mBleHandleCallback$1(this);
    }

    @aa1
    public static final HykyManager getInstance() {
        return Companion.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HykyModel getMHykyModel() {
        return (HykyModel) this.mHykyModel$delegate.getValue();
    }

    private final HykyUpload getMHykyUpload() {
        return (HykyUpload) this.mHykyUpload$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HykyManager instance_delegate$lambda$0() {
        return new HykyManager();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    private final boolean isEnable() throws IllegalAccessException, InstantiationException {
        boolean z;
        a01 a01Var = a01.OXO1;
        Object objFromJson = new Gson().fromJson(a01Var.IiI10X().getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson == null) {
            objFromJson = AppUser.class.newInstance();
        }
        AppUser appUser = (AppUser) objFromJson;
        boolean z2 = false;
        boolean z3 = a01Var.IiI10X().getBoolean(b01.OiO0IOX, false);
        GetSNCodeHYKY.Response response = this.mDeviceCode;
        if (response != null) {
            Intrinsics.XXI(response);
            if (response.deviceInfoExists()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (q62.OXO1.iIIX0XI() && appUser.noAreaCodePhone().length() > 0 && z && z3) {
            z2 = true;
        }
        if (z2) {
            this.mAppUser = appUser;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HykyModel mHykyModel_delegate$lambda$0() {
        return new HykyModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HykyUpload mHykyUpload_delegate$lambda$0() {
        return new HykyUpload();
    }

    public final void bindDevice(boolean z) {
        if (!z) {
            BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        }
        XX01Oi.IiI10X(this.scope, null, null, new C154701(z, null), 3, null);
    }

    public final void checkAuthStatus(@tb1 Activity activity) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = this.TAG;
        q62 q62Var = q62.OXO1;
        i1o0oxo1o.OXO1(str + " checkAuthStatus: start " + q62Var.iIIX0XI());
        if (!q62Var.iIIX0XI() || activity == null) {
            return;
        }
        a01 a01Var = a01.OXO1;
        if (!a01Var.IiI10X().contains(b01.i1iII1i1)) {
            String str2 = O0X11OiO.I0IIOi().format(new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L))) + " 00:00:00";
            i1o0oxo1o.OXO1(this.TAG + " checkAuthStatus: firstUploadDate = " + str2);
            a01Var.IiI10X().put(b01.i1iII1i1, str2);
        }
        Object objFromJson = new Gson().fromJson(a01Var.IiI10X().getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson == null) {
            objFromJson = AppUser.class.newInstance();
        }
        AppUser appUser = (AppUser) objFromJson;
        String deviceMac = HykyUtils.INSTANCE.getDeviceMac(false);
        i1o0oxo1o.OXO1(this.TAG + " checkAuthStatus:  isLogin = " + appUser.isLogin() + " , phone = " + appUser.getPhone() + " , deviceMAC = " + deviceMac);
        if (!appUser.isLogin() || appUser.noAreaCodePhone().length() == 0 || deviceMac.length() == 0) {
            return;
        }
        this.mAppUser = appUser;
        XX01Oi.IiI10X(this.scope, null, null, new C289221(appUser, deviceMac, null), 3, null);
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
        String string = a01.OXO1.IiI10X().getString(b01.i1iII1i1, O0X11OiO.I0IIOi().format(new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L))) + " 00:00:00");
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }

    @tb1
    public final Object refreshToken(@aa1 Continuation<? super Boolean> continuation) {
        return getMHykyModel().refreshToken(continuation);
    }

    public final void setMAppUser(@aa1 AppUser appUser) {
        Intrinsics.X0O(appUser, "<set-?>");
        this.mAppUser = appUser;
    }

    public final void setMDeviceCode(@tb1 GetSNCodeHYKY.Response response) {
        this.mDeviceCode = response;
    }

    public final void setToken(@aa1 GetTokenHYKY.HykyTokenData hykyTokenData) {
        Intrinsics.X0O(hykyTokenData, "<set-?>");
        this.token = hykyTokenData;
    }

    public final void uploadData(@aa1 List<? extends Object> dataList) {
        Intrinsics.X0O(dataList, "dataList");
        if (isEnable()) {
            getMHykyUpload().putData(dataList);
        }
    }

    public final void uploadDataWeight(@aa1 Weight it) {
        Intrinsics.X0O(it, "it");
        XX01Oi.IiI10X(this.scope, null, null, new C289231(it, this, null), 3, null);
    }

    public final void uploadDeviceInfo() {
        if (q62.OXO1.iIIX0XI()) {
            XX01Oi.IiI10X(this.scope, null, null, new C289241(null), 3, null);
        }
    }
}

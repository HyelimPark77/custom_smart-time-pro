package com.sma.smartv3.ui.device.model;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X11ii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.baseble.scanner.BleDevice;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.github.doyaaaaaken.kotlincsv.client.CsvFileReader;
import com.github.doyaaaaaken.kotlincsv.dsl.CsvReaderDslKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.DeviceOnlineInfo;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetNewDeviceListObject;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.util.NetUtil;
import com.sma.smartv3.util.net.NetResult;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAddDeviceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceViewModel.kt\ncom/sma/smartv3/ui/device/model/AddDeviceViewModel\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,165:1\n176#2,11:166\n196#2:185\n252#3,7:177\n270#3:184\n35#4,2:186\n1761#5,3:188\n1878#5,3:192\n1321#6:191\n1322#6:195\n*S KotlinDebug\n*F\n+ 1 AddDeviceViewModel.kt\ncom/sma/smartv3/ui/device/model/AddDeviceViewModel\n*L\n41#1:166,11\n41#1:185\n41#1:177,7\n41#1:184\n121#1:186,2\n161#1:188,3\n105#1:192,3\n101#1:191\n101#1:195\n*E\n"})
public final class AddDeviceViewModel extends ViewModel {

    @aa1
    private final ty0<List<ThirdPartyDeviceFilterData>> _supportedThirdPartyDevices;

    @aa1
    private final k85<List<ThirdPartyDeviceFilterData>> supportedThirdPartyDevices;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1", f = "AddDeviceViewModel.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34641 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AddDeviceViewModel this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05701<T> implements IXiXI {
            public final /* synthetic */ AddDeviceViewModel IO;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1$1$2, reason: invalid class name */
            @DebugMetadata(c = "com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1$1$2", f = "AddDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetResult<List<ThirdPartyDeviceFilterData>> $it;
                int label;

                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(NetResult<? extends List<ThirdPartyDeviceFilterData>> r1, Continuation<? super AnonymousClass2> r2) {
                    this.$it = r1;
                    super(2, r2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
                    return new AnonymousClass2(this.$it, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                    return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r2) {
                    pb.I0iXXO();
                    if (this.label != 0) goto L7;
                    ResultKt.X1ii(r2);
                    ToastUtils.showLong(((NetResult.OXO1) this.$it).XO0O10(), new Object[0]);
                    return Unit.OXO1;
                L7:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
                    return invoke2(r1, r2);
                }
            }

            public C05701(AddDeviceViewModel r1) {
                this.IO = r1;
            }

            public final Object OXO1(NetResult<? extends List<ThirdPartyDeviceFilterData>> r6, Continuation<? super Unit> r7) {
                if ((r7 instanceof AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1) == false) goto L7;
                AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1 r0 = (AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1) r7;
                int r1 = r0.label;
                if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
                r0.label = r1 - Integer.MIN_VALUE;
            L8:
                Object r8 = r0.result;
                Object r2 = pb.I0iXXO();
                int r3 = r0.label;
                if (r3 == 0) goto L14;
                if (r3 != 1) goto L13;
                r6 = (NetResult) r0.L$0;
                ResultKt.X1ii(r8);
            L25:
                i1O0OXO1O.OXO1.OXO1("ThirdPartyDevice -> error = " + ((NetResult.OXO1) r6).XO0O10());
            L27:
                return Unit.OXO1;
            L13:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L14:
                ResultKt.X1ii(r8);
                if ((r6 instanceof NetResult.XIi00iiXO) == false) goto L21;
                List r9 = (List) ((NetResult.XIi00iiXO) r6).XO0O10();
                if (r9 == null) goto L19;
                AddDeviceViewModel.access$get_supportedThirdPartyDevices$p(this.IO).setValue(r9);
            L19:
                i1O0OXO1O.OXO1.OXO1("getThirdPartyDevice:" + ((List) AddDeviceViewModel.access$get_supportedThirdPartyDevices$p(this.IO).getValue()).size() + " " + AddDeviceViewModel.access$get_supportedThirdPartyDevices$p(this.IO).getValue());
                goto L27
            L21:
                if ((r6 instanceof NetResult.OXO1) == false) goto L29;
                g10 r10 = IXOX0Xiii.O00();
                AnonymousClass2 r4 = new AnonymousClass2(r6, null);
                r0.L$0 = r6;
                r0.label = 1;
                if (I100X1.I0IIOi(r10, r4, r0) != r2) goto L25;
                return r2;
            L29:
                throw new NoWhenBranchMatchedException();
            L7:
                r0 = new AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1(this, r7);
                goto L8
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                return OXO1((NetResult) r1, r2);
            }
        }

        public C34641(AddDeviceViewModel r1, Continuation<? super C34641> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34641(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34641) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r5);
        L12:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r5);
            ii0iIIX0<NetResult<List<ThirdPartyDeviceFilterData>>> r6 = NetUtil.OXO1.iO();
            C05701 r2 = new C05701(this.this$0);
            this.label = 1;
            if (r6.collect(r2, this) != r0) goto L12;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public AddDeviceViewModel() {
        ty0<List<ThirdPartyDeviceFilterData>> r0 = l85.OXO1(CollectionsKt__CollectionsKt.iI());
        this._supportedThirdPartyDevices = r0;
        this.supportedThirdPartyDevices = iX0XiO.XXI(r0);
    }

    public static /* synthetic */ Unit OXO1(ArrayList r0, CsvFileReader r1) {
        return getFileData$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$getFileData(AddDeviceViewModel r0, String r1, Function1 r2) {
        r0.getFileData(r1, r2);
    }

    public static final /* synthetic */ ty0 access$get_supportedThirdPartyDevices$p(AddDeviceViewModel r0) {
        return r0._supportedThirdPartyDevices;
    }

    private final void getFileData(String r4, Function1<? super Boolean, Unit> r5) {
        LogUtils.i(new Object[]{"DeviceOnlineInfo" + new File(r4).exists()});
        if (new File(r4).exists() == false) goto L16;
        final ArrayList r0 = new ArrayList();
        CsvReaderDslKt.XIi00iiXO(null, 1, null).X1ii(r4, new X11ii(r0));     // Catch: Exception -> L9
        a01.OXO1.IiI10X().put(b01.iii0, new Gson().toJson(r0));     // Catch: Exception -> L9
        if (r5 == null) goto L11;
        r5.invoke(Boolean.TRUE);     // Catch: Exception -> L9
        Unit r6 = Unit.OXO1;     // Catch: Exception -> L9
        return;
    L11:
        return;
    L9:
        e = move-exception;
        LogUtils.d(new Object[]{"getFileData error -> " + e.getMessage()});
        e.printStackTrace();
        Unit r7 = Unit.OXO1;
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFileData$default(AddDeviceViewModel r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.getFileData(r1, r2);
    }

    private static final Unit getFileData$lambda$0(ArrayList r7, CsvFileReader r8) {
        Intrinsics.X0O(r8, "$this$open");
        Iterator<Map<String, String>> r9 = r8.OIi0().iterator();
    L4:
        if (r9.hasNext() == false) goto L24;
        Iterator<T> r0 = r9.next().values().iterator();
        String r1 = "";
        String r2 = "0";
        int r3 = 0;
    L7:
        if (r0.hasNext() == false) goto L19;
        Object r4 = r0.next();
        int r5 = r3 + 1;
        if (r3 >= 0) goto L11;
        CollectionsKt__CollectionsKt.XOX0O0();
    L11:
        String r6 = (String) r4;
        if (r3 != 0) goto L15;
        r1 = r6;
    L15:
        if (r3 != 2) goto L17;
        r2 = r6;
    L17:
        r3 = r5;
        goto L7
    L19:
        if (TextUtils.isEmpty(r1) == true) goto L4;
        if (TextUtils.isEmpty(r2) == true) goto L4;
        r7.add(new DeviceOnlineInfo(r1, Integer.parseInt(r2)));
        goto L4
    L24:
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getNewDeviceListObject$default(AddDeviceViewModel r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.getNewDeviceListObject(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onDownload$default(AddDeviceViewModel r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.onDownload(r1, r2);
    }

    public final void getNewDeviceListObject(@tb1 final Function1<? super Boolean, Unit> r9) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        final Activity r2 = null;
        HashMap r3 = RequestBodyKt.getNewDeviceListObjectBody$default(null, 1, null);
        final O1XIiIO<String> r4 = new AnonymousClass1(this, r9);
        final uq r10 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetNewDeviceListObject.URL);
        r0.printParam(r5 + GetNewDeviceListObject.URL, r3);
        NetWork r1 = NetWork.OXO1;
        String r6 = r5 + GetNewDeviceListObject.URL;
        final O1XIiIO<Response<String>> r7 = new AddDeviceViewModel$getNewDeviceListObject$$inlined$post$default$1(r2, r4, r10);
        AndroidNetworking.post(r6).addBodyParameter(r3).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new AddDeviceViewModel$getNewDeviceListObject$$inlined$post$default$2(r7));
    }

    @aa1
    public final k85<List<ThirdPartyDeviceFilterData>> getSupportedThirdPartyDevices() {
        return this.supportedThirdPartyDevices;
    }

    public final void getThirdPartyDevices() {
        I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34641(this, null), 2, null);
    }

    public final boolean isSupportedThirdPartyDevice(@aa1 BleDevice r5) {
        Intrinsics.X0O(r5, "bleDevice");
        List<ThirdPartyDeviceFilterData> r0 = getValue();
        if ((r0 instanceof Collection) == true) goto L5;
    L7:
        Iterator<T> r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L14;
        if (Intrinsics.XOO0ii0(((ThirdPartyDeviceFilterData) r1.next()).getBleName(), r5.getMName()) == false) goto L9;
        return true;
    L14:
        return false;
    L5:
        if (r0.isEmpty() == false) goto L7;
        return false;
    }

    public final void onDownload(@aa1 String r8, @tb1 final Function1<? super Boolean, Unit> r9) {
        Intrinsics.X0O(r8, Y5.c.a);
        List r10 = StringsKt__StringsKt.i1I(r8, new String[]{"/"}, false, 0, 6, null);
        if (r10.isEmpty() == true) goto L6;
        String r11 = "device_info" + r10.get(r10.size() - 1);
        sz0 r2 = sz0.OXO1;
        final String r0 = uz0.OiIIX101O(r2).getPath() + "/" + r11;
        i1O0OXO1O.OXO1.OXO1("mFilePath== " + r0);
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        String r1 = r8 + "?time=" + System.currentTimeMillis();
        String r4 = uz0.OiIIX101O(r2).getPath();
        Intrinsics.O10IXXX0X(r4, "getPath(...)");
        r3.download(r1, r4, r11, new C34651(this, r0, r9));
        return;
    }
}

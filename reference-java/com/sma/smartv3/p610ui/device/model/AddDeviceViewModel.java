package com.sma.smartv3.p610ui.device.model;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX01Oi;
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
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.baseble.scanner.BleDevice;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.github.doyaaaaaken.kotlincsv.client.CsvFileReader;
import com.github.doyaaaaaken.kotlincsv.dsl.CsvReaderDslKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.DeviceOnlineInfo;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetNewDeviceListObject;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.device.model.AddDeviceViewModel;
import com.sma.smartv3.util.NetUtil;
import com.sma.smartv3.util.net.NetResult;
import java.io.File;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1", m39466f = "AddDeviceViewModel.kt", m39467i = {}, m39468l = {141}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C289971 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1$1 */
        public static final class AnonymousClass1<T> implements IXiXI {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ AddDeviceViewModel f54598IO;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1$1$2 */
            @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.model.AddDeviceViewModel$getThirdPartyDevices$1$1$2", m39466f = "AddDeviceViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetResult<List<ThirdPartyDeviceFilterData>> $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(NetResult<? extends List<ThirdPartyDeviceFilterData>> netResult, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$it = netResult;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C2798pb.I0iXXO();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.X1ii(obj);
                    ToastUtils.showLong(((NetResult.OXO1) this.$it).XO0O10(), new Object[0]);
                    return Unit.OXO1;
                }
            }

            public AnonymousClass1(AddDeviceViewModel addDeviceViewModel) {
                this.f54598IO = addDeviceViewModel;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // com.android.mltcode.paycertificationapi.IXiXI
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public final Object emit(NetResult<? extends List<ThirdPartyDeviceFilterData>> netResult, Continuation<? super Unit> continuation) {
                AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1 addDeviceViewModel$getThirdPartyDevices$1$1$emit$1;
                if (continuation instanceof AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1) {
                    addDeviceViewModel$getThirdPartyDevices$1$1$emit$1 = (AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1) continuation;
                    int i = addDeviceViewModel$getThirdPartyDevices$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        addDeviceViewModel$getThirdPartyDevices$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        addDeviceViewModel$getThirdPartyDevices$1$1$emit$1 = new AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1(this, continuation);
                    }
                } else {
                    addDeviceViewModel$getThirdPartyDevices$1$1$emit$1 = new AddDeviceViewModel$getThirdPartyDevices$1$1$emit$1(this, continuation);
                }
                Object obj = addDeviceViewModel$getThirdPartyDevices$1$1$emit$1.result;
                Object objI0iXXO = C2798pb.I0iXXO();
                int i2 = addDeviceViewModel$getThirdPartyDevices$1$1$emit$1.label;
                if (i2 == 0) {
                    ResultKt.X1ii(obj);
                    if (netResult instanceof NetResult.XIi00iiXO) {
                        List list = (List) ((NetResult.XIi00iiXO) netResult).XO0O10();
                        if (list != null) {
                            this.f54598IO._supportedThirdPartyDevices.setValue(list);
                        }
                        i1O0OXO1O.OXO1.OXO1("getThirdPartyDevice:" + ((List) this.f54598IO._supportedThirdPartyDevices.getValue()).size() + " " + this.f54598IO._supportedThirdPartyDevices.getValue());
                    } else {
                        if (!(netResult instanceof NetResult.OXO1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g10 g10VarO00 = IXOX0Xiii.O00();
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(netResult, null);
                        addDeviceViewModel$getThirdPartyDevices$1$1$emit$1.L$0 = netResult;
                        addDeviceViewModel$getThirdPartyDevices$1$1$emit$1.label = 1;
                        if (I100X1.I0IIOi(g10VarO00, anonymousClass2, addDeviceViewModel$getThirdPartyDevices$1$1$emit$1) == objI0iXXO) {
                            return objI0iXXO;
                        }
                    }
                    return Unit.OXO1;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                netResult = (NetResult) addDeviceViewModel$getThirdPartyDevices$1$1$emit$1.L$0;
                ResultKt.X1ii(obj);
                i1O0OXO1O.OXO1.OXO1("ThirdPartyDevice -> error = " + ((NetResult.OXO1) netResult).XO0O10());
                return Unit.OXO1;
            }
        }

        public C289971(Continuation<? super C289971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AddDeviceViewModel.this.new C289971(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289971) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                ii0iIIX0<NetResult<List<ThirdPartyDeviceFilterData>>> ii0iiix0M38832iO = NetUtil.OXO1.m38832iO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AddDeviceViewModel.this);
                this.label = 1;
                if (ii0iiix0M38832iO.collect(anonymousClass1, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            return Unit.OXO1;
        }
    }

    public AddDeviceViewModel() {
        ty0<List<ThirdPartyDeviceFilterData>> ty0VarOXO1 = l85.OXO1(CollectionsKt__CollectionsKt.m39402iI());
        this._supportedThirdPartyDevices = ty0VarOXO1;
        this.supportedThirdPartyDevices = iX0XiO.XXI(ty0VarOXO1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFileData(String str, Function1<? super Boolean, Unit> function1) {
        LogUtils.m11130i("DeviceOnlineInfo" + new File(str).exists());
        if (new File(str).exists()) {
            final ArrayList arrayList = new ArrayList();
            try {
                CsvReaderDslKt.XIi00iiXO(null, 1, null).X1ii(str, new Function1() { // from class: com.android.mltcode.paycertificationapi.X11ii
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AddDeviceViewModel.getFileData$lambda$0(arrayList, (CsvFileReader) obj);
                    }
                });
                a01.OXO1.IiI10X().put(b01.iii0, new Gson().toJson(arrayList));
                if (function1 != null) {
                    function1.invoke2(Boolean.TRUE);
                    Unit unit = Unit.OXO1;
                }
            } catch (Exception e) {
                LogUtils.m11128d("getFileData error -> " + e.getMessage());
                e.printStackTrace();
                Unit unit2 = Unit.OXO1;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFileData$default(AddDeviceViewModel addDeviceViewModel, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        addDeviceViewModel.getFileData(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFileData$lambda$0(ArrayList arrayList, CsvFileReader open) {
        Intrinsics.X0O(open, "$this$open");
        Iterator<Map<String, String>> it = open.OIi0().iterator();
        while (it.hasNext()) {
            String str = "";
            String str2 = "0";
            int i = 0;
            for (Object obj : it.next().values()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                String str3 = (String) obj;
                if (i == 0) {
                    str = str3;
                }
                if (i == 2) {
                    str2 = str3;
                }
                i = i2;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                arrayList.add(new DeviceOnlineInfo(str, Integer.parseInt(str2)));
            }
        }
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getNewDeviceListObject$default(AddDeviceViewModel addDeviceViewModel, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        addDeviceViewModel.getNewDeviceListObject(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onDownload$default(AddDeviceViewModel addDeviceViewModel, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        addDeviceViewModel.onDownload(str, function1);
    }

    public final void getNewDeviceListObject(@tb1 final Function1<? super Boolean, Unit> function1) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final Activity activity = null;
        HashMap newDeviceListObjectBody$default = RequestBodyKt.getNewDeviceListObjectBody$default(null, 1, null);
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.device.model.AddDeviceViewModel.getNewDeviceListObject.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                i1O0OXO1O.OXO1.OXO1("getNewDeviceListObject -> " + str);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                AddDeviceViewModel addDeviceViewModel = AddDeviceViewModel.this;
                Intrinsics.XXI(str);
                addDeviceViewModel.onDownload(str, function1);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("getNewDeviceListObject -> error = " + error);
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetNewDeviceListObject.URL);
        netWorkUtils.printParam(strConvertBaseUrl + GetNewDeviceListObject.URL, newDeviceListObjectBody$default);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + GetNewDeviceListObject.URL;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.device.model.AddDeviceViewModel$getNewDeviceListObject$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) newDeviceListObjectBody$default).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.device.model.AddDeviceViewModel$getNewDeviceListObject$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @aa1
    public final k85<List<ThirdPartyDeviceFilterData>> getSupportedThirdPartyDevices() {
        return this.supportedThirdPartyDevices;
    }

    public final void getThirdPartyDevices() {
        XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C289971(null), 2, null);
    }

    public final boolean isSupportedThirdPartyDevice(@aa1 BleDevice bleDevice) {
        Intrinsics.X0O(bleDevice, "bleDevice");
        List<ThirdPartyDeviceFilterData> value = this._supportedThirdPartyDevices.getValue();
        if ((value instanceof Collection) && value.isEmpty()) {
            return false;
        }
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            if (Intrinsics.XOO0ii0(((ThirdPartyDeviceFilterData) it.next()).getBleName(), bleDevice.getMName())) {
                return true;
            }
        }
        return false;
    }

    public final void onDownload(@aa1 String fileUrl, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(fileUrl, "fileUrl");
        List listI1I = StringsKt__StringsKt.i1I(fileUrl, new String[]{"/"}, false, 0, 6, null);
        if (listI1I.isEmpty()) {
            return;
        }
        String str = "device_info" + listI1I.get(listI1I.size() - 1);
        sz0 sz0Var = sz0.OXO1;
        final String str2 = uz0.OiIIX101O(sz0Var).getPath() + "/" + str;
        i1O0OXO1O.OXO1.OXO1("mFilePath== " + str2);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String str3 = fileUrl + "?time=" + System.currentTimeMillis();
        String path = uz0.OiIIX101O(sz0Var).getPath();
        Intrinsics.O10IXXX0X(path, "getPath(...)");
        netWorkUtils.download(str3, path, str, new HttpProgressCallback<String>() { // from class: com.sma.smartv3.ui.device.model.AddDeviceViewModel.onDownload.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str4) {
                LogUtils.m11130i("DeviceOnlineInfo handleResponse");
                XX01Oi.IiI10X(ViewModelKt.getViewModelScope(AddDeviceViewModel.this), IXOX0Xiii.m712iO(), null, new AddDeviceViewModel$onDownload$1$handleResponse$1(AddDeviceViewModel.this, str2, function1, null), 2, null);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("download firmware error -> " + error);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
            }
        });
    }
}

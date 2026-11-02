package com.sma.androidnetworklib.method;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q51;
import com.android.mltcode.paycertificationapi.r51;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Ne;
import com.ironsource.Y5;
import com.sma.androidnetworklib.model.Response;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,511:1\n216#2,2:512\n216#2,2:514\n*S KotlinDebug\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n316#1:512,2\n331#1:514,2\n*E\n"})
public final class NetWork {

    @aa1
    public static final NetWork OXO1 = null;

    @SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postV3$3\n*L\n1#1,511:1\n*E\n"})
    public static final class OXO1 implements Callback {
        public final /* synthetic */ O1XIiIO<Response<T>> OXO1;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: com.sma.androidnetworklib.method.NetWork$OXO1$OXO1, reason: collision with other inner class name */
        public static final class C0552OXO1<T> extends TypeToken<Response<T>> {
            public C0552OXO1() {
            }
        }

        public OXO1(O1XIiIO<Response<T>> r1) {
            this.OXO1 = r1;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call r2, IOException r3) {
            Intrinsics.X0O(r2, NotificationCompat.CATEGORY_CALL);
            Intrinsics.X0O(r3, "e");
            r3.printStackTrace();
            handleError(String.valueOf(r3.getMessage()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // okhttp3.Callback
        public void onResponse(Call r2, okhttp3.Response r3) {
            Intrinsics.X0O(r2, NotificationCompat.CATEGORY_CALL);
            Intrinsics.X0O(r3, Ne.n);
            ResponseBody r4 = r3.body();     // Catch: Exception -> L6
            if (r4 == null) goto L8;
            String r5 = r4.string();     // Catch: Exception -> L6
        L9:
            Intrinsics.XiOIii1();     // Catch: Exception -> L6
            Response r6 = (Response) GsonUtils.fromJson(r5, new C0552OXO1().getType());     // Catch: Exception -> L6
            handleResponse((Response<T>) r6);     // Catch: Exception -> L6
            return;
        L8:
            r5 = null;
        L6:
            e = move-exception;
            handleError(String.valueOf(e.getMessage()));
        }
    }

    static {
        OXO1 = new NetWork();
    }

    public NetWork() {
    }

    public static /* synthetic */ void IO(NetWork r0, String r1, O1XIiIO r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        r0.I0IIOi(r1, r2, r3);
    }

    public static final void O00(HttpProgressCallback r2, long r3, long r5) {
        if (r5 == 0) goto L6;
        r2.handleProgress((int) ((r3 * ((long) 100)) / r5));
        return;
    }

    public static /* synthetic */ void OXO1(HttpProgressCallback r0, long r1, long r3) {
        O00(r0, r1, r3);
    }

    public static /* synthetic */ void XIi00iiXO(HttpProgressCallback r0, long r1, long r3) {
        XOO0ii0(r0, r1, r3);
    }

    public static final void XOO0ii0(HttpProgressCallback r2, long r3, long r5) {
        if (r5 == 0) goto L6;
        r2.handleProgress((int) ((r3 * ((long) 100)) / r5));
        return;
    }

    public final void I0IIOi(@aa1 String r2, @aa1 final O1XIiIO<JSONObject> r3, int r4) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "callback");
        ANRequest.GetRequestBuilder r5 = AndroidNetworking.get(r2).setTag(r2).setPriority(Priority.HIGH);
        if (r4 == 0) goto L5;
        r5.setMaxAgeCacheControl(r4, TimeUnit.MINUTES);
    L5:
        r5.build().getAsJSONObject(new NetWork$get$1(r3));
    }

    public final <T> void I0iXXO(@aa1 String r2, @aa1 final File r3, @aa1 final O1XIiIO<T> r4, @aa1 Map<String, String> r5) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "file");
        Intrinsics.X0O(r4, "callback");
        Intrinsics.X0O(r5, "headers");
        AndroidNetworking.get(r2).addHeaders(r5).setTag(r2).setPriority(Priority.MEDIUM).setBitmapMaxHeight(400).setBitmapMaxWidth(400).setBitmapConfig(Bitmap.Config.ARGB_8888).build().getAsBitmap(new NetWork$getImageV2$1(r3, r4));
    }

    public final /* synthetic */ <T> T I1XOi1(String r3, Object r4) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        ANRequest r5 = AndroidNetworking.post(r3).addApplicationJsonBody(r4).setTag(r3).setPriority(Priority.HIGH).build();     // Catch: Exception -> L5
        Intrinsics.OX(4, "T");     // Catch: Exception -> L5
        T r6 = (T) r5.executeForObject(Object.class).getResult();
        Intrinsics.OX(1, "T");     // Catch: Exception -> L5
        return r6;
    L5:
        e = move-exception;
        e.printStackTrace();
        LogUtils.d(new Object[]{Unit.OXO1});
        return null;
    }

    public final /* synthetic */ <T> void IIX1OXO(String r2, Map<String, String> r3, Object r4, final O1XIiIO<Response<T>> r5) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "headers");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        ANRequest r6 = AndroidNetworking.post(r2).addHeaders(r3).addApplicationJsonBody(r4).setTag(r2).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r7 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r6.getAsParsed(r7, new NetWork$postJsonV2$1(r5));
    }

    public final void IiI10X(@aa1 String r2, @aa1 Map<String, String> r3, @aa1 String r4, @aa1 String r5, @aa1 final HttpProgressCallback<String> r6) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "headers");
        Intrinsics.X0O(r4, "path");
        Intrinsics.X0O(r5, Y5.c.b);
        Intrinsics.X0O(r6, "callback");
        AndroidNetworking.download(r2, r4, r5).setTag(r2).addHeaders(r3).setPriority(Priority.MEDIUM).build().setDownloadProgressListener(new q51(r6)).startDownload(new NetWork$downloadV2$2(r6));
    }

    public final /* synthetic */ <T> void O10IXXX0X(String r3, Object r4, final O1XIiIO<Response<T>> r5) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        ANRequest r6 = AndroidNetworking.post(r3).addApplicationJsonBody(r4).setTag(r3).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r7 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r6.getAsParsed(r7, new NetWork$postJson$1(r5));
    }

    public final <T> void OIX0iXi(@aa1 String r2, @aa1 final File r3, @aa1 final O1XIiIO<T> r4) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "file");
        Intrinsics.X0O(r4, "callback");
        AndroidNetworking.get(r2).setTag(r2).setPriority(Priority.MEDIUM).setBitmapMaxHeight(400).setBitmapMaxWidth(400).setBitmapConfig(Bitmap.Config.ARGB_8888).build().getAsBitmap(new NetWork$getImage$1(r3, r4));
    }

    public final /* synthetic */ <T> void OIi0(String r3, Map<String, String> r4, final O1XIiIO<Response<T>> r5) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        ANRequest r6 = AndroidNetworking.get(r3).addQueryParameter(r4).setTag(r3).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r7 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r6.getAsParsed(r7, new NetWork$get$2(r5));
    }

    public final /* synthetic */ <T> void OiIIX101O(String r3, String r4, File r5, Map<String, String> r6, final O1XIiIO<Response<T>> r7) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "fileParameter");
        Intrinsics.X0O(r5, "file");
        Intrinsics.X0O(r6, "headers");
        Intrinsics.X0O(r7, "callback");
        ANRequest.MultiPartBuilder r0 = AndroidNetworking.upload(r3);
        if (r5.exists() == false) goto L5;
        r0.addMultipartFile(r4, r5);
    L5:
        r0.addHeaders(r6);
        ANRequest r8 = r0.setTag(r3).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWork$uploadV2$1.OXO1);
        Intrinsics.OX(4, "T");
        TypeToken<?> r9 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r8.getAsParsed(r9, new NetWork$uploadV2$2(r7));
    }

    public final /* synthetic */ <T> void X0O(String r2, Map<String, String> r3, JSONArray r4, final O1XIiIO<Response<T>> r5) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "headers");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        ANRequest r6 = AndroidNetworking.post(r2).addHeaders(r3).addJSONArrayBody(r4).setTag(r2).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r7 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r6.getAsParsed(r7, new NetWork$postJsonArrayBody$1(r5));
    }

    public final /* synthetic */ <T> void X1ii(String r3, Map<String, String> r4, final O1XIiIO<Response<T>> r5) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        ANRequest r6 = AndroidNetworking.post(r3).addBodyParameter(r4).setTag(r3).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r7 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r6.getAsParsed(r7, new NetWork$post$1(r5));
    }

    public final void XO0O10(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 final HttpProgressCallback<String> r5) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "path");
        Intrinsics.X0O(r4, Y5.c.b);
        Intrinsics.X0O(r5, "callback");
        AndroidNetworking.download(r2, r3, r4).setTag(r2).setPriority(Priority.MEDIUM).build().setDownloadProgressListener(new r51(r5)).startDownload(new NetWork$download$2(r5));
    }

    public final /* synthetic */ <T> void XX0(String r3, String r4, File r5, Object r6, final O1XIiIO<Response<T>> r7) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "fileParameter");
        Intrinsics.X0O(r5, "file");
        Intrinsics.X0O(r6, "body");
        Intrinsics.X0O(r7, "callback");
        ANRequest.MultiPartBuilder r0 = AndroidNetworking.upload(r3);
        if (r5.exists() == false) goto L5;
        r0.addMultipartFile(r4, r5);
    L5:
        ANRequest r8 = r0.addMultipartParameter(r6).setTag(r3).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWork$upload$1.OXO1);
        Intrinsics.OX(4, "T");
        TypeToken<?> r9 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r8.getAsParsed(r9, new NetWork$upload$2(r7));
    }

    public final /* synthetic */ <T> void XXI(String r2, Map<String, String> r3, Map<String, String> r4, final O1XIiIO<Response<T>> r5) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "headers");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        ANRequest r6 = AndroidNetworking.get(r2).addQueryParameter(r4).setTag(r2).addHeaders(r3).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r7 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r6.getAsParsed(r7, new NetWork$getV2$1(r5));
    }

    public final /* synthetic */ <T> void XiOIO(String r2, Map<String, String> r3, Map<String, ? extends Object> r4, final O1XIiIO<Response<T>> r5) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "headers");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        ANRequest r6 = AndroidNetworking.post(r2).addHeaders(r3).addBodyParameter(r4).setTag(r2).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r7 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r6.getAsParsed(r7, new NetWork$postV2$1(r5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> void iIiiO(String r5, Map<String, String> r6, Map<String, ? extends Object> r7, O1XIiIO<Response<T>> r8) {
        Intrinsics.X0O(r5, "url");
        Intrinsics.X0O(r6, "headers");
        Intrinsics.X0O(r7, "body");
        Intrinsics.X0O(r8, "callback");
        FormBody.Builder r0 = new FormBody.Builder(null, 1, 0 == true ? 1 : 0);
        Iterator<Map.Entry<String, ? extends Object>> r9 = r7.entrySet().iterator();
    L4:
        if (r9.hasNext() == false) goto L16;
        Map.Entry<String, ? extends Object> r1 = r9.next();
        String r2 = r1.getKey();
        Object r3 = r1.getValue();
        if ((r3 instanceof String) == false) goto L9;
        String r4 = (String) r3;
    L15:
        r0.add(r2, r4);
        goto L4
    L9:
        if ((r3 instanceof Boolean) == false) goto L12;
        r4 = String.valueOf(((Boolean) r3).booleanValue()).toLowerCase(Locale.ROOT);
        Intrinsics.O10IXXX0X(r4, "toLowerCase(...)");
        goto L15
    L12:
        if ((r3 instanceof Number) == false) goto L14;
        r4 = r3.toString();
        goto L15
    L14:
        r4 = r3.toString();
        goto L15
    L16:
        FormBody r10 = r0.build();
        Request.Builder r11 = new Request.Builder().url(r5).post(r10);
        Iterator<Map.Entry<String, String>> r12 = r6.entrySet().iterator();
    L18:
        if (r12.hasNext() == false) goto L20;
        Map.Entry<String, String> r13 = r12.next();
        r11.addHeader(r13.getKey(), r13.getValue());
        goto L18
    L20:
        Request r14 = r11.build();
        Call r15 = com.sma.androidnetworklib.OXO1.OXO1.OXO1().newCall(r14);
        Intrinsics.XiOIii1();
        r15.enqueue(new OXO1(r8));
    }

    public final void iO() {
        AndroidNetworking.evictAllBitmap();
    }
}

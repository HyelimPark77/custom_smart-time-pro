package com.sma.androidnetworklib.method;

import android.graphics.Bitmap;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.BitmapRequestListener;
import com.androidnetworking.interfaces.DownloadListener;
import com.androidnetworking.interfaces.DownloadProgressListener;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.androidnetworking.interfaces.UploadProgressListener;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import java.io.File;
import java.io.IOException;
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
    public static final NetWork OXO1 = new NetWork();

    @SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postV3$3\n*L\n1#1,511:1\n*E\n"})
    public static final class OXO1 implements Callback {
        public final /* synthetic */ O1XIiIO<Response<T>> OXO1;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: com.sma.androidnetworklib.method.NetWork$OXO1$OXO1 */
        public static final class C22034OXO1<T> extends TypeToken<Response<T>> {
        }

        public OXO1(O1XIiIO<Response<T>> o1XIiIO) {
            this.OXO1 = o1XIiIO;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e) {
            Intrinsics.X0O(call, "call");
            Intrinsics.X0O(e, "e");
            e.printStackTrace();
            this.OXO1.handleError(String.valueOf(e.getMessage()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // okhttp3.Callback
        public void onResponse(Call call, okhttp3.Response response) {
            Intrinsics.X0O(call, "call");
            Intrinsics.X0O(response, "response");
            try {
                ResponseBody responseBodyBody = response.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                Intrinsics.XiOIii1();
                this.OXO1.handleResponse((Response<T>) ((Response) GsonUtils.fromJson(strString, new C22034OXO1().getType())));
            } catch (Exception e) {
                this.OXO1.handleError(String.valueOf(e.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ void m38061IO(NetWork netWork, String str, O1XIiIO o1XIiIO, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        netWork.I0IIOi(str, o1XIiIO, i);
    }

    public static final void O00(HttpProgressCallback httpProgressCallback, long j, long j2) {
        if (j2 != 0) {
            httpProgressCallback.handleProgress((int) ((j * ((long) 100)) / j2));
        }
    }

    public static final void XOO0ii0(HttpProgressCallback httpProgressCallback, long j, long j2) {
        if (j2 != 0) {
            httpProgressCallback.handleProgress((int) ((j * ((long) 100)) / j2));
        }
    }

    public final void I0IIOi(@aa1 String url, @aa1 final O1XIiIO<JSONObject> callback, int i) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(callback, "callback");
        ANRequest.GetRequestBuilder priority = AndroidNetworking.get(url).setTag((Object) url).setPriority(Priority.HIGH);
        if (i != 0) {
            priority.setMaxAgeCacheControl(i, TimeUnit.MINUTES);
        }
        priority.build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.androidnetworklib.method.NetWork$get$1
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                callback.handleResponse(jSONObject);
            }
        });
    }

    public final <T> void I0iXXO(@aa1 String url, @aa1 final File file, @aa1 final O1XIiIO<T> callback, @aa1 Map<String, String> headers) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        AndroidNetworking.get(url).addHeaders(headers).setTag((Object) url).setPriority(Priority.MEDIUM).setBitmapMaxHeight(400).setBitmapMaxWidth(400).setBitmapConfig(Bitmap.Config.ARGB_8888).build().getAsBitmap(new BitmapRequestListener() { // from class: com.sma.androidnetworklib.method.NetWork$getImageV2$1
            @Override // com.androidnetworking.interfaces.BitmapRequestListener
            public void onError(ANError error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d(error.toString());
                callback.handleError(error.toString());
            }

            @Override // com.androidnetworking.interfaces.BitmapRequestListener
            public void onResponse(Bitmap bitmap) {
                if (bitmap != null) {
                    LogUtils.m11128d("get bitmap");
                    ImageUtils.save(bitmap, file, Bitmap.CompressFormat.JPEG);
                    callback.handleResponse(null);
                }
            }
        });
    }

    public final /* synthetic */ <T> T I1XOi1(String url, Object body) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        try {
            ANRequest aNRequestBuild = AndroidNetworking.post(url).addApplicationJsonBody(body).setTag((Object) url).setPriority(Priority.HIGH).build();
            Intrinsics.m39537OX(4, "T");
            T t = (T) aNRequestBuild.executeForObject(Object.class).getResult();
            Intrinsics.m39537OX(1, "T");
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.m11128d(Unit.OXO1);
            return null;
        }
    }

    public final /* synthetic */ <T> void IIX1OXO(String url, Map<String, String> headers, Object body, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addHeaders(headers).addApplicationJsonBody(body).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$postJsonV2$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
            }
        });
    }

    public final void IiI10X(@aa1 String url, @aa1 Map<String, String> headers, @aa1 String path, @aa1 String fileName, @aa1 final HttpProgressCallback<String> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(callback, "callback");
        AndroidNetworking.download(url, path, fileName).setTag((Object) url).addHeaders(headers).setPriority(Priority.MEDIUM).build().setDownloadProgressListener(new DownloadProgressListener() { // from class: com.android.mltcode.paycertificationapi.q51
            @Override // com.androidnetworking.interfaces.DownloadProgressListener
            public final void onProgress(long j, long j2) {
                NetWork.XOO0ii0(callback, j, j2);
            }
        }).startDownload(new DownloadListener() { // from class: com.sma.androidnetworklib.method.NetWork$downloadV2$2
            @Override // com.androidnetworking.interfaces.DownloadListener
            public void onDownloadComplete() {
                LogUtils.m11128d("download complete");
                callback.handleResponse("");
            }

            @Override // com.androidnetworking.interfaces.DownloadListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
                LogUtils.m11128d("download error " + aNError);
            }
        });
    }

    public final /* synthetic */ <T> void O10IXXX0X(String url, Object body, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addApplicationJsonBody(body).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$postJson$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
            }
        });
    }

    public final <T> void OIX0iXi(@aa1 String url, @aa1 final File file, @aa1 final O1XIiIO<T> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(callback, "callback");
        AndroidNetworking.get(url).setTag((Object) url).setPriority(Priority.MEDIUM).setBitmapMaxHeight(400).setBitmapMaxWidth(400).setBitmapConfig(Bitmap.Config.ARGB_8888).build().getAsBitmap(new BitmapRequestListener() { // from class: com.sma.androidnetworklib.method.NetWork$getImage$1
            @Override // com.androidnetworking.interfaces.BitmapRequestListener
            public void onError(ANError error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d(error.toString());
                callback.handleError(error.toString());
            }

            @Override // com.androidnetworking.interfaces.BitmapRequestListener
            public void onResponse(Bitmap bitmap) {
                if (bitmap != null) {
                    LogUtils.m11128d("get bitmap");
                    ImageUtils.save(bitmap, file, Bitmap.CompressFormat.JPEG);
                    callback.handleResponse(null);
                }
            }
        });
    }

    public final /* synthetic */ <T> void OIi0(String url, Map<String, String> body, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        ANRequest aNRequestBuild = AndroidNetworking.get(url).addQueryParameter(body).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$get$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
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
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                callback.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final /* synthetic */ <T> void OiIIX101O(String url, String fileParameter, File file, Map<String, String> headers, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(fileParameter, "fileParameter");
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(callback, "callback");
        ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(url);
        if (file.exists()) {
            multiPartBuilderUpload.addMultipartFile(fileParameter, file);
        }
        multiPartBuilderUpload.addHeaders(headers);
        ANRequest uploadProgressListener = multiPartBuilderUpload.setTag((Object) url).setPriority(Priority.HIGH).build().setUploadProgressListener(new UploadProgressListener() { // from class: com.sma.androidnetworklib.method.NetWork$uploadV2$1
            @Override // com.androidnetworking.interfaces.UploadProgressListener
            public final void onProgress(long j, long j2) {
            }
        });
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        uploadProgressListener.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$uploadV2$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
            }
        });
    }

    public final /* synthetic */ <T> void X0O(String url, Map<String, String> headers, JSONArray body, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addHeaders(headers).addJSONArrayBody(body).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$postJsonArrayBody$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
            }
        });
    }

    public final /* synthetic */ <T> void X1ii(String url, Map<String, String> body, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addBodyParameter(body).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$post$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
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
                callback.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void XO0O10(@aa1 String url, @aa1 String path, @aa1 String fileName, @aa1 final HttpProgressCallback<String> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(callback, "callback");
        AndroidNetworking.download(url, path, fileName).setTag((Object) url).setPriority(Priority.MEDIUM).build().setDownloadProgressListener(new DownloadProgressListener() { // from class: com.android.mltcode.paycertificationapi.r51
            @Override // com.androidnetworking.interfaces.DownloadProgressListener
            public final void onProgress(long j, long j2) {
                NetWork.O00(callback, j, j2);
            }
        }).startDownload(new DownloadListener() { // from class: com.sma.androidnetworklib.method.NetWork$download$2
            @Override // com.androidnetworking.interfaces.DownloadListener
            public void onDownloadComplete() {
                LogUtils.m11128d("download complete");
                callback.handleResponse("");
            }

            @Override // com.androidnetworking.interfaces.DownloadListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
                LogUtils.m11128d("download error " + aNError);
            }
        });
    }

    public final /* synthetic */ <T> void XX0(String url, String fileParameter, File file, Object body, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(fileParameter, "fileParameter");
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(url);
        if (file.exists()) {
            multiPartBuilderUpload.addMultipartFile(fileParameter, file);
        }
        ANRequest uploadProgressListener = multiPartBuilderUpload.addMultipartParameter(body).setTag((Object) url).setPriority(Priority.HIGH).build().setUploadProgressListener(new UploadProgressListener() { // from class: com.sma.androidnetworklib.method.NetWork$upload$1
            @Override // com.androidnetworking.interfaces.UploadProgressListener
            public final void onProgress(long j, long j2) {
            }
        });
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        uploadProgressListener.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$upload$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
            }
        });
    }

    public final /* synthetic */ <T> void XXI(String url, Map<String, String> headers, Map<String, String> body, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        ANRequest aNRequestBuild = AndroidNetworking.get(url).addQueryParameter(body).setTag((Object) url).addHeaders(headers).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$getV2$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
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
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                callback.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final /* synthetic */ <T> void XiOIO(String url, Map<String, String> headers, Map<String, ? extends Object> body, final O1XIiIO<Response<T>> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addHeaders(headers).addBodyParameter((Map<String, String>) body).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new ParsedRequestListener<Response<T>>() { // from class: com.sma.androidnetworklib.method.NetWork$postV2$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<T> response) {
                Intrinsics.X0O(response, "response");
                callback.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                callback.handleError(String.valueOf(numValueOf));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> void iIiiO(String url, Map<String, String> headers, Map<String, ? extends Object> body, O1XIiIO<Response<T>> callback) {
        String string;
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        FormBody.Builder builder = new FormBody.Builder(null, 1, 0 == true ? 1 : 0);
        for (Map.Entry<String, ? extends Object> entry : body.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                string = (String) value;
            } else if (value instanceof Boolean) {
                string = String.valueOf(((Boolean) value).booleanValue()).toLowerCase(Locale.ROOT);
                Intrinsics.O10IXXX0X(string, "toLowerCase(...)");
            } else {
                string = value instanceof Number ? value.toString() : value.toString();
            }
            builder.add(key, string);
        }
        Request.Builder builderPost = new Request.Builder().url(url).post(builder.build());
        for (Map.Entry<String, String> entry2 : headers.entrySet()) {
            builderPost.addHeader(entry2.getKey(), entry2.getValue());
        }
        Call callNewCall = com.sma.androidnetworklib.OXO1.OXO1.OXO1().newCall(builderPost.build());
        Intrinsics.XiOIii1();
        callNewCall.enqueue(new OXO1(callback));
    }

    /* JADX INFO: renamed from: iO */
    public final void m38062iO() {
        AndroidNetworking.evictAllBitmap();
    }
}

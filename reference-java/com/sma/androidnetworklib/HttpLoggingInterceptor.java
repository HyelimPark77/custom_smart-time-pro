package com.sma.androidnetworklib;

import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes18.dex */
public class HttpLoggingInterceptor implements Interceptor {

    /* JADX INFO: renamed from: iO */
    public static final Charset f47779iO = Charset.forName("UTF-8");
    public final OXO1 OXO1;
    public volatile Level XIi00iiXO;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY,
        CUSTOM
    }

    public interface OXO1 {
        public static final OXO1 OXO1 = new C22033OXO1();

        /* JADX INFO: renamed from: com.sma.androidnetworklib.HttpLoggingInterceptor$OXO1$OXO1 */
        public class C22033OXO1 implements OXO1 {
            @Override // com.sma.androidnetworklib.HttpLoggingInterceptor.OXO1
            public void log(String str) {
                Platform.get().log(str, 4, null);
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(OXO1.OXO1);
    }

    public static boolean XO0O10(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i = 0; i < 16 && !buffer2.exhausted(); i++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public HttpLoggingInterceptor O00(Level level) {
        if (level == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.XIi00iiXO = level;
        return this;
    }

    public final boolean OXO1(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || str.equalsIgnoreCase("identity")) ? false : true;
    }

    public final Response XIi00iiXO(Interceptor.Chain chain) throws Exception {
        String str;
        String str2;
        Level level = this.XIi00iiXO;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = true;
        boolean z2 = false;
        boolean z3 = level == Level.BODY || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        boolean z4 = requestBodyBody != null;
        Connection connection = chain.connection();
        String str3 = "--> " + request.method() + ' ' + request.url().uri().getPath() + ' ' + (connection != null ? connection.protocol() : Protocol.HTTP_1_1);
        if (!z3 && z4) {
            str3 = str3 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.OXO1.log(str3);
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            long jContentLength = responseBodyBody.contentLength();
            if (jContentLength != -1) {
                str = jContentLength + "-byte";
            } else {
                str = "unknown-length";
            }
            OXO1 oxo1 = this.OXO1;
            StringBuilder sb = new StringBuilder();
            sb.append("<-- ");
            sb.append(responseProceed.code());
            sb.append(' ');
            sb.append(responseProceed.message());
            sb.append(' ');
            sb.append(responseProceed.request().url().uri().getPath());
            sb.append(" (");
            sb.append(millis);
            sb.append("ms");
            if (z3) {
                str2 = "";
            } else {
                str2 = ", " + str + " body";
            }
            sb.append(str2);
            sb.append(HexStringBuilder.COMMENT_END_CHAR);
            oxo1.log(sb.toString());
            String strHeader = responseProceed.header("Content-Disposition");
            boolean z5 = strHeader != null && strHeader.contains("attachment");
            MediaType mediaTypeContentType = responseBodyBody.contentType();
            if (mediaTypeContentType != null) {
                String lowerCase = mediaTypeContentType.toString().toLowerCase();
                if (!lowerCase.contains("octet-stream") && !lowerCase.contains("zip") && !lowerCase.contains("pdf") && !lowerCase.contains("image/") && !lowerCase.contains("video/") && !lowerCase.contains("audio/")) {
                    z = false;
                }
                z2 = z;
            }
            if (z5 || z2 || jContentLength > 51200) {
                this.OXO1.log("<-- END HTTP (large file download, body logging skipped)");
                return responseProceed;
            }
            if (!HttpHeaders.hasBody(responseProceed)) {
                this.OXO1.log("<-- END HTTP");
                return responseProceed;
            }
            if (OXO1(responseProceed.headers())) {
                this.OXO1.log("<-- END HTTP (encoded body omitted)");
                return responseProceed;
            }
            BufferedSource bufferedSourceSource = responseBodyBody.source();
            bufferedSourceSource.request(Long.MAX_VALUE);
            Buffer buffer = bufferedSourceSource.buffer();
            Charset charset = f47779iO;
            if (mediaTypeContentType != null) {
                charset = mediaTypeContentType.charset(charset);
            }
            if (XO0O10(buffer)) {
                if (jContentLength != 0) {
                    this.OXO1.log(buffer.clone().readString(charset));
                }
                return responseProceed;
            }
            this.OXO1.log("<-- END HTTP (binary " + buffer.size() + "-byte body omitted)");
            return responseProceed;
        } catch (Exception e) {
            this.OXO1.log("<-- HTTP FAILED " + request.url().uri().getPath() + "  : " + e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: iO */
    public Level m38059iO() {
        return this.XIi00iiXO;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        boolean z;
        String str;
        long j;
        Level level = this.XIi00iiXO;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        if (level == Level.CUSTOM) {
            return XIi00iiXO(chain);
        }
        boolean z2 = level == Level.BODY;
        boolean z3 = z2 || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        boolean z4 = requestBodyBody != null;
        Connection connection = chain.connection();
        String str2 = "--> " + request.method() + ' ' + request.url() + ' ' + (connection != null ? connection.protocol() : Protocol.HTTP_1_1);
        if (!z3 && z4) {
            str2 = str2 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.OXO1.log(str2);
        if (z3) {
            if (z4) {
                if (requestBodyBody.contentType() != null) {
                    j = -1;
                    this.OXO1.log("Content-Type: " + requestBodyBody.contentType());
                } else {
                    j = -1;
                }
                if (requestBodyBody.contentLength() != j) {
                    this.OXO1.log("Content-Length: " + requestBodyBody.contentLength());
                }
            } else {
                j = -1;
            }
            Headers headers = request.headers();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                String strName = headers.name(i);
                if (!"Content-Type".equalsIgnoreCase(strName) && !"Content-Length".equalsIgnoreCase(strName)) {
                    this.OXO1.log(strName + ": " + headers.value(i));
                }
                i++;
                z3 = z3;
            }
            z = z3;
            if (!z2 || !z4) {
                str = r11;
                this.OXO1.log("--> END " + request.method());
            } else if (OXO1(request.headers())) {
                this.OXO1.log("--> END " + request.method() + " (encoded body omitted)");
                str = " (";
            } else {
                Buffer buffer = new Buffer();
                requestBodyBody.writeTo(buffer);
                Charset charset = f47779iO;
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null) {
                    charset = mediaTypeContentType.charset(charset);
                }
                this.OXO1.log("");
                if (XO0O10(buffer)) {
                    this.OXO1.log(buffer.readString(charset));
                    OXO1 oxo1 = this.OXO1;
                    StringBuilder sb = new StringBuilder();
                    sb.append("--> END ");
                    sb.append(request.method());
                    str = r11;
                    sb.append(str);
                    sb.append(requestBodyBody.contentLength());
                    sb.append("-byte body)");
                    oxo1.log(sb.toString());
                } else {
                    str = r11;
                    this.OXO1.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                }
            }
        } else {
            z = z3;
            str = " (";
            j = -1;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            long jContentLength = responseBodyBody.contentLength();
            String str3 = jContentLength != j ? jContentLength + "-byte" : "unknown-length";
            OXO1 oxo2 = this.OXO1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(responseProceed.code());
            sb2.append(' ');
            boolean z5 = z2;
            sb2.append(responseProceed.message());
            sb2.append(' ');
            sb2.append(responseProceed.request().url());
            sb2.append(str);
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z ? "" : ", " + str3 + " body");
            sb2.append(HexStringBuilder.COMMENT_END_CHAR);
            oxo2.log(sb2.toString());
            if (z) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    this.OXO1.log(headers2.name(i2) + ": " + headers2.value(i2));
                }
                if (z5 && HttpHeaders.hasBody(responseProceed)) {
                    if (OXO1(responseProceed.headers())) {
                        this.OXO1.log("<-- END HTTP (encoded body omitted)");
                        return responseProceed;
                    }
                    BufferedSource bufferedSourceSource = responseBodyBody.source();
                    bufferedSourceSource.request(Long.MAX_VALUE);
                    Buffer buffer2 = bufferedSourceSource.buffer();
                    Charset charset2 = f47779iO;
                    MediaType mediaTypeContentType2 = responseBodyBody.contentType();
                    if (mediaTypeContentType2 != null) {
                        charset2 = mediaTypeContentType2.charset(charset2);
                    }
                    if (!XO0O10(buffer2)) {
                        this.OXO1.log("");
                        this.OXO1.log("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (jContentLength != 0) {
                        this.OXO1.log("");
                        this.OXO1.log(buffer2.clone().readString(charset2));
                    }
                    this.OXO1.log("<-- END HTTP (" + buffer2.size() + "-byte body)");
                    return responseProceed;
                }
                this.OXO1.log("<-- END HTTP");
            }
            return responseProceed;
        } catch (Exception e) {
            this.OXO1.log("<-- HTTP FAILED " + request.url().uri().getPath() + "  : " + e);
            throw e;
        }
    }

    public HttpLoggingInterceptor(OXO1 oxo1) {
        this.XIi00iiXO = Level.NONE;
        this.OXO1 = oxo1;
    }
}

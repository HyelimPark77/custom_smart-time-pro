package com.sma.androidnetworklib;

import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.EOFException;
import java.io.IOException;
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
    public static final Charset iO = null;
    public final OXO1 OXO1;
    public volatile Level XIi00iiXO;

    public static final enum Level extends Enum<Level> {
        private static final /* synthetic */ Level[] $VALUES = null;
        public static final Level BASIC = null;
        public static final Level BODY = null;
        public static final Level CUSTOM = null;
        public static final Level HEADERS = null;
        public static final Level NONE = null;

        private static /* synthetic */ Level[] $values() {
            return new Level[]{NONE, BASIC, HEADERS, BODY, CUSTOM};
        }

        static {
            NONE = new Level("NONE", 0);
            BASIC = new Level("BASIC", 1);
            HEADERS = new Level("HEADERS", 2);
            BODY = new Level("BODY", 3);
            CUSTOM = new Level("CUSTOM", 4);
            $VALUES = $values();
        }

        private Level(String r1, int r2) {
            super(r1, r2);
        }

        public static Level valueOf(String r1) {
            return (Level) Enum.valueOf(Level.class, r1);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    public interface OXO1 {
        public static final OXO1 OXO1 = null;

        /* JADX INFO: renamed from: com.sma.androidnetworklib.HttpLoggingInterceptor$OXO1$OXO1, reason: collision with other inner class name */
        public class C0551OXO1 implements OXO1 {
            public C0551OXO1() {
            }

            @Override // com.sma.androidnetworklib.HttpLoggingInterceptor.OXO1
            public void log(String r4) {
                Platform.get().log(r4, 4, null);
            }
        }

        static {
            OXO1 = new C0551OXO1();
        }

        void log(String r1);
    }

    static {
        iO = Charset.forName("UTF-8");
    }

    public HttpLoggingInterceptor() {
        this(OXO1.OXO1);
    }

    public static boolean XO0O10(Buffer r7) {
        Buffer r2 = new Buffer();     // Catch: EOFException -> L20
        long r5 = 64;
        if (r7.size() >= 64) goto L6;
        r5 = r7.size();     // Catch: EOFException -> L20
    L6:
        r7.copyTo(r2, 0, r5);     // Catch: EOFException -> L20
        int r8 = 0;
    L8:
        if (r8 >= 16) goto L28;
        if (r2.exhausted() == true) goto L18;
        int r1 = r2.readUtf8CodePoint();     // Catch: EOFException -> L20
        if (Character.isISOControl(r1) == false) goto L17;
        if (Character.isWhitespace(r1) == true) goto L17;
        return false;
    L17:
        r8 = r8 + 1;
        goto L8
    L18:
        return true;
    L28:
        return true;
    L20:
        return false;
    }

    public HttpLoggingInterceptor O00(Level r2) {
        if (r2 == null) goto L6;
        this.XIi00iiXO = r2;
        return this;
    L6:
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public final boolean OXO1(Headers r2) {
        String r3 = r2.get("Content-Encoding");
        if (r3 != null) goto L5;
        return false;
    L5:
        if (r3.equalsIgnoreCase("identity") == true) goto L10;
        return true;
    L10:
        return false;
    }

    public final Response XIi00iiXO(Interceptor.Chain r15) throws IOException {
        Level r0 = this.XIi00iiXO;
        Request r1 = r15.request();
        if (r0 == Level.NONE) goto L5;
        boolean r3 = true;
        boolean r4 = false;
        if (r0 != Level.BODY) goto L10;
    L11:
        boolean r2 = true;
    L13:
        RequestBody r5 = r1.body();
        if (r5 == null) goto L16;
        boolean r6 = true;
    L17:
        Connection r7 = r15.connection();
        if (r7 == null) goto L20;
        Protocol r8 = r7.protocol();
    L21:
        String r9 = "--> " + r1.method() + ' ' + r1.url().uri().getPath() + ' ' + r8;
        if (r2 == true) goto L25;
        if (r6 == false) goto L25;
        r9 = r9 + " (" + r5.contentLength() + "-byte body)";
    L25:
        this.OXO1.log(r9);
        long r10 = System.nanoTime();
        Response r16 = r15.proceed(r1);     // Catch: Exception -> L84
        long r11 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - r10);
        ResponseBody r12 = r16.body();
        long r13 = r12.contentLength();
        if (r13 == (-1)) goto L30;
        String r14 = r13 + "-byte";
    L31:
        OXO1 r17 = this.OXO1;
        StringBuilder r18 = new StringBuilder();
        r18.append("<-- ");
        r18.append(r16.code());
        r18.append(' ');
        r18.append(r16.message());
        r18.append(' ');
        r18.append(r16.request().url().uri().getPath());
        r18.append(" (");
        r18.append(r11);
        r18.append("ms");
        if (r2 == true) goto L34;
        String r19 = ", " + r14 + " body";
    L35:
        r18.append(r19);
        r18.append(HexStringBuilder.COMMENT_END_CHAR);
        r17.log(r18.toString());
        String r20 = r16.header("Content-Disposition");
        if (r20 != null) goto L38;
    L40:
        boolean r21 = false;
    L41:
        MediaType r22 = r12.contentType();
        if (r22 == null) goto L58;
        String r23 = r22.toString().toLowerCase();
        if (r23.contains("octet-stream") == false) goto L46;
    L57:
        r4 = r3;
        goto L58
    L46:
        if (r23.contains("zip") == true) goto L57;
        if (r23.contains("pdf") == true) goto L57;
        if (r23.contains("image/") == true) goto L57;
        if (r23.contains("video/") == true) goto L57;
        if (r23.contains("audio/") == true) goto L57;
        r3 = false;
    L58:
        if (r21 == true) goto L82;
        if (r4 == true) goto L82;
        if (r13 > 51200) goto L82;
        if (HttpHeaders.hasBody(r16) == true) goto L68;
        this.OXO1.log("<-- END HTTP");
        return r16;
    L68:
        if (OXO1(r16.headers()) == false) goto L71;
        this.OXO1.log("<-- END HTTP (encoded body omitted)");
        return r16;
    L71:
        BufferedSource r24 = r12.source();
        r24.request(Long.MAX_VALUE);
        Buffer r25 = r24.buffer();
        Charset r26 = iO;
        if (r22 == null) goto L75;
        r26 = r22.charset(r26);
    L75:
        if (XO0O10(r25) == true) goto L79;
        this.OXO1.log("<-- END HTTP (binary " + r25.size() + "-byte body omitted)");
        return r16;
    L79:
        if (r13 == 0) goto L81;
        this.OXO1.log(r25.m7144clone().readString(r26));
    L81:
        return r16;
    L82:
        this.OXO1.log("<-- END HTTP (large file download, body logging skipped)");
        return r16;
    L38:
        if (r20.contains("attachment") == false) goto L40;
        r21 = true;
        goto L41
    L34:
        r19 = "";
        goto L35
    L30:
        r14 = "unknown-length";
    L84:
        e = move-exception;
        this.OXO1.log("<-- HTTP FAILED " + r1.url().uri().getPath() + "  : " + e);
        throw e;
    L20:
        r8 = Protocol.HTTP_1_1;
        goto L21
    L16:
        r6 = false;
        goto L17
    L10:
        if (r0 == Level.HEADERS) goto L11;
        r2 = false;
        goto L13
    L5:
        return r15.proceed(r1);
    }

    public Level iO() {
        return this.XIi00iiXO;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain r22) throws IOException {
        Level r2 = this.XIi00iiXO;
        Request r3 = r22.request();
        if (r2 != Level.NONE) goto L7;
        return r22.proceed(r3);
    L7:
        if (r2 == Level.CUSTOM) goto L9;
        boolean r6 = true;
        if (r2 != Level.BODY) goto L13;
        boolean r4 = true;
    L14:
        if (r4 == false) goto L16;
    L19:
        boolean r5 = true;
    L20:
        RequestBody r7 = r3.body();
        if (r7 != null) goto L24;
        r6 = false;
    L24:
        Connection r8 = r22.connection();
        if (r8 == null) goto L27;
        Protocol r9 = r8.protocol();
    L28:
        String r10 = "--> " + r3.method() + ' ' + r3.url() + ' ' + r9;
        if (r5 == true) goto L32;
        if (r6 == false) goto L32;
        r10 = r10 + " (" + r7.contentLength() + "-byte body)";
    L32:
        this.OXO1.log(r10);
        if (r5 == false) goto L68;
        if (r6 == true) goto L36;
        long r17 = -1;
    L44:
        Headers r11 = r3.headers();
        int r12 = r11.size();
        int r13 = 0;
    L45:
        if (r13 >= r12) goto L53;
        String r14 = r11.name(r13);
        if ("Content-Type".equalsIgnoreCase(r14) == true) goto L52;
        if ("Content-Length".equalsIgnoreCase(r14) == true) goto L52;
        this.OXO1.log(r14 + ": " + r11.value(r13));
    L52:
        r13 = r13 + 1;
        r5 = r5;
        goto L45
    L53:
        boolean r20 = r5;
        if (r4 == false) goto L56;
        if (r6 == false) goto L56;
        if (OXO1(r3.headers()) == false) goto L60;
        this.OXO1.log("--> END " + r3.method() + " (encoded body omitted)");
        String r15 = " (";
    L69:
        long r16 = System.nanoTime();
        Response r0 = r22.proceed(r3);     // Catch: Exception -> L106
        long r18 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - r16);
        ResponseBody r19 = r0.body();
        long r21 = r19.contentLength();
        if (r21 == r17) goto L74;
        String r110 = r21 + "-byte";
    L75:
        OXO1 r111 = this.OXO1;
        StringBuilder r112 = new StringBuilder();
        r112.append("<-- ");
        r112.append(r0.code());
        r112.append(' ');
        boolean r113 = r4;
        r112.append(r0.message());
        r112.append(' ');
        r112.append(r0.request().url());
        r112.append(r15);
        r112.append(r18);
        r112.append("ms");
        if (r20 == true) goto L78;
        String r1 = ", " + r110 + " body";
    L79:
        r112.append(r1);
        r112.append(HexStringBuilder.COMMENT_END_CHAR);
        r111.log(r112.toString());
        if (r20 == false) goto L105;
        Headers r23 = r0.headers();
        int r24 = r23.size();
        int r25 = 0;
    L82:
        if (r25 >= r24) goto L84;
        this.OXO1.log(r23.name(r25) + ": " + r23.value(r25));
        r25 = r25 + 1;
        goto L82
    L84:
        if (r113 == true) goto L86;
    L104:
        this.OXO1.log("<-- END HTTP");
        goto L105
    L86:
        if (HttpHeaders.hasBody(r0) == false) goto L104;
        if (OXO1(r0.headers()) == false) goto L92;
        this.OXO1.log("<-- END HTTP (encoded body omitted)");
        return r0;
    L92:
        BufferedSource r26 = r19.source();
        r26.request(Long.MAX_VALUE);
        Buffer r27 = r26.buffer();
        Charset r28 = iO;
        MediaType r29 = r19.contentType();
        if (r29 == null) goto L96;
        r28 = r29.charset(r28);
    L96:
        if (XO0O10(r27) == true) goto L100;
        this.OXO1.log("");
        this.OXO1.log("<-- END HTTP (binary " + r27.size() + "-byte body omitted)");
        return r0;
    L100:
        if (r21 == 0) goto L102;
        this.OXO1.log("");
        this.OXO1.log(r27.m7144clone().readString(r28));
    L102:
        this.OXO1.log("<-- END HTTP (" + r27.size() + "-byte body)");
        return r0;
    L105:
        return r0;
    L78:
        r1 = "";
        goto L79
    L74:
        r110 = "unknown-length";
    L106:
        e = move-exception;
        this.OXO1.log("<-- HTTP FAILED " + r3.url().uri().getPath() + "  : " + e);
        throw e;
    L60:
        Buffer r30 = new Buffer();
        r7.writeTo(r30);
        Charset r31 = iO;
        MediaType r114 = r7.contentType();
        if (r114 == null) goto L63;
        r31 = r114.charset(r31);
    L63:
        this.OXO1.log("");
        if (XO0O10(r30) == false) goto L66;
        this.OXO1.log(r30.readString(r31));
        OXO1 r32 = this.OXO1;
        StringBuilder r33 = new StringBuilder();
        r33.append("--> END ");
        r33.append(r3.method());
        r15 = r11;
        r33.append(r15);
        r33.append(r7.contentLength());
        r33.append("-byte body)");
        r32.log(r33.toString());
        goto L69
    L66:
        r15 = r11;
        this.OXO1.log("--> END " + r3.method() + " (binary " + r7.contentLength() + "-byte body omitted)");
    L56:
        r15 = r11;
        this.OXO1.log("--> END " + r3.method());
        goto L69
    L36:
        if (r7.contentType() == null) goto L38;
        r17 = -1;
        this.OXO1.log("Content-Type: " + r7.contentType());
    L40:
        if (r7.contentLength() == r17) goto L44;
        this.OXO1.log("Content-Length: " + r7.contentLength());
        goto L44
    L38:
        r17 = -1;
        goto L40
    L68:
        r20 = r5;
        r15 = " (";
        r17 = -1;
        goto L69
    L27:
        r9 = Protocol.HTTP_1_1;
        goto L28
    L16:
        if (r2 == Level.HEADERS) goto L19;
        r5 = false;
        goto L20
    L13:
        r4 = false;
        goto L14
    L9:
        return XIi00iiXO(r22);
    }

    public HttpLoggingInterceptor(OXO1 r2) {
        this.XIi00iiXO = Level.NONE;
        this.OXO1 = r2;
    }
}

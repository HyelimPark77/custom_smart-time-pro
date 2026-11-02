package com.sma.smartv3.biz;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.OI0OX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0011i;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.of1;
import com.android.mltcode.paycertificationapi.pf1;
import com.android.mltcode.paycertificationapi.qf1;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.ironsource.Z3;
import j$.net.URLEncoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Date;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nOkHttpFileServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpFileServer.kt\ncom/sma/smartv3/biz/OkHttpFileServer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"})
public final class OkHttpFileServer {

    @aa1
    public static final OXO1 O10IXXX0X = null;

    @aa1
    public final AtomicLong I0IIOi;

    @tb1
    public ServerSocket I0iXXO;

    @tb1
    public ScheduledFuture<?> IO;
    public final int IiI10X;

    @aa1
    public final String O00;

    @aa1
    public final ScheduledExecutorService OIX0iXi;
    public final long OIi0;

    @aa1
    public final File OXO1;

    @aa1
    public AtomicBoolean X1ii;

    @aa1
    public final String XIi00iiXO;
    public final long XO0O10;

    @aa1
    public final AtomicBoolean XOO0ii0;

    @tb1
    public Thread XXI;

    @aa1
    public final OI0OX0 iO;

    @SourceDebugExtension({"SMAP\nOkHttpFileServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpFileServer.kt\ncom/sma/smartv3/biz/OkHttpFileServer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public static final /* synthetic */ int OXO1(OXO1 r0) {
            return r0.XIi00iiXO();
        }

        public final int XIi00iiXO() {
            ServerSocket r0 = new ServerSocket(0);
            int r1 = r0.getLocalPort();     // Catch: Throwable -> L6
            CloseableKt.OXO1(r0, null);
            return r1;
        L6:
            th = move-exception;
            throw th;     // Catch: Throwable -> L8
        L8:
            th = move-exception;
            CloseableKt.OXO1(r0, th);
            throw th;
        }

        @aa1
        public final String iO() {
            Enumeration<NetworkInterface> r0 = NetworkInterface.getNetworkInterfaces();     // Catch: Exception -> L26
        L5:
            if (r0.hasMoreElements() == false) goto L28;
            NetworkInterface r1 = r0.nextElement();     // Catch: Exception -> L26
            if (r1.isLoopback() == true) goto L5;
            if (r1.isVirtual() == true) goto L5;
            if (r1.isUp() == false) goto L5;
            String r5 = r1.getName();     // Catch: Exception -> L26
            Intrinsics.O10IXXX0X(r5, "getName(...)");     // Catch: Exception -> L26
            if (StringsKt__StringsKt.iOiXX(r5, "p2p", true) == false) goto L5;
            Enumeration<InetAddress> r2 = r1.getInetAddresses();     // Catch: Exception -> L26
        L17:
            if (r2.hasMoreElements() == false) goto L5;
            InetAddress r3 = r2.nextElement();     // Catch: Exception -> L26
            if (r3.isLoopbackAddress() == true) goto L17;
            if (r3.isSiteLocalAddress() == false) goto L17;
            String r4 = r3.getHostAddress();     // Catch: Exception -> L26
            if (r4 != null) goto L25;
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        L25:
            return r4;
        L28:
            Enumeration<NetworkInterface> r6 = NetworkInterface.getNetworkInterfaces();     // Catch: Exception -> L26
        L30:
            if (r6.hasMoreElements() == false) goto L53;
            NetworkInterface r7 = r6.nextElement();     // Catch: Exception -> L26
            if (r7.isLoopback() == true) goto L30;
            if (r7.isVirtual() == true) goto L30;
            if (r7.isUp() == false) goto L30;
            String r8 = r7.getName();     // Catch: Exception -> L26
            Intrinsics.O10IXXX0X(r8, "getName(...)");     // Catch: Exception -> L26
            if (StringsKt__StringsKt.iOiXX(r8, "wlan", true) == true) goto L42;
            String r9 = r7.getName();     // Catch: Exception -> L26
            Intrinsics.O10IXXX0X(r9, "getName(...)");     // Catch: Exception -> L26
            if (StringsKt__StringsKt.iOiXX(r9, Z3.b, true) == false) goto L30;
        L42:
            Enumeration<InetAddress> r10 = r7.getInetAddresses();     // Catch: Exception -> L26
        L44:
            if (r10.hasMoreElements() == false) goto L30;
            InetAddress r11 = r10.nextElement();     // Catch: Exception -> L26
            if (r11.isLoopbackAddress() == true) goto L44;
            if (r11.isSiteLocalAddress() == false) goto L44;
            String r12 = r11.getHostAddress();     // Catch: Exception -> L26
            if (r12 != null) goto L52;
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        L52:
            return r12;
        L53:
            Enumeration<NetworkInterface> r13 = NetworkInterface.getNetworkInterfaces();     // Catch: Exception -> L26
        L55:
            if (r13.hasMoreElements() == false) goto L128;
            NetworkInterface r14 = r13.nextElement();     // Catch: Exception -> L26
            if (r14.isLoopback() == true) goto L55;
            if (r14.isVirtual() == true) goto L55;
            if (r14.isUp() == false) goto L55;
            Enumeration<InetAddress> r15 = r14.getInetAddresses();     // Catch: Exception -> L26
        L65:
            if (r15.hasMoreElements() == false) goto L55;
            InetAddress r16 = r15.nextElement();     // Catch: Exception -> L26
            if (r16.isLoopbackAddress() == true) goto L65;
            if (r16.isSiteLocalAddress() == false) goto L65;
            String r17 = r16.getHostAddress();     // Catch: Exception -> L26
            if (r17 != null) goto L73;
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        L73:
            return r17;
        L128:
            return "127.0.0.1";
        L26:
            e = move-exception;
            e.printStackTrace();
            return "127.0.0.1";
        }

        public OXO1() {
        }
    }

    static {
        O10IXXX0X = new OXO1(null);
    }

    public OkHttpFileServer(int r2, @aa1 File r3, @aa1 String r4, @aa1 OI0OX0 r5, long r6) {
        Intrinsics.X0O(r3, "file");
        Intrinsics.X0O(r4, "path");
        Intrinsics.X0O(r5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.OXO1 = r3;
        this.XIi00iiXO = r4;
        this.iO = r5;
        this.XO0O10 = r6;
        this.O00 = "OkHttpFileServer";
        this.IiI10X = r2;
        this.XOO0ii0 = new AtomicBoolean(false);
        this.I0IIOi = new AtomicLong(0);
        this.OIi0 = r3.length();
        ScheduledExecutorService r7 = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.O10IXXX0X(r7, "newSingleThreadScheduledExecutor(...)");
        this.OIX0iXi = r7;
        this.X1ii = new AtomicBoolean(false);
    }

    public static final void OIi0(Socket r17, OkHttpFileServer r18) {
        r17.setSoTimeout(30000);     // Catch: Throwable -> L11 Exception -> L13
        InputStream r3 = r17.getInputStream();     // Catch: Throwable -> L11 Exception -> L13
        OutputStream r4 = r17.getOutputStream();     // Catch: Throwable -> L11 Exception -> L13
        BufferedReader r5 = new BufferedReader(new InputStreamReader(r3));     // Catch: Throwable -> L11 Exception -> L13
        String r7 = r5.readLine();     // Catch: Throwable -> L11 Exception -> L13
        if (r7 != null) goto L6;
    L35:
        r17.close();     // Catch: Throwable -> L11 Exception -> L13
    L36:
        r17.close();     // Catch: IOException -> L43
        return;
    L6:
        if (r7.length() == 0) goto L35;
        List r6 = StringsKt__StringsKt.i1I(r7, new String[]{" "}, false, 0, 6, null);     // Catch: Throwable -> L11 Exception -> L13
        if (r6.size() >= 2) goto L15;
        Intrinsics.XXI(r4);     // Catch: Throwable -> L11 Exception -> L13
        r18.X1ii(r4, 400, "Bad Request");     // Catch: Throwable -> L11 Exception -> L13
        r17.close();     // Catch: Throwable -> L11 Exception -> L13
        goto L36
    L15:
        String r8 = (String) r6.get(0);     // Catch: Throwable -> L11 Exception -> L13
        String r9 = (String) r6.get(1);     // Catch: Throwable -> L11 Exception -> L13
        String r10 = r17.getInetAddress().getHostAddress();     // Catch: Throwable -> L11 Exception -> L13
        r18.I0iXXO("Client connected: " + r10 + ", URI: " + r9 + ", Method: " + r8);     // Catch: Throwable -> L11 Exception -> L13
        LinkedHashMap r11 = new LinkedHashMap();     // Catch: Throwable -> L11 Exception -> L13
    L16:
        String r12 = r5.readLine();     // Catch: Throwable -> L11 Exception -> L13
        if (r12 == null) goto L24;
        Intrinsics.XXI(r12);     // Catch: Throwable -> L11 Exception -> L13
        if (r12.length() <= 0) goto L24;
        List r13 = StringsKt__StringsKt.i1I(r12, new String[]{CertificateUtil.DELIMITER}, false, 2, 2, null);     // Catch: Throwable -> L11 Exception -> L13
        if (r13.size() != 2) goto L16;
        String r14 = StringsKt__StringsKt.iX1X1((String) r13.get(0)).toString().toLowerCase(Locale.ROOT);     // Catch: Throwable -> L11 Exception -> L13
        Intrinsics.O10IXXX0X(r14, "toLowerCase(...)");     // Catch: Throwable -> L11 Exception -> L13
        r11.put(r14, StringsKt__StringsKt.iX1X1((String) r13.get(1)).toString());     // Catch: Throwable -> L11 Exception -> L13
    L24:
        if (Intrinsics.XOO0ii0(r9, r18.XIi00iiXO) == false) goto L32;
        r18.I0iXXO("Client requesting download: " + r10 + ", file: " + r18.OXO1.getName());     // Catch: Throwable -> L11 Exception -> L13
        ScheduledFuture<?> r0 = r18.IO;     // Catch: Throwable -> L11 Exception -> L13
        if (r0 == null) goto L29;
        r0.cancel(false);     // Catch: Throwable -> L11 Exception -> L13
    L29:
        if (r18.XOO0ii0.get() == false) goto L31;
        r18.I0iXXO("Download conflict: " + r10 + ", another download in progress");     // Catch: Throwable -> L11 Exception -> L13
        Intrinsics.XXI(r4);     // Catch: Throwable -> L11 Exception -> L13
        r18.X1ii(r4, 409, "Download in progress");     // Catch: Throwable -> L11 Exception -> L13
    L33:
        r17.close();     // Catch: IOException -> L43
        return;
    L31:
        r18.I1XOi1(r17, r11);     // Catch: Throwable -> L11 Exception -> L13
        goto L33
    L32:
        r18.I0iXXO("Client request not found: " + r10 + ", URI: " + r9);     // Catch: Throwable -> L11 Exception -> L13
        Intrinsics.XXI(r4);     // Catch: Throwable -> L11 Exception -> L13
        r18.X1ii(r4, 404, "Not Found");     // Catch: Throwable -> L11 Exception -> L13
    L13:
        e = move-exception;
        r18.I0iXXO("Error handling client: " + e.getMessage());     // Catch: Throwable -> L11
    L57:
        return;
    L11:
        th = move-exception;
        r17.close();     // Catch: IOException -> L44
    L42:
        throw th;
    }

    public static /* synthetic */ void OXO1(OkHttpFileServer r0) {
        iIiiO(r0);
    }

    public static /* synthetic */ void XIi00iiXO(Socket r0, OkHttpFileServer r1) {
        OIi0(r0, r1);
    }

    public static final void XiOIO(OkHttpFileServer r3) {
    L3:
        if (r3.X1ii.get() == false) goto L16;
        ServerSocket r0 = r3.I0iXXO;     // Catch: IOException -> L7
        if (r0 == null) goto L9;
        Socket r1 = r0.accept();     // Catch: IOException -> L7
    L10:
        if (r1 == null) goto L3;
        r3.I0IIOi(r1);     // Catch: IOException -> L7
        goto L3
    L9:
        r1 = null;
    L7:
        e = move-exception;
        if (r3.X1ii.get() == false) goto L3;
        r3.I0iXXO("Accept error: " + e.getMessage());
        goto L3
    }

    public static final void iIiiO(OkHttpFileServer r4) {
        if (r4.XOO0ii0.get() == true) goto L6;
        r4.I0iXXO("Server timeout, no download started within " + r4.XO0O10 + "ms");
        r4.iO.onTimeout();
        r4.XXI();
        return;
    }

    public static /* synthetic */ void iO(OkHttpFileServer r0) {
        XiOIO(r0);
    }

    public final void I0IIOi(final Socket r3) {
        new Thread(new of1(r3, this)).start();
    }

    public final void I0iXXO(@aa1 String r4) {
        Intrinsics.X0O(r4, "msg");
        i1O0OXO1O.OXO1.OXO1(this.O00 + " " + r4);
    }

    public final void I1XOi1(Socket r7, Map<String, String> r8) {
        if (this.OXO1.exists() == true) goto L6;
        OutputStream r9 = r7.getOutputStream();
        Intrinsics.O10IXXX0X(r9, "getOutputStream(...)");
        X1ii(r9, 404, "File not found");
        onError("File does not exist: " + this.OXO1.getAbsolutePath());
        return;
    L6:
        this.XOO0ii0.set(true);
        this.I0IIOi.set(0);
        long r0 = this.OXO1.length();
        String r10 = r8.get("range");
        if (r10 != null) goto L18;
    L14:
        X0O(r7, r0);     // Catch: Exception -> L12
        return;
    L18:
    L12:
        e = move-exception;
        I0iXXO("Error serving file: " + e.getMessage());
        onError("Error serving file: " + e.getMessage());
        return;
    L9:
        if (oe5.O0(r10, "bytes=", false, 2, null) == false) goto L14;
        IO(r7, r10, r0);     // Catch: Exception -> L12
    }

    public final void IIX1OXO() {
        I0iXXO("Starting server on port " + this.IiI10X + APSSharedUtil.TRUNCATE_SEPARATOR);     // Catch: IOException -> L6
        this.I0iXXO = new ServerSocket(this.IiI10X, 10, InetAddress.getByName("0.0.0.0"));     // Catch: IOException -> L6
        this.X1ii.set(true);     // Catch: IOException -> L6
        Thread r0 = new Thread(new pf1(this));     // Catch: IOException -> L6
        this.XXI = r0;     // Catch: IOException -> L6
        r0.start();     // Catch: IOException -> L6
        String r1 = O00();     // Catch: IOException -> L6
        I0iXXO("Server started successfully, listening on port " + this.IiI10X);     // Catch: IOException -> L6
        I0iXXO("Download URL: " + r1);     // Catch: IOException -> L6
        I0iXXO("Serving file: " + this.OXO1.getName() + ", size: " + this.OXO1.length() + " bytes");     // Catch: IOException -> L6
        iO(this);     // Catch: IOException -> L6
        long r2 = this.XO0O10;     // Catch: IOException -> L6
        if (r2 <= 0) goto L11;
        I0iXXO("Timeout set: " + r2 + "ms");     // Catch: IOException -> L6
        this.IO = this.OIX0iXi.schedule(new qf1(this), this.XO0O10, TimeUnit.MILLISECONDS);     // Catch: IOException -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        I0iXXO("Failed to start server: " + e.getMessage());
        onError("Failed to start server: " + e.getMessage());
    }

    public final void IO(Socket r18, String r19, long r20) {
        String r6 = r19.substring(6);     // Catch: Exception -> L6
        Intrinsics.O10IXXX0X(r6, "substring(...)");     // Catch: Exception -> L6
        List r7 = StringsKt__StringsKt.i1I(StringsKt__StringsKt.iX1X1(r6).toString(), new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);     // Catch: Exception -> L6
        if (((CharSequence) r7.get(0)).length() <= 0) goto L8;
        long r8 = Long.parseLong((String) r7.get(0));     // Catch: Exception -> L6
    L10:
        if (r7.size() > 1) goto L12;
    L15:
        long r13 = r20 - 1;
    L41:
        if (r8 >= r20) goto L32;
        if (r13 >= r20) goto L32;
        if (r8 > r13) goto L32;
        long r10 = (r13 - r8) + 1;
        String r9 = this.OXO1.getName();     // Catch: Exception -> L30
        Intrinsics.O10IXXX0X(r9, "getName(...)");     // Catch: Exception -> L30
        String r11 = IiI10X(r9);     // Catch: Exception -> L30
        StringBuilder r12 = new StringBuilder();     // Catch: Exception -> L30
        r12.append("HTTP/1.1 206 Partial Content\r\n");     // Catch: Exception -> L30
        r12.append("Content-Type: application/octet-stream\r\n");     // Catch: Exception -> L30
        StringBuilder r15 = new StringBuilder();     // Catch: Exception -> L30
        r15.append("Content-Disposition: attachment; filename=\"");     // Catch: Exception -> L28
        r15.append(r11);     // Catch: Exception -> L28
        r15.append("\"\r\n");     // Catch: Exception -> L28
        r12.append(r15.toString());     // Catch: Exception -> L28
        r12.append("Content-Length: " + r10 + "\r\n");     // Catch: Exception -> L28
        r12.append("Content-Range: bytes " + r8 + HelpFormatter.DEFAULT_OPT_PREFIX + r13 + "/" + r20 + "\r\n");     // Catch: Exception -> L28
        r12.append("Accept-Ranges: bytes\r\n");     // Catch: Exception -> L28
        r12.append("ETag: \"");     // Catch: Exception -> L28
        r12.append(r20);     // Catch: Exception -> L28
        r12.append(HelpFormatter.DEFAULT_OPT_PREFIX);     // Catch: Exception -> L28
        r12.append(this.OXO1.lastModified());     // Catch: Exception -> L28
        r12.append("\"\r\n");     // Catch: Exception -> L28
        r12.append("Last-Modified: " + new Date(this.OXO1.lastModified()) + "\r\n");     // Catch: Exception -> L28
        r12.append("Date: " + new Date(System.currentTimeMillis()) + "\r\n");     // Catch: Exception -> L28
        r12.append("Cache-Control: no-cache, no-store, must-revalidate\r\n");     // Catch: Exception -> L28
        r12.append("Connection: close\r\n");     // Catch: Exception -> L28
        r12.append("\r\n");     // Catch: Exception -> L28
        OutputStream r0 = r18.getOutputStream();     // Catch: Exception -> L28
        String r2 = r12.toString();     // Catch: Exception -> L28
        Intrinsics.O10IXXX0X(r2, "toString(...)");     // Catch: Exception -> L28
        byte[] r3 = r2.getBytes(Charsets.XIi00iiXO);     // Catch: Exception -> L28
        Intrinsics.O10IXXX0X(r3, "getBytes(...)");     // Catch: Exception -> L28
        r0.write(r3);     // Catch: Exception -> L28
        r18.getOutputStream().flush();     // Catch: Exception -> L28
        O10IXXX0X(r18, r8, r10, r10);     // Catch: Exception -> L28
        return;
    L30:
        e = e;
    L29:
        String r4 = "getOutputStream(...)";
    L37:
        I0iXXO("Error handling range request: " + e.getMessage());
        OutputStream r1 = r18.getOutputStream();
        Intrinsics.O10IXXX0X(r1, r4);
        X1ii(r1, 500, "Error handling range request");
        return;
    L32:
        OutputStream r5 = r18.getOutputStream();     // Catch: Exception -> L28
        r4 = "getOutputStream(...)";
        Intrinsics.O10IXXX0X(r5, r4);     // Catch: Exception -> L36
        X1ii(r5, 416, "Invalid range");     // Catch: Exception -> L36
        return;
    L36:
        e = e;
    L28:
        e = e;
        goto L29
    L12:
        if (((CharSequence) r7.get(1)).length() <= 0) goto L15;
        r13 = Long.parseLong((String) r7.get(1));     // Catch: Exception -> L6
        goto L41
    L8:
        r8 = 0;
    L6:
        e = e;
        r4 = "getOutputStream(...)";
        goto L37
    }

    public final String IiI10X(String r8) {
        String r1 = URLEncoder.encode(r8, "UTF-8");     // Catch: Exception -> L4
        Intrinsics.O10IXXX0X(r1, "encode(...)");     // Catch: Exception -> L4
        return oe5.IXO0OOi(r1, qu0.O00, "%20", false, 4, null);
    L7:
        return r8;
    }

    @aa1
    public final String O00() {
        return "http://" + O10IXXX0X.iO() + CertificateUtil.DELIMITER + this.IiI10X + this.XIi00iiXO;
    }

    public final void O10IXXX0X(Socket r17, long r18, long r20, long r22) {
        OkHttpFileServer r1 = this;
        FileInputStream r10 = new FileInputStream(r1.OXO1);     // Catch: Throwable -> L62 IOException -> L64 SocketException -> L66
        long r11 = 0;
        if (r18 > 0) goto L90;
    L14:
        int r0 = 8192;
        byte[] r2 = new byte[8192];     // Catch: Throwable -> L56 IOException -> L58 SocketException -> L60
        OutputStream r3 = r17.getOutputStream();     // Catch: Throwable -> L56 IOException -> L58 SocketException -> L60
    L17:
        if (r11 >= r20) goto L49;
        int r4 = r10.read(r2, 0, (int) Math.min(r0, r20 - r11));     // Catch: Throwable -> L43 IOException -> L45 SocketException -> L47
        if (r4 == (-1)) goto L21;
        r3.write(r2, 0, r4);     // Catch: Throwable -> L43 IOException -> L45 SocketException -> L47
        long r5 = r4;
        r11 = r11 + r5;
        OkHttpFileServer r13 = this;
        r13.I0IIOi.addAndGet(r5);     // Catch: Throwable -> L37 IOException -> L39 SocketException -> L41
        FileInputStream r6 = r10;
        r13.iO.onProgress(r13.I0IIOi.get(), r13.OIi0);     // Catch: Throwable -> L31 IOException -> L33 SocketException -> L35
        if (r11 >= r20) goto L50;
        r10 = r6;
        r1 = r13;
        r0 = 8192;
    L50:
        r3.flush();     // Catch: Throwable -> L31 IOException -> L33 SocketException -> L35
        if (r11 < r20) goto L53;
        r13.I0iXXO("Download completed normally, total bytes: " + r22);     // Catch: Throwable -> L31 IOException -> L33 SocketException -> L35
        r13.iO.onComplete();     // Catch: Throwable -> L31 IOException -> L33 SocketException -> L35
        I100X1.O00(i0011i.IO, null, null, new OkHttpFileServer$sendFileData$1(r13, null), 3, null);     // Catch: Throwable -> L31 IOException -> L33 SocketException -> L35
    L54:
        r6.close();
        return;
    L53:
        r13.I0iXXO("Download incomplete: " + r11 + "/" + r20);     // Catch: Throwable -> L31 IOException -> L33 SocketException -> L35
        r13.iO.onCancel();     // Catch: Throwable -> L31 IOException -> L33 SocketException -> L35
    L35:
        e = e;
    L36:
        FileInputStream r9 = r6;
    L73:
        r13.I0iXXO("Client disconnected: " + e.getMessage() + ", bytes downloaded: " + r13.I0IIOi.get() + "/" + r13.OIi0);     // Catch: Throwable -> L71
        if (r13.I0IIOi.get() >= r13.OIi0) goto L76;
        r13.iO.onCancel();     // Catch: Throwable -> L71
    L76:
        if (r9 == null) goto L97;
    L70:
        r9.close();
        return;
    L97:
        return;
    L33:
        e = e;
    L34:
        r9 = r6;
    L68:
        r13.I0iXXO("IO error during download: " + e.getMessage() + ", bytes downloaded: " + r13.I0IIOi.get() + "/" + r13.OIi0);     // Catch: Throwable -> L71
        OI0OX0 r7 = r13.iO;     // Catch: Throwable -> L71
        String r8 = e.getMessage();     // Catch: Throwable -> L71
        StringBuilder r12 = new StringBuilder();     // Catch: Throwable -> L71
        r12.append("IO error during download: ");     // Catch: Throwable -> L71
        r12.append(r8);     // Catch: Throwable -> L71
        r7.onError(r12.toString());     // Catch: Throwable -> L71
        if (r9 != null) goto L70;
        return;
    L31:
        th = th;
    L32:
        FileInputStream r14 = r6;
    L79:
        if (r14 == null) goto L81;
        r14.close();
    L81:
        throw th;
    L41:
        e = e;
    L42:
        r6 = r10;
    L39:
        e = e;
    L40:
        r6 = r10;
    L37:
        th = th;
    L38:
        r6 = r10;
        goto L32
    L21:
        r13 = this;
    L22:
        r6 = r10;
    L47:
        e = e;
        r13 = this;
    L45:
        e = e;
        r13 = this;
    L43:
        th = th;
        goto L38
    L49:
        r13 = r1;
    L60:
        e = e;
        r13 = r1;
    L58:
        e = e;
        r13 = r1;
    L56:
        th = th;
        goto L38
    L90:
        r10.skip(r18);     // Catch: Throwable -> L8 IOException -> L10 SocketException -> L12
    L12:
        e = e;
        r13 = r1;
        r9 = r10;
    L10:
        e = e;
        r13 = r1;
        r9 = r10;
    L8:
        th = th;
        r14 = r10;
        goto L79
    L71:
        th = th;
    L66:
        e = e;
        r13 = r1;
        r9 = null;
    L64:
        e = e;
        r13 = r1;
        r9 = null;
    L62:
        th = th;
        r14 = null;
        goto L79
    }

    public final boolean OIX0iXi() {
        return this.XOO0ii0.get();
    }

    public final void X0O(Socket r12, long r13) {
        OutputStream r0 = r12.getOutputStream();
        String r1 = this.OXO1.getName();
        Intrinsics.O10IXXX0X(r1, "getName(...)");
        String r2 = IiI10X(r1);
        StringBuilder r3 = new StringBuilder();
        r3.append("HTTP/1.1 200 OK\r\n");
        r3.append("Content-Type: application/octet-stream\r\n");
        r3.append("Content-Disposition: attachment; filename=\"" + r2 + "\"\r\n");
        r3.append("Content-Length: " + r13 + "\r\n");
        r3.append("Accept-Ranges: bytes\r\n");
        r3.append("ETag: \"");
        r3.append(r13);
        r3.append(HelpFormatter.DEFAULT_OPT_PREFIX);
        r3.append(this.OXO1.lastModified());
        r3.append("\"\r\n");
        r3.append("Last-Modified: " + new Date(this.OXO1.lastModified()) + "\r\n");
        r3.append("Date: " + new Date(System.currentTimeMillis()) + "\r\n");
        r3.append("Pragma: no-cache\r\n");
        r3.append("Expires: 0\r\n");
        r3.append("Connection: close\r\n");
        r3.append("\r\n");
        String r4 = r3.toString();
        Intrinsics.O10IXXX0X(r4, "toString(...)");
        byte[] r5 = r4.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r5, "getBytes(...)");
        r0.write(r5);
        r0.flush();
        O10IXXX0X(r12, 0, r13, r13);
    }

    public final void X1ii(OutputStream r4, int r5, String r6) {
        byte[] r7 = ("HTTP/1.1 " + r5 + " " + r6 + "\r\nContent-Type: text/plain\r\nContent-Length: " + r6.length() + "\r\nConnection: close\r\n\r\n" + r6).getBytes(Charsets.XIi00iiXO);     // Catch: IOException -> L4
        Intrinsics.O10IXXX0X(r7, "getBytes(...)");     // Catch: IOException -> L4
        r4.write(r7);     // Catch: IOException -> L4
        r4.flush();     // Catch: IOException -> L4
        return;
    }

    public final void XO0O10() {
        if (this.XOO0ii0.get() == false) goto L6;
        I0iXXO("Cancelling download, bytes downloaded: " + this.I0IIOi.get() + "/" + this.OIi0);
        this.XOO0ii0.set(false);
        onCancel();
        XXI();
        return;
    L6:
        I0iXXO("Cancel called but not downloading");
    }

    public final double XOO0ii0() {
        if (this.OIi0 > 0) goto L5;
        return 0.0d;
    L5:
        return (this.I0IIOi.get() / this.OIi0) * ((double) 100);
    }

    public final void XXI() {
        I0iXXO("Releasing server resources...");
        this.X1ii.set(false);     // Catch: Exception -> L6
        I0iXXO("Stopping server socket...");     // Catch: Exception -> L6
        ServerSocket r0 = this.I0iXXO;     // Catch: Exception -> L6
        if (r0 == null) goto L8;
        r0.close();     // Catch: Exception -> L6
    L8:
        I0iXXO("Cancelling timeout future...");     // Catch: Exception -> L6
        ScheduledFuture<?> r1 = this.IO;     // Catch: Exception -> L6
        if (r1 == null) goto L11;
        r1.cancel(false);     // Catch: Exception -> L6
    L11:
        I0iXXO("Shutting down scheduler...");     // Catch: Exception -> L6
        this.OIX0iXi.shutdownNow();     // Catch: Exception -> L6
        I0iXXO("Server resources released successfully");     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        I0iXXO("Error releasing resources: " + e.getMessage());
        onError("Error releasing resources: " + e.getMessage());
    }

    public /* synthetic */ OkHttpFileServer(int r1, File r2, String r3, OI0OX0 r4, long r5, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = OXO1.OXO1(O10IXXX0X);
    L6:
        if ((r7 & 16) == 0) goto L8;
        r5 = 0;
    L8:
        int r6 = r1;
        this(r6, r2, r3, r4, r5);
    }
}

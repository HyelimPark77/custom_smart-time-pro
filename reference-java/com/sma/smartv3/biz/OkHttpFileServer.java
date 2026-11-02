package com.sma.smartv3.biz;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.android.mltcode.paycertificationapi.OI0OX0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0011i;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.ironsource.C12250Z3;
import com.sma.smartv3.biz.OkHttpFileServer;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p617io.CloseableKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import p616j$.net.URLEncoder;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nOkHttpFileServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpFileServer.kt\ncom/sma/smartv3/biz/OkHttpFileServer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"})
public final class OkHttpFileServer {

    @aa1
    public static final OXO1 O10IXXX0X = new OXO1(null);

    @aa1
    public final AtomicLong I0IIOi;

    @tb1
    public ServerSocket I0iXXO;

    /* JADX INFO: renamed from: IO */
    @tb1
    public ScheduledFuture<?> f50889IO;
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

    /* JADX INFO: renamed from: iO */
    @aa1
    public final OI0OX0 f50890iO;

    @SourceDebugExtension({"SMAP\nOkHttpFileServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpFileServer.kt\ncom/sma/smartv3/biz/OkHttpFileServer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int XIi00iiXO() {
            ServerSocket serverSocket = new ServerSocket(0);
            try {
                int localPort = serverSocket.getLocalPort();
                CloseableKt.OXO1(serverSocket, null);
                return localPort;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.OXO1(serverSocket, th);
                    throw th2;
                }
            }
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final String m38105iO() {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    if (!networkInterfaceNextElement.isLoopback() && !networkInterfaceNextElement.isVirtual() && networkInterfaceNextElement.isUp()) {
                        String name = networkInterfaceNextElement.getName();
                        Intrinsics.O10IXXX0X(name, "getName(...)");
                        if (StringsKt__StringsKt.iOiXX(name, "p2p", true)) {
                            Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                            while (inetAddresses.hasMoreElements()) {
                                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                                if (!inetAddressNextElement.isLoopbackAddress() && inetAddressNextElement.isSiteLocalAddress()) {
                                    String hostAddress = inetAddressNextElement.getHostAddress();
                                    return hostAddress == null ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : hostAddress;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces2.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement2 = networkInterfaces2.nextElement();
                    if (!networkInterfaceNextElement2.isLoopback() && !networkInterfaceNextElement2.isVirtual() && networkInterfaceNextElement2.isUp()) {
                        String name2 = networkInterfaceNextElement2.getName();
                        Intrinsics.O10IXXX0X(name2, "getName(...)");
                        if (!StringsKt__StringsKt.iOiXX(name2, "wlan", true)) {
                            String name3 = networkInterfaceNextElement2.getName();
                            Intrinsics.O10IXXX0X(name3, "getName(...)");
                            if (!StringsKt__StringsKt.iOiXX(name3, C12250Z3.f30470b, true)) {
                                continue;
                            }
                        }
                        Enumeration<InetAddress> inetAddresses2 = networkInterfaceNextElement2.getInetAddresses();
                        while (inetAddresses2.hasMoreElements()) {
                            InetAddress inetAddressNextElement2 = inetAddresses2.nextElement();
                            if (!inetAddressNextElement2.isLoopbackAddress() && inetAddressNextElement2.isSiteLocalAddress()) {
                                String hostAddress2 = inetAddressNextElement2.getHostAddress();
                                return hostAddress2 == null ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : hostAddress2;
                            }
                        }
                    }
                }
                Enumeration<NetworkInterface> networkInterfaces3 = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces3.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement3 = networkInterfaces3.nextElement();
                    if (!networkInterfaceNextElement3.isLoopback() && !networkInterfaceNextElement3.isVirtual() && networkInterfaceNextElement3.isUp()) {
                        Enumeration<InetAddress> inetAddresses3 = networkInterfaceNextElement3.getInetAddresses();
                        while (inetAddresses3.hasMoreElements()) {
                            InetAddress inetAddressNextElement3 = inetAddresses3.nextElement();
                            if (!inetAddressNextElement3.isLoopbackAddress() && inetAddressNextElement3.isSiteLocalAddress()) {
                                String hostAddress3 = inetAddressNextElement3.getHostAddress();
                                return hostAddress3 == null ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : hostAddress3;
                            }
                        }
                    }
                }
                return "127.0.0.1";
            } catch (Exception e) {
                e.printStackTrace();
                return "127.0.0.1";
            }
        }

        public OXO1() {
        }
    }

    public OkHttpFileServer(int i, @aa1 File file, @aa1 String path, @aa1 OI0OX0 listener, long j) {
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(listener, "listener");
        this.OXO1 = file;
        this.XIi00iiXO = path;
        this.f50890iO = listener;
        this.XO0O10 = j;
        this.O00 = "OkHttpFileServer";
        this.IiI10X = i;
        this.XOO0ii0 = new AtomicBoolean(false);
        this.I0IIOi = new AtomicLong(0L);
        this.OIi0 = file.length();
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.O10IXXX0X(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor(...)");
        this.OIX0iXi = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.X1ii = new AtomicBoolean(false);
    }

    public static final void OIi0(Socket socket, OkHttpFileServer okHttpFileServer) {
        try {
            try {
                try {
                    socket.setSoTimeout(30000);
                    InputStream inputStream = socket.getInputStream();
                    OutputStream outputStream = socket.getOutputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    String line = bufferedReader.readLine();
                    if (line == null || line.length() == 0) {
                        socket.close();
                    } else {
                        List listI1I = StringsKt__StringsKt.i1I(line, new String[]{" "}, false, 0, 6, null);
                        if (listI1I.size() >= 2) {
                            String str = (String) listI1I.get(0);
                            String str2 = (String) listI1I.get(1);
                            String hostAddress = socket.getInetAddress().getHostAddress();
                            okHttpFileServer.I0iXXO("Client connected: " + hostAddress + ", URI: " + str2 + ", Method: " + str);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            while (true) {
                                String line2 = bufferedReader.readLine();
                                if (line2 == null) {
                                    break;
                                }
                                Intrinsics.XXI(line2);
                                if (line2.length() <= 0) {
                                    break;
                                }
                                List listI1I2 = StringsKt__StringsKt.i1I(line2, new String[]{CertificateUtil.DELIMITER}, false, 2, 2, null);
                                if (listI1I2.size() == 2) {
                                    String lowerCase = StringsKt__StringsKt.iX1X1((String) listI1I2.get(0)).toString().toLowerCase(Locale.ROOT);
                                    Intrinsics.O10IXXX0X(lowerCase, "toLowerCase(...)");
                                    linkedHashMap.put(lowerCase, StringsKt__StringsKt.iX1X1((String) listI1I2.get(1)).toString());
                                }
                            }
                            if (Intrinsics.XOO0ii0(str2, okHttpFileServer.XIi00iiXO)) {
                                okHttpFileServer.I0iXXO("Client requesting download: " + hostAddress + ", file: " + okHttpFileServer.OXO1.getName());
                                ScheduledFuture<?> scheduledFuture = okHttpFileServer.f50889IO;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                if (okHttpFileServer.XOO0ii0.get()) {
                                    okHttpFileServer.I0iXXO("Download conflict: " + hostAddress + ", another download in progress");
                                    Intrinsics.XXI(outputStream);
                                    okHttpFileServer.X1ii(outputStream, 409, "Download in progress");
                                } else {
                                    okHttpFileServer.I1XOi1(socket, linkedHashMap);
                                }
                            } else {
                                okHttpFileServer.I0iXXO("Client request not found: " + hostAddress + ", URI: " + str2);
                                Intrinsics.XXI(outputStream);
                                okHttpFileServer.X1ii(outputStream, 404, "Not Found");
                            }
                            socket.close();
                            return;
                        }
                        Intrinsics.XXI(outputStream);
                        okHttpFileServer.X1ii(outputStream, 400, "Bad Request");
                        socket.close();
                    }
                    socket.close();
                } catch (IOException unused) {
                }
            } catch (Exception e) {
                okHttpFileServer.I0iXXO("Error handling client: " + e.getMessage());
            }
        } catch (Throwable th) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static final void XiOIO(OkHttpFileServer okHttpFileServer) {
        while (okHttpFileServer.X1ii.get()) {
            try {
                ServerSocket serverSocket = okHttpFileServer.I0iXXO;
                Socket socketAccept = serverSocket != null ? serverSocket.accept() : null;
                if (socketAccept != null) {
                    okHttpFileServer.I0IIOi(socketAccept);
                }
            } catch (IOException e) {
                if (okHttpFileServer.X1ii.get()) {
                    okHttpFileServer.I0iXXO("Accept error: " + e.getMessage());
                }
            }
        }
    }

    public static final void iIiiO(OkHttpFileServer okHttpFileServer) {
        if (okHttpFileServer.XOO0ii0.get()) {
            return;
        }
        okHttpFileServer.I0iXXO("Server timeout, no download started within " + okHttpFileServer.XO0O10 + "ms");
        okHttpFileServer.f50890iO.onTimeout();
        okHttpFileServer.XXI();
    }

    public final void I0IIOi(final Socket socket) {
        new Thread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.of1
            @Override // java.lang.Runnable
            public final void run() {
                OkHttpFileServer.OIi0(socket, this);
            }
        }).start();
    }

    public final void I0iXXO(@aa1 String msg) {
        Intrinsics.X0O(msg, "msg");
        i1O0OXO1O.OXO1.OXO1(this.O00 + " " + msg);
    }

    public final void I1XOi1(Socket socket, Map<String, String> map) throws Throwable {
        if (!this.OXO1.exists()) {
            OutputStream outputStream = socket.getOutputStream();
            Intrinsics.O10IXXX0X(outputStream, "getOutputStream(...)");
            X1ii(outputStream, 404, "File not found");
            this.f50890iO.onError("File does not exist: " + this.OXO1.getAbsolutePath());
            return;
        }
        this.XOO0ii0.set(true);
        this.I0IIOi.set(0L);
        long length = this.OXO1.length();
        String str = map.get("range");
        if (str != null) {
            try {
                if (oe5.m2764O0(str, "bytes=", false, 2, null)) {
                    m38104IO(socket, str, length);
                    return;
                }
            } catch (Exception e) {
                I0iXXO("Error serving file: " + e.getMessage());
                this.f50890iO.onError("Error serving file: " + e.getMessage());
                return;
            }
        }
        X0O(socket, length);
    }

    public final void IIX1OXO() {
        try {
            I0iXXO("Starting server on port " + this.IiI10X + APSSharedUtil.TRUNCATE_SEPARATOR);
            this.I0iXXO = new ServerSocket(this.IiI10X, 10, InetAddress.getByName("0.0.0.0"));
            this.X1ii.set(true);
            Thread thread = new Thread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.pf1
                @Override // java.lang.Runnable
                public final void run() {
                    OkHttpFileServer.XiOIO(this.f10351IO);
                }
            });
            this.XXI = thread;
            thread.start();
            String strO00 = O00();
            I0iXXO("Server started successfully, listening on port " + this.IiI10X);
            I0iXXO("Download URL: " + strO00);
            I0iXXO("Serving file: " + this.OXO1.getName() + ", size: " + this.OXO1.length() + " bytes");
            this.f50890iO.m843iO(this);
            long j = this.XO0O10;
            if (j > 0) {
                I0iXXO("Timeout set: " + j + "ms");
                this.f50889IO = this.OIX0iXi.schedule(new Runnable() { // from class: com.android.mltcode.paycertificationapi.qf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        OkHttpFileServer.iIiiO(this.f10589IO);
                    }
                }, this.XO0O10, TimeUnit.MILLISECONDS);
            }
        } catch (IOException e) {
            I0iXXO("Failed to start server: " + e.getMessage());
            this.f50890iO.onError("Failed to start server: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: IO */
    public final void m38104IO(Socket socket, String str, long j) throws Throwable {
        String str2;
        try {
            String strSubstring = str.substring(6);
            Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
            List listI1I = StringsKt__StringsKt.i1I(StringsKt__StringsKt.iX1X1(strSubstring).toString(), new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);
            long j2 = ((CharSequence) listI1I.get(0)).length() > 0 ? Long.parseLong((String) listI1I.get(0)) : 0L;
            long j3 = (listI1I.size() <= 1 || ((CharSequence) listI1I.get(1)).length() <= 0) ? j - 1 : Long.parseLong((String) listI1I.get(1));
            try {
                if (j2 >= j || j3 >= j || j2 > j3) {
                    OutputStream outputStream = socket.getOutputStream();
                    str2 = "getOutputStream(...)";
                    try {
                        Intrinsics.O10IXXX0X(outputStream, str2);
                        X1ii(outputStream, 416, "Invalid range");
                        return;
                    } catch (Exception e) {
                        e = e;
                        I0iXXO("Error handling range request: " + e.getMessage());
                        OutputStream outputStream2 = socket.getOutputStream();
                        Intrinsics.O10IXXX0X(outputStream2, str2);
                        X1ii(outputStream2, 500, "Error handling range request");
                    }
                }
                long j4 = (j3 - j2) + 1;
                try {
                    String name = this.OXO1.getName();
                    Intrinsics.O10IXXX0X(name, "getName(...)");
                    String strIiI10X = IiI10X(name);
                    StringBuilder sb = new StringBuilder();
                    sb.append("HTTP/1.1 206 Partial Content\r\n");
                    sb.append("Content-Type: application/octet-stream\r\n");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Content-Disposition: attachment; filename=\"");
                    sb2.append(strIiI10X);
                    sb2.append("\"\r\n");
                    sb.append(sb2.toString());
                    sb.append("Content-Length: " + j4 + "\r\n");
                    sb.append("Content-Range: bytes " + j2 + HelpFormatter.DEFAULT_OPT_PREFIX + j3 + "/" + j + "\r\n");
                    sb.append("Accept-Ranges: bytes\r\n");
                    sb.append("ETag: \"");
                    sb.append(j);
                    sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
                    sb.append(this.OXO1.lastModified());
                    sb.append("\"\r\n");
                    sb.append("Last-Modified: " + new Date(this.OXO1.lastModified()) + "\r\n");
                    sb.append("Date: " + new Date(System.currentTimeMillis()) + "\r\n");
                    sb.append("Cache-Control: no-cache, no-store, must-revalidate\r\n");
                    sb.append("Connection: close\r\n");
                    sb.append("\r\n");
                    OutputStream outputStream3 = socket.getOutputStream();
                    String string = sb.toString();
                    Intrinsics.O10IXXX0X(string, "toString(...)");
                    byte[] bytes = string.getBytes(Charsets.XIi00iiXO);
                    Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
                    outputStream3.write(bytes);
                    socket.getOutputStream().flush();
                    O10IXXX0X(socket, j2, j4, j4);
                } catch (Exception e2) {
                    e = e2;
                    str2 = "getOutputStream(...)";
                    I0iXXO("Error handling range request: " + e.getMessage());
                    OutputStream outputStream4 = socket.getOutputStream();
                    Intrinsics.O10IXXX0X(outputStream4, str2);
                    X1ii(outputStream4, 500, "Error handling range request");
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            str2 = "getOutputStream(...)";
        }
    }

    public final String IiI10X(String str) {
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            Intrinsics.O10IXXX0X(strEncode, "encode(...)");
            return oe5.IXO0OOi(strEncode, qu0.O00, "%20", false, 4, null);
        } catch (Exception unused) {
            return str;
        }
    }

    @aa1
    public final String O00() {
        return "http://" + O10IXXX0X.m38105iO() + CertificateUtil.DELIMITER + this.IiI10X + this.XIi00iiXO;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x018f A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #10 {all -> 0x0155, blocks: (B:68:0x010d, B:73:0x0157, B:75:0x018f), top: B:82:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0197 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public final void O10IXXX0X(Socket socket, long j, long j2, long j3) throws Throwable {
        FileInputStream fileInputStream;
        OkHttpFileServer okHttpFileServer;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        OkHttpFileServer okHttpFileServer2 = this;
        try {
            try {
                FileInputStream fileInputStream4 = new FileInputStream(okHttpFileServer2.OXO1);
                long j4 = 0;
                if (j > 0) {
                    try {
                        fileInputStream4.skip(j);
                    } catch (SocketException e) {
                        e = e;
                        okHttpFileServer = okHttpFileServer2;
                        fileInputStream2 = fileInputStream4;
                        okHttpFileServer.I0iXXO("Client disconnected: " + e.getMessage() + ", bytes downloaded: " + okHttpFileServer.I0IIOi.get() + "/" + okHttpFileServer.OIi0);
                        if (okHttpFileServer.I0IIOi.get() < okHttpFileServer.OIi0) {
                            okHttpFileServer.f50890iO.onCancel();
                        }
                        if (fileInputStream2 == null) {
                            return;
                        }
                        fileInputStream2.close();
                        return;
                    } catch (IOException e2) {
                        e = e2;
                        okHttpFileServer = okHttpFileServer2;
                        fileInputStream2 = fileInputStream4;
                        okHttpFileServer.I0iXXO("IO error during download: " + e.getMessage() + ", bytes downloaded: " + okHttpFileServer.I0IIOi.get() + "/" + okHttpFileServer.OIi0);
                        OI0OX0 oi0ox0 = okHttpFileServer.f50890iO;
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("IO error during download: ");
                        sb.append(message);
                        oi0ox0.onError(sb.toString());
                        if (fileInputStream2 == null) {
                            return;
                        }
                        fileInputStream2.close();
                        return;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream4;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                }
                int i = 8192;
                try {
                    byte[] bArr = new byte[8192];
                    OutputStream outputStream = socket.getOutputStream();
                    while (true) {
                        if (j4 < j2) {
                            try {
                                int i2 = fileInputStream4.read(bArr, 0, (int) Math.min(i, j2 - j4));
                                if (i2 == -1) {
                                    okHttpFileServer = this;
                                } else {
                                    outputStream.write(bArr, 0, i2);
                                    long j5 = i2;
                                    j4 += j5;
                                    okHttpFileServer = this;
                                    try {
                                        okHttpFileServer.I0IIOi.addAndGet(j5);
                                        fileInputStream3 = fileInputStream4;
                                        try {
                                            okHttpFileServer.f50890iO.onProgress(okHttpFileServer.I0IIOi.get(), okHttpFileServer.OIi0);
                                            if (j4 >= j2) {
                                                break;
                                            }
                                            fileInputStream4 = fileInputStream3;
                                            okHttpFileServer2 = okHttpFileServer;
                                            i = 8192;
                                        } catch (SocketException e3) {
                                            e = e3;
                                            fileInputStream2 = fileInputStream3;
                                            okHttpFileServer.I0iXXO("Client disconnected: " + e.getMessage() + ", bytes downloaded: " + okHttpFileServer.I0IIOi.get() + "/" + okHttpFileServer.OIi0);
                                            if (okHttpFileServer.I0IIOi.get() < okHttpFileServer.OIi0) {
                                                okHttpFileServer.f50890iO.onCancel();
                                            }
                                            if (fileInputStream2 == null) {
                                                return;
                                            }
                                            fileInputStream2.close();
                                            return;
                                        } catch (IOException e4) {
                                            e = e4;
                                            fileInputStream2 = fileInputStream3;
                                            okHttpFileServer.I0iXXO("IO error during download: " + e.getMessage() + ", bytes downloaded: " + okHttpFileServer.I0IIOi.get() + "/" + okHttpFileServer.OIi0);
                                            OI0OX0 oi0ox1 = okHttpFileServer.f50890iO;
                                            String message2 = e.getMessage();
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("IO error during download: ");
                                            sb2.append(message2);
                                            oi0ox1.onError(sb2.toString());
                                            if (fileInputStream2 == null) {
                                                return;
                                            }
                                            fileInputStream2.close();
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            fileInputStream = fileInputStream3;
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SocketException e5) {
                                        e = e5;
                                        fileInputStream3 = fileInputStream4;
                                        fileInputStream2 = fileInputStream3;
                                        okHttpFileServer.I0iXXO("Client disconnected: " + e.getMessage() + ", bytes downloaded: " + okHttpFileServer.I0IIOi.get() + "/" + okHttpFileServer.OIi0);
                                        if (okHttpFileServer.I0IIOi.get() < okHttpFileServer.OIi0) {
                                            okHttpFileServer.f50890iO.onCancel();
                                        }
                                        if (fileInputStream2 == null) {
                                            return;
                                        }
                                        fileInputStream2.close();
                                        return;
                                    } catch (IOException e6) {
                                        e = e6;
                                        fileInputStream3 = fileInputStream4;
                                        fileInputStream2 = fileInputStream3;
                                        okHttpFileServer.I0iXXO("IO error during download: " + e.getMessage() + ", bytes downloaded: " + okHttpFileServer.I0IIOi.get() + "/" + okHttpFileServer.OIi0);
                                        OI0OX0 oi0ox2 = okHttpFileServer.f50890iO;
                                        String message3 = e.getMessage();
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("IO error during download: ");
                                        sb3.append(message3);
                                        oi0ox2.onError(sb3.toString());
                                        if (fileInputStream2 == null) {
                                            return;
                                        }
                                        fileInputStream2.close();
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileInputStream3 = fileInputStream4;
                                        fileInputStream = fileInputStream3;
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (SocketException e7) {
                                e = e7;
                                okHttpFileServer = this;
                            } catch (IOException e8) {
                                e = e8;
                                okHttpFileServer = this;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            okHttpFileServer = okHttpFileServer2;
                        }
                        fileInputStream3 = fileInputStream4;
                        break;
                    }
                    outputStream.flush();
                    if (j4 >= j2) {
                        okHttpFileServer.I0iXXO("Download completed normally, total bytes: " + j3);
                        okHttpFileServer.f50890iO.onComplete();
                        XX01Oi.IiI10X(i0011i.f7259IO, null, null, new OkHttpFileServer$sendFileData$1(okHttpFileServer, null), 3, null);
                    } else {
                        okHttpFileServer.I0iXXO("Download incomplete: " + j4 + "/" + j2);
                        okHttpFileServer.f50890iO.onCancel();
                    }
                    fileInputStream3.close();
                } catch (SocketException e9) {
                    e = e9;
                    okHttpFileServer = okHttpFileServer2;
                } catch (IOException e10) {
                    e = e10;
                    okHttpFileServer = okHttpFileServer2;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (SocketException e11) {
            e = e11;
            okHttpFileServer = okHttpFileServer2;
            fileInputStream2 = null;
        } catch (IOException e12) {
            e = e12;
            okHttpFileServer = okHttpFileServer2;
            fileInputStream2 = null;
        } catch (Throwable th7) {
            th = th7;
            fileInputStream = null;
        }
    }

    public final boolean OIX0iXi() {
        return this.XOO0ii0.get();
    }

    public final void X0O(Socket socket, long j) throws Throwable {
        OutputStream outputStream = socket.getOutputStream();
        String name = this.OXO1.getName();
        Intrinsics.O10IXXX0X(name, "getName(...)");
        String strIiI10X = IiI10X(name);
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK\r\n");
        sb.append("Content-Type: application/octet-stream\r\n");
        sb.append("Content-Disposition: attachment; filename=\"" + strIiI10X + "\"\r\n");
        sb.append("Content-Length: " + j + "\r\n");
        sb.append("Accept-Ranges: bytes\r\n");
        sb.append("ETag: \"");
        sb.append(j);
        sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append(this.OXO1.lastModified());
        sb.append("\"\r\n");
        sb.append("Last-Modified: " + new Date(this.OXO1.lastModified()) + "\r\n");
        sb.append("Date: " + new Date(System.currentTimeMillis()) + "\r\n");
        sb.append("Pragma: no-cache\r\n");
        sb.append("Expires: 0\r\n");
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String string = sb.toString();
        Intrinsics.O10IXXX0X(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        outputStream.write(bytes);
        outputStream.flush();
        O10IXXX0X(socket, 0L, j, j);
    }

    public final void X1ii(OutputStream outputStream, int i, String str) {
        try {
            byte[] bytes = ("HTTP/1.1 " + i + " " + str + "\r\nContent-Type: text/plain\r\nContent-Length: " + str.length() + "\r\nConnection: close\r\n\r\n" + str).getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.flush();
        } catch (IOException unused) {
        }
    }

    public final void XO0O10() {
        if (!this.XOO0ii0.get()) {
            I0iXXO("Cancel called but not downloading");
            return;
        }
        I0iXXO("Cancelling download, bytes downloaded: " + this.I0IIOi.get() + "/" + this.OIi0);
        this.XOO0ii0.set(false);
        this.f50890iO.onCancel();
        XXI();
    }

    public final double XOO0ii0() {
        if (this.OIi0 > 0) {
            return (this.I0IIOi.get() / this.OIi0) * ((double) 100);
        }
        return 0.0d;
    }

    public final void XXI() {
        I0iXXO("Releasing server resources...");
        try {
            this.X1ii.set(false);
            I0iXXO("Stopping server socket...");
            ServerSocket serverSocket = this.I0iXXO;
            if (serverSocket != null) {
                serverSocket.close();
            }
            I0iXXO("Cancelling timeout future...");
            ScheduledFuture<?> scheduledFuture = this.f50889IO;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            I0iXXO("Shutting down scheduler...");
            this.OIX0iXi.shutdownNow();
            I0iXXO("Server resources released successfully");
        } catch (Exception e) {
            I0iXXO("Error releasing resources: " + e.getMessage());
            this.f50890iO.onError("Error releasing resources: " + e.getMessage());
        }
    }

    public /* synthetic */ OkHttpFileServer(int i, File file, String str, OI0OX0 oi0ox0, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? O10IXXX0X.XIi00iiXO() : i, file, str, oi0ox0, (i2 & 16) != 0 ? 0L : j);
    }
}

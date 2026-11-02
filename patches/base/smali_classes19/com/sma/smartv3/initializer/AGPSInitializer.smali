.class public final Lcom/sma/smartv3/initializer/AGPSInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/s5;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAGPSInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AGPSInitializer.kt\ncom/sma/smartv3/initializer/AGPSInitializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAGPSInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AGPSInitializer.kt\ncom/sma/smartv3/initializer/AGPSInitializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"
    }
.end annotation


# static fields
.field public static final I1:Ljava/lang/String; = "AGPS"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IO:Lcom/sma/smartv3/initializer/AGPSInitializer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static O001I:Lcom/android/mltcode/paycertificationapi/ms; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final X0i1O:I = 0x90

.field public static final X11iII1O1:I = 0x3

.field public static final X1IX:I = 0x90

.field public static final XXO:Lcom/sma/smartv3/initializer/AGPSInitializer$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XXX11i:I = 0x30

.field public static iIXi1iiXI:Lcom/android/mltcode/paycertificationapi/c72; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final iX1O1:Ljava/lang/String; = "AGPS_SYNC_STATE"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static iXiX011:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/initializer/AGPSInitializer;

    invoke-direct {v0}, Lcom/sma/smartv3/initializer/AGPSInitializer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    new-instance v0, Lcom/sma/smartv3/initializer/AGPSInitializer$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/initializer/AGPSInitializer$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->XXO:Lcom/sma/smartv3/initializer/AGPSInitializer$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final I0IIOi()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->iIXi1iiXI:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    const v0, 0x7f141196

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_0
    return-void
.end method

.method public static final synthetic I0iXXO(Lcom/sma/smartv3/initializer/AGPSInitializer;Ljava/io/File;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->XX0(Ljava/io/File;)V

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/initializer/AGPSInitializer;ZLcom/android/mltcode/paycertificationapi/c72;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/initializer/AGPSInitializer;->OX(ZLcom/android/mltcode/paycertificationapi/c72;)V

    return-void
.end method

.method public static final synthetic IO(Lcom/sma/smartv3/initializer/AGPSInitializer;)Lcom/szabh/smable3/BleKey;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->O10IXXX0X()Lcom/szabh/smable3/BleKey;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->XOO0ii0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic OIX0iXi()Lcom/android/mltcode/paycertificationapi/c72;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->iIXi1iiXI:Lcom/android/mltcode/paycertificationapi/c72;

    return-object v0
.end method

.method public static final synthetic OIi0(Lcom/sma/smartv3/initializer/AGPSInitializer;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->IiI10X(Ljava/lang/String;)V

    return-void
.end method

.method public static final OiIIX101O()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->iIXi1iiXI:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    const v0, 0x7f141196

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_0
    return-void
.end method

.method public static final synthetic X1ii(Lcom/sma/smartv3/initializer/AGPSInitializer;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->OII()V

    return-void
.end method

.method public static synthetic XIi00iiXO()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/initializer/AGPSInitializer;->OiIIX101O()V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->iOOX010X(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XOO0ii0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 8

    const/4 v1, 0x0

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v2, "AGPS -> aGpsFileSocket socket connect"

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0}, Ljava/net/Socket;-><init>()V

    new-instance v2, Ljava/net/InetSocketAddress;

    const-string v3, "121.41.40.95"

    const/16 v4, 0xa3d

    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    const/16 v3, 0x1388

    invoke-virtual {v0, v2, v3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    sget-object v3, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const-string v3, "getBytes(...)"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    new-instance p0, Ljava/io/BufferedOutputStream;

    new-instance v3, Ljava/io/FileOutputStream;

    sget-object v4, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/uz0;->IiI10X(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    :goto_0
    invoke-static {v3}, Lkotlin/io/ByteStreamsKt;->X0O(Ljava/io/InputStream;)[B

    move-result-object v4

    array-length v5, v4

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    move v5, v1

    :goto_1
    if-nez v5, :cond_1

    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V

    invoke-virtual {v0}, Ljava/net/Socket;->shutdownOutput()V

    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object p0, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->O10IXXX0X()Lcom/szabh/smable3/BleKey;

    move-result-object v3

    sget-object p0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/uz0;->IiI10X(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AGPS -> aGpsFileSocket error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/XiOIii1;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/XiOIii1;-><init>()V

    invoke-static {p0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    sget-object p0, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->XiOIii1(Z)V

    :goto_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic XXI(Lcom/sma/smartv3/initializer/AGPSInitializer;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->XiOIii1(Z)V

    return-void
.end method

.method public static synthetic iO()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/initializer/AGPSInitializer;->I0IIOi()V

    return-void
.end method

.method public static final iOOX010X(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 2

    const-string v0, "status"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/sma/smartv3/initializer/AGPSInitializer;->O001I:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz p0, :cond_1

    const v0, 0x7f140c50

    invoke-virtual {p0, v0, v1}, Lcom/android/mltcode/paycertificationapi/ms;->IiI10X(IZ)V

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "syncAGPS -> Location permission is not granted"

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p0, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->XiOIii1(Z)V

    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final I1XOi1()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->iXiX011:Z

    return v0
.end method

.method public final IIX1OXO()Z
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "SHOW_SYNC_AGPS_POPUP_TIME"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/32 v0, 0x6ddd00

    cmp-long v0, v2, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final IiI10X(Ljava/lang/String;)V
    .locals 8

    new-instance v5, Lcom/android/mltcode/paycertificationapi/OII;

    invoke-direct {v5, p1}, Lcom/android/mltcode/paycertificationapi/OII;-><init>(Ljava/lang/String;)V

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void
.end method

.method public final O10IXXX0X()Lcom/szabh/smable3/BleKey;
    .locals 2

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->iIXi1iiXI:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/szabh/smable3/BleKey;->AGPS_FILE:Lcom/szabh/smable3/BleKey;

    return-object v0

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0I0O111I()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/szabh/smable3/BleKey;->AGPS_FILE2:Lcom/szabh/smable3/BleKey;

    return-object v0

    :cond_1
    sget-object v0, Lcom/szabh/smable3/BleKey;->AGPS_FILE:Lcom/szabh/smable3/BleKey;

    return-object v0
.end method

.method public final OII()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->O001I:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ms;->I0IIOi()V

    :cond_0
    return-void
.end method

.method public final OX(ZLcom/android/mltcode/paycertificationapi/c72;)V
    .locals 6
    .param p2    # Lcom/android/mltcode/paycertificationapi/c72;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-boolean v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->iXiX011:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AGPS syncAGPS -> Syncing"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez p1, :cond_6

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "AGPS is syncing, please wait..."

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    return-void

    :cond_0
    sput-object p2, Lcom/sma/smartv3/initializer/AGPSInitializer;->iIXi1iiXI:Lcom/android/mltcode/paycertificationapi/c72;

    sget-object p2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p2}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string p2, "AGPS syncAGPS -> BleConnector is not available"

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->XiOIO()Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string p2, "AGPS syncAGPS -> Not time to sync AGPS"

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->OI()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string p2, "AGPS firmware update....."

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_4
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0I0O111I()Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz p1, :cond_7

    invoke-virtual {p2}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result p1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_5

    invoke-virtual {p2}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result p1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_5

    invoke-virtual {p2}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result p1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_5

    invoke-virtual {p2}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result p1

    const/16 v0, 0xa

    if-ne p1, v0, :cond_7

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->IIX1OXO()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string p2, "AGPS syncAGPS -> AGPS file too large! Need to popup!"

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const-string p1, "show_sync_agps_popup"

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_6
    :goto_0
    return-void

    :cond_7
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->XiOIii1(Z)V

    const/4 p1, 0x6

    invoke-virtual {p2}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result v0

    if-ne p1, v0, :cond_8

    const-string p1, "LOCATION"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string p1, "permission(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/OX;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/OX;-><init>()V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_8
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p2}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsFileUrl()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/initializer/AGPSInitializer$syncAGPS$3;

    invoke-direct {v1}, Lcom/sma/smartv3/initializer/AGPSInitializer$syncAGPS$3;-><init>()V

    const-string v2, "agps"

    invoke-virtual {p1, p2, v0, v2, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method public OXO1(Landroid/app/Application;)V
    .locals 4
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1:Lcom/android/mltcode/paycertificationapi/I0iIi;

    new-instance v1, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;

    invoke-direct {v1}, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;-><init>()V

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.TIME_TICK"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x2

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->XXO:Lcom/sma/smartv3/initializer/AGPSInitializer$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public final X0O()I
    .locals 3

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    const/16 v2, 0x90

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/4 v0, 0x3

    return v0

    :cond_0
    return v2

    :cond_1
    const/16 v0, 0x30

    return v0
.end method

.method public final XX0(Ljava/io/File;)V
    .locals 10

    const/4 v1, 0x0

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result p1

    new-array v2, p1, [B

    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result v3

    new-array v6, v3, [B

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v2}, Ljava/io/FileInputStream;->read([B)I

    move v0, v1

    :goto_0
    const/16 v5, 0xc

    if-ge v0, v5, :cond_2

    move v5, v1

    :goto_1
    if-ge v5, p1, :cond_1

    const/16 v7, 0x900

    if-ge v5, v7, :cond_0

    mul-int/lit16 v7, v0, 0xfc0

    add-int/2addr v7, v5

    aget-byte v7, v2, v7

    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_0
    const/16 v7, 0xfc0

    if-ge v5, v7, :cond_1

    mul-int/lit16 v7, v0, 0xfc0

    add-int/2addr v7, v5

    aget-byte v7, v2, v7

    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    :goto_3
    const-string v2, "get(...)"

    if-ge v0, p1, :cond_3

    :try_start_1
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    move-result v2

    aput-byte v2, v6, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result p1

    move v0, v1

    :goto_4
    if-ge v0, p1, :cond_4

    add-int/lit16 v3, v0, 0x6c00

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    move-result v5

    aput-byte v5, v6, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    invoke-static {v6}, Lcom/blankj/utilcode/util/ConvertUtils;->bytes2HexString([B)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->O10IXXX0X()Lcom/szabh/smable3/BleKey;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;[BIILjava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_5
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AGPS -> sendAGPSEPO2File error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/OiIIX101O;

    invoke-direct {p1}, Lcom/android/mltcode/paycertificationapi/OiIIX101O;-><init>()V

    invoke-static {p1}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->XiOIii1(Z)V

    return-void
.end method

.method public final XiOIO()Z
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "AGPS_SYNC_TIME"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const v0, 0x36ee80

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->X0O()I

    move-result v1

    mul-int/2addr v1, v0

    int-to-long v0, v1

    cmp-long v0, v2, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final XiOIii1(Z)V
    .locals 1

    sput-boolean p1, Lcom/sma/smartv3/initializer/AGPSInitializer;->iXiX011:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "AGPS_SYNC_STATE"

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final iIiiO(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "LOCATION_WHERE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "AGPS onLocationWhere"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    new-instance p1, Lcom/sma/smartv3/initializer/AGPSInitializer$XIi00iiXO;

    invoke-direct {p1}, Lcom/sma/smartv3/initializer/AGPSInitializer$XIi00iiXO;-><init>()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/ns;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/IO0OI;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ms;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/initializer/AGPSInitializer;->O001I:Lcom/android/mltcode/paycertificationapi/ms;

    :cond_0
    return-void
.end method

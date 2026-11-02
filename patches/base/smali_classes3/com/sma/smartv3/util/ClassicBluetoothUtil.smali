.class public final Lcom/sma/smartv3/util/ClassicBluetoothUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassicBluetoothUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,291:1\n1869#2,2:292\n1761#2,3:305\n310#3,11:294\n310#3,11:308\n*S KotlinDebug\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil\n*L\n55#1:292,2\n250#1:305,3\n209#1:294,11\n254#1:308,11\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nClassicBluetoothUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,291:1\n1869#2,2:292\n1761#2,3:305\n310#3,11:294\n310#3,11:308\n*S KotlinDebug\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil\n*L\n55#1:292,2\n250#1:305,3\n209#1:294,11\n254#1:308,11\n*E\n"
    }
.end annotation


# static fields
.field public static final I0IIOi:Ljava/util/UUID;

.field public static final IiI10X:Lcom/sma/smartv3/util/ClassicBluetoothUtil$myReceiver$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final O00:Lcom/android/mltcode/paycertificationapi/l94;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Lcom/bestmafen/baseble/scanner/BleDevice;",
            ">;"
        }
    .end annotation
.end field

.field public static final OIi0:Ljava/util/UUID;

.field public static final OXO1:Lcom/sma/smartv3/util/ClassicBluetoothUtil;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XO0O10:Lcom/android/mltcode/paycertificationapi/ry0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ry0<",
            "Lcom/bestmafen/baseble/scanner/BleDevice;",
            ">;"
        }
    .end annotation
.end field

.field public static XOO0ii0:Landroid/bluetooth/BluetoothSocket;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final iO:Landroid/bluetooth/BluetoothAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    invoke-direct {v0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;-><init>()V

    sput-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->OXO1:Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    const-string v0, "ClassicScanner"

    sput-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XIi00iiXO:Ljava/lang/String;

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->iO:Landroid/bluetooth/BluetoothAdapter;

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/16 v3, 0x3c

    invoke-static {v2, v3, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/m94;->XIi00iiXO(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XO0O10:Lcom/android/mltcode/paycertificationapi/ry0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->I0iXXO(Lcom/android/mltcode/paycertificationapi/ry0;)Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->O00:Lcom/android/mltcode/paycertificationapi/l94;

    new-instance v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$myReceiver$1;

    invoke-direct {v0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil$myReceiver$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->IiI10X:Lcom/sma/smartv3/util/ClassicBluetoothUtil$myReceiver$1;

    const-string v0, "00001101-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->I0IIOi:Ljava/util/UUID;

    const-string v0, "0000110b-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->OIi0:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic OXO1()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XIi00iiXO:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic XIi00iiXO()Lcom/android/mltcode/paycertificationapi/ry0;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XO0O10:Lcom/android/mltcode/paycertificationapi/ry0;

    return-object v0
.end method


# virtual methods
.method public final I0IIOi()Lcom/android/mltcode/paycertificationapi/l94;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Lcom/bestmafen/baseble/scanner/BleDevice;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->O00:Lcom/android/mltcode/paycertificationapi/l94;

    return-object v0
.end method

.method public final I0iXXO(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object v1, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->iO:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    return v0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public final I1XOi1(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 0
    .param p1    # Lcom/bestmafen/baseble/scanner/BleDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->IiI10X()V

    return-void
.end method

.method public final IIX1OXO(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->IiI10X:Lcom/sma/smartv3/util/ClassicBluetoothUtil$myReceiver$1;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final IO(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/util/ClassicBluetoothUtil$XIi00iiXO;

    invoke-direct {v2, v0, p2}, Lcom/sma/smartv3/util/ClassicBluetoothUtil$XIi00iiXO;-><init>(Lcom/android/mltcode/paycertificationapi/IO0i;Ljava/lang/String;)V

    const/4 p2, 0x2

    invoke-virtual {v1, p1, v2, p2}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public final IiI10X()V
    .locals 4

    :try_start_0
    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XOO0ii0:Landroid/bluetooth/BluetoothSocket;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothSocket;->close()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "\u5173\u95ed\u8fde\u63a5\uff0c\u91cd\u65b0\u8bf7\u6c42"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XIi00iiXO:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " DisConnect Failed "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final O00()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.BLUETOOTH_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ActivityUtils;->startActivity(Landroid/content/Intent;)Z

    return-void
.end method

.method public final O10IXXX0X()V
    .locals 3
    .annotation build Landroidx/annotation/RequiresPermission;
        allOf = {
            "android.permission.BLUETOOTH_SCAN",
            "android.permission.BLUETOOTH_CONNECT"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->X0O()V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XOO0ii0()V

    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->iO:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->startDiscovery()Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XIi00iiXO:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " StartScan"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final OIX0iXi()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XOO0ii0:Landroid/bluetooth/BluetoothSocket;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothSocket;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method

.method public final OIi0(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->X1ii(Landroid/content/Context;)V

    return-void
.end method

.method public final X0O()V
    .locals 3
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.BLUETOOTH_SCAN"
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XIi00iiXO:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " StopScan"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->iO:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    :cond_0
    return-void
.end method

.method public final X1ii(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->IiI10X:Lcom/sma/smartv3/util/ClassicBluetoothUtil$myReceiver$1;

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final XO0O10(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->IIX1OXO(Landroid/content/Context;)V

    return-void
.end method

.method public final XOO0ii0()V
    .locals 9
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.BLUETOOTH_CONNECT"
    .end annotation

    sget-object v0, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->iO:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v1, "getName(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v8

    const-string v1, "getAddress(...)"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v7

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Lcom/bestmafen/baseble/scanner/BleDevice;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/bestmafen/baseble/scanner/BleDevice;-><init>(Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XO0O10:Lcom/android/mltcode/paycertificationapi/ry0;

    invoke-interface {v1, v2}, Lcom/android/mltcode/paycertificationapi/ry0;->iO(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final XXI(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 4
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.BLUETOOTH_CONNECT"
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->createBond()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XIi00iiXO:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " pair Exception:"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return v0
.end method

.method public final iO(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;

    invoke-direct {v2, p1, v0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;-><init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/IO0i;)V

    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v1, Lcom/sma/smartv3/util/ClassicBluetoothUtil$OXO1;

    invoke-direct {v1, p1, v2}, Lcom/sma/smartv3/util/ClassicBluetoothUtil$OXO1;-><init>(Landroid/content/Context;Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;)V

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/IO0i;->iX(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

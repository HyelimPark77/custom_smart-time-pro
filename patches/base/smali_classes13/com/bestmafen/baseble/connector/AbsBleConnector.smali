.class public abstract Lcom/bestmafen/baseble/connector/AbsBleConnector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DEF_RECONNECT_MAX_PERIOD:I = 0x1e

.field public static final DEF_RECONNECT_MIN_PERIOD:I = 0x14

.field public static final DEF_SCAN_MAX_DURATION:I = 0xc

.field public static final TIMEOUT:J = 0x1f40L


# instance fields
.field private final LOG_HEADER:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private disableStreamLog:Z

.field private isAutoReconnect:Z

.field private isConnecting:Z

.field private isRefreshDeviceCache:Z

.field private mBleGattCallback:Lcom/android/mltcode/paycertificationapi/XX0XO01i;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

.field private mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBluetoothGattCallback$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mConnectDirectly:Z

.field protected mContext:Landroid/content/Context;

.field private mForceConnectDirectly:Z

.field private final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMtu:I

.field private mNotified:Z

.field private final mReceiver$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mReconnectBasePeriod:I

.field private mReconnectMaxPeriod:I

.field private final mReconnection:Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRetry:I

.field private final mScanFilter:Lcom/android/mltcode/paycertificationapi/O1iiIi;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mScanMaxDuration:I

.field private mScanMode:Lcom/bestmafen/baseble/scanner/ScanMode;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mScanner:Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mTargetAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mTimeout:J

.field private mTransport:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->Companion:Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "AbsBleConnector"

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->LOG_HEADER:Ljava/lang/String;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/X1i1IX1X;->OXO1()I

    move-result v0

    iput v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mMtu:I

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOIX1OI0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOIX1OI0;-><init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGattCallback$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOiXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOiXX;-><init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReceiver$delegate:Lkotlin/Lazy;

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1iiIi;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1iiIi;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanFilter:Lcom/android/mltcode/paycertificationapi/O1iiIi;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isAutoReconnect:Z

    iput-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mConnectDirectly:Z

    const/4 v0, 0x5

    iput v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnectBasePeriod:I

    const-wide/16 v0, 0x1f40

    iput-wide v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTimeout:J

    const/16 v0, 0x1e

    iput v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnectMaxPeriod:I

    const/16 v0, 0xc

    iput v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanMaxDuration:I

    sget-object v0, Lcom/bestmafen/baseble/scanner/ScanMode;->BALANCED:Lcom/bestmafen/baseble/scanner/ScanMode;

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanMode:Lcom/bestmafen/baseble/scanner/ScanMode;

    new-instance v0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;

    invoke-direct {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;-><init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnection:Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;

    return-void
.end method

.method public static final I0IIOi(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;
    .locals 1

    new-instance v0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;

    invoke-direct {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;-><init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    return-object v0
.end method

.method public static synthetic OXO1(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;
    .locals 0

    invoke-static {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->XOO0ii0(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;
    .locals 0

    invoke-static {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->I0IIOi(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static final XOO0ii0(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;
    .locals 1

    new-instance v0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;

    invoke-direct {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;-><init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    return-object v0
.end method

.method public static final synthetic access$connectGatt(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->iO()V

    return-void
.end method

.method public static final synthetic access$getBluetoothGatt(Lcom/bestmafen/baseble/connector/AbsBleConnector;Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->XO0O10(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMNotified$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mNotified:Z

    return p0
.end method

.method public static final synthetic access$getMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)I
    .locals 0

    iget p0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mRetry:I

    return p0
.end method

.method public static final synthetic access$getMScanner$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    iget-object p0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanner:Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object p0
.end method

.method public static final synthetic access$setMNotified$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mNotified:Z

    return-void
.end method

.method public static final synthetic access$setMRetry$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mRetry:I

    return-void
.end method

.method public static final synthetic access$shouldReconnect(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->IO()Z

    move-result p0

    return p0
.end method

.method public static synthetic setBleDevice$default(Lcom/bestmafen/baseble/connector/AbsBleConnector;Lcom/bestmafen/baseble/scanner/BleDevice;IILjava/lang/Object;)Lcom/bestmafen/baseble/connector/AbsBleConnector;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setBleDevice(Lcom/bestmafen/baseble/scanner/BleDevice;I)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setBleDevice"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final IO()Z
    .locals 4

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTargetAddress:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " shouldReconnect -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", BluetoothAdapter isEnabled: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", mTargetAddress: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTargetAddress:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return v0
.end method

.method public final IiI10X()Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReceiver$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;

    return-object v0
.end method

.method public final O00()Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGattCallback$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;

    return-object v0
.end method

.method public final OIi0()V
    .locals 4

    :try_start_0
    const-class v0, Landroid/bluetooth/BluetoothGatt;

    const-string v1, "refresh"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " refreshDeviceCache -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " refreshDeviceCache -> error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final XO0O10(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;
    .locals 4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    iget v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTransport:I

    if-nez v1, :cond_0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTransport:I

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " BluetoothGatt -> type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " , transport = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTransport:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->O00()Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;

    move-result-object v1

    iget v2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTransport:I

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;I)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final declared-synchronized closeConnection(Z)V
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " closeConnection -> stopReconnecting = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isRefreshDeviceCache:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iO00;->reset()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleParser()Lcom/android/mltcode/paycertificationapi/OIXOI;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/OIXOI;->reset()V

    iget-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mNotified:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mNotified:Z

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBleGattCallback:Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onConnectionStateChange(Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isRefreshDeviceCache:Z

    if-eqz v2, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->OIi0()V

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    :cond_2
    if-eqz p1, :cond_3

    const-string p1, ""

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTargetAddress:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized connect(Z)V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isConnecting()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " connect -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setConnecting(Z)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mRetry:I

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isAutoReconnect:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnection:Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->iO()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanner:Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    :cond_3
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnection:Lcom/bestmafen/baseble/connector/AbsBleConnector$XO0O10;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final exit()V
    .locals 3

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " -> exit"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanner:Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->IiI10X()Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final getAddress()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTargetAddress:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final getCharacteristic(Ljava/lang/String;Ljava/lang/String;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "serviceUuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristicUuid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    const-string v2, ")=null"

    const-string v3, " getCharacteristic -> service("

    if-nez v0, :cond_2

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XOO0ii0(Ljava/lang/String;)V

    return-object v1

    :cond_2
    invoke-static {p2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "), characteristic("

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XOO0ii0(Ljava/lang/String;)V

    return-object v1

    :cond_3
    return-object v0

    :cond_4
    :goto_0
    return-object v1
.end method

.method public final getDisableStreamLog()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->disableStreamLog:Z

    return v0
.end method

.method public getLOG_HEADER()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->LOG_HEADER:Ljava/lang/String;

    return-object v0
.end method

.method public final getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBleGattCallback:Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    return-object v0
.end method

.method public abstract getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract getMBleParser()Lcom/android/mltcode/paycertificationapi/OIXOI;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public final getMBluetoothGatt()Landroid/bluetooth/BluetoothGatt;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method public final getMConnectDirectly()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mConnectDirectly:Z

    return v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMForceConnectDirectly()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mForceConnectDirectly:Z

    return v0
.end method

.method public final getMHandler()Landroid/os/Handler;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public final getMMtu()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mMtu:I

    return v0
.end method

.method public abstract getMNotify()Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public final getMReconnectBasePeriod()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnectBasePeriod:I

    return v0
.end method

.method public final getMReconnectMaxPeriod()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnectMaxPeriod:I

    return v0
.end method

.method public final getMScanMaxDuration()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanMaxDuration:I

    return v0
.end method

.method public final getMScanMode()Lcom/bestmafen/baseble/scanner/ScanMode;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanMode:Lcom/bestmafen/baseble/scanner/ScanMode;

    return-object v0
.end method

.method public abstract getMService()Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public final getMTargetAddress()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTargetAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getMTimeout()J
    .locals 2

    iget-wide v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTimeout:J

    return-wide v0
.end method

.method public final getMTransport()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTransport:I

    return v0
.end method

.method public final getNotifyDescriptor(Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattDescriptor;
    .locals 3
    .param p1    # Landroid/bluetooth/BluetoothGattCharacteristic;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " getNotifyDescriptor -> characteristic=null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XOO0ii0(Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v1, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " getNotifyDescriptor -> descriptor=null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XOO0ii0(Ljava/lang/String;)V

    return-object v0

    :cond_1
    return-object p1
.end method

.method public getWriteType()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final iO()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " connectGatt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTargetAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const-string v1, "getRemoteDevice(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->XO0O10(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iput-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " connect Exception"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final init(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/XX0XO01i;)Lcom/bestmafen/baseble/connector/AbsBleConnector;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/XX0XO01i;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleGattCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setMContext(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBleGattCallback:Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    sget-object p2, Lcom/android/mltcode/paycertificationapi/ut3;->OXO1:Lcom/android/mltcode/paycertificationapi/ut3;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p2, v0, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/ut3;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/ut3;[Ljava/util/UUID;Lcom/bestmafen/baseble/scanner/ScanMode;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p2

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanFilter:Lcom/android/mltcode/paycertificationapi/O1iiIi;

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->iIiiO(Z)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p2

    new-instance v0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;-><init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->X1ii(Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p2

    iput-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanner:Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/android/mltcode/paycertificationapi/iO00;->setMAbsBleConnector(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x22

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    if-lt p2, v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->IiI10X()Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;

    move-result-object p2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1}, Landroidx/core/content/ContextCompat;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->IiI10X()Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;

    move-result-object p2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-object p0
.end method

.method public final isAutoReconnect(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isAutoReconnect:Z

    return-void
.end method

.method public final isAutoReconnect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isAutoReconnect:Z

    return v0
.end method

.method public isConnecting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isConnecting:Z

    return v0
.end method

.method public final isRefreshDeviceCache()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isRefreshDeviceCache:Z

    return v0
.end method

.method public final setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTargetAddress:Ljava/lang/String;

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanFilter:Lcom/android/mltcode/paycertificationapi/O1iiIi;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1iiIi;->iO(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setAutoReconnect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isAutoReconnect:Z

    return-void
.end method

.method public final setBleDevice(Lcom/bestmafen/baseble/scanner/BleDevice;I)Lcom/bestmafen/baseble/connector/AbsBleConnector;
    .locals 1
    .param p1    # Lcom/bestmafen/baseble/scanner/BleDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "bleDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTransport:I

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p1

    return-object p1
.end method

.method public final setBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/bestmafen/baseble/connector/AbsBleConnector;
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "bluetoothDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getAddress(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p1

    return-object p1
.end method

.method public setConnecting(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isConnecting:Z

    return-void
.end method

.method public final setDisableStreamLog(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->disableStreamLog:Z

    return-void
.end method

.method public final setForceConnectDirectly(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mForceConnectDirectly:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x14

    goto :goto_0

    :cond_0
    const/16 p1, 0x1e

    :goto_0
    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnectMaxPeriod:I

    return-void
.end method

.method public final setMBleGattCallback(Lcom/android/mltcode/paycertificationapi/XX0XO01i;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/XX0XO01i;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBleGattCallback:Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    return-void
.end method

.method public final setMBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)V
    .locals 0
    .param p1    # Landroid/bluetooth/BluetoothGatt;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mBluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    return-void
.end method

.method public final setMConnectDirectly(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mConnectDirectly:Z

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final setMForceConnectDirectly(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mForceConnectDirectly:Z

    return-void
.end method

.method public final setMMtu(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mMtu:I

    return-void
.end method

.method public final setMReconnectBasePeriod(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnectBasePeriod:I

    return-void
.end method

.method public final setMReconnectMaxPeriod(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnectMaxPeriod:I

    return-void
.end method

.method public final setMScanMaxDuration(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanMaxDuration:I

    return-void
.end method

.method public final setMScanMode(Lcom/bestmafen/baseble/scanner/ScanMode;)V
    .locals 1
    .param p1    # Lcom/bestmafen/baseble/scanner/ScanMode;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanMode:Lcom/bestmafen/baseble/scanner/ScanMode;

    return-void
.end method

.method public final setMTargetAddress(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTargetAddress:Ljava/lang/String;

    return-void
.end method

.method public final setMTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTimeout:J

    return-void
.end method

.method public final setMTransport(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTransport:I

    return-void
.end method

.method public final setReconnectMaxPeriod(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mReconnectMaxPeriod:I

    return-void
.end method

.method public final setRefreshDeviceCache(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isRefreshDeviceCache:Z

    return-void
.end method

.method public final setScanMaxDuration(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanMaxDuration:I

    return-void
.end method

.method public final setScanMode(Lcom/bestmafen/baseble/scanner/ScanMode;)V
    .locals 1
    .param p1    # Lcom/bestmafen/baseble/scanner/ScanMode;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mScanMode:Lcom/bestmafen/baseble/scanner/ScanMode;

    return-void
.end method

.method public final setTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector;->mTimeout:J

    return-void
.end method

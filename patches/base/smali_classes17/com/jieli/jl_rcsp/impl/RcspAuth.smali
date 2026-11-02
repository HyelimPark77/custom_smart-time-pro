.class public Lcom/jieli/jl_rcsp/impl/RcspAuth;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;,
        Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;,
        Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;
    }
.end annotation


# static fields
.field private static final AUTH_RETRY_COUNT:I = 0x2

.field private static final DEFAULT_AUTH_TIMEOUT:J = 0xbb8L

.field private static DELAY_AUTH_WAITING_TIME:J = 0xbb8L

.field public static final ERR_AUTH_DATA_CHECK:I = 0xa014

.field public static final ERR_AUTH_DATA_SEND:I = 0xa013

.field public static final ERR_AUTH_DEVICE_TIMEOUT:I = 0xa011

.field public static final ERR_AUTH_USER_STOP:I = 0xa012

.field public static final ERR_NONE:I = 0x0

.field private static final MSG_AUTH_DEVICE_TIMEOUT:I = 0x12

.field private static final MSG_SEND_AUTH_DATA_TIMEOUT:I = 0x11

.field private static final TAG:Ljava/lang/String; = "RcspAuth"

.field private static volatile mIsLibLoaded:Z = false

.field public static final sLocalLibLoader:Lcom/jieli/jl_rcsp/interfaces/listener/LibLoader;


# instance fields
.field private isLibInit:Z

.field private final mAuthTaskMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;",
            ">;"
        }
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;

.field private final mListener:Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;

.field private final mRcspAuthOp:Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ad2;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ad2;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->sLocalLibLoader:Lcom/jieli/jl_rcsp/interfaces/listener/LibLoader;

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;-><init>(Lcom/jieli/jl_rcsp/impl/RcspAuth;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mRcspAuthOp:Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mListener:Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->loadLibrariesOnce(Lcom/jieli/jl_rcsp/interfaces/listener/LibLoader;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->nativeInit()Z

    move-result p1

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->isLibInit:Z

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->onInitResult(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "IRcspAuthOp can not be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_rcsp/impl/RcspAuth;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mRcspAuthOp:Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->getRandomData()[B

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;->sendAuthDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    const/16 v0, 0x11

    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    invoke-virtual {p0, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    sget-wide v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->DELAY_AUTH_WAITING_TIME:J

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_0
    const p2, 0xa013

    const-string v0, "Failed to send data."

    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->onAuthFailed(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mRcspAuthOp:Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;

    return-object p0
.end method

.method public static synthetic access$200(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic access$300()J
    .locals 2

    sget-wide v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->DELAY_AUTH_WAITING_TIME:J

    return-wide v0
.end method

.method public static synthetic access$400(Lcom/jieli/jl_rcsp/impl/RcspAuth;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->onAuthFailed(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private getErrorMsg(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const-string p1, ""

    return-object p1

    :pswitch_0
    const-string p1, "Check auth data error."

    return-object p1

    :pswitch_1
    const-string p1, "Failed to send data."

    return-object p1

    :pswitch_2
    const-string p1, "User stop auth device."

    return-object p1

    :pswitch_3
    const-string p1, "Auth device timeout."

    return-object p1

    :pswitch_data_0
    .packed-switch 0xa011
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getResetAuthFlagCmdData()[B
    .locals 1

    const-string v0, "FEDCBAC00600020001EF"

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->hexStr2Bytes(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method private isValidAuthData([B)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    array-length v1, p1

    const/4 v2, 0x5

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    aget-byte v1, p1, v0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    :cond_1
    array-length v1, p1

    const/16 v2, 0x11

    if-ne v1, v2, :cond_3

    aget-byte p1, p1, v0

    if-eqz p1, :cond_2

    if-ne p1, v3, :cond_3

    :cond_2
    return v3

    :cond_3
    :goto_0
    return v0
.end method

.method public static loadLibrariesOnce(Lcom/jieli/jl_rcsp/interfaces/listener/LibLoader;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mIsLibLoaded:Z

    if-nez v1, :cond_1

    if-nez p0, :cond_0

    sget-object p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->sLocalLibLoader:Lcom/jieli/jl_rcsp/interfaces/listener/LibLoader;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    const-string v1, "jl_auth"

    invoke-interface {p0, v1}, Lcom/jieli/jl_rcsp/interfaces/listener/LibLoader;->loadLibrary(Ljava/lang/String;)V

    const/4 p0, 0x1

    sput-boolean p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mIsLibLoaded:Z

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private onAuthFailed(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getErrorMsg(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->onAuthFailed(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    return-void
.end method

.method private onAuthFailed(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V
    .locals 3

    .line 2
    sget-object v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->TAG:Ljava/lang/String;

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1, p3}, [Ljava/lang/Object;

    move-result-object v1

    .line 4
    const-string v2, "Device = %s, code = %d, message = %s."

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onAuthFailed"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    if-eqz p1, :cond_0

    .line 7
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mListener:Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;->onAuthFailed(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method private onAuthSuccess(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    sget-object v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->TAG:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "device = %s, auth ok."

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onAuthSuccess"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mListener:Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;->onAuthSuccess(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    return-void
.end method

.method private onInitResult(Z)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mListener:Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;->onInitResult(Z)V

    :cond_0
    return-void
.end method

.method public static setAuthTimeout(J)Z
    .locals 3

    const-wide/16 v0, 0xbb8

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    sget-object v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The timeout is too short to be set successfully.  timeout : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "setAuthTimeout"

    invoke-static {v0, p1, p0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_0
    sput-wide p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->DELAY_AUTH_WAITING_TIME:J

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public addListener(Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->isLibInit:Z

    sput-boolean v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mIsLibLoaded:Z

    return-void
.end method

.method public getAuthData([B)[B
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getEncryptedAuthData([B)[B

    move-result-object p1

    return-object p1
.end method

.method public getAuthOkData()[B
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 1
        0x2t
        0x70t
        0x61t
        0x73t
        0x73t
    .end array-data
.end method

.method public native getEncryptedAuthData([B)[B
.end method

.method public native getRandomAuthData()[B
.end method

.method public getRandomData()[B
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getRandomAuthData()[B

    move-result-object v0

    return-object v0
.end method

.method public handleAuthData(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 8

    if-eqz p1, :cond_9

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->isLibInit:Z

    if-eqz v0, :cond_9

    invoke-direct {p0, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->isValidAuthData([B)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->isAuthDevice()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    sget-object v1, Lcom/jieli/jl_rcsp/impl/RcspAuth;->TAG:Ljava/lang/String;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v2

    filled-new-array {p1, v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Device : %s, data : %s"

    invoke-static {v3, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "handleAuthData"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->isAuthProgressResult()Z

    move-result v2

    const/4 v4, 0x1

    const/16 v5, 0x11

    const/4 v6, 0x0

    if-nez v2, :cond_4

    array-length v2, p2

    if-ne v2, v5, :cond_9

    aget-byte v2, p2, v6

    if-eq v2, v4, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->getRandomData()[B

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getAuthData([B)[B

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mRcspAuthOp:Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getAuthOkData()[B

    move-result-object v1

    invoke-interface {p2, p1, v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;->sendAuthDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_0

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Data not match. authData : "

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, v3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const p2, 0xa014

    goto :goto_1

    :cond_4
    array-length v2, p2

    if-ne v2, v5, :cond_6

    aget-byte v2, p2, v6

    if-nez v2, :cond_6

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getAuthData([B)[B

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "devAuthData : "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mRcspAuthOp:Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;

    invoke-interface {v1, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;->sendAuthDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p2

    if-eqz p2, :cond_5

    :goto_0
    move p2, v6

    goto :goto_1

    :cond_5
    const p2, 0xa013

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getAuthOkData()[B

    move-result-object v1

    invoke-static {p2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->setAuthDevice(Z)V

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->onAuthSuccess(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :goto_1
    if-nez p2, :cond_7

    goto :goto_2

    :cond_7
    move v4, v6

    :goto_2
    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->setAuthProgressResult(Z)V

    if-eqz p2, :cond_8

    invoke-virtual {v0, v6}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->setAuthDevice(Z)V

    invoke-direct {p0, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getErrorMsg(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->onAuthFailed(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    return-void

    :cond_8
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    invoke-virtual {p2, v5}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x12

    invoke-virtual {p2, v1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->isAuthDevice()Z

    move-result p2

    if-nez p2, :cond_9

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    invoke-virtual {p2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    sget-wide v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->DELAY_AUTH_WAITING_TIME:J

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_9
    :goto_3
    return-void
.end method

.method public native nativeInit()Z
.end method

.method public removeListener(Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setDeviceConnectionLinkKey([B)I
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->setLinkKey([B)I

    move-result p1

    return p1
.end method

.method public native setLinkKey([B)I
.end method

.method public startAuth(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 6

    if-eqz p1, :cond_5

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->isLibInit:Z

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "startAuth"

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->isAuthDevice()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    const/16 v2, 0x12

    invoke-virtual {v0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    sget-object p1, Lcom/jieli/jl_rcsp/impl/RcspAuth;->TAG:Ljava/lang/String;

    const-string v0, "The device has been certified or certification of device is in progress."

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspAuth$1;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->setDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getRandomData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->setRandomData([B)Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mRcspAuthOp:Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->getResetAuthFlagCmdData()[B

    move-result-object v2

    invoke-interface {v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;->sendAuthDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    new-instance v3, Lcom/jieli/jl_rcsp/impl/IiI10X;

    invoke-direct {v3, p0, p1, v0}, Lcom/jieli/jl_rcsp/impl/IiI10X;-><init>(Lcom/jieli/jl_rcsp/impl/RcspAuth;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;)V

    const-wide/16 v4, 0x1f4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return v1

    :cond_5
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public stopAuth(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->stopAuth(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public stopAuth(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 2

    if-eqz p1, :cond_3

    .line 2
    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->isLibInit:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mAuthTaskMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    const p2, 0xa012

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->onAuthFailed(Landroid/bluetooth/BluetoothDevice;I)V

    .line 5
    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    const/16 p2, 0x11

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth;->mHandler:Landroid/os/Handler;

    const/16 p2, 0x12

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    :cond_3
    :goto_0
    return-void
.end method

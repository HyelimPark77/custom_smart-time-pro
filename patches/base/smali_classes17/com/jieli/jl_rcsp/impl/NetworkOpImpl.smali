.class public Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/network/INetworkOp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;,
        Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;
    }
.end annotation


# static fields
.field public static WAITING_END_STATE_TIMEOUT:J = 0x3a980L

.field public static WAITING_START_STATE_TIMEOUT:J = 0xea60L

.field public static volatile j:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl; = null

.field public static final k:I = 0x1010


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

.field public final d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

.field public final e:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

.field public f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

.field public final g:Landroid/os/Handler;

.field public final h:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

.field public final i:Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/y51;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/y51;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->g:Landroid/os/Handler;

    new-instance v1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$6;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$6;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->h:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V

    iput-object v2, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->i:Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    new-instance p1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;-><init>(Landroid/os/Handler;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->e:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->addOnSettingFunctionListener(Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "WatchOpImpl can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;ILjava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;[B)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a([B)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Ljava/io/IOException;)V
    .locals 4

    if-eqz p0, :cond_0

    .line 34
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x4005

    .line 35
    invoke-static {v2}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    .line 36
    invoke-interface {p0, v0}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Ljava/lang/String;)V
    .locals 4

    if-eqz p0, :cond_0

    .line 30
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x1001

    .line 31
    invoke-static {v2}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " Error Path : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    .line 32
    invoke-interface {p0, v0}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;[B)V
    .locals 0

    if-eqz p0, :cond_0

    .line 33
    invoke-interface {p0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->e:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b(I)V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    return-object p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic f(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->g:Landroid/os/Handler;

    return-object p0
.end method

.method public static instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;
    .locals 2

    sget-object v0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->j:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->j:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    sput-object v1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->j:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->j:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getNetworkInfo()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    .line 9
    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 2

    .line 10
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->isNetworkOTA()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->g:Landroid/os/Handler;

    const/16 v1, 0x1010

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->setNetworkOTA(Z)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;)Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

    move-result-object v0

    if-eqz v0, :cond_2

    const/16 v1, 0x1002

    if-ne p1, v1, :cond_1

    .line 14
    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;->onCancel()V

    return-void

    .line 15
    :cond_1
    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;->onError(ILjava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance v2, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;

    new-instance v3, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;

    invoke-direct {v3, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;-><init>(I)V

    const/4 p2, 0x1

    invoke-direct {v2, p2, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;-><init>(ILcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;)V

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    new-instance p2, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;

    invoke-direct {p2, p0, p3}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, p2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->settingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5

    .line 16
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    goto :goto_2

    .line 18
    :cond_0
    :try_start_0
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 19
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x1000

    .line 20
    new-array v1, v1, [B

    .line 21
    :cond_1
    invoke-virtual {p1, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_2

    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 23
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 24
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    .line 25
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->g:Landroid/os/Handler;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/z51;

    invoke-direct {v2, p2, p1}, Lcom/android/mltcode/paycertificationapi/z51;-><init>(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;[B)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 27
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->g:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/a61;

    invoke-direct {v1, p2, p1}, Lcom/android/mltcode/paycertificationapi/a61;-><init>(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Ljava/io/IOException;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 29
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->g:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b61;

    invoke-direct {v1, p2, p1}, Lcom/android/mltcode/paycertificationapi/b61;-><init>(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a([B)V
    .locals 8

    .line 37
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->isNetworkOTA()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;)Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    new-instance v2, Lcom/jieli/jl_rcsp/model/data/SendParams;

    const/16 v5, 0x1000

    const/16 v6, 0x1000

    const/4 v3, 0x7

    const/4 v4, 0x0

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Lcom/jieli/jl_rcsp/model/data/SendParams;-><init>(IIII[B)V

    new-instance p1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;

    invoke-direct {p1, p0, v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;)V

    invoke-virtual {v1, v2, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->sendLargeData(Lcom/jieli/jl_rcsp/model/data/SendParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V

    return-void
.end method

.method public final synthetic a(Landroid/os/Message;)Z
    .locals 1

    .line 5
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x1010

    if-ne v0, p1, :cond_0

    const/16 p1, 0x5003

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(I)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public addOnNetworkListener(Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->e:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public final b(I)V
    .locals 2

    .line 6
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->isNetworkOTA()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->c(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V

    invoke-virtual {p0, v0, p1, v1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "[B>;)V"
        }
    .end annotation

    .line 4
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c61;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/c61;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public cancelNetworkOTA(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 3

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->cancelNetworkOTA(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->h:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->i:Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->removeOnSettingFunctionListener(Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->destroy()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->destroy()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->e:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    sput-object v1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->j:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    return-void
.end method

.method public isNetworkOTA()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->isNetworkOTA()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public queryNetworkInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance v2, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;

    new-instance v3, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>(I)V

    invoke-direct {v2, v4, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;-><init>(ILcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;)V

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    new-instance v2, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;

    invoke-direct {v2, p0, p2, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->settingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public removeOnNetworkListener(Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->e:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->unregisterCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public startNetworkOTA(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/network/OTAParam;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->isNetworkOTA()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    const/16 p1, 0x1100

    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    invoke-direct {v0, p1, p3}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->setNetworkOTA(Z)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;->onStart()V

    :cond_2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/network/OTAParam;->getOtaData()[B

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/network/OTAParam;->getOtaData()[B

    move-result-object p1

    array-length p1, p1

    if-lez p1, :cond_3

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/network/OTAParam;->getOtaData()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->setOtaData([B)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->getOtaData()[B

    move-result-object p1

    array-length p1, p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b(I)V

    return-void

    :cond_3
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/network/OTAParam;->getOtaFilePath()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$2;

    invoke-direct {p2, p0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

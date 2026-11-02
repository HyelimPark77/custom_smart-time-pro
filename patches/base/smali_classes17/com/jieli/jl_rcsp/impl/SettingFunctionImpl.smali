.class public Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/setting/ISettingFunction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;
    }
.end annotation


# static fields
.field public static volatile e:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

.field public final d:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->a:Ljava/lang/String;

    new-instance v0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;-><init>(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$1;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

    new-instance v0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$2;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->d:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "RcspOpImpl can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;
    .locals 2

    sget-object v0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->e:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->e:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    sput-object v1, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->e:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

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
    sget-object p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->e:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    return-object p0
.end method


# virtual methods
.method public addOnSettingFunctionListener(Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->d:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    const/4 v0, 0x0

    sput-object v0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->e:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    return-void
.end method

.method public getRcspOp()Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object v0
.end method

.method public removeOnSettingFunctionListener(Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->c:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->unregisterCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public settingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;

    invoke-direct {v1, p2}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;)V

    new-instance p2, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)V

    const-string v3, "settingFunction"

    invoke-direct {p2, v3, p3, v2}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, p1, v1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

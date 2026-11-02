.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitFailed(I)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->o(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onInitFailed = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "createFatFileSystem"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->destroyFatFileSystem()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;->onInitFailed(I)V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->p(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onWatchSystemInit(I)V

    return-void
.end method

.method public onInitOk()V
    .locals 6

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onInitOk ====> "

    const-string v2, "createFatFileSystem"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Z)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;->onInitOk()V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->f(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onWatchSystemInit(I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->g(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->h(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->i(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getExpandMode()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    move v1, v5

    :cond_1
    invoke-static {v3, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Z)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->k(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isOTAResource = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v4}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->l(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->m(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->n(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onResourceUpdateUnfinished(Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    return-void
.end method

.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

.field public final synthetic c:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field public final synthetic d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->b:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->c:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->b:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;->onInitFailed(I)V

    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->v(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->c(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateExtFlashMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->d(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GetExternalFlashMsg : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "createFatFileSystem"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->d:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->b:Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->c:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;->onSuccess(Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    return-void
.end method

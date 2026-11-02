.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;II[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;)V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v0

    const-string v1, "writeDataToDeviceModify"

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->writeBufferIsEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    .line 5
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getData()[B

    move-result-object v3

    array-length v3, v3

    .line 6
    invoke-static {}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a()Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v5, v6, p2}, [Ljava/lang/Object;

    move-result-object p2

    .line 8
    const-string v5, "device = %s, dataLen = %d, ctrlCmd = %s"

    invoke-static {v5, p2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v4, v1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v0, v3}, Lcom/jieli/jl_fatfs/FatFileSystem;->callbackProgress(I)V

    .line 10
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getOffset()I

    move-result p2

    .line 11
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getFlag()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    add-int/2addr p2, v3

    .line 12
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getNeedSendLeftData()[B

    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {v1, p1, p2, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {v0, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;I)Z

    move-result p2

    if-nez p2, :cond_2

    .line 15
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {p2, p1, v2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    .line 16
    :cond_2
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 17
    :cond_3
    :goto_0
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    const-string v0, "fatFs is null or write buffer is empty."

    invoke-static {p2, p1, v1, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onErrCode ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "writeDataToDeviceModify"

    invoke-static {v0, p1, v1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

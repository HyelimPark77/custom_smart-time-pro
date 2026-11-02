.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "readDataFromDevice"

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    .line 3
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->readBufferIsEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v4

    check-cast v4, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    if-nez v4, :cond_1

    .line 5
    invoke-static {}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a()Ljava/lang/String;

    move-result-object p2

    const-string v0, "No response."

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    new-array v0, v3, [B

    invoke-static {p2, p1, v3, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z[B)V

    return-void

    .line 7
    :cond_1
    invoke-static {}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a()Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6, p2}, [Ljava/lang/Object;

    move-result-object v6

    .line 9
    const-string v7, "device = %s, ctrlCmd = %s"

    invoke-static {v7, v6}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v2, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v5

    .line 11
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->getResult()I

    move-result v6

    if-nez v5, :cond_4

    if-nez v6, :cond_4

    .line 12
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    .line 13
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->getData()[B

    move-result-object v2

    .line 14
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getOffset()I

    move-result v3

    if-eqz v2, :cond_2

    .line 15
    array-length v4, v2

    if-lez v4, :cond_2

    .line 16
    invoke-virtual {v0, v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->putDataInReadBuff([B)V

    .line 17
    array-length v2, v2

    add-int/2addr v3, v2

    .line 18
    :cond_2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->isFinalData()Z

    move-result p2

    if-nez p2, :cond_3

    .line 19
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getReadLeftSize()I

    move-result p2

    .line 20
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {v0, p1, v3, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;II)V

    return-void

    .line 21
    :cond_3
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getReadBuffer()[B

    move-result-object p2

    .line 22
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {v0, p1, v1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z[B)V

    return-void

    .line 23
    :cond_4
    invoke-static {}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a()Ljava/lang/String;

    move-result-object p2

    .line 24
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 25
    const-string v1, "Device reply bad status(%d). result : %d."

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    new-array v0, v3, [B

    invoke-static {p2, p1, v3, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z[B)V

    return-void

    .line 27
    :cond_5
    :goto_0
    invoke-static {}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a()Ljava/lang/String;

    move-result-object p2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "fatfs = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", readBufferIsEmpty : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->readBufferIsEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    move v1, v3

    :goto_1
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    new-array v0, v3, [B

    invoke-static {p2, p1, v3, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z[B)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onErrCode ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "readDataFromDevice"

    invoke-static {v0, v1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;->a:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    const/4 v0, 0x0

    new-array v1, v0, [B

    invoke-static {p2, p1, v0, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z[B)V

    return-void
.end method

.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;I)V
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
.field public final synthetic a:I

.field public final synthetic b:Lcom/jieli/jl_fatfs/FatFileSystem;

.field public final synthetic c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;ILcom/jieli/jl_fatfs/FatFileSystem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    iput p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->a:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->b:Lcom/jieli/jl_fatfs/FatFileSystem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;)V
    .locals 4

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    .line 3
    invoke-static {}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FlashQueryWriteResultCmd  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "queryWriteDataResult"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->getResult()I

    move-result v1

    if-nez p2, :cond_1

    if-nez v1, :cond_1

    .line 6
    iget p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->a:I

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    .line 7
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->b:Lcom/jieli/jl_fatfs/FatFileSystem;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->getSize()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->setNeedWriteData(I)V

    .line 8
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-static {p2, p1, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z)V

    return-void

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p2, v1}, [Ljava/lang/Object;

    move-result-object p2

    .line 11
    const-string v1, "Device reply bad status(%d). result : %d."

    invoke-static {v1, p2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p1, v3, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onErrCode ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "queryWriteDataResult"

    invoke-static {v0, p1, v1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

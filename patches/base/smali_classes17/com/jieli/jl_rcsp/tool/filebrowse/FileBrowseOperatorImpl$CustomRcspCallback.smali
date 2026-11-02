.class Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CustomRcspCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "TC;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    return-void
.end method


# virtual methods
.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TC;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;->onSuccess()V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    const/16 v1, 0x3004

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;->a:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "device: %s, %s"

    invoke-static {v2, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;->onError(I)V

    :cond_0
    return-void
.end method

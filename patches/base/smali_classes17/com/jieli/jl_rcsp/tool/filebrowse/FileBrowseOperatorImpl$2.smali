.class Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->formatDevice(ILcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

.field public final synthetic c:Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;ILcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;->c:Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;

    iput p2, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;->a:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;->onError(I)V

    :cond_0
    return-void
.end method

.method public onSuccess()V
    .locals 6

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Start formatting"

    const-string v2, "formatDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;

    iget v3, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;->a:I

    invoke-direct {v1, v3}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;->c:Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v1

    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;->c:Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;

    invoke-static {v3}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    new-instance v4, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    invoke-direct {v4, v2, v5}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    const/16 v2, 0x7530

    invoke-virtual {v1, v3, v0, v2, v4}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

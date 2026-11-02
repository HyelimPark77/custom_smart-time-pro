.class public Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/FileBrowseOperator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String; = "FileBrowseOperatorImpl"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;IBIZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a(IBIZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    return-void
.end method


# virtual methods
.method public final a(BLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 4

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildNotifyPrepareEnvCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;

    const-string v3, "prepareDelEnv"

    invoke-direct {v2, v3, p2}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(IBIZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 1

    .line 5
    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;-><init>(IBIZ)V

    .line 6
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/DelDevFileCmd;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DelDevFileCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;)V

    .line 7
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    new-instance p4, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;

    const-string v0, "deleteFileActual"

    invoke-direct {p4, v0, p5}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    const/16 p5, 0x1770

    invoke-virtual {p2, p3, p1, p5, p4}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public dataHasPacket()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public deleteFile(IBIZZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 7

    if-eqz p5, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;-><init>(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;IBIZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    move-object p1, v1

    const/4 p2, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a(BLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    return-void

    :cond_0
    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a(IBIZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    return-void
.end method

.method public formatDevice(ILcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$2;-><init>(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;ILcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a(BLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    return-void
.end method

.method public sendPathDataCmd(Lcom/jieli/jl_filebrowse/bean/PathData;[BLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 3

    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSendPathDataCmd(Lcom/jieli/jl_filebrowse/bean/PathData;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v1, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;

    const-string v2, "sendPathDataCmd"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$CustomRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    invoke-virtual {p2, v0, p1, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

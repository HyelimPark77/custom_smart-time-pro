.class public Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadOperator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl$CustomRcspCallback;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String; = "LrcReadOperatorImpl"


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

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public startLrcRead(Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/file_op/StartLrcGetCmd;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/command/file_op/StartLrcGetCmd;-><init>()V

    new-instance v3, Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl$CustomRcspCallback;

    const-string v4, "startLrcRead"

    invoke-direct {v3, v4, p1}, Lcom/jieli/jl_rcsp/tool/filebrowse/LrcReadOperatorImpl$CustomRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

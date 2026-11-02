.class public final synthetic Lcom/jieli/jl_rcsp/impl/XOO0ii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic IO:Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;

.field public final synthetic X11iII1O1:I

.field public final synthetic XXX11i:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

.field public final synthetic iX1O1:Lcom/jieli/jl_rcsp/model/base/CommandBase;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->IO:Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->I1:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->iX1O1:Lcom/jieli/jl_rcsp/model/base/CommandBase;

    iput p4, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->X11iII1O1:I

    iput-object p5, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->XXX11i:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->IO:Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->I1:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->iX1O1:Lcom/jieli/jl_rcsp/model/base/CommandBase;

    iget v3, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->X11iII1O1:I

    iget-object v4, p0, Lcom/jieli/jl_rcsp/impl/XOO0ii0;->XXX11i:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

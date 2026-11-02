.class public final synthetic Lcom/jieli/jl_rcsp/impl/IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic IO:Lcom/jieli/jl_rcsp/impl/RcspAuth;

.field public final synthetic iX1O1:Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspAuth;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/IiI10X;->IO:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/IiI10X;->I1:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/IiI10X;->iX1O1:Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/IiI10X;->IO:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/IiI10X;->I1:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/IiI10X;->iX1O1:Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->OXO1(Lcom/jieli/jl_rcsp/impl/RcspAuth;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;)V

    return-void
.end method

.class public final synthetic Lcom/jieli/jl_rcsp/impl/iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:I

.field public final synthetic iO:[B


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/iO;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, Lcom/jieli/jl_rcsp/impl/iO;->XIi00iiXO:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/iO;->iO:[B

    return-void
.end method


# virtual methods
.method public final onPost(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/iO;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, Lcom/jieli/jl_rcsp/impl/iO;->XIi00iiXO:I

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/iO;->iO:[B

    check-cast p1, Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;

    invoke-static {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;I[BLcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V

    return-void
.end method

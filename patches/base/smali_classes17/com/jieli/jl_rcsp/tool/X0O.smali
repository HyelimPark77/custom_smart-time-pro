.class public final synthetic Lcom/jieli/jl_rcsp/tool/X0O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:I


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/X0O;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, Lcom/jieli/jl_rcsp/tool/X0O;->XIi00iiXO:I

    return-void
.end method


# virtual methods
.method public final onCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/X0O;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, Lcom/jieli/jl_rcsp/tool/X0O;->XIi00iiXO:I

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    return-void
.end method

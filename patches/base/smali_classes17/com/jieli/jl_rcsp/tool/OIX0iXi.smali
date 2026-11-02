.class public final synthetic Lcom/jieli/jl_rcsp/tool/OIX0iXi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/OIX0iXi;->OXO1:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method


# virtual methods
.method public final onCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/OIX0iXi;->OXO1:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    return-void
.end method

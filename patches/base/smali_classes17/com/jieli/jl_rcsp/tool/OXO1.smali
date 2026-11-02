.class public final synthetic Lcom/jieli/jl_rcsp/tool/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/BatteryInfo;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/OXO1;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/OXO1;->XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/BatteryInfo;

    return-void
.end method


# virtual methods
.method public final onCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/OXO1;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/OXO1;->XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/BatteryInfo;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    return-void
.end method

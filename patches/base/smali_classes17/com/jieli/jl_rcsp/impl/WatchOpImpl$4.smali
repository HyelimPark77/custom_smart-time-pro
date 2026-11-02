.class Lcom/jieli/jl_rcsp/impl/WatchOpImpl$4;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/WatchOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatteryChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onDevicePower(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V

    return-void
.end method

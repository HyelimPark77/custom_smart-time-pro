.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothAdapterReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;


# direct methods
.method private constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "android.bluetooth.adapter.extra.PREVIOUS_STATE"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v1, "android.bluetooth.adapter.extra.STATE"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", prevState : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ACTION_STATE_CHANGED"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-ne p1, p2, :cond_2

    goto :goto_0

    :cond_2
    const/16 p1, 0xa

    if-ne p1, p2, :cond_3

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->onAdapterStatus(Z)V

    return-void

    :cond_3
    const/16 p1, 0xc

    if-ne p1, p2, :cond_4

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase$BluetoothAdapterReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->onAdapterStatus(Z)V

    :cond_4
    :goto_0
    return-void
.end method

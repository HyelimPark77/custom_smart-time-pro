.class Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "profile",
            "proxy"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "profile = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onServiceConnected"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    move-object v3, p2

    check-cast v3, Landroid/bluetooth/BluetoothA2dp;

    invoke-static {v0, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$202(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothA2dp;)Landroid/bluetooth/BluetoothA2dp;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$302(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Z)Z

    goto :goto_0

    :cond_0
    if-ne v1, p1, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    move-object v3, p2

    check-cast v3, Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v0, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$402(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$502(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Z)Z

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$600(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    move-result-object v0

    invoke-virtual {v0, v1, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->onEdrService(ZILandroid/bluetooth/BluetoothProfile;)V

    return-void
.end method

.method public onServiceDisconnected(I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "profile"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "profile = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onServiceDisconnected"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$202(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothA2dp;)Landroid/bluetooth/BluetoothA2dp;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$302(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Z)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$402(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$502(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Z)Z

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$600(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    move-result-object v0

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->onEdrService(ZILandroid/bluetooth/BluetoothProfile;)V

    return-void
.end method

.class public final synthetic Lcom/jieli/jl_bt_ota/impl/bt/XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/Consumer;


# instance fields
.field public final synthetic IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/XO0O10;->IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/XO0O10;->IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    check-cast p1, Lcom/jieli/jl_bt_ota/model/base/ThreadState;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->XO0O10(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Lcom/jieli/jl_bt_ota/model/base/ThreadState;)V

    return-void
.end method

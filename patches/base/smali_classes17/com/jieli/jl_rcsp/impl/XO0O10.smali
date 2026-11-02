.class public final synthetic Lcom/jieli/jl_rcsp/impl/XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/XO0O10;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/XO0O10;->XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    return-void
.end method


# virtual methods
.method public final onPost(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/XO0O10;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/XO0O10;->XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    check-cast p1, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;)V

    return-void
.end method

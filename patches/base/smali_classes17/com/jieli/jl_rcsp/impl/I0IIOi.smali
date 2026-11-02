.class public final synthetic Lcom/jieli/jl_rcsp/impl/I0IIOi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/I0IIOi;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/I0IIOi;->XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;

    return-void
.end method


# virtual methods
.method public final onPost(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/I0IIOi;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/I0IIOi;->XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;

    check-cast p1, Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V

    return-void
.end method

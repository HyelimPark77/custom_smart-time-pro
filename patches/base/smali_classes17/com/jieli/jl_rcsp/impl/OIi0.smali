.class public final synthetic Lcom/jieli/jl_rcsp/impl/OIi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/OIi0;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/OIi0;->XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    return-void
.end method


# virtual methods
.method public final onPost(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OIi0;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/OIi0;->XIi00iiXO:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    check-cast p1, Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/SettingData;Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V

    return-void
.end method

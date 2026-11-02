.class Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallbackManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;",
        ">;",
        "Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/SettingData;Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;->onSettingData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V
    .locals 0

    .line 2
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;->onSettingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;)V

    return-void
.end method


# virtual methods
.method public onSettingData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/impl/OIi0;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/OIi0;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onSettingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/impl/I0IIOi;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/I0IIOi;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

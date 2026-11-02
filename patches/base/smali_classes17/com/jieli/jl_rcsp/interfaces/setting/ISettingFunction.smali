.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/setting/ISettingFunction;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addOnSettingFunctionListener(Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V
.end method

.method public abstract removeOnSettingFunctionListener(Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;)V
.end method

.method public abstract settingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;",
            ">;)V"
        }
    .end annotation
.end method

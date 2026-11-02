.class public Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;",
        ">;",
        "Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordState;Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;->onStateChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordState;)V

    return-void
.end method


# virtual methods
.method public addOnRecordStateCallback(Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public onStateChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordState;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cf3;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/cf3;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordState;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public removeOnRecordStateCallback(Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->unregisterCallback(Ljava/lang/Object;)V

    return-void
.end method

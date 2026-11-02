.class public Lcom/jieli/watchtesttool/util/WLog;
.super Lcom/jieli/jl_rcsp/util/JL_Log;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/util/JL_Log;-><init>()V

    return-void
.end method

.method public static configureLog(Landroid/content/Context;ZZ)V
    .locals 1

    const-string v0, "watch_test"

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->setTagPrefix(Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->configureLog(Landroid/content/Context;ZZ)V

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->setLog(Z)V

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->setLog(Z)V

    if-eqz p2, :cond_0

    new-instance p0, Lcom/android/mltcode/paycertificationapi/bm6;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/bm6;-><init>()V

    invoke-static {p0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->setLogOutput(Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/cm6;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/cm6;-><init>()V

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->setLogOutput(Lcom/jieli/jl_bt_ota/util/JL_Log$ILogOutput;)V

    return-void

    :cond_0
    const/4 p0, 0x0

    invoke-static {p0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->setLogOutput(Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;)V

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->setLogOutput(Lcom/jieli/jl_bt_ota/util/JL_Log$ILogOutput;)V

    return-void
.end method

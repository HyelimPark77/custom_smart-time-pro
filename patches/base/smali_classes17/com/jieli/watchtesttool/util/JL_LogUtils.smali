.class public Lcom/jieli/watchtesttool/util/JL_LogUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static isEnable:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static disableLog(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/jieli/watchtesttool/util/JL_LogUtils;->isEnable:Z

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->setLog(Z)V

    invoke-static {p0, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->setIsSaveLogFile(Landroid/content/Context;Z)V

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->setLog(Z)V

    const/4 p0, 0x0

    invoke-static {p0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->setLogOutput(Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;)V

    return-void
.end method

.method public static enableLog(Landroid/content/Context;)V
    .locals 1

    sget-boolean v0, Lcom/jieli/watchtesttool/util/JL_LogUtils;->isEnable:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lcom/jieli/watchtesttool/util/JL_LogUtils;->isEnable:Z

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->setLog(Z)V

    invoke-static {p0, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->setIsSaveLogFile(Landroid/content/Context;Z)V

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->setLog(Z)V

    new-instance p0, Lcom/jieli/watchtesttool/util/JL_LogUtils$1;

    invoke-direct {p0}, Lcom/jieli/watchtesttool/util/JL_LogUtils$1;-><init>()V

    invoke-static {p0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->setLogOutput(Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;)V

    :cond_0
    return-void
.end method

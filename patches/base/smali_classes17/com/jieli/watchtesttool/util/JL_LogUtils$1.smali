.class Lcom/jieli/watchtesttool/util/JL_LogUtils$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/watchtesttool/util/JL_LogUtils;->enableLog(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public output(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->addLogOutput(Ljava/lang/String;)V

    return-void
.end method

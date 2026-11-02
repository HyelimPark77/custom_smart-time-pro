.class public Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetParam;
.super Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetParam"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Param;-><init>(B[B)V

    return-void
.end method

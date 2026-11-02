.class public Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$SetParam;
.super Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SetParam"
.end annotation


# instance fields
.field private final list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->attrs2Bytes(Ljava/util/List;)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Param;-><init>(B[B)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$SetParam;->list:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$SetParam;->list:Ljava/util/List;

    return-object v0
.end method

.class public Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetResponse;
.super Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetResponse"
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
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Response;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetResponse;->list:Ljava/util/List;

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

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetResponse;->list:Ljava/util/List;

    return-object v0
.end method

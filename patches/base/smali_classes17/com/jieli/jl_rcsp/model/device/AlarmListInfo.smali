.class public Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private alarmBeans:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AlarmBean;",
            ">;"
        }
    .end annotation
.end field

.field private version:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AlarmBean;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->version:I

    .line 5
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->alarmBeans:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AlarmBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->setAlarmBeans(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public getAlarmBeans()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AlarmBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->alarmBeans:Ljava/util/List;

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->version:I

    return v0
.end method

.method public setAlarmBeans(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AlarmBean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->alarmBeans:Ljava/util/List;

    return-void
.end method

.method public setVersion(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;->version:I

    return-void
.end method

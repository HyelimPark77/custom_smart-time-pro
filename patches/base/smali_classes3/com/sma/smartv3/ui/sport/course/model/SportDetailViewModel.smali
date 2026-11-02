.class public final Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# instance fields
.field private final customLatLng:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final markLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->markLiveData:Landroidx/lifecycle/MutableLiveData;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getCustomLatLng()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getIntiLocationList(Ljava/util/ArrayList;I)V
    .locals 3
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "locationList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, p2, v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->I1(Ljava/util/ArrayList;FIILjava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "customLatLng.size = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final getMarkList(Ljava/util/ArrayList;I)V
    .locals 3
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "locationList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "customLatLng.size2 = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, p2, v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->I1(Ljava/util/ArrayList;FIILjava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->markLiveData:Landroidx/lifecycle/MutableLiveData;

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->markLiveData:Landroidx/lifecycle/MutableLiveData;

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->customLatLng:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final getMarkLiveData()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->markLiveData:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

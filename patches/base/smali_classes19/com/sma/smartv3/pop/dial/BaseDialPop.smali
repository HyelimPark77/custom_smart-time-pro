.class public Lcom/sma/smartv3/pop/dial/BaseDialPop;
.super Lcom/android/mltcode/paycertificationapi/I0OIO1i;
.source "SourceFile"


# instance fields
.field public final I0IIOi:Landroidx/recyclerview/widget/LinearLayoutManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final OIi0:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/II01IOiX;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/android/mltcode/paycertificationapi/II01IOiX;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;",
            "Lcom/android/mltcode/paycertificationapi/II01IOiX<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;-><init>(Landroid/app/Activity;)V

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    iput-object v0, p0, Lcom/sma/smartv3/pop/dial/BaseDialPop;->I0IIOi:Landroidx/recyclerview/widget/LinearLayoutManager;

    new-instance v0, Lcom/sma/smartv3/pop/dial/BaseDialPop$adapter$1;

    invoke-direct {v0, p1, p2, p3}, Lcom/sma/smartv3/pop/dial/BaseDialPop$adapter$1;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/II01IOiX;)V

    iput-object v0, p0, Lcom/sma/smartv3/pop/dial/BaseDialPop;->OIi0:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-void
.end method


# virtual methods
.method public final OiIIX101O()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/pop/dial/BaseDialPop;->OIi0:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-object v0
.end method

.method public final XiOIii1()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/pop/dial/BaseDialPop;->I0IIOi:Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object v0
.end method

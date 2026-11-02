.class public final Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;
.super Lcom/android/mltcode/paycertificationapi/I0OIO1i;
.source "SourceFile"


# instance fields
.field public final I0IIOi:Landroid/widget/Button;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final OIi0:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/X11iXOOOi;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/android/mltcode/paycertificationapi/X11iXOOOi;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/android/mltcode/paycertificationapi/X11iXOOOi;",
            ")V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paths"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d1023

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IiI10X()Landroid/widget/FrameLayout;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IiI10X()Landroid/widget/FrameLayout;

    move-result-object v0

    const v1, 0x7f0a01b9

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;->I0IIOi:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IiI10X()Landroid/widget/FrameLayout;

    move-result-object v0

    const v2, 0x7f0a09c1

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;->OIi0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v1, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;

    invoke-direct {v1, p1, p2, p3, p0}, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup$1;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/X11iXOOOi;Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method


# virtual methods
.method public final OiIIX101O()Landroid/widget/Button;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;->I0IIOi:Landroid/widget/Button;

    return-object v0
.end method

.method public final XiOIii1()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialBgFilePickerPopup;->OIi0:Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

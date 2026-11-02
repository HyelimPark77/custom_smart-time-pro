.class public final Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private final number:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final pb:Lcom/sma/smartv3/view/PaceProgressBar;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvPace:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const v0, 0x7f0a08ae

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedViewHolder;->number:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a08f9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/PaceProgressBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedViewHolder;->pb:Lcom/sma/smartv3/view/PaceProgressBar;

    const v0, 0x7f0a0c0e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedViewHolder;->tvPace:Lcom/sma/smartv3/view/text/DINCondBold;

    return-void
.end method


# virtual methods
.method public final getNumber()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedViewHolder;->number:Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getPb()Lcom/sma/smartv3/view/PaceProgressBar;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedViewHolder;->pb:Lcom/sma/smartv3/view/PaceProgressBar;

    return-object v0
.end method

.method public final getTvPace()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedViewHolder;->tvPace:Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

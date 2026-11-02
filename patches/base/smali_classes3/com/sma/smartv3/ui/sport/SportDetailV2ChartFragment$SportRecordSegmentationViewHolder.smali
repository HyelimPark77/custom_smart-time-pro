.class public final Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SportRecordSegmentationViewHolder"
.end annotation


# instance fields
.field private final avgPace:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final distance:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final duration:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final number:Lcom/sma/smartv3/view/text/DINCondBold;
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

    const v0, 0x7f0a0a10

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->number:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0a0f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->duration:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0a0e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->distance:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0a0d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->avgPace:Lcom/sma/smartv3/view/text/DINCondBold;

    return-void
.end method


# virtual methods
.method public final getAvgPace()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->avgPace:Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getDistance()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->distance:Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getDuration()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->duration:Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getNumber()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->number:Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

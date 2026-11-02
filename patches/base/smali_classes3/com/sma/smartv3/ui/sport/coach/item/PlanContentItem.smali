.class public Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private currentImg:Landroid/widget/ImageView;

.field private currentName:Landroid/widget/TextView;

.field private currentTitle:Landroid/widget/TextView;

.field private exerciseLayout:Landroid/view/View;

.field private exerciseNull:Landroid/widget/TextView;

.field private exerciseTime:Landroid/widget/TextView;

.field private final isReachedTarget:Z

.field private final mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Z)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mVitalityDayLesson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    iput-boolean p2, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->isReachedTarget:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;-><init>(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Z)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0259

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->currentTitle:Landroid/widget/TextView;

    const v0, 0x7f0a0256

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->currentName:Landroid/widget/TextView;

    const v0, 0x7f0a0258

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseTime:Landroid/widget/TextView;

    const v0, 0x7f0a0255

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->currentImg:Landroid/widget/ImageView;

    const v0, 0x7f0a0257

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    const v0, 0x7f0a0281

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseLayout:Landroid/view/View;

    return-void
.end method

.method public final getMVitalityDayLesson()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    return-object v0
.end method

.method public initView()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x4

    const-string v2, "exerciseLayout"

    const/4 v3, 0x0

    const-string v4, "exerciseNull"

    const/4 v5, 0x0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    if-nez v0, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseLayout:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->isReachedTarget:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    if-nez v0, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    if-nez v1, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v5

    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f06053b

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    if-nez v0, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v5, v0

    :goto_0
    const v0, 0x7f14004b

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    if-nez v0, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    if-nez v1, :cond_7

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v5

    :cond_7
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f06024d

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    if-nez v0, :cond_8

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move-object v5, v0

    :goto_1
    const v0, 0x7f14004d

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_9
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseNull:Landroid/widget/TextView;

    if-nez v0, :cond_a

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_a
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseLayout:Landroid/view/View;

    if-nez v0, :cond_b

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_b
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->currentName:Landroid/widget/TextView;

    if-nez v0, :cond_c

    const-string v0, "currentName"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_c
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->currentTitle:Landroid/widget/TextView;

    if-nez v0, :cond_d

    const-string v0, "currentTitle"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v5

    :cond_d
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->exerciseTime:Landroid/widget/TextView;

    if-nez v0, :cond_e

    const-string v0, "exerciseTime"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_e
    move-object v5, v0

    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->mVitalityDayLesson:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->getLessonTime()I

    move-result v0

    const v1, 0x7f140f4f

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final isReachedTarget()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;->isReachedTarget:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0259

    return v0
.end method
